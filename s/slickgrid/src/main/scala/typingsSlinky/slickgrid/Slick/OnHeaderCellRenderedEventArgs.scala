package typingsSlinky.slickgrid.Slick

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnHeaderCellRenderedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  	// todo: might be JQuery instance
  var column: Column[T] = js.native
  var node: HTMLElement = js.native
}

object OnHeaderCellRenderedEventArgs {
  @scala.inline
  def apply[T](column: Column[T], grid: Grid[T], node: HTMLElement): OnHeaderCellRenderedEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderCellRenderedEventArgs[T]]
  }
  @scala.inline
  implicit class OnHeaderCellRenderedEventArgsOps[Self[t] <: OnHeaderCellRenderedEventArgs[t], T] (val x: Self[T]) extends AnyVal {
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
    @scala.inline
    def withNode(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

