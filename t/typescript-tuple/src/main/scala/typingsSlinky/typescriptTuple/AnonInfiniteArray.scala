package typingsSlinky.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInfiniteArray[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement] extends js.Object {
  var empty: Holder = js.native
  var infinite: js.Array[Replacement] = js.native
  var nonEmpty: js.Any = js.native
}

object AnonInfiniteArray {
  @scala.inline
  def apply[Holder, Tuple, Replacement](empty: Holder, infinite: js.Array[Replacement], nonEmpty: js.Any): AnonInfiniteArray[Holder, Tuple, Replacement] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfiniteArray[Holder, Tuple, Replacement]]
  }
  @scala.inline
  implicit class AnonInfiniteArrayOps[Self[holder, tuple, replacement] <: AnonInfiniteArray[holder, tuple, replacement], Holder, Tuple, Replacement] (val x: Self[Holder, Tuple, Replacement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Holder, Tuple, Replacement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Holder, Tuple, Replacement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Holder, Tuple, Replacement]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Holder, Tuple, Replacement]) with Other]
    @scala.inline
    def withEmpty(value: Holder): Self[Holder, Tuple, Replacement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: js.Array[Replacement]): Self[Holder, Tuple, Replacement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonEmpty(value: js.Any): Self[Holder, Tuple, Replacement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

