package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnComponent extends _ColumnLookup {
  /** The delete function deletes the column, removing it from the table*/
  def delete(): js.Promise[Unit] = js.native
  /** The getCells function returns an array of CellComponent objects, one for each cell in the column.*/
  def getCells(): js.Array[CellComponent] = js.native
  /** The getDefinition function returns the column definition object for the column.*/
  def getDefinition(): ColumnDefinition = js.native
  /*The getElement function returns the DOM node for the colum*/
  def getElement(): HTMLElement = js.native
  /** The getField function returns the field name for the column.*/
  def getField(): String = js.native
  /**Get the current header filter value of a column */
  def getHeaderFilterValue(): js.Any = js.native
  /** The getNextColumn function returns the Column Component for the next visible column in the table, if there is no next column it will return a value of false. */
  def getNextColumn(): ColumnComponent | `false` = js.native
  /** The getParentColumn function returns the ColumnComponent for the parent column of this column. if no parent exists, this function will return false */
  def getParentColumn(): ColumnComponent | `false` = js.native
  /** The getPrevColumn function returns the Column Component for the previous visible column in the table, if there is no previous column it will return a value of false. */
  def getPrevColumn(): ColumnComponent | `false` = js.native
  /** The getSubColumns function returns an array of ColumnComponent objects, one for each sub column of this column. */
  def getSubColumns(): js.Array[ColumnComponent] = js.native
  /** The getTable function returns the Tabulator object for the table containing the column */
  def getTable(): typingsSlinky.tabulatorTables.Tabulator = js.native
  /** The getVisibility function returns a boolean to show if the column is visible, a value of true means it is visible.*/
  def getVisibility(): Boolean = js.native
  /** The headerFilterFocus function will place focus on the header filter element for this column if it exists. */
  def headerFilterFocus(): Unit = js.native
  /** The hide function hides the column if it is visible.*/
  def hide(): Unit = js.native
  /**You can move a column component next to another column using the move function */
  def move(toColumn: ColumnLookup, after: Boolean): Unit = js.native
  /** The reloadHeaderFilter function rebuilds the header filter element, updating any params passed into the editor used to generate the filter. */
  def reloadHeaderFilter(): Unit = js.native
  /** The scrollTo function will scroll the table to the column if it is visible. */
  def scrollTo(): js.Promise[Unit] = js.native
  /** The setHeaderFilterValue function set the value of the columns header filter element to the value provided in the first argument. */
  def setHeaderFilterValue(value: js.Any): Unit = js.native
  /** The show function shows the column if it is hidden.*/
  def show(): Unit = js.native
  /** The toggle function toggles the visibility of the column, switching between hidden and visible.*/
  def toggle(): Unit = js.native
  /** Update the definition of a column */
  def updateDefinition(definition: ColumnDefinition): js.Promise[Unit] = js.native
}

object ColumnComponent {
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    getCells: () => js.Array[CellComponent],
    getDefinition: () => ColumnDefinition,
    getElement: () => HTMLElement,
    getField: () => String,
    getHeaderFilterValue: () => js.Any,
    getNextColumn: () => ColumnComponent | `false`,
    getParentColumn: () => ColumnComponent | `false`,
    getPrevColumn: () => ColumnComponent | `false`,
    getSubColumns: () => js.Array[ColumnComponent],
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
  ): ColumnComponent = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), getCells = js.Any.fromFunction0(getCells), getDefinition = js.Any.fromFunction0(getDefinition), getElement = js.Any.fromFunction0(getElement), getField = js.Any.fromFunction0(getField), getHeaderFilterValue = js.Any.fromFunction0(getHeaderFilterValue), getNextColumn = js.Any.fromFunction0(getNextColumn), getParentColumn = js.Any.fromFunction0(getParentColumn), getPrevColumn = js.Any.fromFunction0(getPrevColumn), getSubColumns = js.Any.fromFunction0(getSubColumns), getTable = js.Any.fromFunction0(getTable), getVisibility = js.Any.fromFunction0(getVisibility), headerFilterFocus = js.Any.fromFunction0(headerFilterFocus), hide = js.Any.fromFunction0(hide), move = js.Any.fromFunction2(move), reloadHeaderFilter = js.Any.fromFunction0(reloadHeaderFilter), scrollTo = js.Any.fromFunction0(scrollTo), setHeaderFilterValue = js.Any.fromFunction1(setHeaderFilterValue), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), updateDefinition = js.Any.fromFunction1(updateDefinition))
    __obj.asInstanceOf[ColumnComponent]
  }
  @scala.inline
  implicit class ColumnComponentOps[Self <: ColumnComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCells(value: () => js.Array[CellComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCells")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefinition(value: () => ColumnDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefinition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaderFilterValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderFilterValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNextColumn(value: () => ColumnComponent | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentColumn(value: () => ColumnComponent | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrevColumn(value: () => ColumnComponent | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrevColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubColumns(value: () => js.Array[ColumnComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTable(value: () => typingsSlinky.tabulatorTables.Tabulator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibility(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibility")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaderFilterFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMove(value: (ColumnLookup, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReloadHeaderFilter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadHeaderFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollTo(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetHeaderFilterValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderFilterValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateDefinition(value: ColumnDefinition => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDefinition")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

