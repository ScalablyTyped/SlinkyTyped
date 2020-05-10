package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellCallbacks extends js.Object {
  // Cell Events
  /** callback for when user clicks on a cell in this column  */
  var cellClick: js.UndefOr[CellEventCallback] = js.native
  /** callback for when user right clicks on a cell in this column */
  var cellContext: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when user double clicks on a cell in this column */
  var cellDblClick: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when user double taps on a cell in this column, triggered in touch displays when a user taps the same cell twice in under 300ms.  */
  var cellDblTap: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when an edit on a cell in this column is aborted by the user  */
  var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.native
  /** callback for when a cell in this column has been edited by the user */
  var cellEdited: js.UndefOr[CellEditEventCallback] = js.native
  // Cell editing
  /** callback for when a cell in this column is being edited by the user */
  var cellEditing: js.UndefOr[CellEditEventCallback] = js.native
  /** callback for when the mouse pointer enters a cell */
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when the mouse pointer leaves a cell */
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.native
  /** callback for when the mouse pointer moves over a cell  */
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.native
  /** callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.native
  /** callback for when user taps on a cell in this column, triggered in touch displays.  */
  var cellTap: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when user taps and holds on a cell in this column, triggered in touch displays when a user taps and holds the same cell for 1 second.*/
  var cellTapHold: js.UndefOr[CellEventCallback] = js.native
}

object CellCallbacks {
  @scala.inline
  def apply(): CellCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellCallbacks]
  }
  @scala.inline
  implicit class CellCallbacksOps[Self <: CellCallbacks] (val x: Self) extends AnyVal {
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
  }
  
}

