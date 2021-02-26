package typingsSlinky.vscode.anon

import typingsSlinky.vscode.mod.Range
import typingsSlinky.vscode.mod.TextDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  var document: TextDocument = js.native
  
  var range: Range = js.native
}
object Document {
  
  @scala.inline
  def apply(document: TextDocument, range: Range): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
