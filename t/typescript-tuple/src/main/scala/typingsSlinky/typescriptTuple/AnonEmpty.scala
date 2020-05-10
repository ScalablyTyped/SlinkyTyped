package typingsSlinky.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmpty[Finite, Tuple /* <: js.Array[_] */, Infinite] extends js.Object {
  var empty: Finite = js.native
  var infinite: Infinite = js.native
  var nonEmpty: js.Any = js.native
}

object AnonEmpty {
  @scala.inline
  def apply[Finite, Tuple, Infinite](empty: Finite, infinite: Infinite, nonEmpty: js.Any): AnonEmpty[Finite, Tuple, Infinite] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmpty[Finite, Tuple, Infinite]]
  }
  @scala.inline
  implicit class AnonEmptyOps[Self[finite, tuple, infinite] <: AnonEmpty[finite, tuple, infinite], Finite, Tuple, Infinite] (val x: Self[Finite, Tuple, Infinite]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Finite, Tuple, Infinite] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Finite, Tuple, Infinite]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Finite, Tuple, Infinite]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Finite, Tuple, Infinite]) with Other]
    @scala.inline
    def withEmpty(value: Finite): Self[Finite, Tuple, Infinite] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: Infinite): Self[Finite, Tuple, Infinite] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonEmpty(value: js.Any): Self[Finite, Tuple, Infinite] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

