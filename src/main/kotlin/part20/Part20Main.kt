package part20

fun main() {
    val runtime = Runtime.getRuntime()
    val testString = "0123456789".repeat(1000)
    testShared(testString, runtime)
    testNonShared(testString, runtime)
}

fun testShared(testString: String, runtime: Runtime) {
    runtime.gc()
    val before: Long = runtime.totalMemory() - runtime.freeMemory()
    val bigString = BigString(testString, true)
    val after: Long = runtime.totalMemory() - runtime.freeMemory()
    println("shared - before: $before, after: $after, diff: ${after - before}")
}

fun testNonShared(testString: String, runtime: Runtime) {
    runtime.gc()
    val before: Long = runtime.totalMemory() - runtime.freeMemory()
    val bigString = BigString(testString, false)
    val after: Long = runtime.totalMemory() - runtime.freeMemory()
    println("non-shared: $before, after: $after, diff: ${after - before}")
}
