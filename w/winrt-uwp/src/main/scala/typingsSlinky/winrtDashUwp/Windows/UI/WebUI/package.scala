package typingsSlinky.winrtDashUwp.Windows.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebUI {
  import typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Activation.IActivatedEventArgs
  import typingsSlinky.winrtDashUwp.Windows.ApplicationModel.ISuspendingEventArgs
  import typingsSlinky.winrtDashUwp.Windows.WinRTEvent

  /** Represents a method that handles the app activation event. */
  type ActivatedEventHandler = js.Function1[/* ev */ IActivatedEventArgs with WinRTEvent[_], Unit]
  /** Represents a method that handles the app navigation event. */
  type NavigatedEventHandler = js.Function1[/* ev */ IWebUINavigatedEventArgs with WinRTEvent[_], Unit]
  /** Represents a method that handles the app resumption event. */
  type ResumingEventHandler = js.Function1[/* ev */ WinRTEvent[js.Any], Unit]
  /** Represents a method that handles the app suspension event. */
  type SuspendingEventHandler = js.Function1[/* ev */ ISuspendingEventArgs with WinRTEvent[_], Unit]
}
