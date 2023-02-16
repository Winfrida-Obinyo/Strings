fun main(){
    areaname()
    println(datanames("Kemunto",45))
    println(length(""))
    mynames("Winfrida")

}
fun areaname(){
    val name= "akirachix"
    println(name[0])
    println(name[2])
    println(name[3])
}
fun datanames(name :String, age:Int) : String{
    val data = " Hi, my name is $name and I am $age"
    return data
}
fun length(txt: String) :Int{
    val txt = "I love the person I am becoming"
    return txt.length
}
fun mynames(name: String){
    if (name=="Winfrida"){
        println("thats me")}

    else{
        println("I dont know who that is")
    }

}
