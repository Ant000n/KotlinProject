package homework.homework_2.task_1

fun main() {
    var a = 3
    var b = 5

    a += b
    b = a - b
    a -= b
    println("a: $a")
    println("b: $b")
}