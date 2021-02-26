package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionContext
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeActionParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * Context carrying additional information.
    */
  var context: CodeActionContext = js.native
  
  /**
    * The range for which the command was invoked.
    */
  var range: Range = js.native
  
  /**
    * The document in which the command was invoked.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object CodeActionParams {
  
  @scala.inline
  def apply(context: CodeActionContext, range: Range, textDocument: TextDocumentIdentifier): CodeActionParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionParams]
  }
  
  @scala.inline
  implicit class CodeActionParamsMutableBuilder[Self <: CodeActionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: CodeActionContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
