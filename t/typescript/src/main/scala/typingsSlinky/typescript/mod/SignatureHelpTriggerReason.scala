package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptStrings.characterTyped
import typingsSlinky.typescript.typescriptStrings.invoked
import typingsSlinky.typescript.typescriptStrings.retrigger
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
  def SignatureHelpInvokedReason(kind: invoked, triggerCharacter: js.UndefOr[scala.Nothing] = js.undefined): SignatureHelpTriggerReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerCharacter)) __obj.updateDynamic("triggerCharacter")(triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpTriggerReason]
  }
  @scala.inline
  def SignatureHelpCharacterTypedReason(kind: characterTyped, triggerCharacter: SignatureHelpTriggerCharacter): SignatureHelpTriggerReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignatureHelpTriggerReason]
  }
  @scala.inline
  def SignatureHelpRetriggeredReason(kind: retrigger, triggerCharacter: SignatureHelpRetriggerCharacter = null): SignatureHelpTriggerReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpTriggerReason]
  }
}

