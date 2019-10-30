package homework.homework_1.task_2

fun main() {
    val text = "GGGvvv"
    println()
    fun upperCase(text: String): Long {
        var counter: Long = 0

        for (i in 0 until text.length) {
            if (Character.isUpperCase(text[i])) {
                counter++
            }
        }
        return counter
    }

}