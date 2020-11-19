package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "TextDocumentIdentifier")
@js.native
object TextDocumentIdentifier extends js.Object {
  
  /**
    * Creates a new TextDocumentIdentifier literal.
    * @param uri The document's uri.
    */
  def create(uri: DocumentUri): typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier = js.native
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentIdentifier](#TextDocumentIdentifier) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean = js.native
}
