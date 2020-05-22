package typingsSlinky.xhrMock.typesMod

import typingsSlinky.xhrMock.mockRequestMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCallbackEvent extends js.Object {
  var err: js.Error
  var req: default
}

object ErrorCallbackEvent {
  @scala.inline
  def apply(err: js.Error, req: default): ErrorCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCallbackEvent]
  }
}

