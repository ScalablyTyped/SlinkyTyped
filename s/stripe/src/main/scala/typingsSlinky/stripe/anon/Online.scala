package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.accepted
import typingsSlinky.stripe.stripeStrings.offline
import typingsSlinky.stripe.stripeStrings.online
import typingsSlinky.stripe.stripeStrings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Online extends js.Object {
  var date: js.UndefOr[Double] = js.native
  var ip: js.UndefOr[String] = js.native
  var offline: js.UndefOr[Contactemail] = js.native
  var online: js.UndefOr[Useragent] = js.native
  var status: accepted | refused = js.native
  var `type`: online | offline = js.native
  var user_agent: js.UndefOr[String] = js.native
}

object Online {
  @scala.inline
  def apply(status: accepted | refused, `type`: online | offline): Online = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Online]
  }
  @scala.inline
  implicit class OnlineOps[Self <: Online] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: accepted | refused): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: online | offline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
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
    def withOffline(value: Contactemail): Self = {
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
    def withOnline(value: Useragent): Self = {
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

