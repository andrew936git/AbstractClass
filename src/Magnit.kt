class Magnit(employees: Int, boxOffice: Int, buyer: Int, address: String ):
    Shop(employees, boxOffice, buyer, address) {
    override fun deliveries() {
        println("Сотрудников в зале ${employees - 1}")
    }

    override fun sale(): Unit {
        if (buyer > 5) println("Открыть новую кассу")
    }

    override fun addressInfo() {
        println("Магазин Магнит находится по адресу $address")
    }

}