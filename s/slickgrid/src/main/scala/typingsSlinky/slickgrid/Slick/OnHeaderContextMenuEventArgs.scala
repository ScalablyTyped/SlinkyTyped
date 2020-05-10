package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnHeaderContextMenuEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var column: Column[T] = js.native
}

object OnHeaderContextMenuEventArgs {
  @scala.inline
  def apply[T](column: Column[T], grid: Grid[T]): OnHeaderContextMenuEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderContextMenuEventArgs[T]]
  }
  @scala.inline
  implicit class OnHeaderContextMenuEventArgsOps[Self[t] <: OnHeaderContextMenuEventArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColumn(value: Column[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

