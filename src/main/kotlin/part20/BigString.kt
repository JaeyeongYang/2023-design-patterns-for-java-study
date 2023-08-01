package part20

class BigString(string: String, val shared: Boolean = true) {
    val bigChars: Array<BigChar> = string.toCharArray()
        .map { getBigChar(it) }
        .toTypedArray()

    private fun getBigChar(charName: Char): BigChar =
        if (shared) {
            BigCharFactory.getBigChar(charName)
        } else {
            BigChar(charName)
        }

    fun print() = bigChars.forEach { it.print() }
}
