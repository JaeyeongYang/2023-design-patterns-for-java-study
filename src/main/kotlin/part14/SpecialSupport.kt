package part14

class SpecialSupport(name: String, val number: Int) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean = trouble.number == number
}
