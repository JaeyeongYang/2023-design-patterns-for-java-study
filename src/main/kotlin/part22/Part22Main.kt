package part22

import part22.command.MacroCommand
import part22.drawer.ColorCommand
import part22.drawer.DrawCanvas
import part22.drawer.DrawCommand
import java.awt.Color
import java.awt.event.MouseEvent
import java.awt.event.MouseMotionAdapter
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.Box
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JFrame

class Part22Main(title: String) : JFrame(title) {
    private val history = MacroCommand()
    private val canvas = DrawCanvas(400, 400, history)

    private val clearButton = JButton("clear")
    private val undoButton = JButton("undo")
    private val changeColorButton = JButton("changeColor")

    init {
        addWindowListener(object : WindowAdapter() {
            override fun windowClosing(e: WindowEvent?) {
                System.exit(0)
            }
        })

        canvas.addMouseMotionListener(object : MouseMotionAdapter() {
            override fun mouseDragged(e: MouseEvent?) {
                val cmd = DrawCommand(canvas, e!!.point)
                history.append(cmd)
                cmd.execute()
            }
        })

        clearButton.addActionListener {
            history.clear()
            canvas.repaint()
        }
        undoButton.addActionListener {
            history.undo()
            canvas.repaint()
        }
        changeColorButton.addActionListener {
            val cmd = ColorCommand(canvas, Color.BLACK)
            history.append(cmd)
            canvas.repaint()
        }

        val buttonBox = Box(BoxLayout.X_AXIS)
        buttonBox.add(changeColorButton)
        buttonBox.add(clearButton)
        buttonBox.add(undoButton)

        val mainBox = Box(BoxLayout.Y_AXIS)
        mainBox.add(buttonBox)
        mainBox.add(canvas)

        contentPane.add(mainBox)

        pack()
        isVisible = true
    }
}

fun main() {
    Part22Main("Command Pattern Sample")
}
