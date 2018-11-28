package com.mjie.common;

/**
 * ssh辅助工具
 * @author panmingjie
 * @date 2018/11/28 13:59
 */

import com.jcraft.jsch.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * ssh辅助类
 * @author panmingjie
 * @date 2018/9/5 09:09
 */
public class SshHelper {

    public SshHelper(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    private static Logger log = LoggerFactory.getLogger(SshHelper.class);

    private String host;
    private int port;
    private String username;
    private String password;

    /**
     * ssh会话
     */
    private Session sshSession;
    /**
     * sftp会话
     */
    private ChannelSftp channelSftp;
    /**
     * shell会话
     */
    private ChannelExec channelExec;

    /**
     * 连接到ssh
     * @return ssh会话
     */
    private Session sshConnect() {
        JSch jSch = new JSch();
        try {
            sshSession = jSch.getSession(username, host, port);
            if (password != null && !"".equals(password)) {
                sshSession.setPassword(password);
            }
            Properties properties = new Properties();
            properties.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(properties);
            sshSession.connect();
        } catch (Exception ex) {
            log.error("connect to ssh error", ex);
        }
        return sshSession;
    }

    /**
     * 获取一个sftp连接
     * @return sftp连接
     */
    public ChannelSftp sftpConnect() {
        if (sshSession == null) {
            this.sshConnect();
        }
        try {
            boolean connected = sshSession.isConnected();
            if (connected) {
                Channel channel = sshSession.openChannel("sftp");
                channel.connect();
                channelSftp = (ChannelSftp) channel;
            }
        } catch (Exception ex) {
            log.error("connect to sftp error, host : {}, port : {}",sshSession.getHost(), sshSession.getPort(), ex);
        }
        return channelSftp;
    }

    /**
     * 获取shell连接并执行shell脚本
     * @return shell连接
     */
    public ChannelExec executeShell(String shell) {
        if (sshSession == null) {
            this.sshConnect();
        }
        try {
            boolean connected = sshSession.isConnected();
            if (connected) {
                Channel channel = sshSession.openChannel("exec");
                channelExec = (ChannelExec) channel;
                channelExec.setCommand(shell);
                channel.connect();
            }
        } catch (Exception ex) {
            log.error("connect to exec error, host : {}, port : {}", sshSession.getHost(), sshSession.getPort(), ex);
        }
        return channelExec;
    }
    /**
     * 关闭sftp连接
     */
    public void disConnect() {
        if (sshSession != null && sshSession.isConnected()) {
            sshSession.disconnect();
        }
    }
    /**
     *  上传文件到sftp
     * @param uploadDir sftp文件目录
     * @param localDir 本地文件目录，目录需要以文件分隔符结尾
     * @param fileName 要上传的文件名
     * @return 是否上传成功
     */
    public boolean upload(String uploadDir, String localDir, String fileName) {
        if (this.channelSftp == null) {
            this.sftpConnect();
        }
        try {
            channelSftp.cd(uploadDir);
        } catch (SftpException e) {
            try {
                channelSftp.mkdir(uploadDir);
                channelSftp.cd(uploadDir);
            } catch (SftpException e1) {
                log.error("sftp server don't exist file： {}", uploadDir);
                return false;
            }
        }
        File file = new File(localDir + fileName);
        try (FileInputStream in = new FileInputStream(file)) {
            channelSftp.put(in, fileName);
            return true;
        } catch (Exception ex) {
            log.error("upload file : {} to sftp error, fileName : {}", fileName, ex);
        }
        return false;
    }
}

