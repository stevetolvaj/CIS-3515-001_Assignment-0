import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {
    // Uses superclasses variable a

    fun setDimensions(a : Double) {
        this.a = a
    }

    override fun printDimensions() {
        println("The dimensions of the $name are:\nside1=$a\narea=${getArea()}")
    }

    override fun getArea(): Double {
        return ((sqrt(3.0)/4.0)*(a*a))
    }

}