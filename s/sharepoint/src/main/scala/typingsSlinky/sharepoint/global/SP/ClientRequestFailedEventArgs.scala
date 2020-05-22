package typingsSlinky.sharepoint.global.SP

import typingsSlinky.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientRequestFailedEventArgs")
@js.native
class ClientRequestFailedEventArgs protected ()
  extends typingsSlinky.sharepoint.SP.ClientRequestFailedEventArgs {
  def this(
    request: typingsSlinky.sharepoint.SP.ClientRequest,
    message: String,
    stackTrace: String,
    errorCode: Double,
    errorValue: String,
    errorTypeName: String,
    errorDetails: js.Any
  ) = this()
  def this(
    request: typingsSlinky.sharepoint.SP.ClientRequest,
    message: String,
    stackTrace: String,
    errorCode: Double,
    errorValue: String,
    errorTypeName: String,
    errorDetails: js.Any,
    errorTraceCorrelationId: String
  ) = this()
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  override var Empty: EventArgs = js.native
  /* CompleteClass */
  override def get_errorCode(): Double = js.native
  /* CompleteClass */
  override def get_errorDetails(): js.Any = js.native
  /* CompleteClass */
  override def get_errorTraceCorrelationId(): String = js.native
  /* CompleteClass */
  override def get_errorTypeName(): String = js.native
  /* CompleteClass */
  override def get_errorValue(): String = js.native
  /* CompleteClass */
  override def get_message(): String = js.native
  /* CompleteClass */
  override def get_request(): typingsSlinky.sharepoint.SP.ClientRequest = js.native
  /* CompleteClass */
  override def get_stackTrace(): String = js.native
}

