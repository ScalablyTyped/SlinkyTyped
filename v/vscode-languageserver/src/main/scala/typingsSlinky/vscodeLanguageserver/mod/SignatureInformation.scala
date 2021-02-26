package typingsSlinky.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureInformation {
  
  @JSImport("vscode-languageserver", "SignatureInformation.create")
  @js.native
  def create(
    label: String,
    documentation: js.UndefOr[scala.Nothing],
    parameters: typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
  @JSImport("vscode-languageserver", "SignatureInformation.create")
  @js.native
  def create(
    label: String,
    documentation: String,
    parameters: typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
}
