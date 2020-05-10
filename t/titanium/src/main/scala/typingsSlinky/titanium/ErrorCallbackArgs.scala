package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Network.Socket.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object passed to the error callback when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
  */
@js.native
trait ErrorCallbackArgs extends FailureResponse {
  /**
  	 * Socket that experienced the error.
  	 */
  var socket: js.UndefOr[TCP] = js.native
}

object ErrorCallbackArgs {
  @scala.inline
  def apply(): ErrorCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorCallbackArgs]
  }
  @scala.inline
  implicit class ErrorCallbackArgsOps[Self <: ErrorCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSocket(value: TCP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
  }
  
}

