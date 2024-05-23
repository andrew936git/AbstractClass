class Student(name: String, surname:String, age: Int): Person(name, surname, age) {
    override fun activity() {
        print("студент, ")
    }

    override fun militaryAge() {
        if(age in 18..27) print("подлежит призыву")
        else print("не подлежит призыву")
    }

    override fun printInfo() {
        print("Имя: $name, фамилия $surname, возраст: $age, род деятельности: ")
        activity()
        militaryAge()
    }
}