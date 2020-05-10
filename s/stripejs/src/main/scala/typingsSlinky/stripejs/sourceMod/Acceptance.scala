package typingsSlinky.stripejs.sourceMod

import typingsSlinky.stripejs.stripejsStrings.accepted
import typingsSlinky.stripejs.stripejsStrings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acceptance extends js.Object {
  /**
    * The unix timestamp the mandate was accepted or refused at by the customer.
    */
  var date: Double = js.native
  /**
    * The unix timestamp the mandate was accepted or refused at by the customer.
    */
  var ip: String = js.native
  /**
    * The status of the mandate acceptance
    */
  var status: accepted | refused = js.native
  /**
    * The user agent of the browser from which the mandate was accepted or refused by the customer
    * NOTE: This can be unset by updating the value to `null` and then saving
    */
  var user_agent: String = js.native
}

object Acceptance {
  @scala.inline
  def apply(date: Double, ip: String, status: accepted | refused, user_agent: String): Acceptance = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acceptance]
  }
  @scala.inline
  implicit class AcceptanceOps[Self <: Acceptance] (val x: Self) extends AnyVal {
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
    def withStatus(value: accepted | refused): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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

