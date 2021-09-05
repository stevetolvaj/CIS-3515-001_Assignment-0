import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    protected var a : Double = 0.0
    private var b : Double = 0.0
    private var c : Double = 0.0

    fun setDimensions(a : Double, b : Double, c : Double) {
        this.a = a
        this.b = b
        this.c = c
    }

    override fun printDimensions() {
        println("The dimensions of the $name are:\nside1=$a\nside2=$b\nside3=$c\narea=${getArea()}")
    }

    override fun getArea(): Double {
        val s : Double = 0.5 * (a + b + c)
        return sqrt(s * ((s - a) * (s - b) * (s - c)))
    }
}