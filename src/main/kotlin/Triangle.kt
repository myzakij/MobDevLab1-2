class Triangle() {
    fun getTriangleType() {
        println("Введите длины сторон треугольника:")
        print("a = ")
        val a = readlnOrNull()?.toDoubleOrNull()
        print("b = ")
        val b = readlnOrNull()?.toDoubleOrNull()
        print("c = ")
        val c = readlnOrNull()?.toDoubleOrNull()

        if (a != null && b != null && c != null && a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c) {
                println("Это равносторонний треугольник.")
            }
            else if (a == b || b == c || c == a) {
                println("Это равнобедренный треугольник.")
            }
            else {
                println("Это разносторонний треугольник.")
            }
        } else {
            println("Такой треугольник не может существовать.")
        }



    }
}