package typingsSlinky.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ColorPresentation")
@js.native
object ColorPresentation extends js.Object {
  /**
    * Creates a new ColorInformation literal.
    */
  def create(label: String): typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  def create(label: String, textEdit: typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit): typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  def create(
    label: String,
    textEdit: typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit,
    additionalTextEdits: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = js.native
}

