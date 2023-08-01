package part16

import java.awt.Button

class ColleagueButton(caption: String) : Colleague, Button(caption) {
    private var mediator: Mediator? = null

    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }

    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
    }
}
