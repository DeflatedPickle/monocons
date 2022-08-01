package com.deflatedpickle.monocons

import javax.imageio.ImageIO
import javax.swing.Icon
import javax.swing.ImageIcon

@Suppress("SpellCheckingInspection", "unused")
object MonoIcon {
    private const val NAMESPACE = "icon"

    val ADD_ELEMENT = icon("add_element")
    val EDIT_ELEMENT = icon("edit_element")
    val EDIT_ELEMENT_CODE = icon("edit_elements_code")
    val DELETE_ELEMENT = icon("delete_element")
    val DELETE_ALL_ELEMENTS = icon("delete_all_elements")

    val VERTEX_SHADER = icon("vertex_shaded")
    val FRAGMENT_SHADER = icon("fragment_shader")

    val ARROW_DOWN = icon("arrow_down")
    val ARROW_UP = icon("arrow_up")
    val ARROW_LEFT = icon("back_arrow")
    val ARROW_RIGHT = icon("forward_arrow")

    val NBT = icon("nbt")

    val SETTINGS = icon("settings")

    val CHESSBOARD = icon("chessboard")

    val CROP = icon("crop")
    val CLIPBOARD = icon("clipboard")

    val ERROR = icon("error")
    val EXIT = icon("exit")
    val HELP = icon("help_button")

    val SELECT_WORD = icon("select_word")
    val SELECT_LINE = icon("select_line")
    val SELECT_SECTION = icon("begin_end_select")
    val SELECT_ALL = icon("select_all")

    val SAVE = icon("save")
    val SAVE_AS = icon("save_as")

    val COPY = icon("copy")
    val CUT = icon("cut")
    val CUT_2 = icon("cut_2")
    val PASTE = icon("paste")
    val DELETE = icon("delete")
    val REPLACE = icon("replace")

    val UNDO = icon("undo")
    val REDO = icon("redo")

    val RELOAD = icon("reload_arrow")

    val FIND = icon("find")
    val FIND_NEXT = icon("find_next")
    val FIND_PREVIOUS = icon("find_previous")

    val GO_TO = icon("go_to")
    val CHAIN_LINK = icon("chain_link")

    val IGNORE = icon("ignore")

    val CASE_INSENSITIVE = icon("case_insensitive")
    val IGNORE_WHITESPACE = icon("ignore_whitespace")
    val STRIP_SPECIAL_CHARACTERS = icon("strip_special_characters")

    val ZOOM_IN = icon("zoom_in")
    val ZOOM_OUT = icon("zoom_out")

    val CURSOR = icon("arrow")
    val PENCIL = icon("pencil")
    val ERASER = icon("eraser")
    val COLOUR_PICKER = icon("colour_picker")
    val PAINT_BUCKET = icon("paint_bucket")
    val LINE = icon("line")

    val MOVE = icon("move")
    val BOX_SELECT = icon("box_select")

    val FOLDER_CLOSE = icon("folder_close")
    val FOLDER_OPEN = icon("folder_open")
    val FOLDER_OPEN_FILE = icon("folder_open_2")
    val FOLDER_NEW = icon("folder_new")

    val LOCK_OPEN = icon("lock_unlocked")
    val LOCK_CLOSED = icon("lock_locked")

    val SHOW = icon("show")
    val HIDE = icon("hide")

    val PAINTING_BLANK = icon("painting_blank")
    val PAINTING_DECORATED = icon("painting_decorated")

    val FILE = icon("paper_blank")
    val FILE_SMALL = icon("paper_small")
    val FILE_NEW = icon("paper_new")
    val FILE_TEXT = icon("paper_text")
    val FILE_BINARY = icon("paper_binary")
    val FILE_CODE = icon("paper_code")
    val FILE_JSON = icon("paper_json")
    val FILE_EXPORT = icon("paper_export")

    val RUN = icon("run")
    val RUN_DEBUG = icon("run_in_debug")

    val TRANSLATE = icon("translate")

    private fun icon(name: String) = ImageIcon(
        ImageIO.read(
            this::class.java.getResource("/$NAMESPACE/$name.png").openStream()
        )
    )
}