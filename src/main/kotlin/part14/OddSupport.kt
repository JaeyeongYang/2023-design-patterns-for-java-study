package part14

class OddSupport(name: String): Support(name) {
    override fun resolve(trouble: Trouble): Boolean = trouble.number % 2 == 1
}
