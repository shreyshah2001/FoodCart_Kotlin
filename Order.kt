package FoodOrder

import java.util.Date


class Order {
    var order_no = 123
    var item_id = 0
    var dt: Date
    var item_name: Array<String?>
    var price: IntArray
    var quantity = 2
    var total:Double = 0.0

    init {
        dt = Date()
        item_name = arrayOfNulls(100)
        price = IntArray(100)
    }

    fun display() {
        println("Order no: $order_no")
        println(dt)
        for (i in 0 until item_id) {
            print(item_name[i] + "\t")
            print(price[i])
            println()
        }
        println("Total = $total")
    }

    fun add(name: String?, price: Int) {
        item_name[item_id] = name
        this.price[item_id] = price
        total = total + price
        item_id++
        println("Total upto now: " + total)
    }

    fun displayItems() {
        for (i in 0 until item_id) {
            println(item_name[i])
        }
    }

}