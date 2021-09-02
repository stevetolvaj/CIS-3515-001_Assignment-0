class Square(_name: String) : Shape(_name) {
    private var length = 0.0
    private var height = 0.0

    fun setDimensions(length : Double, height : Double) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("The length of the square is $length and the height is $height.")
    }

    override fun getArea(): Double {
        return length * height
    }
}