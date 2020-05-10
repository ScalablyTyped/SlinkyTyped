package typingsSlinky.serverless.validateMod

import typingsSlinky.serverless.AnonAuthorizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiGatewayEvent extends js.Object {
  var http: String | AnonAuthorizer = js.native
}

object ApiGatewayEvent {
  @scala.inline
  def apply(http: String | AnonAuthorizer): ApiGatewayEvent = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiGatewayEvent]
  }
  @scala.inline
  implicit class ApiGatewayEventOps[Self <: ApiGatewayEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttp(value: String | AnonAuthorizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

