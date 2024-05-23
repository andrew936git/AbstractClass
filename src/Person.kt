abstract class Person(var name: String, var surname: String, var age: Int) {

    abstract fun activity()
    abstract fun militaryAge()

    open fun printInfo(){
        println("Информация о человеке")
    }
}