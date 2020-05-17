package typingsSlinky.sharepoint.SP

import typingsSlinky.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientRequestFailedEventArgs extends ClientRequestEventArgs {
  def get_errorCode(): Double = js.native
  def get_errorDetails(): js.Any = js.native
  def get_errorTraceCorrelationId(): String = js.native
  def get_errorTypeName(): String = js.native
  def get_errorValue(): String = js.native
  def get_message(): String = js.native
  def get_stackTrace(): String = js.native
}

object ClientRequestFailedEventArgs {
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_errorCode: () => Double,
    get_errorDetails: () => js.Any,
    get_errorTraceCorrelationId: () => String,
    get_errorTypeName: () => String,
    get_errorValue: () => String,
    get_message: () => String,
    get_request: () => ClientRequest,
    get_stackTrace: () => String
  ): ClientRequestFailedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_errorCode = js.Any.fromFunction0(get_errorCode), get_errorDetails = js.Any.fromFunction0(get_errorDetails), get_errorTraceCorrelationId = js.Any.fromFunction0(get_errorTraceCorrelationId), get_errorTypeName = js.Any.fromFunction0(get_errorTypeName), get_errorValue = js.Any.fromFunction0(get_errorValue), get_message = js.Any.fromFunction0(get_message), get_request = js.Any.fromFunction0(get_request), get_stackTrace = js.Any.fromFunction0(get_stackTrace))
    __obj.asInstanceOf[ClientRequestFailedEventArgs]
  }
  @scala.inline
  implicit class ClientRequestFailedEventArgsOps[Self <: ClientRequestFailedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_errorCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errorCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_errorDetails(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errorDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_errorTraceCorrelationId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errorTraceCorrelationId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_errorTypeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errorTypeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_errorValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errorValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_message(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_message")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_stackTrace(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_stackTrace")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

