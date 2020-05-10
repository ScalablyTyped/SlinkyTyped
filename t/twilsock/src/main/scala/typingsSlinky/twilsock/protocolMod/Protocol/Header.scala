package typingsSlinky.twilsock.protocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  var http_request: js.UndefOr[Request] = js.native
  var id: js.UndefOr[String] = js.native
  var method: MessageType = js.native
  var notification_ctx_id: js.UndefOr[String] = js.native
  var payload_size: js.UndefOr[Double] = js.native
  var payload_type: js.UndefOr[String] = js.native
}

object Header {
  @scala.inline
  def apply(method: MessageType): Header = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: MessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp_request(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp_request: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http_request")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification_ctx_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification_ctx_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification_ctx_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification_ctx_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload_size")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload_type")(js.undefined)
        ret
    }
  }
  
}

