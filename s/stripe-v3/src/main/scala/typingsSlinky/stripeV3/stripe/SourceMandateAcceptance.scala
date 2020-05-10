package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.stripeV3Strings.accepted
import typingsSlinky.stripeV3.stripeV3Strings.offline
import typingsSlinky.stripeV3.stripeV3Strings.online
import typingsSlinky.stripeV3.stripeV3Strings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMandateAcceptance extends js.Object {
  var date: Double = js.native
  var ip: js.UndefOr[String] = js.native
  var offline: js.UndefOr[OfflineAcceptanceMandate] = js.native
  var online: js.UndefOr[OnlineAcceptanceMandate] = js.native
  var status: accepted | refused = js.native
  var `type`: js.UndefOr[online | offline] = js.native
  var user_agent: js.UndefOr[String] = js.native
}

object SourceMandateAcceptance {
  @scala.inline
  def apply(date: Double, status: accepted | refused): SourceMandateAcceptance = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMandateAcceptance]
  }
  @scala.inline
  implicit class SourceMandateAcceptanceOps[Self <: SourceMandateAcceptance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: accepted | refused): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withOffline(value: OfflineAcceptanceMandate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(js.undefined)
        ret
    }
    @scala.inline
    def withOnline(value: OnlineAcceptanceMandate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("online")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("online")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: online | offline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_agent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_agent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(js.undefined)
        ret
    }
  }
  
}

