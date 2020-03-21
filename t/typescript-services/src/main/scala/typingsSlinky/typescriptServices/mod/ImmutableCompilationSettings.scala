package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

/* static members */
@JSImport("typescript-services", "ImmutableCompilationSettings")
@js.native
object ImmutableCompilationSettings extends js.Object {
  var _defaultSettings: js.Any = js.native
  def defaultSettings(): typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
  def fromCompilationSettings(settings: typingsSlinky.typescriptServices.TypeScript.CompilationSettings): typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
}

