package typingsSlinky.xhrMock.typesMod

import typingsSlinky.xhrMock.mockRequestMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorCallbackEvent extends js.Object {
  var err: js.Error = js.native
  var req: default = js.native
}

object ErrorCallbackEvent {
  @scala.inline
  def apply(err: js.Error, req: default): ErrorCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCallbackEvent]
  }
  @scala.inline
  implicit class ErrorCallbackEventOps[Self <: ErrorCallbackEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErr(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReq(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

