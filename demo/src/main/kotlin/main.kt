import com.deflatedpickle.monocons.MonoIcon
import uk.co.timwise.wraplayout.WrapLayout
import java.awt.Dimension
import javax.swing.*

fun main() {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())

    val window = JFrame()
    window.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    window.layout = WrapLayout()

    for (i in MonoIcon::class.java.declaredFields) {
        i.isAccessible = true

        if (i.type == Icon::class.java) {
            window.add(JButton(i.get(MonoIcon) as Icon).apply {
                toolTipText = i.name.toLowerCase()
            })
        }
    }

    window.size = Dimension(300, 500)
    window.isVisible = true
}