import java.util.*

fun main() {

        val reader = Scanner(System.`in`)


        val square = Square("square")
        val circle = Circle("circle")
        circle.setDimensions(5.0)
        val triangle = Triangle("triangle")
        triangle.setDimensions(5.0, 10.0, 14.0)
        val equilateralTriangle = EquilateralTriangle("equilateral triangle")
        equilateralTriangle.setDimensions(20.0)

        println("Enter the squares length then height seperated by a space:")
        square.setDimensions(reader.nextDouble(), reader.nextDouble())

        println("Enter the radius of the circle:")
        circle.setDimensions(reader.nextDouble())

        println("Enter the three sides of the triangle seperated by a space:")
        triangle.setDimensions(reader.nextDouble(), reader.nextDouble(), reader.nextDouble())

        println("Enter the length of one side of the equilateral triangle seperated by a space:")
        equilateralTriangle.setDimensions(reader.nextDouble())


        val shape : Array<Shape> = arrayOf(circle, square,
                                           triangle,equilateralTriangle)


        for (i in shape.indices) {
                shape[i].printDimensions()
                println()
        }


}