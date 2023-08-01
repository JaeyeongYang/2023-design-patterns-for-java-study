package part19

object NightState: State {
    override fun doClock(context: Context, hour: Int) {
        if (hour in 8 until 21) {
            if (hour in 12 until 13) {
                context.changeState(LunchState)
            } else {
                context.changeState(DayState)
            }
        } else {
            context.changeState(NightState)
        }
    }

    override fun doUse(context: Context) {
        context.callSecurityCenter("비상: 야간 금고 사용!")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("비상벨 (야간)")
    }

    override fun doPhone(context: Context) {
        context.recordLog("야간 통화 녹음")
    }

    override fun toString(): String = "[야간]"
}
