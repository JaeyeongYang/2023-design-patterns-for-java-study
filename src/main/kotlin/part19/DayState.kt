package part19

object DayState : State {
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
        context.recordLog("금고 사용 (주간)")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("비상벨 (주간)")
    }

    override fun doPhone(context: Context) {
        context.callSecurityCenter("일반 통화 (주간)")
    }

    override fun toString(): String = "[주간]"
}
