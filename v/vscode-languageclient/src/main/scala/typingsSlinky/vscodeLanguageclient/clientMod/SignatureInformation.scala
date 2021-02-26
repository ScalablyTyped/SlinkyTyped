package typingsSlinky.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureInformation {
  
  @JSImport("vscode-languageclient/lib/client", "SignatureInformation.create")
  @js.native
  def create(
    label: String,
    documentation: js.UndefOr[scala.Nothing],
    parameters: typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
  @JSImport("vscode-languageclient/lib/client", "SignatureInformation.create")
  @js.native
  def create(
    label: String,
    documentation: String,
    parameters: typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
}
