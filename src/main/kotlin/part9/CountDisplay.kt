package part9

class CountDisplay(impl: DisplayImpl): Display(impl) {
    fun multiDisplay(times: Int) {
        open()
        repeat(times) {
            print()
        }
        close()
    }
}
