package typingsSlinky.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  /**
    * Creates a new Diagnostic literal.
    */
  def create(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range, message: String): typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticSeverity
  ): typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String
  ): typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String
  ): typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double
  ): typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double,
    source: String
  ): typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double,
    source: String,
    relatedInformation: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  /**
    * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = js.native
}

