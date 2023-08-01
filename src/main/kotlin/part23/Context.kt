package part23

class Context(text: String) {
    private val tokens = text.split(Regex("\\s+")).toTypedArray()
    private var index = 0
    private var lastToken: String? = nextToken()

    fun nextToken(): String? {
        lastToken = if (index < tokens.size) {
            tokens[index++]
        } else {
            null
        }
        return lastToken
    }

    fun currentToken() = lastToken

    fun skipToken(token: String?) {
        if (currentToken() == null) {
            throw ParseException("Error: '$token' is expected, but no token is found.")
        } else if (token != currentToken()) {
            throw ParseException("Error: '$token' is expected, but '${currentToken()}' is found.")
        }
        nextToken()
    }

    fun currentNumber(): Int {
        if (currentToken() == null) {
            throw ParseException("Error: no more token.")
        }
        val number: Int
        try {
            number = currentToken()?.toInt()!!
        } catch (ex: NumberFormatException) {
            throw ParseException("Error: ${ex.message}")
        }
        return number
    }
}
