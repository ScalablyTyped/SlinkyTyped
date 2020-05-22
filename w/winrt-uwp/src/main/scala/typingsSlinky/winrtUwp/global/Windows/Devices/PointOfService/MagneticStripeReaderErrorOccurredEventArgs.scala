package typingsSlinky.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides error information for the ErrorOccurred event. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderErrorOccurredEventArgs")
@js.native
abstract class MagneticStripeReaderErrorOccurredEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderErrorOccurredEventArgs {
  /** Gets the error information, such as cause of error, severity, error message, and any available vendor specific error information. */
  /* CompleteClass */
  override var errorData: typingsSlinky.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorData = js.native
  /** Gets the track data for tracks the did not have errors. */
  /* CompleteClass */
  override var partialInputData: typingsSlinky.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderReport = js.native
  /** Gets the Track 1 error information. */
  /* CompleteClass */
  override var track1Status: typingsSlinky.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType = js.native
  /** Gets the Track 2 error information. */
  /* CompleteClass */
  override var track2Status: typingsSlinky.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType = js.native
  /** Gets the Track 3 error information. */
  /* CompleteClass */
  override var track3Status: typingsSlinky.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType = js.native
  /** Gets the Track 4 error information. */
  /* CompleteClass */
  override var track4Status: typingsSlinky.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType = js.native
}

