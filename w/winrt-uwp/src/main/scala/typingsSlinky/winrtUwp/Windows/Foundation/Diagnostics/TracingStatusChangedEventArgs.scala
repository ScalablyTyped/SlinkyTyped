package typingsSlinky.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TracingStatusChanged event. */
@js.native
trait TracingStatusChangedEventArgs extends js.Object {
  /** Gets a value that indicates whether tracing is active. */
  var enabled: Boolean = js.native
  /** Gets the trace level for the current tracing session. */
  var traceLevel: CausalityTraceLevel = js.native
}

object TracingStatusChangedEventArgs {
  @scala.inline
  def apply(enabled: Boolean, traceLevel: CausalityTraceLevel): TracingStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], traceLevel = traceLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingStatusChangedEventArgs]
  }
  @scala.inline
  implicit class TracingStatusChangedEventArgsOps[Self <: TracingStatusChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceLevel(value: CausalityTraceLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

