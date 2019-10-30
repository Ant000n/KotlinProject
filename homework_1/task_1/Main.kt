package homework.homework_1.task_1

fun main() {
println(basn("jldA"))
}
    fun basn(a: String): Boolean {
        a.forEach {
            if (it.isUpperCase())
                return true
        }
//        for (i in 0 until a.length) {
//            val c = a[i]
//
//            if (c.isUpperCase()){
//                return true
//            }
//        }
        return false
    }