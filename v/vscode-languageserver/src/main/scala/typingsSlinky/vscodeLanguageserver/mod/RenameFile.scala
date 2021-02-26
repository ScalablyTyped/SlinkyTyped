package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentUri
import typingsSlinky.vscodeLanguageserverTypes.mod.RenameFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenameFile {
  
  @JSImport("vscode-languageserver", "RenameFile.create")
  @js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri): typingsSlinky.vscodeLanguageserverTypes.mod.RenameFile = js.native
  @JSImport("vscode-languageserver", "RenameFile.create")
  @js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): typingsSlinky.vscodeLanguageserverTypes.mod.RenameFile = js.native
  
  @JSImport("vscode-languageserver", "RenameFile.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
}
