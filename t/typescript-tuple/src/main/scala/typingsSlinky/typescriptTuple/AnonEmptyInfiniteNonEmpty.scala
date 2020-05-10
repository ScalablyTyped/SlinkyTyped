package typingsSlinky.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmptyInfiniteNonEmpty[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Holder = js.native
  var infinite: js.Any = js.native
  var nonEmpty: js.Any = js.native
}

object AnonEmptyInfiniteNonEmpty {
  @scala.inline
  def apply[Holder, Tuple](empty: Holder, infinite: js.Any, nonEmpty: js.Any): AnonEmptyInfiniteNonEmpty[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmptyInfiniteNonEmpty[Holder, Tuple]]
  }
  @scala.inline
  implicit class AnonEmptyInfiniteNonEmptyOps[Self[holder, tuple] <: AnonEmptyInfiniteNonEmpty[holder, tuple], Holder, Tuple] (val x: Self[Holder, Tuple]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Holder, Tuple] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Holder, Tuple]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Holder, Tuple]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Holder, Tuple]) with Other]
    @scala.inline
    def withEmpty(value: Holder): Self[Holder, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: js.Any): Self[Holder, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonEmpty(value: js.Any): Self[Holder, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

