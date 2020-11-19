package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentUri
import typingsSlinky.vscodeLanguageserverTypes.mod.RenameFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "RenameFile")
@js.native
object RenameFile extends js.Object {
  
  def create(oldUri: DocumentUri, newUri: DocumentUri): typingsSlinky.vscodeLanguageserverTypes.mod.RenameFile = js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): typingsSlinky.vscodeLanguageserverTypes.mod.RenameFile = js.native
  
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
}
