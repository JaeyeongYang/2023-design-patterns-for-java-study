package part19

import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class SafeFrame(title: String) : Frame(title), ActionListener, Context {
    private val textClock = TextField(60)
    private val textScreen = TextArea(10, 60);
    private val buttonUse = Button("금고 사용")
    private val buttonAlarm = Button("비상벨")
    private val buttonPhone = Button("일반 통화")
    private val buttonExit = Button("종료")

    private var state: State = DayState

    init {
        background = Color.LIGHT_GRAY
        layout = BorderLayout()

        add(textClock, BorderLayout.NORTH)
        textClock.isEditable = false

        add(textScreen, BorderLayout.CENTER)
        textScreen.isEditable = false

        val panel = Panel().also {
            it.add(buttonUse)
            it.add(buttonAlarm)
            it.add(buttonPhone)
            it.add(buttonExit)
        }
        add(panel, BorderLayout.SOUTH)

        pack()
        isVisible = true

//        buttonUse.addActionListener(this)
//        buttonAlarm.addActionListener(this)
//        buttonPhone.addActionListener(this)
//        buttonExit.addActionListener(this)
        buttonUse.addActionListener { state.doUse(this) }
        buttonAlarm.addActionListener { state.doAlarm(this) }
        buttonPhone.addActionListener { state.doPhone(this) }
        buttonExit.addActionListener { System.exit(0) }
    }

    override fun actionPerformed(e: ActionEvent) {
        println(e.toString())
        when (e.source) {
            buttonUse -> state.doUse(this)
            buttonAlarm -> state.doAlarm(this)
            buttonPhone -> state.doPhone(this)
            buttonExit -> System.exit(0)
            else -> println("?")
        }
    }

    override fun setClock(hour: Int) {
        val clockString = "현재 시간은 %02d:00".format(hour)
        println(clockString)
        textClock.text = clockString
        state.doClock(this, hour)
    }

    override fun changeState(state: State) {
        if (this.state == state) {
            return
        }

        println("${this.state}에서 ${state}으로 상태가 변화했습니다.")
        this.state = state
    }

    override fun callSecurityCenter(msg: String) {
        textScreen.append("Call! $msg\n")
    }

    override fun recordLog(msg: String) {
        textScreen.append("record ... $msg\n")
    }
}
