package typingsSlinky.winrtDashUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Store {
  import typingsSlinky.winrtDashUwp.Windows.WinRTEvent

  /** Represents the method that will handle the LicenseChanged event. */
  type LicenseChangedEventHandler = js.Function1[/* ev */ WinRTEvent[Unit], Unit]
}
