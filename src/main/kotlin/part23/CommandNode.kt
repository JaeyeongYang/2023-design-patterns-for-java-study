package part23

class CommandNode : Node() {
    private var node: Node? = null

    override fun parse(context: Context) {
        node = if (context.currentToken() == "repeat") {
            RepeatCommandNode().apply {
                parse(context)
            }
        } else {
            PrimitiveCommandNode().apply {
                parse(context)
            }
        }
    }

    override fun toString(): String {
        return node?.toString() ?: ""
    }
}
