package typingsSlinky.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DiagnosticRelatedInformation")
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

