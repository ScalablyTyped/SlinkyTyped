package typingsSlinky.vscode.mod

import typingsSlinky.vscode.anon.LanguageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscode.mod.Uri
  - typingsSlinky.vscode.mod.TextDocument
  - typingsSlinky.vscode.mod.WorkspaceFolder
  - typingsSlinky.vscode.anon.LanguageId
*/
trait ConfigurationScope extends js.Object

object ConfigurationScope {
  @scala.inline
  implicit def apply(value: LanguageId): ConfigurationScope = value.asInstanceOf[ConfigurationScope]
  @scala.inline
  implicit def apply(value: TextDocument): ConfigurationScope = value.asInstanceOf[ConfigurationScope]
  @scala.inline
  implicit def apply(value: Uri): ConfigurationScope = value.asInstanceOf[ConfigurationScope]
  @scala.inline
  implicit def apply(value: WorkspaceFolder): ConfigurationScope = value.asInstanceOf[ConfigurationScope]
}

