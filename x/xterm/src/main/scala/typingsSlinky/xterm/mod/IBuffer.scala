package typingsSlinky.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a terminal buffer.
  */
@js.native
trait IBuffer extends js.Object {
  /**
    * The line within the buffer where the top of the bottom page is (when
    * fully scrolled down).
    */
  val baseY: Double = js.native
  /**
    * The x position of the cursor. This ranges between `0` (left side) and
    * `Terminal.cols - 1` (right side).
    */
  val cursorX: Double = js.native
  /**
    * The y position of the cursor. This ranges between `0` (when the
    * cursor is at baseY) and `Terminal.rows - 1` (when the cursor is on the
    * last row).
    */
  val cursorY: Double = js.native
  /**
    * The amount of lines in the buffer.
    */
  val length: Double = js.native
  /**
    * The line within the buffer where the top of the viewport is.
    */
  val viewportY: Double = js.native
  /**
    * Gets a line from the buffer, or undefined if the line index does not
    * exist.
    *
    * Note that the result of this function should be used immediately after
    * calling as when the terminal updates it could lead to unexpected
    * behavior.
    *
    * @param y The line index to get.
    */
  def getLine(y: Double): js.UndefOr[IBufferLine] = js.native
  /**
    * Creates an empty cell object suitable as a cell reference in
    * `line.getCell(x, cell)`. Use this to avoid costly recreation of
    * cell objects when dealing with tons of cells.
    */
  def getNullCell(): IBufferCell = js.native
}

object IBuffer {
  @scala.inline
  def apply(
    baseY: Double,
    cursorX: Double,
    cursorY: Double,
    getLine: Double => js.UndefOr[IBufferLine],
    getNullCell: () => IBufferCell,
    length: Double,
    viewportY: Double
  ): IBuffer = {
    val __obj = js.Dynamic.literal(baseY = baseY.asInstanceOf[js.Any], cursorX = cursorX.asInstanceOf[js.Any], cursorY = cursorY.asInstanceOf[js.Any], getLine = js.Any.fromFunction1(getLine), getNullCell = js.Any.fromFunction0(getNullCell), length = length.asInstanceOf[js.Any], viewportY = viewportY.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuffer]
  }
  @scala.inline
  implicit class IBufferOps[Self <: IBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLine(value: Double => js.UndefOr[IBufferLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNullCell(value: () => IBufferCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNullCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

