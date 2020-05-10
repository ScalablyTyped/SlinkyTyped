package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsMenu extends js.Object {
  var rowContextMenu: js.UndefOr[
    (js.Array[MenuObject | MenuSeparator]) | (js.Function1[
      /* component */ RowComponent | CellComponent | ColumnComponent, 
      MenuObject | `false` | js.Array[_]
    ])
  ] = js.native
}

object OptionsMenu {
  @scala.inline
  def apply(): OptionsMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsMenu]
  }
  @scala.inline
  implicit class OptionsMenuOps[Self <: OptionsMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowContextMenuFunction1(
      value: /* component */ RowComponent | CellComponent | ColumnComponent => MenuObject | `false` | js.Array[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowContextMenu(
      value: (js.Array[MenuObject | MenuSeparator]) | (js.Function1[
          /* component */ RowComponent | CellComponent | ColumnComponent, 
          MenuObject | `false` | js.Array[_]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowContextMenu")(js.undefined)
        ret
    }
  }
  
}

