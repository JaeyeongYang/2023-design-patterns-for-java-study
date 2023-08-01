package part23

class RepeatCommandNode : Node() {
    private var number: Int? = null
    private var commandListNode: CommandListNode = CommandListNode()

    override fun parse(context: Context) {
        context.skipToken("repeat")
        number = context.currentNumber()
        context.nextToken()
        commandListNode.parse(context)
    }

    override fun toString(): String {
        return "[repeat $number $commandListNode]"
    }
}
