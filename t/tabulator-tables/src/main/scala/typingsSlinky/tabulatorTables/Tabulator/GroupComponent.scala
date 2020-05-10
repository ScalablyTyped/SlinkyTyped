package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupComponent extends js.Object {
  /** The getElement function returns the DOM node for the group header. */
  def getElement(): HTMLElement = js.native
  /** Returns the string of the field that all rows in this group have been grouped by. (if a function is used to group the rows rather than a field, this function will return false) */
  def getField(): String = js.native
  /** The getKey function returns the unique key that is shared between all rows in this group. */
  def getKey(): js.Any = js.native
  /** The getParentGroup function returns the GroupComponent for the parent group of this group. if no parent exists, this function will return false */
  def getParentGroup(): GroupComponent | `false` = js.native
  /** The getRows function returns an array of RowComponent objects, one for each row in the group */
  def getRows(): js.Array[RowComponent] = js.native
  /** The getSubGroups function returns an array of GroupComponent objects, one for each sub group of this group. */
  def getSubGroups(): js.Array[GroupComponent] = js.native
  /** The getTable function returns the Tabulator object for the table containing the group */
  def getTable(): typingsSlinky.tabulatorTables.Tabulator = js.native
  /**  The getVisibility function returns a boolean to show if the group is visible, a value of true means it is visible.*/
  def getVisibility(): Boolean = js.native
  /** The hide function hides the group if it is visible. */
  def hide(): Unit = js.native
  /** The show function shows the group if it is hidden. */
  def show(): Unit = js.native
  /** The toggle function toggles the visibility of the group, switching between hidden and visible. */
  def toggle(): Unit = js.native
}

object GroupComponent {
  @scala.inline
  def apply(
    getElement: () => HTMLElement,
    getField: () => String,
    getKey: () => js.Any,
    getParentGroup: () => GroupComponent | `false`,
    getRows: () => js.Array[RowComponent],
    getSubGroups: () => js.Array[GroupComponent],
    getTable: () => typingsSlinky.tabulatorTables.Tabulator,
    getVisibility: () => Boolean,
    hide: () => Unit,
    show: () => Unit,
    toggle: () => Unit
  ): GroupComponent = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getField = js.Any.fromFunction0(getField), getKey = js.Any.fromFunction0(getKey), getParentGroup = js.Any.fromFunction0(getParentGroup), getRows = js.Any.fromFunction0(getRows), getSubGroups = js.Any.fromFunction0(getSubGroups), getTable = js.Any.fromFunction0(getTable), getVisibility = js.Any.fromFunction0(getVisibility), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[GroupComponent]
  }
  @scala.inline
  implicit class GroupComponentOps[Self <: GroupComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGetKey(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentGroup(value: () => GroupComponent | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRows(value: () => js.Array[RowComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubGroups(value: () => js.Array[GroupComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubGroups")(js.Any.fromFunction0(value))
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
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
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
  }
  
}

