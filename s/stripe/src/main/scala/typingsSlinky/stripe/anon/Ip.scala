package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ip extends js.Object {
  var date: Double = js.native
  var ip: String = js.native
  var user_agent: String = js.native
}

object Ip {
  @scala.inline
  def apply(date: Double, ip: String, user_agent: String): Ip = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
  @scala.inline
  implicit class IpOps[Self <: Ip] (val x: Self) extends AnyVal {
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
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_agent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

