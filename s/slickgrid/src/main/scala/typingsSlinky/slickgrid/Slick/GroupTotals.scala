package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupTotals[T] extends NonDataRow {
  /***
  		* Parent Group.
  		* @param group
  		* @type {Group}
  		*/
  var group: Group[T] = js.native
}

object GroupTotals {
  @scala.inline
  def apply[T](group: Group[T]): GroupTotals[T] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupTotals[T]]
  }
  @scala.inline
  implicit class GroupTotalsOps[Self[t] <: GroupTotals[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGroup(value: Group[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

