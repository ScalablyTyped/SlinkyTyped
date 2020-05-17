package typingsSlinky.winrtUwp.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the ticket that is obtained after the user authenticates to this app or has provided consent to access user data stored in Live. */
@js.native
trait OnlineIdServiceTicket extends js.Object {
  /** If there was an error in obtaining the ticket, then the error code is captured here. */
  var errorCode: Double = js.native
  /** Represents the OnlineIdServiceTicketRequest for which the ticket was obtained. */
  var request: OnlineIdServiceTicketRequest = js.native
  /** The ticket. */
  var value: String = js.native
}

object OnlineIdServiceTicket {
  @scala.inline
  def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): OnlineIdServiceTicket = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlineIdServiceTicket]
  }
  @scala.inline
  implicit class OnlineIdServiceTicketOps[Self <: OnlineIdServiceTicket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: OnlineIdServiceTicketRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

