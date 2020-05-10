package typingsSlinky.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEqual[WhenEqual, Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var equal: WhenEqual = js.native
  var shorterLeft: js.Tuple2[Left, Right] = js.native
  var shorterRight: js.Tuple2[Right, Left] = js.native
}

object AnonEqual {
  @scala.inline
  def apply[WhenEqual, Left, Right](equal: WhenEqual, shorterLeft: js.Tuple2[Left, Right], shorterRight: js.Tuple2[Right, Left]): AnonEqual[WhenEqual, Left, Right] = {
    val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], shorterLeft = shorterLeft.asInstanceOf[js.Any], shorterRight = shorterRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEqual[WhenEqual, Left, Right]]
  }
  @scala.inline
  implicit class AnonEqualOps[Self[whenequal, left, right] <: AnonEqual[whenequal, left, right], WhenEqual, Left, Right] (val x: Self[WhenEqual, Left, Right]) extends AnyVal {
    @scala.inline
    def duplicate: Self[WhenEqual, Left, Right] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[WhenEqual, Left, Right]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[WhenEqual, Left, Right]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[WhenEqual, Left, Right]) with Other]
    @scala.inline
    def withEqual(value: WhenEqual): Self[WhenEqual, Left, Right] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShorterLeft(value: js.Tuple2[Left, Right]): Self[WhenEqual, Left, Right] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorterLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShorterRight(value: js.Tuple2[Right, Left]): Self[WhenEqual, Left, Right] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorterRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

