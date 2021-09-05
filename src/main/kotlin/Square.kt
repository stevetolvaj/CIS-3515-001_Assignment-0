class Square(_name: String) : Shape(_name) {
    private var length = 0.0
    private var height = 0.0

    fun setDimensions(length : Double, height : Double) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("The dimensions of the $name are:\nlength=$length\nheight=$height\narea=${getArea()}")
    }

    override fun getArea(): Double {
        return length * height
    }
}