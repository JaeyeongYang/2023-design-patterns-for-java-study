package part23

class PrimitiveCommandNode : Node() {
    private var name: String? = null

    override fun parse(context: Context) {
        name = context.currentToken()
        if (name == null) {
            throw ParseException("Error: Missing <primitive command>")
        } else if (!VALID_COMMANDS.contains(name)) {
            throw ParseException("Error: Unknown <primitive command>: $name")
        }
        context.skipToken(name)
    }

    override fun toString(): String = name ?: ""

    companion object {
        @JvmStatic
        private val VALID_COMMANDS = setOf("go", "right", "left")
    }
}
