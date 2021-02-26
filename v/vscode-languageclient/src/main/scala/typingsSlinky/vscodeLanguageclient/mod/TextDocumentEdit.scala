package typingsSlinky.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocumentEdit {
  
  /**
    * Creates a new `TextDocumentEdit`
    */
  @JSImport("vscode-languageclient", "TextDocumentEdit.create")
  @js.native
  def create(
    textDocument: typingsSlinky.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier,
    edits: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentEdit = js.native
  
  @JSImport("vscode-languageclient", "TextDocumentEdit.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = js.native
}
