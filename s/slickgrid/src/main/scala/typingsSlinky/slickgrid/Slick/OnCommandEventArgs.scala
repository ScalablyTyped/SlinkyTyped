package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCommandEventArgs[T /* <: SlickData */] extends js.Object {
  var button: HeaderButton = js.native
  var column: Column[T] = js.native
  var command: String = js.native
  var grid: Grid[T] = js.native
}

object OnCommandEventArgs {
  @scala.inline
  def apply[T](button: HeaderButton, column: Column[T], command: String, grid: Grid[T]): OnCommandEventArgs[T] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCommandEventArgs[T]]
  }
  @scala.inline
  implicit class OnCommandEventArgsOps[Self[t] <: OnCommandEventArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withButton(value: HeaderButton): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: Column[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrid(value: Grid[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

