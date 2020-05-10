package typingsSlinky.sharepoint.SP.UI.ApplicationPages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ICalendarController extends js.Object {
  def collapseAll(): Unit = js.native
  def deleteItem(itemId: String): Unit = js.native
  def expandAll(): Unit = js.native
  def getActiveScope(): CalendarScope = js.native
  def moveToDate(date: String): Unit = js.native
  def moveToView(scope: CalendarScope): Unit = js.native
  def moveToViewDate(scope: CalendarScope, date: String): Unit = js.native
  def moveToViewType(viewType: String): Unit = js.native
  def newItemDialog(contentTypeId: String): Unit = js.native
  def refreshItems(): Unit = js.native
}

object ICalendarController {
  @scala.inline
  def apply(
    collapseAll: () => Unit,
    deleteItem: String => Unit,
    expandAll: () => Unit,
    getActiveScope: () => CalendarScope,
    moveToDate: String => Unit,
    moveToView: CalendarScope => Unit,
    moveToViewDate: (CalendarScope, String) => Unit,
    moveToViewType: String => Unit,
    newItemDialog: String => Unit,
    refreshItems: () => Unit
  ): ICalendarController = {
    val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), deleteItem = js.Any.fromFunction1(deleteItem), expandAll = js.Any.fromFunction0(expandAll), getActiveScope = js.Any.fromFunction0(getActiveScope), moveToDate = js.Any.fromFunction1(moveToDate), moveToView = js.Any.fromFunction1(moveToView), moveToViewDate = js.Any.fromFunction2(moveToViewDate), moveToViewType = js.Any.fromFunction1(moveToViewType), newItemDialog = js.Any.fromFunction1(newItemDialog), refreshItems = js.Any.fromFunction0(refreshItems))
    __obj.asInstanceOf[ICalendarController]
  }
  @scala.inline
  implicit class ICalendarControllerOps[Self <: ICalendarController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteItem(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpandAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActiveScope(value: () => CalendarScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveToDate(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveToView(value: CalendarScope => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveToViewDate(value: (CalendarScope, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToViewDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMoveToViewType(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToViewType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewItemDialog(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItemDialog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefreshItems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshItems")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

