import kotlin.math.PI

class Circle(_name: String) : Shape(_name) {
    private var radius : Double = 0.0

    fun setDimensions(radius: Double) {
        this.radius = radius
    }

    override fun printDimensions() {
        println("The dimensions of the $name are:\nradius=$radius\narea=${getArea()}.")
    }

    override fun getArea(): Double {
        return (radius * radius) * PI
    }

}