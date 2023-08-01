package part15.pagemaker

import java.io.FileReader
import java.util.*

internal class Database {
    companion object {
        @JvmStatic
        fun getProperties(dbname: String): Properties {
            val filename = "/${dbname}.txt"
            val prop = Properties()
            FileReader(Database::class.java.getResource(filename)!!.file).use {
                prop.load(it)
            }
            return prop
        }
    }
}
