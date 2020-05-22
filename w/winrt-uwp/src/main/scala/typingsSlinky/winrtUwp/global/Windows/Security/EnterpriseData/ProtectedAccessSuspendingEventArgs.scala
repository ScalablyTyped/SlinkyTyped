package typingsSlinky.winrtUwp.global.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection is being suspended. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedAccessSuspendingEventArgs")
@js.native
abstract class ProtectedAccessSuspendingEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectedAccessSuspendingEventArgs {
  /** DateTime at which content protection will be suspended. The app can subtract DateTime.Now from this value to determine how much time there is to perform any processing before the suspension occurs. */
  /* CompleteClass */
  override var deadline: js.Date = js.native
  /** Contains the enterprise identities for which content protection is being suspended. */
  /* CompleteClass */
  override var identities: IVectorView[String] = js.native
  /**
    * Gets the Deferral object that manages the protection suspension. The app must call Deferral.Complete before it returns from the event handler.
    * @return The Deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

