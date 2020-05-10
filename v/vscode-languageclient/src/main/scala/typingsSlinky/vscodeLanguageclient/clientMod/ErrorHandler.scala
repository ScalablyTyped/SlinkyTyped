package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeJsonrpc.messagesMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorHandler extends js.Object {
  /**
    * The connection to the server got closed.
    */
  def closed(): CloseAction = js.native
  /**
    * An error has occurred while writing or reading from the connection.
    *
    * @param error - the error received
    * @param message - the message to be delivered to the server if know.
    * @param count - a count indicating how often an error is received. Will
    *  be reset if a message got successfully send or received.
    */
  def error(error: js.Error, message: Message, count: Double): ErrorAction = js.native
}

object ErrorHandler {
  @scala.inline
  def apply(closed: () => CloseAction, error: (js.Error, Message, Double) => ErrorAction): ErrorHandler = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction3(error))
    __obj.asInstanceOf[ErrorHandler]
  }
  @scala.inline
  implicit class ErrorHandlerOps[Self <: ErrorHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosed(value: () => CloseAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: (js.Error, Message, Double) => ErrorAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

