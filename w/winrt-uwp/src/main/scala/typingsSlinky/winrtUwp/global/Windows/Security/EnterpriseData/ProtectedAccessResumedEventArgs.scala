package typingsSlinky.winrtUwp.global.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection is resumed. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedAccessResumedEventArgs")
@js.native
abstract class ProtectedAccessResumedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectedAccessResumedEventArgs {
  /** Contains the enterprise identities for which content protection is being resumed. */
  /* CompleteClass */
  override var identities: IVectorView[String] = js.native
}

