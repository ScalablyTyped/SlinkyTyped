package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backward extends js.Object {
  var backward: scala.Double = js.native
  var forward: scala.Double = js.native
}

object Backward {
  @scala.inline
  def apply(backward: scala.Double, forward: scala.Double): Backward = {
    val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backward]
  }
  @scala.inline
  implicit class BackwardOps[Self <: Backward] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackward(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForward(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

