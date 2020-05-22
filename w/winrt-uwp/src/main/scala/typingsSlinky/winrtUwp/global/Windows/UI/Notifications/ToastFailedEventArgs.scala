package typingsSlinky.winrtUwp.global.Windows.UI.Notifications

import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the error code that was generated in the process of raising a toast notification. */
@JSGlobal("Windows.UI.Notifications.ToastFailedEventArgs")
@js.native
abstract class ToastFailedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastFailedEventArgs {
  /** Gets the error code that was generated in the process of raising a toast notification. */
  /* CompleteClass */
  override var errorCode: WinRTError = js.native
}

