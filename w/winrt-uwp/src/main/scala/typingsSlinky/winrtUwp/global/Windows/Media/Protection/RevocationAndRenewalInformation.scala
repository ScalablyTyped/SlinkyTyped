package typingsSlinky.winrtUwp.global.Windows.Media.Protection

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about components that need to be revoked and renewed. */
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalInformation")
@js.native
abstract class RevocationAndRenewalInformation ()
  extends typingsSlinky.winrtUwp.Windows.Media.Protection.RevocationAndRenewalInformation {
  /** Returns a list of components that need to be revoked and renewed with updated components. */
  /* CompleteClass */
  override var items: IVector[typingsSlinky.winrtUwp.Windows.Media.Protection.RevocationAndRenewalItem] = js.native
}

