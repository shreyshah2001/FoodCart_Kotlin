package FoodOrder



class Menu {
    var id = 101
    var price: IntArray
//    var quantity: IntArray
    var name: Array<String>
    var description = "Breakfast Menu"
    var r1: Restaurant? = null

    init {
        name = arrayOf("Tea/Coffee", "Milkshakes", "Pizza","IceCream")
        price = intArrayOf(43, 85, 225,150)
//        quantity = intArrayOf(1, 3, 2)
    }

    fun display() {
        println(description)
        for (i in 0..2) {
            println((i + 1).toString() + "\t" + name[i] + "\t" + price[i])
        }
    }

    fun getItem(i: Int): String {
        return name[i]
    }

    fun getPrice(i: Int): Int {
        return price[i]
    }
}