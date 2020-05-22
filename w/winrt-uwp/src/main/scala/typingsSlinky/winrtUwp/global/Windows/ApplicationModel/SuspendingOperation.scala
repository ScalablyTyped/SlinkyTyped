package typingsSlinky.winrtUwp.global.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about an app suspending operation. */
@JSGlobal("Windows.ApplicationModel.SuspendingOperation")
@js.native
abstract class SuspendingOperation ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.SuspendingOperation {
  /** Gets the time remaining before a delayed app suspending operation continues. */
  /* CompleteClass */
  override var deadline: js.Date = js.native
  /**
    * Requests that the app suspending operation be delayed.
    * @return The suspension deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typingsSlinky.winrtUwp.Windows.ApplicationModel.SuspendingDeferral = js.native
}

