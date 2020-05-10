package typingsSlinky.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmptyHolder[Holder /* <: js.Array[js.Array[_]] */, Types /* <: js.Array[_] */] extends js.Object {
  var empty: Holder = js.native
  var infinite: js.Any = js.native
  var nonEmpty: js.Any = js.native
}

object AnonEmptyHolder {
  @scala.inline
  def apply[Holder, Types](empty: Holder, infinite: js.Any, nonEmpty: js.Any): AnonEmptyHolder[Holder, Types] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmptyHolder[Holder, Types]]
  }
  @scala.inline
  implicit class AnonEmptyHolderOps[Self[holder, types] <: AnonEmptyHolder[holder, types], Holder, Types] (val x: Self[Holder, Types]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Holder, Types] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Holder, Types]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Holder, Types]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Holder, Types]) with Other]
    @scala.inline
    def withEmpty(value: Holder): Self[Holder, Types] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: js.Any): Self[Holder, Types] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonEmpty(value: js.Any): Self[Holder, Types] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

