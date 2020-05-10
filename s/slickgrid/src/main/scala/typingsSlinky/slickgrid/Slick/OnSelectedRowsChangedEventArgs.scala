package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSelectedRowsChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var rows: js.Array[Double] = js.native
}

object OnSelectedRowsChangedEventArgs {
  @scala.inline
  def apply[T](grid: Grid[T], rows: js.Array[Double]): OnSelectedRowsChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSelectedRowsChangedEventArgs[T]]
  }
  @scala.inline
  implicit class OnSelectedRowsChangedEventArgsOps[Self[t] <: OnSelectedRowsChangedEventArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRows(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

