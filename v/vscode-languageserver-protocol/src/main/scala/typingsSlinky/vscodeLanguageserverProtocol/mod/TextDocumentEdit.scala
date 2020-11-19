package typingsSlinky.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "TextDocumentEdit")
@js.native
object TextDocumentEdit extends js.Object {
  
  /**
    * Creates a new `TextDocumentEdit`
    */
  def create(
    textDocument: typingsSlinky.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier,
    edits: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentEdit = js.native
  
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = js.native
}
