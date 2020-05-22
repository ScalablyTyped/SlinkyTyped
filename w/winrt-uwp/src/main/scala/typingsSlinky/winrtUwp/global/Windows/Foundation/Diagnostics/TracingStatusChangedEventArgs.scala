package typingsSlinky.winrtUwp.global.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TracingStatusChanged event. */
@JSGlobal("Windows.Foundation.Diagnostics.TracingStatusChangedEventArgs")
@js.native
abstract class TracingStatusChangedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Foundation.Diagnostics.TracingStatusChangedEventArgs {
  /** Gets a value that indicates whether tracing is active. */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /** Gets the trace level for the current tracing session. */
  /* CompleteClass */
  override var traceLevel: typingsSlinky.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel = js.native
}

