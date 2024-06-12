class Counter private constructor() {
    var count = 0
    fun increment() {
        count++
    }

    companion object {
        val instance = Counter()
    }
}

fun main() {

    val obj1 = Counter.instance
    val obj2 = Counter.instance
    obj1.increment()
    println("Counter 1 : ${obj1.count}")
    obj2.increment()
    println("Counter 2 : ${obj2.count}")


    obj1.increment()
    obj2.increment()
    println("Counter 1 : ${obj1.count}")
    println("Counter 2 : ${obj2.count}")


}