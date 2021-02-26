package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptStrings.characterTyped
import typingsSlinky.typescript.typescriptStrings.invoked
import typingsSlinky.typescript.typescriptStrings.retrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SignatureHelpInvokedReason
  - typingsSlinky.typescript.mod.SignatureHelpCharacterTypedReason
  - typingsSlinky.typescript.mod.SignatureHelpRetriggeredReason
*/
trait SignatureHelpTriggerReason extends StObject
object SignatureHelpTriggerReason {
  
  @scala.inline
  def SignatureHelpCharacterTypedReason(kind: characterTyped, triggerCharacter: SignatureHelpTriggerCharacter): typingsSlinky.typescript.mod.SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.SignatureHelpCharacterTypedReason]
  }
  
  @scala.inline
  def SignatureHelpInvokedReason(kind: invoked): typingsSlinky.typescript.mod.SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.SignatureHelpInvokedReason]
  }
  
  @scala.inline
  def SignatureHelpRetriggeredReason(kind: retrigger): typingsSlinky.typescript.mod.SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.SignatureHelpRetriggeredReason]
  }
}
