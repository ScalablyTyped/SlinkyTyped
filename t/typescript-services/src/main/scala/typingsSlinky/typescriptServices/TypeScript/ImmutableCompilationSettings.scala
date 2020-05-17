package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmutableCompilationSettings extends js.Object {
  var _allowAutomaticSemicolonInsertion: js.Any = js.native
  var _codeGenTarget: js.Any = js.native
  var _codepage: js.Any = js.native
  var _createFileLog: js.Any = js.native
  var _gatherDiagnostics: js.Any = js.native
  var _generateDeclarationFiles: js.Any = js.native
  var _mapRoot: js.Any = js.native
  var _mapSourceFiles: js.Any = js.native
  var _moduleGenTarget: js.Any = js.native
  var _noImplicitAny: js.Any = js.native
  var _noLib: js.Any = js.native
  var _noResolve: js.Any = js.native
  var _outDirOption: js.Any = js.native
  var _outFileOption: js.Any = js.native
  var _propagateEnumConstants: js.Any = js.native
  var _removeComments: js.Any = js.native
  var _sourceRoot: js.Any = js.native
  var _useCaseSensitiveFileResolution: js.Any = js.native
  var _watch: js.Any = js.native
  def allowAutomaticSemicolonInsertion(): Boolean = js.native
  def codeGenTarget(): LanguageVersion = js.native
  def codepage(): Double = js.native
  def createFileLog(): Boolean = js.native
  def gatherDiagnostics(): Boolean = js.native
  def generateDeclarationFiles(): Boolean = js.native
  def mapRoot(): String = js.native
  def mapSourceFiles(): Boolean = js.native
  def moduleGenTarget(): ModuleGenTarget = js.native
  def noImplicitAny(): Boolean = js.native
  def noLib(): Boolean = js.native
  def noResolve(): Boolean = js.native
  def outDirOption(): String = js.native
  def outFileOption(): String = js.native
  def propagateEnumConstants(): Boolean = js.native
  def removeComments(): Boolean = js.native
  def sourceRoot(): String = js.native
  def toCompilationSettings(): js.Any = js.native
  def useCaseSensitiveFileResolution(): Boolean = js.native
  def watch(): Boolean = js.native
}

object ImmutableCompilationSettings {
  @scala.inline
  def apply(
    _allowAutomaticSemicolonInsertion: js.Any,
    _codeGenTarget: js.Any,
    _codepage: js.Any,
    _createFileLog: js.Any,
    _gatherDiagnostics: js.Any,
    _generateDeclarationFiles: js.Any,
    _mapRoot: js.Any,
    _mapSourceFiles: js.Any,
    _moduleGenTarget: js.Any,
    _noImplicitAny: js.Any,
    _noLib: js.Any,
    _noResolve: js.Any,
    _outDirOption: js.Any,
    _outFileOption: js.Any,
    _propagateEnumConstants: js.Any,
    _removeComments: js.Any,
    _sourceRoot: js.Any,
    _useCaseSensitiveFileResolution: js.Any,
    _watch: js.Any,
    allowAutomaticSemicolonInsertion: () => Boolean,
    codeGenTarget: () => LanguageVersion,
    codepage: () => Double,
    createFileLog: () => Boolean,
    gatherDiagnostics: () => Boolean,
    generateDeclarationFiles: () => Boolean,
    mapRoot: () => String,
    mapSourceFiles: () => Boolean,
    moduleGenTarget: () => ModuleGenTarget,
    noImplicitAny: () => Boolean,
    noLib: () => Boolean,
    noResolve: () => Boolean,
    outDirOption: () => String,
    outFileOption: () => String,
    propagateEnumConstants: () => Boolean,
    removeComments: () => Boolean,
    sourceRoot: () => String,
    toCompilationSettings: () => js.Any,
    useCaseSensitiveFileResolution: () => Boolean,
    watch: () => Boolean
  ): ImmutableCompilationSettings = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _codeGenTarget = _codeGenTarget.asInstanceOf[js.Any], _codepage = _codepage.asInstanceOf[js.Any], _createFileLog = _createFileLog.asInstanceOf[js.Any], _gatherDiagnostics = _gatherDiagnostics.asInstanceOf[js.Any], _generateDeclarationFiles = _generateDeclarationFiles.asInstanceOf[js.Any], _mapRoot = _mapRoot.asInstanceOf[js.Any], _mapSourceFiles = _mapSourceFiles.asInstanceOf[js.Any], _moduleGenTarget = _moduleGenTarget.asInstanceOf[js.Any], _noImplicitAny = _noImplicitAny.asInstanceOf[js.Any], _noLib = _noLib.asInstanceOf[js.Any], _noResolve = _noResolve.asInstanceOf[js.Any], _outDirOption = _outDirOption.asInstanceOf[js.Any], _outFileOption = _outFileOption.asInstanceOf[js.Any], _propagateEnumConstants = _propagateEnumConstants.asInstanceOf[js.Any], _removeComments = _removeComments.asInstanceOf[js.Any], _sourceRoot = _sourceRoot.asInstanceOf[js.Any], _useCaseSensitiveFileResolution = _useCaseSensitiveFileResolution.asInstanceOf[js.Any], _watch = _watch.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = js.Any.fromFunction0(allowAutomaticSemicolonInsertion), codeGenTarget = js.Any.fromFunction0(codeGenTarget), codepage = js.Any.fromFunction0(codepage), createFileLog = js.Any.fromFunction0(createFileLog), gatherDiagnostics = js.Any.fromFunction0(gatherDiagnostics), generateDeclarationFiles = js.Any.fromFunction0(generateDeclarationFiles), mapRoot = js.Any.fromFunction0(mapRoot), mapSourceFiles = js.Any.fromFunction0(mapSourceFiles), moduleGenTarget = js.Any.fromFunction0(moduleGenTarget), noImplicitAny = js.Any.fromFunction0(noImplicitAny), noLib = js.Any.fromFunction0(noLib), noResolve = js.Any.fromFunction0(noResolve), outDirOption = js.Any.fromFunction0(outDirOption), outFileOption = js.Any.fromFunction0(outFileOption), propagateEnumConstants = js.Any.fromFunction0(propagateEnumConstants), removeComments = js.Any.fromFunction0(removeComments), sourceRoot = js.Any.fromFunction0(sourceRoot), toCompilationSettings = js.Any.fromFunction0(toCompilationSettings), useCaseSensitiveFileResolution = js.Any.fromFunction0(useCaseSensitiveFileResolution), watch = js.Any.fromFunction0(watch))
    __obj.asInstanceOf[ImmutableCompilationSettings]
  }
  @scala.inline
  implicit class ImmutableCompilationSettingsOps[Self <: ImmutableCompilationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_allowAutomaticSemicolonInsertion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allowAutomaticSemicolonInsertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_codeGenTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_codeGenTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_codepage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_codepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_createFileLog(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_createFileLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_gatherDiagnostics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gatherDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_generateDeclarationFiles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_generateDeclarationFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_mapRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mapRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_mapSourceFiles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mapSourceFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_moduleGenTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_moduleGenTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_noImplicitAny(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_noImplicitAny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_noLib(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_noLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_noResolve(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_noResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_outDirOption(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_outDirOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_outFileOption(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_outFileOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_propagateEnumConstants(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_propagateEnumConstants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_removeComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_removeComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sourceRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_useCaseSensitiveFileResolution(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_useCaseSensitiveFileResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_watch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowAutomaticSemicolonInsertion(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutomaticSemicolonInsertion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCodeGenTarget(value: () => LanguageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeGenTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCodepage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateFileLog(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFileLog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGatherDiagnostics(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatherDiagnostics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGenerateDeclarationFiles(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateDeclarationFiles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMapRoot(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMapSourceFiles(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapSourceFiles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModuleGenTarget(value: () => ModuleGenTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleGenTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNoImplicitAny(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitAny")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNoLib(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLib")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNoResolve(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResolve")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOutDirOption(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDirOption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOutFileOption(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFileOption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPropagateEnumConstants(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateEnumConstants")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveComments(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSourceRoot(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToCompilationSettings(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCompilationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUseCaseSensitiveFileResolution(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCaseSensitiveFileResolution")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWatch(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

