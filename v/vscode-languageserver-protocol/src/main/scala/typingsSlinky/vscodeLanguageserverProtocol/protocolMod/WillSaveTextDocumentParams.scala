package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WillSaveTextDocumentParams extends StObject {
  
  /**
    * The 'TextDocumentSaveReason'.
    */
  var reason: TextDocumentSaveReason = js.native
  
  /**
    * The document that will be saved.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object WillSaveTextDocumentParams {
  
  @scala.inline
  def apply(reason: TextDocumentSaveReason, textDocument: TextDocumentIdentifier): WillSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[WillSaveTextDocumentParams]
  }
  
  @scala.inline
  implicit class WillSaveTextDocumentParamsMutableBuilder[Self <: WillSaveTextDocumentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: TextDocumentSaveReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
