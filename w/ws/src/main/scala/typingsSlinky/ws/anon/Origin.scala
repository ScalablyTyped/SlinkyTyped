package typingsSlinky.ws.anon

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origin extends js.Object {
  var origin: String = js.native
  var req: IncomingMessage = js.native
  var secure: Boolean = js.native
}

object Origin {
  @scala.inline
  def apply(origin: String, req: IncomingMessage, secure: Boolean): Origin = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
  @scala.inline
  implicit class OriginOps[Self <: Origin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReq(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

