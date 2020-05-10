package typingsSlinky.sipJs.transactionUserMod

import typingsSlinky.sipJs.coreExceptionsMod.TransportError
import typingsSlinky.sipJs.logMod.LoggerFactory
import typingsSlinky.sipJs.transactionStateMod.TransactionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionUser extends js.Object {
  /**
    * Logger factory.
    */
  var loggerFactory: LoggerFactory = js.native
  /**
    * Callback for notification of transaction state changes.
    *
    * Not called when transaction is constructed, so there is
    * no notification of entering the initial transaction state.
    * Otherwise, called once for each transaction state change.
    * State changes adhere to the following RFCs.
    * https://tools.ietf.org/html/rfc3261#section-17
    * https://tools.ietf.org/html/rfc6026
    */
  var onStateChange: js.UndefOr[js.Function1[/* newState */ TransactionState, Unit]] = js.native
  /**
    * Callback for notification of a transport error.
    *
    * If a fatal transport error is reported by the transport layer
    * (generally, due to fatal ICMP errors in UDP or connection failures in
    * TCP), the condition MUST be treated as a 503 (Service Unavailable)
    * status code.
    * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
    * https://tools.ietf.org/html/rfc3261#section-17.1.4
    * https://tools.ietf.org/html/rfc3261#section-17.2.4
    * https://tools.ietf.org/html/rfc6026
    */
  var onTransportError: js.UndefOr[js.Function1[/* error */ TransportError, Unit]] = js.native
}

object TransactionUser {
  @scala.inline
  def apply(loggerFactory: LoggerFactory): TransactionUser = {
    val __obj = js.Dynamic.literal(loggerFactory = loggerFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionUser]
  }
  @scala.inline
  implicit class TransactionUserOps[Self <: TransactionUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggerFactory(value: LoggerFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnStateChange(value: /* newState */ TransactionState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransportError(value: /* error */ TransportError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransportError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransportError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransportError")(js.undefined)
        ret
    }
  }
  
}

