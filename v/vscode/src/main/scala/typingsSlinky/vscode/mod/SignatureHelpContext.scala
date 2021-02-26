package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpContext extends StObject {
  
  /**
    * The currently active [`SignatureHelp`](#SignatureHelp).
    *
    * The `activeSignatureHelp` has its [`SignatureHelp.activeSignature`] field updated based on
    * the user arrowing through available signatures.
    */
  val activeSignatureHelp: js.UndefOr[SignatureHelp] = js.native
  
  /**
    * `true` if signature help was already showing when it was triggered.
    *
    * Retriggers occur when the signature help is already active and can be caused by actions such as
    * typing a trigger character, a cursor move, or document content changes.
    */
  val isRetrigger: Boolean = js.native
  
  /**
    * Character that caused signature help to be triggered.
    *
    * This is `undefined` when signature help is not triggered by typing, such as when manually invoking
    * signature help or when moving the cursor.
    */
  val triggerCharacter: js.UndefOr[String] = js.native
  
  /**
    * Action that caused signature help to be triggered.
    */
  val triggerKind: SignatureHelpTriggerKind = js.native
}
object SignatureHelpContext {
  
  @scala.inline
  def apply(isRetrigger: Boolean, triggerKind: SignatureHelpTriggerKind): SignatureHelpContext = {
    val __obj = js.Dynamic.literal(isRetrigger = isRetrigger.asInstanceOf[js.Any], triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpContext]
  }
  
  @scala.inline
  implicit class SignatureHelpContextMutableBuilder[Self <: SignatureHelpContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSignatureHelp(value: SignatureHelp): Self = StObject.set(x, "activeSignatureHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSignatureHelpUndefined: Self = StObject.set(x, "activeSignatureHelp", js.undefined)
    
    @scala.inline
    def setIsRetrigger(value: Boolean): Self = StObject.set(x, "isRetrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacter(value: String): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
    
    @scala.inline
    def setTriggerKind(value: SignatureHelpTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
  }
}
