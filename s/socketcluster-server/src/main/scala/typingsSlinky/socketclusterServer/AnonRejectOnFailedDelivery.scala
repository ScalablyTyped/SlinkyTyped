package typingsSlinky.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRejectOnFailedDelivery extends js.Object {
  var rejectOnFailedDelivery: Boolean = js.native
}

object AnonRejectOnFailedDelivery {
  @scala.inline
  def apply(rejectOnFailedDelivery: Boolean): AnonRejectOnFailedDelivery = {
    val __obj = js.Dynamic.literal(rejectOnFailedDelivery = rejectOnFailedDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRejectOnFailedDelivery]
  }
  @scala.inline
  implicit class AnonRejectOnFailedDeliveryOps[Self <: AnonRejectOnFailedDelivery] (val x: Self) extends AnyVal {
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

