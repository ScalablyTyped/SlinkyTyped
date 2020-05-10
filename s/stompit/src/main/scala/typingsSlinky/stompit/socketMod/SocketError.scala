package typingsSlinky.stompit.socketMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketError extends Error {
  def isApplicationError(): Boolean = js.native
  def isProtocolError(): Boolean = js.native
  def isTransportError(): Boolean = js.native
}

object SocketError {
  @scala.inline
  def apply(
    isApplicationError: () => Boolean,
    isProtocolError: () => Boolean,
    isTransportError: () => Boolean,
    message: String,
    name: String
  ): SocketError = {
    val __obj = js.Dynamic.literal(isApplicationError = js.Any.fromFunction0(isApplicationError), isProtocolError = js.Any.fromFunction0(isProtocolError), isTransportError = js.Any.fromFunction0(isTransportError), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketError]
  }
  @scala.inline
  implicit class SocketErrorOps[Self <: SocketError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsApplicationError(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isApplicationError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsProtocolError(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProtocolError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTransportError(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransportError")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

