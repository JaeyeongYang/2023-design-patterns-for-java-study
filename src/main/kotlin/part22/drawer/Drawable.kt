package part22.drawer

import java.awt.Color

interface Drawable {
    fun draw(x: Int, y: Int)

    fun setColor(color: Color)
}
