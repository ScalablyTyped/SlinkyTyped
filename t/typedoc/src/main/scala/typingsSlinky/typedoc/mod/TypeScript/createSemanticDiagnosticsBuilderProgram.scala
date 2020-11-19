package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BuilderProgramHost
import typingsSlinky.typescript.mod.CompilerHost
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.ProjectReference
import typingsSlinky.typescript.mod.SemanticDiagnosticsBuilderProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createSemanticDiagnosticsBuilderProgram")
@js.native
object createSemanticDiagnosticsBuilderProgram extends js.Object {
  
  /**
    * Create the builder to manage semantic diagnostics and cache them
    */
  def apply(newProgram: Program, host: BuilderProgramHost): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: js.UndefOr[scala.Nothing],
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(newProgram: Program, host: BuilderProgramHost, oldProgram: SemanticDiagnosticsBuilderProgram): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[js.Array[String]],
    options: js.UndefOr[CompilerOptions],
    host: js.UndefOr[CompilerHost],
    oldProgram: js.UndefOr[SemanticDiagnosticsBuilderProgram],
    configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
    projectReferences: js.UndefOr[js.Array[ProjectReference]]
  ): SemanticDiagnosticsBuilderProgram = js.native
}
