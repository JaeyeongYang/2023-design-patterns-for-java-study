package part14

class NoSupport(name: String) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean = false
}
