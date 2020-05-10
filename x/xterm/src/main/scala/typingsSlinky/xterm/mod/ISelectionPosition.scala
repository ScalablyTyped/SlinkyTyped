package typingsSlinky.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a selection within the terminal.
  */
@js.native
trait ISelectionPosition extends js.Object {
  /**
    * The end column of the selection.
    */
  var endColumn: Double = js.native
  /**
    * The end row of the selection.
    */
  var endRow: Double = js.native
  /**
    * The start column of the selection.
    */
  var startColumn: Double = js.native
  /**
    * The start row of the selection.
    */
  var startRow: Double = js.native
}

object ISelectionPosition {
  @scala.inline
  def apply(endColumn: Double, endRow: Double, startColumn: Double, startRow: Double): ISelectionPosition = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionPosition]
  }
  @scala.inline
  implicit class ISelectionPositionOps[Self <: ISelectionPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

