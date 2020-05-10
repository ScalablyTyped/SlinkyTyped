package typingsSlinky.sipJs.transactionUserMod

import typingsSlinky.sipJs.logMod.LoggerFactory
import typingsSlinky.sipJs.messagesMod.IncomingResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientTransactionUser extends TransactionUser {
  /**
    * Callback for request timeout error.
    *
    * When a timeout error is received from the transaction layer, it MUST be
    * treated as if a 408 (Request Timeout) status code has been received.
    * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
    * TU MUST be informed of a timeout.
    * https://tools.ietf.org/html/rfc3261#section-17.1.2.2
    */
  var onRequestTimeout: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback for delegation of valid response handling.
    *
    * Valid responses are passed up to the TU from the client transaction.
    * https://tools.ietf.org/html/rfc3261#section-17.1
    */
  var receiveResponse: js.UndefOr[js.Function1[/* response */ IncomingResponseMessage, Unit]] = js.native
}

object ClientTransactionUser {
  @scala.inline
  def apply(loggerFactory: LoggerFactory): ClientTransactionUser = {
    val __obj = js.Dynamic.literal(loggerFactory = loggerFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientTransactionUser]
  }
  @scala.inline
  implicit class ClientTransactionUserOps[Self <: ClientTransactionUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnRequestTimeout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiveResponse(value: /* response */ IncomingResponseMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReceiveResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveResponse")(js.undefined)
        ret
    }
  }
  
}

