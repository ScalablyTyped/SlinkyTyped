package typingsSlinky.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides error information. */
@JSGlobal("Windows.Devices.PointOfService.UnifiedPosErrorData")
@js.native
abstract class UnifiedPosErrorData ()
  extends typingsSlinky.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorData {
  /** Gets the vendor specific error information. */
  /* CompleteClass */
  override var extendedReason: Double = js.native
  /** Gets the error message. */
  /* CompleteClass */
  override var message: String = js.native
  /** Gets the cause of the error. */
  /* CompleteClass */
  override var reason: typingsSlinky.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorReason = js.native
  /** Gets the error severity. */
  /* CompleteClass */
  override var severity: typingsSlinky.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorSeverity = js.native
}

