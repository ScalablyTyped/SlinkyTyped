package typingsSlinky.winrtUwp.global.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection has been revoked. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedContentRevokedEventArgs")
@js.native
abstract class ProtectedContentRevokedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectedContentRevokedEventArgs {
  /** Contains the enterprise identities for which content protection has been revoked. */
  /* CompleteClass */
  override var identities: IVectorView[String] = js.native
}

