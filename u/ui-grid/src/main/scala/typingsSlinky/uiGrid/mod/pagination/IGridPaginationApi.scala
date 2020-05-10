package typingsSlinky.uiGrid.mod.pagination

import typingsSlinky.uiGrid.AnonPaginationChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridPaginationApi extends js.Object {
  // Events
  var on: AnonPaginationChanged = js.native
  // Methods
  /**
    * Get the current page
    * @returns {number} the number of the current page
    */
  def getPage(): Double = js.native
  /**
    * Get the total number of pages
    * @returns {number} the total number of pages
    */
  def getTotalPages(): Double = js.native
  /**
    * Moves to the next page if possible
    */
  def nextPage(): Unit = js.native
  /**
    * Moves to the previous page if we're not on the first page.
    */
  def previousPage(): Unit = js.native
  /**
    * Moves to the requested page
    * @param {number} page The number of the page that should be displayed
    */
  def seek(page: Double): Unit = js.native
}

object IGridPaginationApi {
  @scala.inline
  def apply(
    getPage: () => Double,
    getTotalPages: () => Double,
    nextPage: () => Unit,
    on: AnonPaginationChanged,
    previousPage: () => Unit,
    seek: Double => Unit
  ): IGridPaginationApi = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getTotalPages = js.Any.fromFunction0(getTotalPages), nextPage = js.Any.fromFunction0(nextPage), on = on.asInstanceOf[js.Any], previousPage = js.Any.fromFunction0(previousPage), seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[IGridPaginationApi]
  }
  @scala.inline
  implicit class IGridPaginationApiOps[Self <: IGridPaginationApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTotalPages(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalPages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextPage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: AnonPaginationChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousPage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeek(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

