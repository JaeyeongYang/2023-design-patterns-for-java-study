package part23

class CommandListNode : Node() {
    private val list: MutableList<Node> = mutableListOf()

    override fun parse(context: Context) {
        while (true) {
            if (context.currentToken() == null) {
                throw ParseException("Error: Missing End")
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end")
                break;
            } else {
                val cmdNode: Node = CommandNode()
                cmdNode.parse(context)
                list.add(cmdNode)
            }
        }
    }

    override fun toString(): String = list.toString()
}
