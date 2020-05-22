package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the deferral process. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangedEventArgs")
@js.native
abstract class EmailMailboxChangedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChangedEventArgs {
  /**
    * Gets the deferral object.
    * @return The deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChangedDeferral = js.native
}

