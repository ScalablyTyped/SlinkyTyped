package typingsSlinky.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmptyPrefix[Prefix /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Prefix = js.native
  var infinite: AnonCODENAME = js.native
  var nonEmpty: js.Any = js.native
}

object AnonEmptyPrefix {
  @scala.inline
  def apply[Prefix, Tuple](empty: Prefix, infinite: AnonCODENAME, nonEmpty: js.Any): AnonEmptyPrefix[Prefix, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmptyPrefix[Prefix, Tuple]]
  }
  @scala.inline
  implicit class AnonEmptyPrefixOps[Self[prefix, tuple] <: AnonEmptyPrefix[prefix, tuple], Prefix, Tuple] (val x: Self[Prefix, Tuple]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Prefix, Tuple] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Prefix, Tuple]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Prefix, Tuple]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Prefix, Tuple]) with Other]
    @scala.inline
    def withEmpty(value: Prefix): Self[Prefix, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: AnonCODENAME): Self[Prefix, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonEmpty(value: js.Any): Self[Prefix, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

