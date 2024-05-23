class Employer(name: String, surname:String, age: Int, private var salary: Int): Person(name, surname, age) {
    override fun activity() {
        print("сотрудник, ")
    }

    override fun militaryAge() {
        if(age in 18..27) println("подлежит призыву,")
        else print("не подлежит призыву,")
    }

    override fun printInfo() {
        print("Имя: $name, фамилия $surname, возраст: $age, род деятельности: ")
        activity()
        militaryAge()
        print(" зарплата: $salary рублей.")
    }
}