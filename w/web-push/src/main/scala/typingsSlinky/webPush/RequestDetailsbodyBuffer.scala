package typingsSlinky.webPush

import typingsSlinky.node.Buffer
import typingsSlinky.webPush.mod.Headers
import typingsSlinky.webPush.webPushStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined web-push.web-push.RequestDetails & {  body  :node.Buffer} */
@js.native
trait RequestDetailsbodyBuffer extends js.Object {
  var body: (Buffer | Null) with Buffer = js.native
  var endpoint: String = js.native
  var headers: Headers = js.native
  var method: POST = js.native
  var proxy: js.UndefOr[String] = js.native
}

object RequestDetailsbodyBuffer {
  @scala.inline
  def apply(body: (Buffer | Null) with Buffer, endpoint: String, headers: Headers, method: POST): RequestDetailsbodyBuffer = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetailsbodyBuffer]
  }
  @scala.inline
  implicit class RequestDetailsbodyBufferOps[Self <: RequestDetailsbodyBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: (Buffer | Null) with Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: POST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
  }
  
}

