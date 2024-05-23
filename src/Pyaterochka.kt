class Pyaterochka(employees: Int, boxOffice: Int, buyer: Int, address: String ):
    Shop(employees, boxOffice, buyer, address) {

override fun deliveries() {
        println("Сотрудников в зале ${employees - 2}")
    }

    override fun sale(): Unit {
        if (buyer > 3) println("Открыть новую кассу")
    }

    override fun addressInfo() {
        println("Магазин Пятерочка находится по адресу $address")
    }
}