package typingsSlinky.tablesorter.parsedCellMod

import typingsSlinky.tablesorter.mod._Global_.HTMLElement
import typingsSlinky.tablesorter.mod._Global_.JQuery
import typingsSlinky.tablesorter.parsedOptionMod.ParsedOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedCell extends ParsedOption {
  /**
    * The jQuery-object which contains the cell.
    */
  @JSName("$cell")
  var $cell: JQuery[HTMLElement] = js.native
  /**
    * The jQuery-object which contains the row.
    */
  @JSName("$row")
  var $row: JQuery[HTMLElement] = js.native
  /**
    * The index of the row.
    */
  var rowIndex: Double = js.native
  /**
    * The index of the `tbody` of the row.
    */
  var tbodyIndex: Double = js.native
}

object ParsedCell {
  @scala.inline
  def apply(
    $cell: JQuery[HTMLElement],
    $row: JQuery[HTMLElement],
    parsed: js.Any,
    raw: String,
    rowIndex: Double,
    tbodyIndex: Double
  ): ParsedCell = {
    val __obj = js.Dynamic.literal($cell = $cell.asInstanceOf[js.Any], $row = $row.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], tbodyIndex = tbodyIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCell]
  }
  @scala.inline
  implicit class ParsedCellOps[Self <: ParsedCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$cell(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$row(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTbodyIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbodyIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

