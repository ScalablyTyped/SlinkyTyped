package typingsSlinky.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "DiagnosticRelatedInformation")
@js.native
object DiagnosticRelatedInformation extends js.Object {
  
  /**
    * Creates a new DiagnosticRelatedInformation literal.
    */
  def create(location: typingsSlinky.vscodeLanguageserverTypes.mod.Location, message: String): typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation = js.native
  
  /**
    * Checks whether the given literal conforms to the [DiagnosticRelatedInformation](#DiagnosticRelatedInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DiagnosticRelatedInformation */ Boolean = js.native
}
