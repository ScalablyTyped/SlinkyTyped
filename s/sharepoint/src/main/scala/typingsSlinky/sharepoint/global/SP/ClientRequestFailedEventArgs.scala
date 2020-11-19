package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
