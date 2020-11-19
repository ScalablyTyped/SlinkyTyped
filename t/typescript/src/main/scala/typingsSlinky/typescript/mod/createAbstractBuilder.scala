package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createAbstractBuilder")
@js.native
object createAbstractBuilder extends js.Object {
  
  /**
    * Creates a builder thats just abstraction over program and can be used with watch
    */
  def apply(newProgram: Program, host: BuilderProgramHost): BuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: js.UndefOr[scala.Nothing],
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def apply(newProgram: Program, host: BuilderProgramHost, oldProgram: BuilderProgram): BuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[js.Array[java.lang.String]],
    options: js.UndefOr[CompilerOptions],
    host: js.UndefOr[CompilerHost],
    oldProgram: js.UndefOr[BuilderProgram],
    configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
    projectReferences: js.UndefOr[js.Array[ProjectReference]]
  ): BuilderProgram = js.native
}
