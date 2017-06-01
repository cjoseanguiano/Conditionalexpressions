/**
 * Created by carlosjoseanguiano on 01/06/17.
 */
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun main(args: Array<String>) {
    println("max of 0 and 42 ${maxOf(0, 42)}")
}