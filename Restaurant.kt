package FoodOrder


data class Restaurant(var name: String, var gst: String, var email: String, var bname: String?, var street: String?, var pincode: Int, var city: String?)
//{
//    var add1: Address
//    init {
//        add1 = Address(bname!!, street!!, pincode, city!!)
//    }
//}
fun main()
{
    var str1 = "Hi"
    var str2 = "Hello"
    var str3 = str1 + str2 + str2
    print(str3)
}
