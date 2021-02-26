package typingsSlinky.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ImmutableCompilationSettings")
@js.native
class ImmutableCompilationSettings protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings {
  def this(
    propagateEnumConstants: Boolean,
    removeComments: Boolean,
    watch: Boolean,
    noResolve: Boolean,
    allowAutomaticSemicolonInsertion: Boolean,
    noImplicitAny: Boolean,
    noLib: Boolean,
    codeGenTarget: typingsSlinky.typescriptServices.TypeScript.LanguageVersion,
    moduleGenTarget: typingsSlinky.typescriptServices.TypeScript.ModuleGenTarget,
    outFileOption: String,
    outDirOption: String,
    mapSourceFiles: Boolean,
    mapRoot: String,
    sourceRoot: String,
    generateDeclarationFiles: Boolean,
    useCaseSensitiveFileResolution: Boolean,
    gatherDiagnostics: Boolean,
    codepage: Double,
    createFileLog: Boolean
  ) = this()
}
object ImmutableCompilationSettings {
  
  @JSImport("typescript-services", "ImmutableCompilationSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "ImmutableCompilationSettings._defaultSettings")
  @js.native
  def _defaultSettings: js.Any = js.native
  @scala.inline
  def _defaultSettings_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultSettings")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "ImmutableCompilationSettings.defaultSettings")
  @js.native
  def defaultSettings(): typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
  
  /* static member */
  @JSImport("typescript-services", "ImmutableCompilationSettings.fromCompilationSettings")
  @js.native
  def fromCompilationSettings(settings: typingsSlinky.typescriptServices.TypeScript.CompilationSettings): typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
}
