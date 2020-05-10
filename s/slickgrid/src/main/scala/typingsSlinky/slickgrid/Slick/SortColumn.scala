package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortColumn[T /* <: SlickData */] extends js.Object {
  var sortAsc: Boolean = js.native
  var sortCol: Column[T] = js.native
}

object SortColumn {
  @scala.inline
  def apply[T](sortAsc: Boolean, sortCol: Column[T]): SortColumn[T] = {
    val __obj = js.Dynamic.literal(sortAsc = sortAsc.asInstanceOf[js.Any], sortCol = sortCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn[T]]
  }
  @scala.inline
  implicit class SortColumnOps[Self[t] <: SortColumn[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
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
  }
  
}

