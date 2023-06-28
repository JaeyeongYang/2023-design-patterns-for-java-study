package part9

fun main() {
    val d1: Display = Display(StringDisplayImpl("Hello, Korea."))
    val d2: Display = CountDisplay(StringDisplayImpl("Hello, World."))
    val d3: CountDisplay = CountDisplay(StringDisplayImpl("Hello, Universe."))
    val d4: RandomDisplay = RandomDisplay(StringDisplayImpl("What's up, Danger."))
    val d5: Display = Display(FileDisplayImpl("part9.txt"))
    val d6: IncrementDisplay = IncrementDisplay(InlineDisplayImpl("<", "*", ">"))
    val d7: IncrementDisplay = IncrementDisplay(InlineDisplayImpl("|", "##", "-"))

    d1.display()
    d2.display()
    d3.display()
    d3.multiDisplay(5)
    d4.randomDisplay(5)
    d5.display()
    d6.incrementDisplay(4)
    d7.incrementDisplay(6)
}
