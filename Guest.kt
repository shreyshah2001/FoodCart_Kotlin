package FoodOrder


class Guest : Customer(), billpayment {
    var paydel: Int? = null
    init {
        discount = 0.0
        paydel = 100
    }

    override fun paybill(total: Double) {
        var total = total
        total = total * (1 - discount!! / 100) + paydel!!
        println(total)
    }
}

