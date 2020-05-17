package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxSelectColumn[T /* <: SlickData */] extends Plugin[T] {
  def getColumnDefinition(): ColumnMetadata[T] = js.native
}

object CheckboxSelectColumn {
  @scala.inline
  def apply[T](destroy: () => Unit, getColumnDefinition: () => ColumnMetadata[T], init: Grid[T] => Unit): CheckboxSelectColumn[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getColumnDefinition = js.Any.fromFunction0(getColumnDefinition), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CheckboxSelectColumn[T]]
  }
  @scala.inline
  implicit class CheckboxSelectColumnOps[Self[t] <: CheckboxSelectColumn[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetColumnDefinition(value: () => ColumnMetadata[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnDefinition")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

