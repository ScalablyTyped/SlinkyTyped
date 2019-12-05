package typingsSlinky.winrtDashUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Capture {
  import typingsSlinky.winrtDashUwp.Windows.WinRTEvent

  /** Represents the method that will handle the MediaCapture.Failed event. */
  type MediaCaptureFailedEventHandler = js.Function1[/* ev */ MediaCaptureFailedEventArgs with WinRTEvent[MediaCapture], Unit]
  /** Represents the method that will handle RecordLimitationExceeded and related events. */
  type RecordLimitationExceededEventHandler = js.Function1[/* ev */ WinRTEvent[MediaCapture], Unit]
}
