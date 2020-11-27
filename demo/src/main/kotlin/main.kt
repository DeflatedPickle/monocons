import com.deflatedpickle.nagato.NagatoIcon
import uk.co.timwise.wraplayout.WrapLayout
import java.awt.Dimension
import javax.swing.*

fun main() {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())

    val window = JFrame()
    window.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    window.layout = WrapLayout()

    for (i in NagatoIcon::class.java.declaredFields) {
        i.isAccessible = true

        if (i.type == Icon::class.java) {
            window.add(JButton(i.get(NagatoIcon) as Icon).apply {
                toolTipText = i.name.toLowerCase()
            })
        }
    }

    window.size = Dimension(300, 500)
    window.isVisible = true
}