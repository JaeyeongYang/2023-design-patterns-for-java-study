package part10

fun main() {
    val list = listOf("D", "B", "C", "E", "A")

    // Comparator
    println(list.sortedWith(Comparator { o1, o2 -> o1.compareTo(o2) }))
    println(list.sortedWith(Comparator { o1, o2 -> -o1.compareTo(o2) }))

    // Kotlin
    println(list.sorted())
    println(list.sortedDescending())
}
