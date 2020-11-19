package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowAutomaticSemicolonInsertion(value: Boolean): Self = this.set("allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeGenTarget(value: LanguageVersion): Self = this.set("codeGenTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodepage(value: Double): Self = this.set("codepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFileLog(value: Boolean): Self = this.set("createFileLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatherDiagnostics(value: Boolean): Self = this.set("gatherDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDeclarationFiles(value: Boolean): Self = this.set("generateDeclarationFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapRoot(value: String): Self = this.set("mapRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapSourceFiles(value: Boolean): Self = this.set("mapSourceFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleGenTarget(value: ModuleGenTarget): Self = this.set("moduleGenTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoImplicitAny(value: Boolean): Self = this.set("noImplicitAny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLib(value: Boolean): Self = this.set("noLib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResolve(value: Boolean): Self = this.set("noResolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDirOption(value: String): Self = this.set("outDirOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutFileOption(value: String): Self = this.set("outFileOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagateEnumConstants(value: Boolean): Self = this.set("propagateEnumConstants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveComments(value: Boolean): Self = this.set("removeComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCaseSensitiveFileResolution(value: Boolean): Self = this.set("useCaseSensitiveFileResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
  }
}
