package typingsSlinky.twit.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseResponse extends js.Object {
  var data: Response = js.native
  var resp: IncomingMessage = js.native
}

object PromiseResponse {
  @scala.inline
  def apply(data: Response, resp: IncomingMessage): PromiseResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resp = resp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResponse]
  }
  @scala.inline
  implicit class PromiseResponseOps[Self <: PromiseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResp(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

