package FoodOrder

open class Customer constructor()  {
    var name1: Name? = null
    var id:Int? = null
    var address1: Address? = null
    var phone_no:Int? = null
    var email_id: String? = null
    var discount:Double? = null

    init{
        name1 = Name("Shrey", "Shah")
        email_id = "shshah.ext@deloitte.com"
        address1 = Address("Deloitte", "Kolshet Road", 4022, "Mumbai")
        id = 1
        phone_no = 12453282
    }

    constructor(fname: String?, lname: String?, id: Int?, email: String?, bname: String?, street: String?, pincode: Int?, city: String?, phone: Int?):this() {
        this.name1 = Name(fname!!, lname!!)
        this.id = id!!
        this.email_id = email!!
        this.phone_no = phone!!
        this.address1 = Address(bname!!, street!!, pincode!!, city!!)
    }

    fun display() {
        println(id)
        println(email_id)
        println(phone_no)
    }

    open fun paybill(total: Double) {
        println("Method to be overriden")
    }
}