package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSortEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var multiColumnSort: Boolean = js.native
  var sortAsc: Boolean = js.native
  // Single column returned
  var sortCol: js.UndefOr[Column[T]] = js.native
  // Multiple columns returned
  var sortCols: js.UndefOr[js.Array[SortColumn[T]]] = js.native
}

object OnSortEventArgs {
  @scala.inline
  def apply[T](grid: Grid[T], multiColumnSort: Boolean, sortAsc: Boolean): OnSortEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], multiColumnSort = multiColumnSort.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSortEventArgs[T]]
  }
  @scala.inline
  implicit class OnSortEventArgsOps[Self[t] <: OnSortEventArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMultiColumnSort(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortAsc(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortCol(value: Column[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortCol: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCol")(js.undefined)
        ret
    }
    @scala.inline
    def withSortCols(value: js.Array[SortColumn[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortCols: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCols")(js.undefined)
        ret
    }
  }
  
}

