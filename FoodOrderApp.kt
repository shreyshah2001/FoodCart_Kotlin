package FoodOrder

fun login_screen(): Customer {
    println("Enter Registered Number")
    val rnum: String = readln().toLowerCase()
    return if (rnum[0] == 'p') PremiumCust() else if (rnum[0] == 'r') RegularCust() else Guest()
}

fun takeOrder(): Order {
    val m1 = Menu()
    val o2 = Order()
    while (true) {
        m1.display()
        println("Enter 4 for Exit")
        println("Please enter your choice")
        var choice2 = -1
        try {
            choice2 = readln().toInt()
        } catch (e: Exception) {
            println("Please enter a number")
        }
        if (choice2 == 4) return o2
        o2.add(m1.getItem(choice2 - 1), m1.getPrice(choice2 - 1))
    }
}

fun main() {
    val c1 = login_screen()
    val r1 = Restaurant("Restaurant", "f23432", "shsh2@gmail.com", "build1", "Road 6", 232, "Mumbai")
    System.out.println(r1.name)
    val o1: Order = takeOrder()
    val total: Double = o1.total
    o1.display()
    println("Total before discount $total")
    c1.paybill(total)
}