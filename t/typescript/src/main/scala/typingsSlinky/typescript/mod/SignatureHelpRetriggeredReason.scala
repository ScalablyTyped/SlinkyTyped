package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptStrings.retrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals that this signature help request came from typing a character or moving the cursor.
  * This should only occur if a signature help session was already active and the editor needs to see if it should adjust.
  * The language service will unconditionally attempt to provide a result.
  * `triggerCharacter` can be `undefined` for a retrigger caused by a cursor move.
  */
@js.native
trait SignatureHelpRetriggeredReason extends SignatureHelpTriggerReason {
  
  var kind: retrigger = js.native
  
  /**
    * Character that was responsible for triggering signature help.
    */
  var triggerCharacter: js.UndefOr[SignatureHelpRetriggerCharacter] = js.native
}
object SignatureHelpRetriggeredReason {
  
  @scala.inline
  def apply(kind: retrigger): SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpRetriggeredReason]
  }
  
  @scala.inline
  implicit class SignatureHelpRetriggeredReasonMutableBuilder[Self <: SignatureHelpRetriggeredReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: retrigger): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacter(value: SignatureHelpRetriggerCharacter): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
  }
}
