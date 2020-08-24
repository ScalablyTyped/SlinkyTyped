package typingsSlinky.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "SignatureInformation")
@js.native
object SignatureInformation extends js.Object {
  def create(
    label: String,
    documentation: js.UndefOr[scala.Nothing],
    parameters: typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
  def create(
    label: String,
    documentation: String,
    parameters: typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
}

