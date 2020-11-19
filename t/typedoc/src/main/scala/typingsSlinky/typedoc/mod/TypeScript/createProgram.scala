package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CompilerHost
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.CreateProgramOptions
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createProgram")
@js.native
object createProgram extends js.Object {
  
  def apply(createProgramOptions: CreateProgramOptions): Program = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions): Program = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: js.UndefOr[scala.Nothing],
    oldProgram: js.UndefOr[scala.Nothing],
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: js.UndefOr[scala.Nothing],
    oldProgram: Program
  ): Program = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: js.UndefOr[scala.Nothing],
    oldProgram: Program,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost): Program = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: js.UndefOr[scala.Nothing],
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost, oldProgram: Program): Program = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: Program,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
}
