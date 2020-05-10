package typingsSlinky.semanticUiApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'statusMessage'> */
@js.native
trait PickImplstatusMessage extends js.Object {
  var statusMessage: String = js.native
}

object PickImplstatusMessage {
  @scala.inline
  def apply(statusMessage: String): PickImplstatusMessage = {
    val __obj = js.Dynamic.literal(statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstatusMessage]
  }
  @scala.inline
  implicit class PickImplstatusMessageOps[Self <: PickImplstatusMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

