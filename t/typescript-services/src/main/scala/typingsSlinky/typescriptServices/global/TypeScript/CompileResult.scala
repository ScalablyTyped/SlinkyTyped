package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CompileResult")
@js.native
class CompileResult ()
  extends typingsSlinky.typescriptServices.TypeScript.CompileResult {
  /* CompleteClass */
  override var diagnostics: js.Array[typingsSlinky.typescriptServices.TypeScript.Diagnostic] = js.native
  /* CompleteClass */
  override var outputFiles: js.Array[typingsSlinky.typescriptServices.TypeScript.OutputFile] = js.native
}

/* static members */
@JSGlobal("TypeScript.CompileResult")
@js.native
object CompileResult extends js.Object {
  def fromDiagnostics(diagnostics: js.Array[typingsSlinky.typescriptServices.TypeScript.Diagnostic]): typingsSlinky.typescriptServices.TypeScript.CompileResult = js.native
  def fromOutputFiles(outputFiles: js.Array[typingsSlinky.typescriptServices.TypeScript.OutputFile]): typingsSlinky.typescriptServices.TypeScript.CompileResult = js.native
}

