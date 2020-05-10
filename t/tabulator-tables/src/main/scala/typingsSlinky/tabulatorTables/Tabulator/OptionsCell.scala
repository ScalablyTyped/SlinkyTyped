package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsCell extends js.Object {
  /** The cellClick callback is triggered when a user left clicks on a cell, it can be set on a per column basis using the option in the columns definition object. */
  var cellClick: js.UndefOr[CellEventCallback] = js.native
  var cellContext: js.UndefOr[CellEventCallback] = js.native
  var cellDblClick: js.UndefOr[CellEventCallback] = js.native
  var cellDblTap: js.UndefOr[CellEventCallback] = js.native
  var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.native
  var cellEdited: js.UndefOr[CellEditEventCallback] = js.native
  var cellEditing: js.UndefOr[CellEditEventCallback] = js.native
  var cellHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.native
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.native
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.native
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.native
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.native
  var cellTap: js.UndefOr[CellEventCallback] = js.native
  var cellTapHold: js.UndefOr[CellEventCallback] = js.native
  var cellVertAlign: js.UndefOr[VerticalAlign] = js.native
}

object OptionsCell {
  @scala.inline
  def apply(): OptionsCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsCell]
  }
  @scala.inline
  implicit class OptionsCellOps[Self <: OptionsCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellClick(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCellContext(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContext")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDblClick(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDblClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDblTap(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDblTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellDblTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDblTap")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEditCancelled(value: /* cell */ CellComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditCancelled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellEditCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditCancelled")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEdited(value: /* cell */ CellComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdited")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellEdited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdited")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEditing(value: /* cell */ CellComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHozAlign(value: ColumnDefinitionAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHozAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHozAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHozAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMouseEnter(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMouseLeave(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMouseMove(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMouseOut(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseOut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMouseOver(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTap(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTap")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTapHold(value: (/* e */ js.Any, /* cell */ CellComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTapHold")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellTapHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTapHold")(js.undefined)
        ret
    }
    @scala.inline
    def withCellVertAlign(value: VerticalAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellVertAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellVertAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellVertAlign")(js.undefined)
        ret
    }
  }
  
}

