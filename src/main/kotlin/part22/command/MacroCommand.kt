package part22.command

import java.util.*

class MacroCommand : Command {
    private val commands: Deque<Command> = ArrayDeque()

    override fun execute() {
        commands.forEach { it.execute() }
    }

    fun append(cmd: Command) {
        if (cmd == this) {
            throw IllegalArgumentException("Infinite loop caused by append")
        }
        commands.push(cmd)
    }

    fun undo() {
        if (commands.isNotEmpty()) {
            commands.pop()
        }
    }

    fun clear() {
        commands.clear()
    }
}
