package typingsSlinky.socketclusterServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectOnFailedDelivery extends js.Object {
  var rejectOnFailedDelivery: Boolean = js.native
}

object RejectOnFailedDelivery {
  @scala.inline
  def apply(rejectOnFailedDelivery: Boolean): RejectOnFailedDelivery = {
    val __obj = js.Dynamic.literal(rejectOnFailedDelivery = rejectOnFailedDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectOnFailedDelivery]
  }
  @scala.inline
  implicit class RejectOnFailedDeliveryOps[Self <: RejectOnFailedDelivery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRejectOnFailedDelivery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectOnFailedDelivery")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

