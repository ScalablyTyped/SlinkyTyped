package typingsSlinky.vegaTypings.runtimeMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineMark[T /* <: String */, I, R /* <: String */] extends js.Object {
  var group: js.Any = js.native
  var items: js.Array[Item[I]] = js.native
  var marktype: T = js.native
  var role: mark | R = js.native
}

object DefineMark {
  @scala.inline
  def apply[T, I, R](group: js.Any, items: js.Array[Item[I]], marktype: T, role: mark | R): DefineMark[T, I, R] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineMark[T, I, R]]
  }
  @scala.inline
  implicit class DefineMarkOps[Self[t, i, r] <: DefineMark[t, i, r], T, I, R] (val x: Self[T, I, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, I, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, I, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, I, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, I, R]) with Other]
    @scala.inline
    def withGroup(value: js.Any): Self[T, I, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Item[I]]): Self[T, I, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarktype(value: T): Self[T, I, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marktype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: mark | R): Self[T, I, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

