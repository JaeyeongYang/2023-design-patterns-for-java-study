package part19

interface Context {
    fun setClock(hour: Int)

    fun changeState(state: State)

    fun callSecurityCenter(msg: String)

    fun recordLog(msg: String)
}
