package typingsSlinky.winrtUwp.global.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FocusChanged event. */
@JSGlobal("Windows.Media.Capture.MediaCaptureFocusChangedEventArgs")
@js.native
abstract class MediaCaptureFocusChangedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.Capture.MediaCaptureFocusChangedEventArgs {
  /** Gets the current focus state of the capture device. */
  /* CompleteClass */
  override var focusState: MediaCaptureFocusState = js.native
}

