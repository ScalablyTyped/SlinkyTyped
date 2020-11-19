package typingsSlinky.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "SignatureInformation")
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
