package typingsSlinky.twilioChat.consumptionhorizonMod

import typingsSlinky.twilioChat.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumptionHorizonServices extends js.Object {
  var session: Session = js.native
}

object ConsumptionHorizonServices {
  @scala.inline
  def apply(session: Session): ConsumptionHorizonServices = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumptionHorizonServices]
  }
  @scala.inline
  implicit class ConsumptionHorizonServicesOps[Self <: ConsumptionHorizonServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSession(value: Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

