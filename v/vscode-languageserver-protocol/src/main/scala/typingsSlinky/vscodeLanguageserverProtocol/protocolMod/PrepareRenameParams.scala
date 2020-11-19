package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrepareRenameParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams
object PrepareRenameParams {
  
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): PrepareRenameParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareRenameParams]
  }
}
