package typingsSlinky.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "SignatureInformation")
@js.native
object SignatureInformation extends js.Object {
  def create(label: String): typingsSlinky.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
  def create(
    label: String,
    documentation: String,
    parameters: typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
}

