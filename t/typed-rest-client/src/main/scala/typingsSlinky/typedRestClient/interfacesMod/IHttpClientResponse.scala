package typingsSlinky.typedRestClient.interfacesMod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpClientResponse extends js.Object {
  var message: IncomingMessage = js.native
  def readBody(): js.Promise[String] = js.native
}

object IHttpClientResponse {
  @scala.inline
  def apply(message: IncomingMessage, readBody: () => js.Promise[String]): IHttpClientResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], readBody = js.Any.fromFunction0(readBody))
    __obj.asInstanceOf[IHttpClientResponse]
  }
  @scala.inline
  implicit class IHttpClientResponseOps[Self <: IHttpClientResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadBody(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBody")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

