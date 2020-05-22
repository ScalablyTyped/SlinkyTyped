package typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics

import typingsSlinky.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ResponseReceived event. */
trait HttpDiagnosticProviderResponseReceivedEventArgs extends js.Object {
  /** Gets a locally unique ID for this activity, for correlating with other events. */
  var activityId: String
  /** Gets the HttpResponseMessage including headers, the status code, and data. */
  var message: HttpResponseMessage
  /** Gets the timestamp of when the HttpResponseMessage was received. */
  var timestamp: js.Date
}

object HttpDiagnosticProviderResponseReceivedEventArgs {
  @scala.inline
  def apply(activityId: String, message: HttpResponseMessage, timestamp: js.Date): HttpDiagnosticProviderResponseReceivedEventArgs = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticProviderResponseReceivedEventArgs]
  }
}

