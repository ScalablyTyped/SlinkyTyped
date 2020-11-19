package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "getPreEmitDiagnostics")
@js.native
object getPreEmitDiagnostics extends js.Object {
  
  def apply(program: Program): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: js.UndefOr[scala.Nothing], cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
}
