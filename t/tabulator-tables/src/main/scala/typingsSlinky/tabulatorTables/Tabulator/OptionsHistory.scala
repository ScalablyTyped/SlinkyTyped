package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsHistory extends js.Object {
  /** Enable user interaction history functionality	 */
  var history: js.UndefOr[Boolean] = js.native
  /** The historyRedo event is triggered when the redo action is triggered. */
  var historyRedo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ js.Any, 
      Unit
    ]
  ] = js.native
  /** The historyUndo event is triggered when the undo action is triggered. */
  var historyUndo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ js.Any, 
      Unit
    ]
  ] = js.native
}

object OptionsHistory {
  @scala.inline
  def apply(): OptionsHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsHistory]
  }
  @scala.inline
  implicit class OptionsHistoryOps[Self <: OptionsHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryRedo(
      value: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyRedo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHistoryRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyRedo")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryUndo(
      value: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyUndo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHistoryUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyUndo")(js.undefined)
        ret
    }
  }
  
}

