package typingsSlinky.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyPrepareParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams
object CallHierarchyPrepareParams {
  
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): CallHierarchyPrepareParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyPrepareParams]
  }
}
