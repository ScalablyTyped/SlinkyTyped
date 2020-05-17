package typingsSlinky.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyPrefix[Prefix /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Prefix = js.native
  var infinite: CODENAME = js.native
  var nonEmpty: js.Any = js.native
}

object EmptyPrefix {
  @scala.inline
  def apply[Prefix, Tuple](empty: Prefix, infinite: CODENAME, nonEmpty: js.Any): EmptyPrefix[Prefix, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyPrefix[Prefix, Tuple]]
  }
  @scala.inline
  implicit class EmptyPrefixOps[Self[prefix, tuple] <: EmptyPrefix[prefix, tuple], Prefix, Tuple] (val x: Self[Prefix, Tuple]) extends AnyVal {
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
    def withInfinite(value: CODENAME): Self[Prefix, Tuple] = {
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

