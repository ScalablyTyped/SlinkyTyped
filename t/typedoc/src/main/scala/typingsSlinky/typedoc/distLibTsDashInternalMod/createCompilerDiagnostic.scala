package typingsSlinky.typedoc.distLibTsDashInternalMod

import typingsSlinky.typescript.typescriptMod.Diagnostic
import typingsSlinky.typescript.typescriptMod.DiagnosticMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/ts-internal", "createCompilerDiagnostic")
@js.native
object createCompilerDiagnostic extends js.Object {
  def apply(message: DiagnosticMessage): Diagnostic = js.native
  def apply(message: DiagnosticMessage, args: (String | Double)*): Diagnostic = js.native
}

