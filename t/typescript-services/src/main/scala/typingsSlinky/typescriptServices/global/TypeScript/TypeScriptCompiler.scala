package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TypeScriptCompiler")
@js.native
class TypeScriptCompiler ()
  extends typingsSlinky.typescriptServices.TypeScript.TypeScriptCompiler {
  def this(logger: ILogger) = this()
  def this(
    logger: js.UndefOr[scala.Nothing],
    _settings: typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings
  ) = this()
  def this(
    logger: ILogger,
    _settings: typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings
  ) = this()
}
object TypeScriptCompiler {
  
  /* static member */
  @JSGlobal("TypeScript.TypeScriptCompiler.getFullDiagnosticText")
  @js.native
  def getFullDiagnosticText(
    diagnostic: typingsSlinky.typescriptServices.TypeScript.Diagnostic,
    resolvePath: js.Function1[/* path */ String, String]
  ): String = js.native
  
  /* static member */
  @JSGlobal("TypeScript.TypeScriptCompiler.getLocationText")
  @js.native
  def getLocationText(location: js.Any, resolvePath: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.TypeScriptCompiler.mapToDTSFileName")
  @js.native
  def mapToDTSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = js.native
  
  /* static member */
  @JSGlobal("TypeScript.TypeScriptCompiler.mapToFileNameExtension")
  @js.native
  def mapToFileNameExtension(extension: String, fileName: String, wholeFileNameReplaced: Boolean): String = js.native
  
  /* static member */
  @JSGlobal("TypeScript.TypeScriptCompiler.mapToJSFileName")
  @js.native
  def mapToJSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = js.native
}
