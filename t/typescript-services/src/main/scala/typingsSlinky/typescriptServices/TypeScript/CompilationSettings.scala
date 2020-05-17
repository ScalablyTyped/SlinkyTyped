package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilationSettings extends js.Object {
  var allowAutomaticSemicolonInsertion: Boolean = js.native
  var codeGenTarget: LanguageVersion = js.native
  var codepage: Double = js.native
  var createFileLog: Boolean = js.native
  var gatherDiagnostics: Boolean = js.native
  var generateDeclarationFiles: Boolean = js.native
  var mapRoot: String = js.native
  var mapSourceFiles: Boolean = js.native
  var moduleGenTarget: ModuleGenTarget = js.native
  var noImplicitAny: Boolean = js.native
  var noLib: Boolean = js.native
  var noResolve: Boolean = js.native
  var outDirOption: String = js.native
  var outFileOption: String = js.native
  var propagateEnumConstants: Boolean = js.native
  var removeComments: Boolean = js.native
  var sourceRoot: String = js.native
  var useCaseSensitiveFileResolution: Boolean = js.native
  var watch: Boolean = js.native
}

object CompilationSettings {
  @scala.inline
  def apply(
    allowAutomaticSemicolonInsertion: Boolean,
    codeGenTarget: LanguageVersion,
    codepage: Double,
    createFileLog: Boolean,
    gatherDiagnostics: Boolean,
    generateDeclarationFiles: Boolean,
    mapRoot: String,
    mapSourceFiles: Boolean,
    moduleGenTarget: ModuleGenTarget,
    noImplicitAny: Boolean,
    noLib: Boolean,
    noResolve: Boolean,
    outDirOption: String,
    outFileOption: String,
    propagateEnumConstants: Boolean,
    removeComments: Boolean,
    sourceRoot: String,
    useCaseSensitiveFileResolution: Boolean,
    watch: Boolean
  ): CompilationSettings = {
    val __obj = js.Dynamic.literal(allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], codeGenTarget = codeGenTarget.asInstanceOf[js.Any], codepage = codepage.asInstanceOf[js.Any], createFileLog = createFileLog.asInstanceOf[js.Any], gatherDiagnostics = gatherDiagnostics.asInstanceOf[js.Any], generateDeclarationFiles = generateDeclarationFiles.asInstanceOf[js.Any], mapRoot = mapRoot.asInstanceOf[js.Any], mapSourceFiles = mapSourceFiles.asInstanceOf[js.Any], moduleGenTarget = moduleGenTarget.asInstanceOf[js.Any], noImplicitAny = noImplicitAny.asInstanceOf[js.Any], noLib = noLib.asInstanceOf[js.Any], noResolve = noResolve.asInstanceOf[js.Any], outDirOption = outDirOption.asInstanceOf[js.Any], outFileOption = outFileOption.asInstanceOf[js.Any], propagateEnumConstants = propagateEnumConstants.asInstanceOf[js.Any], removeComments = removeComments.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], useCaseSensitiveFileResolution = useCaseSensitiveFileResolution.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationSettings]
  }
  @scala.inline
  implicit class CompilationSettingsOps[Self <: CompilationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAutomaticSemicolonInsertion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutomaticSemicolonInsertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeGenTarget(value: LanguageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeGenTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodepage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFileLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFileLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatherDiagnostics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatherDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateDeclarationFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateDeclarationFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapSourceFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapSourceFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleGenTarget(value: ModuleGenTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleGenTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoImplicitAny(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitAny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoLib(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResolve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutDirOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDirOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutFileOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFileOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagateEnumConstants(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateEnumConstants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCaseSensitiveFileResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCaseSensitiveFileResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

