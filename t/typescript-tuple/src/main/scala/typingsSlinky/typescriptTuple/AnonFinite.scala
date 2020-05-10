package typingsSlinky.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFinite[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var finite: js.Tuple2[Tuple, js.Array[js.Any]] = js.native
  var matched: js.Tuple2[Holder, Tuple] = js.native
  var unmatched: js.Any = js.native
}

object AnonFinite {
  @scala.inline
  def apply[Holder, Tuple](finite: js.Tuple2[Tuple, js.Array[js.Any]], matched: js.Tuple2[Holder, Tuple], unmatched: js.Any): AnonFinite[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(finite = finite.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFinite[Holder, Tuple]]
  }
  @scala.inline
  implicit class AnonFiniteOps[Self[holder, tuple] <: AnonFinite[holder, tuple], Holder, Tuple] (val x: Self[Holder, Tuple]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Holder, Tuple] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Holder, Tuple]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Holder, Tuple]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Holder, Tuple]) with Other]
    @scala.inline
    def withFinite(value: js.Tuple2[Tuple, js.Array[js.Any]]): Self[Holder, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatched(value: js.Tuple2[Holder, Tuple]): Self[Holder, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmatched(value: js.Any): Self[Holder, Tuple] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmatched")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

