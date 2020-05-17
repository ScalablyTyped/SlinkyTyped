package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SignatureHelpInvokedReason
  - typingsSlinky.typescript.mod.SignatureHelpCharacterTypedReason
  - typingsSlinky.typescript.mod.SignatureHelpRetriggeredReason
*/
trait SignatureHelpTriggerReason extends js.Object

object SignatureHelpTriggerReason {
  @scala.inline
  implicit def apply(value: SignatureHelpCharacterTypedReason): SignatureHelpTriggerReason = value.asInstanceOf[SignatureHelpTriggerReason]
  @scala.inline
  implicit def apply(value: SignatureHelpInvokedReason): SignatureHelpTriggerReason = value.asInstanceOf[SignatureHelpTriggerReason]
  @scala.inline
  implicit def apply(value: SignatureHelpRetriggeredReason): SignatureHelpTriggerReason = value.asInstanceOf[SignatureHelpTriggerReason]
}

