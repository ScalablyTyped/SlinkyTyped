package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentPositionParams extends StObject {
  
  /**
    * The position inside the text document.
    */
  var position: Position = js.native
  
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object TextDocumentPositionParams {
  
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): TextDocumentPositionParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentPositionParams]
  }
  
  @scala.inline
  implicit class TextDocumentPositionParamsMutableBuilder[Self <: TextDocumentPositionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
