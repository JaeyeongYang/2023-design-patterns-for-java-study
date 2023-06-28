package part8.factory

abstract class Tray(caption: String) : Item(caption) {
    protected val tray: MutableList<Item> = mutableListOf()

    fun add(item: Item) {
        tray.add(item)
    }
}
