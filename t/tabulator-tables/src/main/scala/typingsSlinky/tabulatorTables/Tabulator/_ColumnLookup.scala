package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ColumnLookup extends js.Object

object _ColumnLookup {
  @scala.inline
  def ColumnComponent(
    delete: () => js.Promise[Unit],
    getCells: () => js.Array[CellComponent],
    getDefinition: () => ColumnDefinition,
    getElement: () => HTMLElement,
    getField: () => String,
    getHeaderFilterValue: () => js.Any,
    getNextColumn: () => typingsSlinky.tabulatorTables.Tabulator.ColumnComponent | `false`,
    getParentColumn: () => typingsSlinky.tabulatorTables.Tabulator.ColumnComponent | `false`,
    getPrevColumn: () => typingsSlinky.tabulatorTables.Tabulator.ColumnComponent | `false`,
    getSubColumns: () => js.Array[typingsSlinky.tabulatorTables.Tabulator.ColumnComponent],
    getTable: () => typingsSlinky.tabulatorTables.Tabulator,
    getVisibility: () => Boolean,
    headerFilterFocus: () => Unit,
    hide: () => Unit,
    move: (ColumnLookup, Boolean) => Unit,
    reloadHeaderFilter: () => Unit,
    scrollTo: () => js.Promise[Unit],
    setHeaderFilterValue: js.Any => Unit,
    show: () => Unit,
    toggle: () => Unit,
    updateDefinition: ColumnDefinition => js.Promise[Unit]
  ): _ColumnLookup = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), getCells = js.Any.fromFunction0(getCells), getDefinition = js.Any.fromFunction0(getDefinition), getElement = js.Any.fromFunction0(getElement), getField = js.Any.fromFunction0(getField), getHeaderFilterValue = js.Any.fromFunction0(getHeaderFilterValue), getNextColumn = js.Any.fromFunction0(getNextColumn), getParentColumn = js.Any.fromFunction0(getParentColumn), getPrevColumn = js.Any.fromFunction0(getPrevColumn), getSubColumns = js.Any.fromFunction0(getSubColumns), getTable = js.Any.fromFunction0(getTable), getVisibility = js.Any.fromFunction0(getVisibility), headerFilterFocus = js.Any.fromFunction0(headerFilterFocus), hide = js.Any.fromFunction0(hide), move = js.Any.fromFunction2(move), reloadHeaderFilter = js.Any.fromFunction0(reloadHeaderFilter), scrollTo = js.Any.fromFunction0(scrollTo), setHeaderFilterValue = js.Any.fromFunction1(setHeaderFilterValue), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), updateDefinition = js.Any.fromFunction1(updateDefinition))
    __obj.asInstanceOf[_ColumnLookup]
  }
  @scala.inline
  def ColumnDefinition(title: String): _ColumnLookup = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColumnLookup]
  }
}

