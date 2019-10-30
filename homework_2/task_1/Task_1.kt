package homework.homework_2.task_1

import java.lang.reflect.Array.get
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val calendar = Calendar.getInstance()
    val day = calendar.get(Calendar.DAY_OF_WEEK)-1
    val monday = calendar.get(Calendar.MONTH)+1
    println(day)
    println(monday)
    println("Anton")
}