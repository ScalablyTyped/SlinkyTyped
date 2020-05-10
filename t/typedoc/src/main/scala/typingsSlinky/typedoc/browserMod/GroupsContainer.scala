package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsContainer[T] extends js.Object {
  var groups: js.Array[T] = js.native
}

object GroupsContainer {
  @scala.inline
  def apply[T](groups: js.Array[T]): GroupsContainer[T] = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupsContainer[T]]
  }
  @scala.inline
  implicit class GroupsContainerOps[Self[t] <: GroupsContainer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGroups(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

