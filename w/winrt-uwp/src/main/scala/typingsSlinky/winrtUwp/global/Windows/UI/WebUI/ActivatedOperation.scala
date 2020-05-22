package typingsSlinky.winrtUwp.global.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app activation operation. */
@JSGlobal("Windows.UI.WebUI.ActivatedOperation")
@js.native
abstract class ActivatedOperation ()
  extends typingsSlinky.winrtUwp.Windows.UI.WebUI.ActivatedOperation {
  /**
    * Requests that the completion of app activation be delayed.
    * @return The activation deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): typingsSlinky.winrtUwp.Windows.UI.WebUI.ActivatedDeferral = js.native
}

