package typingsSlinky.slickgrid.Slick.Controls

import typingsSlinky.slickgrid.Slick.Column
import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnPicker[T /* <: SlickData */] extends js.Object {
  def destroy(): Unit = js.native
  def getAllColumns(): js.Array[Column[T]] = js.native
}

object ColumnPicker {
  @scala.inline
  def apply[T](destroy: () => Unit, getAllColumns: () => js.Array[Column[T]]): ColumnPicker[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAllColumns = js.Any.fromFunction0(getAllColumns))
    __obj.asInstanceOf[ColumnPicker[T]]
  }
  @scala.inline
  implicit class ColumnPickerOps[Self[t] <: ColumnPicker[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllColumns(value: () => js.Array[Column[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllColumns")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

