package FoodOrder

class Address constructor(bname:String, street:String,pincode:Int, city:String ) {
    var bname:String = ""
    var street:String = ""
    var pincode:Int = -1
    var city:String = ""


    init{
        this.bname = bname
        this.street = street
        this.pincode = pincode
        this.city = city
    }
}
