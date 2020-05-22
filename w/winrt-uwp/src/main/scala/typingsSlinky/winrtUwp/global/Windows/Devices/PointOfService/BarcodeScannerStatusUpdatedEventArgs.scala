package typingsSlinky.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an operation status change. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerStatusUpdatedEventArgs")
@js.native
abstract class BarcodeScannerStatusUpdatedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerStatusUpdatedEventArgs {
  /** Gets the vendor specific status code. */
  /* CompleteClass */
  override var extendedStatus: Double = js.native
  /** Gets the status change information. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerStatus = js.native
}

