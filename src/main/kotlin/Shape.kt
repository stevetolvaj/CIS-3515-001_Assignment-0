abstract class Shape (_name : String) {
    var name : String = _name

    open fun getArea(): Double {
        return 0.0
    }

    open fun printDimensions() {
        println("No dimensions")
    }

}