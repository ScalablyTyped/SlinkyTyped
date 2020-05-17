package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accepted extends js.Object {
  var accepted: scala.Double = js.native
  var open: scala.Double = js.native
  var rejected: scala.Double = js.native
}

object Accepted {
  @scala.inline
  def apply(accepted: scala.Double, open: scala.Double, rejected: scala.Double): Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepted]
  }
  @scala.inline
  implicit class AcceptedOps[Self <: Accepted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejected(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

