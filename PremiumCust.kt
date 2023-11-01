package FoodOrder


class PremiumCust : Customer(), billpayment {
    var points = 0.0

    init {
        val mem_num = 23421
        discount = 25.0
    }

    override fun paybill(total: Double) {
        var total = total
        total = total * (1 - discount!! / 100)
        points = points + total * 0.5
        println("Total after discount $total")
    }
}



