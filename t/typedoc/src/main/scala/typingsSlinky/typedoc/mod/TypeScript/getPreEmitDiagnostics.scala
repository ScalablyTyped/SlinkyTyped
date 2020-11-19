package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CancellationToken
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getPreEmitDiagnostics")
@js.native
object getPreEmitDiagnostics extends js.Object {
  
  def apply(program: Program): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: js.UndefOr[scala.Nothing], cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
}
