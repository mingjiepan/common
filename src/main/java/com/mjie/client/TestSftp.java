package com.mjie.client;

import com.mjie.common.SshHelper;

/**
 * @author panmingjie
 * @date 2018/11/28 15:04
 */
public class TestSftp {
    public static void main(String[] args) {
        SshHelper sshHelper = new SshHelper("10.46.235.125", 22, "codeadmin", "XDmwj776,12Z");
        sshHelper.executeShell("cp /web/spider/picture/hello.jpg /web/spider/file/ \n");
        sshHelper.disConnect();
    }
}
