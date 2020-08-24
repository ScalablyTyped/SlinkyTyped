package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.FormatDiagnosticsHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.formatDiagnostics")
@js.native
object formatDiagnostics extends js.Object {
  def apply(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
}

