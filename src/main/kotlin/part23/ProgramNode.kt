package part23

class ProgramNode : Node() {
    private val commandListNode: Node = CommandListNode()

    override fun parse(context: Context) {
        context.skipToken("program")
        commandListNode.parse(context)
    }

    override fun toString(): String {
        return "[program ${commandListNode}]"
    }
}
