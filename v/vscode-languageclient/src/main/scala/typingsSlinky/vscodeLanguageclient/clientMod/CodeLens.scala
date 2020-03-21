package typingsSlinky.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CodeLens")
@js.native
object CodeLens extends js.Object {
  /**
    * Creates a new CodeLens literal.
    */
  def create(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range): typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens = js.native
  def create(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range, data: js.Any): typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens = js.native
  /**
    * Checks whether the given literal conforms to the [CodeLens](#CodeLens) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean = js.native
}

