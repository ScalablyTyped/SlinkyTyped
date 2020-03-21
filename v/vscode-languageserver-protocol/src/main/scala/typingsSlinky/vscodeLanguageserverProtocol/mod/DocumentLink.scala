package typingsSlinky.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DocumentLink")
@js.native
object DocumentLink extends js.Object {
  /**
    * Creates a new DocumentLink literal.
    */
  def create(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  def create(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range, target: String): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  def create(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range, target: String, data: js.Any): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = js.native
}

