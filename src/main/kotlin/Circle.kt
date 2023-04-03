import kotlin.math.pow
import kotlin.math.sqrt

class Circle() {

    fun isPointInsideCircle() {
        println("Введите координаты точки:")
        print("x = ")
        val x = readlnOrNull()?.toDoubleOrNull()
        print("y = ")
        val y = readlnOrNull()?.toDoubleOrNull()
        print("Введите радиус круга: ")
        val r = readlnOrNull()?.toDoubleOrNull()

        val distance = sqrt(x?.pow(2) ?: (0.0 + y?.pow(2)!!))//d = sqrt( (x2-x1)^2 + (y2-y1)^2 )

        if (distance < (r ?: 0.0)) {
            println("Точка находится внутри круга.")
        } else if (distance == (r ?: 0.0)) {
            println("Точка находится на границе круга.")
        } else {
            println("Точка находится за пределами круга.")
        }
    }
}
