package part18

import java.io.FileReader
import java.io.FileWriter
import java.io.Serializable

class Memento(money: Int) : Serializable {
    var money: Int = money
        private set

    val fruits: MutableList<String> = mutableListOf()

    fun addFruit(fruit: String) {
        fruits.add(fruit)
    }

    override fun toString(): String {
        return "Memento(money=$money, fruits=$fruits)"
    }

    companion object {
        private const val DELIMITER = "::"

        @JvmStatic
        fun saveToFile(filename: String, memento: Memento): Boolean {
            return try {
                FileWriter(filename).use {
                    it.write(memento.money.toString())
                    it.write(DELIMITER)
                    it.write(memento.fruits.joinToString(","))
                }
                true
            } catch (ex: Exception) {
                false
            }
        }

        @JvmStatic
        fun loadFromFile(filename: String): Memento? {
            return try {
                val fileText: String = FileReader(filename).use {
                    it.readText()
                }
                val split = fileText.split(DELIMITER)
                val memento = Memento(split[0].toInt())
                split[1].split(",").forEach {
                    memento.addFruit(it)
                }
                memento
            } catch (ex: Exception) {
                null
            }
        }
    }
}
