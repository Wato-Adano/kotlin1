fun main(args: Array<String>) {
    var X= print("wato")
    println(X)
    var t =remaider(num1=8, num2=20.1)
    println(t)
    var y =addition(num3=60, num4=40, num5=20)
    println(y)
    var r =sentence("words")
    println(r)
}


fun print(name: String) :String{
    var home="hello{ name}"
    return home
}


fun remaider(num1:Int, num2:Double):Double{
    var module = num1%num2
    return module



}



fun addition(num3:Int, num4:Int, num5:Int):Int{
    var sum=num3+num4+ num5
    return sum
}



fun sentence(text:String):String {
    var words = "Am proud of myself"
    return words
}