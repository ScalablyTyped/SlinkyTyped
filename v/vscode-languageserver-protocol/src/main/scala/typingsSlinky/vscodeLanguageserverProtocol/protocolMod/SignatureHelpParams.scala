package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams {
  
  /**
    * The signature help context. This is only available if the client specifies
    * to send this using the client capability `textDocument.signatureHelp.contextSupport === true`
    *
    * @since 3.15.0
    */
  var context: js.UndefOr[SignatureHelpContext] = js.native
}
object SignatureHelpParams {
  
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): SignatureHelpParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpParams]
  }
  
  @scala.inline
  implicit class SignatureHelpParamsMutableBuilder[Self <: SignatureHelpParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: SignatureHelpContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
