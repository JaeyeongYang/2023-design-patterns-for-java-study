package part22.drawer

import part22.command.MacroCommand
import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics

class DrawCanvas(
    width: Int,
    height: Int,
    private val history: MacroCommand
) : Canvas(), Drawable {
    private var color: Color = Color.RED
    private val radius = 6

    init {
        setSize(width, height)
        background = Color.WHITE
    }

    override fun paint(g: Graphics?) {
        history.execute()
    }

    override fun draw(x: Int, y: Int) {
        val g = graphics
        g.color = this.color
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2)
    }

    override fun setColor(color: Color) {
        this.color = color
    }
}
