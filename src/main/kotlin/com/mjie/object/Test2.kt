//对象表达式（匿名内部类）
class MyClass {
    val name = "world"

    //声明为类的成员变量，只能是private才能被识别
    private val myObject = object {
        val name: String = "hello"
        fun echo() {
            println(this.name)
        }
    }

    fun method() {
        myObject.echo()
    }
}


fun main(args: Array<String>) {
    var myClass = MyClass()
    myClass.method()
    println("----------------------")

    var myObect = object {
        init {
            println("init invoked")
        }

        fun method() {
            println("myobject method")
        }
    }

    myObect.method()
}






