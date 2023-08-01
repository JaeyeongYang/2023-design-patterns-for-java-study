package part20

object BigCharFactory {
    private val pool: MutableMap<String, BigChar> = mutableMapOf()

    @Synchronized
    fun getBigChar(charname: Char): BigChar {
        var bigChar = pool[charname.toString()]
        if (bigChar == null) {
            bigChar = BigChar(charname)
            pool[charname.toString()] = bigChar
        }
        return bigChar
    }
}
