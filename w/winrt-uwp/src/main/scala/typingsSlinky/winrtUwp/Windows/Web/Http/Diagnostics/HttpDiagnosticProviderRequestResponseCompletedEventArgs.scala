package typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the RequestResponseCompleted event. */
@js.native
trait HttpDiagnosticProviderRequestResponseCompletedEventArgs extends js.Object {
  /** Gets a locally unique ID for this activity, for correlating with other events. */
  var activityId: String = js.native
  /** Gets the type of operation initiating this request. */
  var initiator: HttpDiagnosticRequestInitiator = js.native
  var processId: js.Any = js.native
   /* unmapped type */ /** Gets the URI of the requested response. */
  var requestedUri: Uri = js.native
  var sourceLocations: js.Any = js.native
   /* unmapped type */ var threadId: js.Any = js.native
   /* unmapped type */ /** Gets the timestamp for connection events. */
  var timestamps: HttpDiagnosticProviderRequestResponseTimestamps = js.native
}

object HttpDiagnosticProviderRequestResponseCompletedEventArgs {
  @scala.inline
  def apply(
    activityId: String,
    initiator: HttpDiagnosticRequestInitiator,
    processId: js.Any,
    requestedUri: Uri,
    sourceLocations: js.Any,
    threadId: js.Any,
    timestamps: HttpDiagnosticProviderRequestResponseTimestamps
  ): HttpDiagnosticProviderRequestResponseCompletedEventArgs = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], sourceLocations = sourceLocations.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any], timestamps = timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticProviderRequestResponseCompletedEventArgs]
  }
  @scala.inline
  implicit class HttpDiagnosticProviderRequestResponseCompletedEventArgsOps[Self <: HttpDiagnosticProviderRequestResponseCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitiator(value: HttpDiagnosticRequestInitiator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLocations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreadId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamps(value: HttpDiagnosticProviderRequestResponseTimestamps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

