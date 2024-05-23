//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val pyaterochka = Pyaterochka(6, 4, 10,"Ленина 64")
    pyaterochka.addressInfo()
    pyaterochka.deliveries()
    pyaterochka.sale()
    println("----------------------")
    val magnit = Magnit(8, 3, 6,"Гагарина 15")
    magnit.addressInfo()
    magnit.deliveries()
    magnit.sale()
    println("\n======================\n")
//2
    val student = Student("Иван", "Иванов", 17)
    student.printInfo()
    println("\n------------------------")
    val employer = Employer("Алексей", "Козлов", 28, 60000)
    employer.printInfo()
    println("\n======================\n")
//3
    println("Введите число")
    var number = readln().toInt()
    println("Введите размер отрезка")
    var section = readln().toDouble()
    when(number){
        1 -> println("${section * 10} дециметров")
        2 -> println("${section * 0.001} киллометров")
        3 -> println("${section} метров")
        4 -> println("${section * 10000} миллиметров")
        5 -> println("${section * 100} сантиметров")
        else -> println("ошибка!")
    }
}