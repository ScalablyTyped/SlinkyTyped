package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackward extends js.Object {
  var backward: Double = js.native
  var forward: Double = js.native
}

object AnonBackward {
  @scala.inline
  def apply(backward: Double, forward: Double): AnonBackward = {
    val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackward]
  }
  @scala.inline
  implicit class AnonBackwardOps[Self <: AnonBackward] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackward(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForward(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

