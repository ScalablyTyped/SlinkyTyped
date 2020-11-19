package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverTypes.mod.DeleteFileOptions
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "DeleteFile")
@js.native
object DeleteFile extends js.Object {
  
  def create(uri: DocumentUri): typingsSlinky.vscodeLanguageserverTypes.mod.DeleteFile = js.native
  def create(uri: DocumentUri, options: DeleteFileOptions): typingsSlinky.vscodeLanguageserverTypes.mod.DeleteFile = js.native
  
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = js.native
}
