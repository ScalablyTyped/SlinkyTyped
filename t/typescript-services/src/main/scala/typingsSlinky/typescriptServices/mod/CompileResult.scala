package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "CompileResult")
@js.native
class CompileResult ()
  extends typingsSlinky.typescriptServices.TypeScript.CompileResult
/* static members */
@JSImport("typescript-services", "CompileResult")
@js.native
object CompileResult extends js.Object {
  
  def fromDiagnostics(diagnostics: js.Array[typingsSlinky.typescriptServices.TypeScript.Diagnostic]): typingsSlinky.typescriptServices.TypeScript.CompileResult = js.native
  
  def fromOutputFiles(outputFiles: js.Array[typingsSlinky.typescriptServices.TypeScript.OutputFile]): typingsSlinky.typescriptServices.TypeScript.CompileResult = js.native
}
