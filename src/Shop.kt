abstract class Shop(var employees: Int, var boxOffices: Int, var buyer: Int, var address: String) {

    abstract fun deliveries(): Unit
    abstract fun sale(): Unit

    open fun addressInfo(){
        println("Магазин находится по адресу $address")
    }
}