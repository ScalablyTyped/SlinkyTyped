package typingsSlinky.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareTicket extends js.Object {
  var shareTicket: String = js.native
  var timeout: Double = js.native
}

object ShareTicket {
  @scala.inline
  def apply(shareTicket: String, timeout: Double): ShareTicket = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTicket]
  }
  @scala.inline
  implicit class ShareTicketOps[Self <: ShareTicket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShareTicket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareTicket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

