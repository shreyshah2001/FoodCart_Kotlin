package FoodOrder


internal class RegularCust : Customer(), billpayment {
    init {
        discount = 15.0
    }

    override fun paybill(total: Double) {
        var total = total
        total = total * (1 - discount!! / 100)
        println("Total after $total")
    }
}


