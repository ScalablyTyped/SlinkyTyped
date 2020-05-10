package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccepted extends js.Object {
  var accepted: Double = js.native
  var open: Double = js.native
  var rejected: Double = js.native
}

object AnonAccepted {
  @scala.inline
  def apply(accepted: Double, open: Double, rejected: Double): AnonAccepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccepted]
  }
  @scala.inline
  implicit class AnonAcceptedOps[Self <: AnonAccepted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

