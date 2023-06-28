package part8.factory

abstract class Item(protected val caption: String) {
    abstract fun makeHTML(): String
}
