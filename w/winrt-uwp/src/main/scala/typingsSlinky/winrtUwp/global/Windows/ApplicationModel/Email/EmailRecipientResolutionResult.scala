package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an attempt to resolve an email recipient. */
@JSGlobal("Windows.ApplicationModel.Email.EmailRecipientResolutionResult")
@js.native
abstract class EmailRecipientResolutionResult ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionResult {
  /** Gets the public key for an email recipient. */
  /* CompleteClass */
  override var publicKeys: IVectorView[Certificate] = js.native
  /** Gets the state of an attempt to resolve an email recipient. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus = js.native
}

