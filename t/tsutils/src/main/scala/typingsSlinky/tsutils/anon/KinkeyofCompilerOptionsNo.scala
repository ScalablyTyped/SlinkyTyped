package typingsSlinky.tsutils.anon

import typingsSlinky.tsutils.tsutilsStrings.allowJs
import typingsSlinky.tsutils.tsutilsStrings.allowSyntheticDefaultImports
import typingsSlinky.tsutils.tsutilsStrings.allowUmdGlobalAccess
import typingsSlinky.tsutils.tsutilsStrings.allowUnreachableCode
import typingsSlinky.tsutils.tsutilsStrings.allowUnusedLabels
import typingsSlinky.tsutils.tsutilsStrings.alwaysStrict
import typingsSlinky.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies
import typingsSlinky.tsutils.tsutilsStrings.baseUrl
import typingsSlinky.tsutils.tsutilsStrings.charset
import typingsSlinky.tsutils.tsutilsStrings.checkJs
import typingsSlinky.tsutils.tsutilsStrings.composite
import typingsSlinky.tsutils.tsutilsStrings.declaration
import typingsSlinky.tsutils.tsutilsStrings.declarationDir
import typingsSlinky.tsutils.tsutilsStrings.declarationMap
import typingsSlinky.tsutils.tsutilsStrings.disableSizeLimit
import typingsSlinky.tsutils.tsutilsStrings.disableSolutionSearching
import typingsSlinky.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect
import typingsSlinky.tsutils.tsutilsStrings.downlevelIteration
import typingsSlinky.tsutils.tsutilsStrings.emitBOM
import typingsSlinky.tsutils.tsutilsStrings.emitDeclarationOnly
import typingsSlinky.tsutils.tsutilsStrings.emitDecoratorMetadata
import typingsSlinky.tsutils.tsutilsStrings.esModuleInterop
import typingsSlinky.tsutils.tsutilsStrings.experimentalDecorators
import typingsSlinky.tsutils.tsutilsStrings.forceConsistentCasingInFileNames
import typingsSlinky.tsutils.tsutilsStrings.importHelpers
import typingsSlinky.tsutils.tsutilsStrings.importsNotUsedAsValues
import typingsSlinky.tsutils.tsutilsStrings.incremental
import typingsSlinky.tsutils.tsutilsStrings.inlineSourceMap
import typingsSlinky.tsutils.tsutilsStrings.inlineSources
import typingsSlinky.tsutils.tsutilsStrings.isolatedModules
import typingsSlinky.tsutils.tsutilsStrings.jsx
import typingsSlinky.tsutils.tsutilsStrings.jsxFactory
import typingsSlinky.tsutils.tsutilsStrings.keyofStringsOnly
import typingsSlinky.tsutils.tsutilsStrings.lib
import typingsSlinky.tsutils.tsutilsStrings.locale
import typingsSlinky.tsutils.tsutilsStrings.mapRoot
import typingsSlinky.tsutils.tsutilsStrings.maxNodeModuleJsDepth
import typingsSlinky.tsutils.tsutilsStrings.module
import typingsSlinky.tsutils.tsutilsStrings.moduleResolution
import typingsSlinky.tsutils.tsutilsStrings.newLine
import typingsSlinky.tsutils.tsutilsStrings.noEmit
import typingsSlinky.tsutils.tsutilsStrings.noEmitHelpers
import typingsSlinky.tsutils.tsutilsStrings.noEmitOnError
import typingsSlinky.tsutils.tsutilsStrings.noErrorTruncation
import typingsSlinky.tsutils.tsutilsStrings.noFallthroughCasesInSwitch
import typingsSlinky.tsutils.tsutilsStrings.noImplicitAny
import typingsSlinky.tsutils.tsutilsStrings.noImplicitReturns
import typingsSlinky.tsutils.tsutilsStrings.noImplicitThis
import typingsSlinky.tsutils.tsutilsStrings.noImplicitUseStrict
import typingsSlinky.tsutils.tsutilsStrings.noLib
import typingsSlinky.tsutils.tsutilsStrings.noResolve
import typingsSlinky.tsutils.tsutilsStrings.noStrictGenericChecks
import typingsSlinky.tsutils.tsutilsStrings.noUnusedLocals
import typingsSlinky.tsutils.tsutilsStrings.noUnusedParameters
import typingsSlinky.tsutils.tsutilsStrings.out
import typingsSlinky.tsutils.tsutilsStrings.outDir
import typingsSlinky.tsutils.tsutilsStrings.outFile
import typingsSlinky.tsutils.tsutilsStrings.paths
import typingsSlinky.tsutils.tsutilsStrings.preserveConstEnums
import typingsSlinky.tsutils.tsutilsStrings.preserveSymlinks
import typingsSlinky.tsutils.tsutilsStrings.project
import typingsSlinky.tsutils.tsutilsStrings.reactNamespace
import typingsSlinky.tsutils.tsutilsStrings.removeComments
import typingsSlinky.tsutils.tsutilsStrings.resolveJsonModule
import typingsSlinky.tsutils.tsutilsStrings.rootDir
import typingsSlinky.tsutils.tsutilsStrings.rootDirs
import typingsSlinky.tsutils.tsutilsStrings.skipDefaultLibCheck
import typingsSlinky.tsutils.tsutilsStrings.skipLibCheck
import typingsSlinky.tsutils.tsutilsStrings.sourceMap
import typingsSlinky.tsutils.tsutilsStrings.sourceRoot
import typingsSlinky.tsutils.tsutilsStrings.strict
import typingsSlinky.tsutils.tsutilsStrings.strictBindCallApply
import typingsSlinky.tsutils.tsutilsStrings.strictFunctionTypes
import typingsSlinky.tsutils.tsutilsStrings.strictNullChecks
import typingsSlinky.tsutils.tsutilsStrings.strictPropertyInitialization
import typingsSlinky.tsutils.tsutilsStrings.stripInternal
import typingsSlinky.tsutils.tsutilsStrings.suppressExcessPropertyErrors
import typingsSlinky.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors
import typingsSlinky.tsutils.tsutilsStrings.target
import typingsSlinky.tsutils.tsutilsStrings.traceResolution
import typingsSlinky.tsutils.tsutilsStrings.tsBuildInfoFile
import typingsSlinky.tsutils.tsutilsStrings.typeRoots
import typingsSlinky.tsutils.tsutilsStrings.types
import typingsSlinky.tsutils.tsutilsStrings.useDefineForClassFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof typescript.typescript.CompilerOptions ]: std.NonNullable<typescript.typescript.CompilerOptions[K]> extends boolean? K : never} */
@js.native
trait KinkeyofCompilerOptionsNo extends js.Object {
  
  var allowJs: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowJs] = js.native
  
  var allowSyntheticDefaultImports: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowSyntheticDefaultImports] = js.native
  
  var allowUmdGlobalAccess: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowUmdGlobalAccess] = js.native
  
  var allowUnreachableCode: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowUnreachableCode] = js.native
  
  var allowUnusedLabels: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowUnusedLabels] = js.native
  
  var alwaysStrict: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.alwaysStrict] = js.native
  
  var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies] = js.native
  
  var baseUrl: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.baseUrl] = js.native
  
  var charset: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.charset] = js.native
  
  var checkJs: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.checkJs] = js.native
  
  var composite: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.composite] = js.native
  
  var declaration: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.declaration] = js.native
  
  var declarationDir: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.declarationDir] = js.native
  
  var declarationMap: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.declarationMap] = js.native
  
  var disableSizeLimit: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.disableSizeLimit] = js.native
  
  var disableSolutionSearching: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.disableSolutionSearching] = js.native
  
  var disableSourceOfProjectReferenceRedirect: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect] = js.native
  
  var downlevelIteration: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.downlevelIteration] = js.native
  
  var emitBOM: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.emitBOM] = js.native
  
  var emitDeclarationOnly: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.emitDeclarationOnly] = js.native
  
  var emitDecoratorMetadata: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.emitDecoratorMetadata] = js.native
  
  var esModuleInterop: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.esModuleInterop] = js.native
  
  var experimentalDecorators: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.experimentalDecorators] = js.native
  
  var forceConsistentCasingInFileNames: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.forceConsistentCasingInFileNames] = js.native
  
  var importHelpers: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.importHelpers] = js.native
  
  var importsNotUsedAsValues: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.importsNotUsedAsValues] = js.native
  
  var incremental: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.incremental] = js.native
  
  var inlineSourceMap: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.inlineSourceMap] = js.native
  
  var inlineSources: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.inlineSources] = js.native
  
  var isolatedModules: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.isolatedModules] = js.native
  
  var jsx: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.jsx] = js.native
  
  var jsxFactory: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.jsxFactory] = js.native
  
  var keyofStringsOnly: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.keyofStringsOnly] = js.native
  
  var lib: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.lib] = js.native
  
  var locale: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.locale] = js.native
  
  var mapRoot: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.mapRoot] = js.native
  
  var maxNodeModuleJsDepth: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.maxNodeModuleJsDepth] = js.native
  
  var module: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.module] = js.native
  
  var moduleResolution: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.moduleResolution] = js.native
  
  var newLine: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.newLine] = js.native
  
  var noEmit: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noEmit] = js.native
  
  var noEmitHelpers: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noEmitHelpers] = js.native
  
  var noEmitOnError: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noEmitOnError] = js.native
  
  var noErrorTruncation: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noErrorTruncation] = js.native
  
  var noFallthroughCasesInSwitch: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noFallthroughCasesInSwitch] = js.native
  
  var noImplicitAny: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noImplicitAny] = js.native
  
  var noImplicitReturns: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noImplicitReturns] = js.native
  
  var noImplicitThis: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noImplicitThis] = js.native
  
  var noImplicitUseStrict: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noImplicitUseStrict] = js.native
  
  var noLib: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noLib] = js.native
  
  var noResolve: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noResolve] = js.native
  
  var noStrictGenericChecks: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noStrictGenericChecks] = js.native
  
  var noUnusedLocals: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noUnusedLocals] = js.native
  
  var noUnusedParameters: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noUnusedParameters] = js.native
  
  var out: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.out] = js.native
  
  var outDir: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.outDir] = js.native
  
  var outFile: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.outFile] = js.native
  
  var paths: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.paths] = js.native
  
  var preserveConstEnums: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.preserveConstEnums] = js.native
  
  var preserveSymlinks: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.preserveSymlinks] = js.native
  
  var project: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.project] = js.native
  
  var reactNamespace: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.reactNamespace] = js.native
  
  var removeComments: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.removeComments] = js.native
  
  var resolveJsonModule: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.resolveJsonModule] = js.native
  
  var rootDir: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.rootDir] = js.native
  
  var rootDirs: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.rootDirs] = js.native
  
  var skipDefaultLibCheck: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.skipDefaultLibCheck] = js.native
  
  var skipLibCheck: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.skipLibCheck] = js.native
  
  var sourceMap: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.sourceMap] = js.native
  
  var sourceRoot: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.sourceRoot] = js.native
  
  var strict: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strict] = js.native
  
  var strictBindCallApply: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strictBindCallApply] = js.native
  
  var strictFunctionTypes: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strictFunctionTypes] = js.native
  
  var strictNullChecks: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strictNullChecks] = js.native
  
  var strictPropertyInitialization: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strictPropertyInitialization] = js.native
  
  var stripInternal: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.stripInternal] = js.native
  
  var suppressExcessPropertyErrors: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.suppressExcessPropertyErrors] = js.native
  
  var suppressImplicitAnyIndexErrors: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors] = js.native
  
  var target: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.target] = js.native
  
  var traceResolution: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.traceResolution] = js.native
  
  var tsBuildInfoFile: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.tsBuildInfoFile] = js.native
  
  var typeRoots: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.typeRoots] = js.native
  
  var types: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.types] = js.native
  
  var useDefineForClassFields: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.useDefineForClassFields] = js.native
}
object KinkeyofCompilerOptionsNo {
  
  @scala.inline
  def apply(): KinkeyofCompilerOptionsNo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinkeyofCompilerOptionsNo]
  }
  
  @scala.inline
  implicit class KinkeyofCompilerOptionsNoOps[Self <: KinkeyofCompilerOptionsNo] (val x: Self) extends AnyVal {
    
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
    def setAllowJs(value: allowJs): Self = this.set("allowJs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowJs: Self = this.set("allowJs", js.undefined)
    
    @scala.inline
    def setAllowSyntheticDefaultImports(value: allowSyntheticDefaultImports): Self = this.set("allowSyntheticDefaultImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSyntheticDefaultImports: Self = this.set("allowSyntheticDefaultImports", js.undefined)
    
    @scala.inline
    def setAllowUmdGlobalAccess(value: allowUmdGlobalAccess): Self = this.set("allowUmdGlobalAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUmdGlobalAccess: Self = this.set("allowUmdGlobalAccess", js.undefined)
    
    @scala.inline
    def setAllowUnreachableCode(value: allowUnreachableCode): Self = this.set("allowUnreachableCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnreachableCode: Self = this.set("allowUnreachableCode", js.undefined)
    
    @scala.inline
    def setAllowUnusedLabels(value: allowUnusedLabels): Self = this.set("allowUnusedLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnusedLabels: Self = this.set("allowUnusedLabels", js.undefined)
    
    @scala.inline
    def setAlwaysStrict(value: alwaysStrict): Self = this.set("alwaysStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysStrict: Self = this.set("alwaysStrict", js.undefined)
    
    @scala.inline
    def setAssumeChangesOnlyAffectDirectDependencies(value: assumeChangesOnlyAffectDirectDependencies): Self = this.set("assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumeChangesOnlyAffectDirectDependencies: Self = this.set("assumeChangesOnlyAffectDirectDependencies", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: baseUrl): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setCharset(value: charset): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setCheckJs(value: checkJs): Self = this.set("checkJs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckJs: Self = this.set("checkJs", js.undefined)
    
    @scala.inline
    def setComposite(value: composite): Self = this.set("composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComposite: Self = this.set("composite", js.undefined)
    
    @scala.inline
    def setDeclaration(value: declaration): Self = this.set("declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaration: Self = this.set("declaration", js.undefined)
    
    @scala.inline
    def setDeclarationDir(value: declarationDir): Self = this.set("declarationDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclarationDir: Self = this.set("declarationDir", js.undefined)
    
    @scala.inline
    def setDeclarationMap(value: declarationMap): Self = this.set("declarationMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclarationMap: Self = this.set("declarationMap", js.undefined)
    
    @scala.inline
    def setDisableSizeLimit(value: disableSizeLimit): Self = this.set("disableSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSizeLimit: Self = this.set("disableSizeLimit", js.undefined)
    
    @scala.inline
    def setDisableSolutionSearching(value: disableSolutionSearching): Self = this.set("disableSolutionSearching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSolutionSearching: Self = this.set("disableSolutionSearching", js.undefined)
    
    @scala.inline
    def setDisableSourceOfProjectReferenceRedirect(value: disableSourceOfProjectReferenceRedirect): Self = this.set("disableSourceOfProjectReferenceRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSourceOfProjectReferenceRedirect: Self = this.set("disableSourceOfProjectReferenceRedirect", js.undefined)
    
    @scala.inline
    def setDownlevelIteration(value: downlevelIteration): Self = this.set("downlevelIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownlevelIteration: Self = this.set("downlevelIteration", js.undefined)
    
    @scala.inline
    def setEmitBOM(value: emitBOM): Self = this.set("emitBOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitBOM: Self = this.set("emitBOM", js.undefined)
    
    @scala.inline
    def setEmitDeclarationOnly(value: emitDeclarationOnly): Self = this.set("emitDeclarationOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitDeclarationOnly: Self = this.set("emitDeclarationOnly", js.undefined)
    
    @scala.inline
    def setEmitDecoratorMetadata(value: emitDecoratorMetadata): Self = this.set("emitDecoratorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitDecoratorMetadata: Self = this.set("emitDecoratorMetadata", js.undefined)
    
    @scala.inline
    def setEsModuleInterop(value: esModuleInterop): Self = this.set("esModuleInterop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsModuleInterop: Self = this.set("esModuleInterop", js.undefined)
    
    @scala.inline
    def setExperimentalDecorators(value: experimentalDecorators): Self = this.set("experimentalDecorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentalDecorators: Self = this.set("experimentalDecorators", js.undefined)
    
    @scala.inline
    def setForceConsistentCasingInFileNames(value: forceConsistentCasingInFileNames): Self = this.set("forceConsistentCasingInFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceConsistentCasingInFileNames: Self = this.set("forceConsistentCasingInFileNames", js.undefined)
    
    @scala.inline
    def setImportHelpers(value: importHelpers): Self = this.set("importHelpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportHelpers: Self = this.set("importHelpers", js.undefined)
    
    @scala.inline
    def setImportsNotUsedAsValues(value: importsNotUsedAsValues): Self = this.set("importsNotUsedAsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportsNotUsedAsValues: Self = this.set("importsNotUsedAsValues", js.undefined)
    
    @scala.inline
    def setIncremental(value: incremental): Self = this.set("incremental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncremental: Self = this.set("incremental", js.undefined)
    
    @scala.inline
    def setInlineSourceMap(value: inlineSourceMap): Self = this.set("inlineSourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineSourceMap: Self = this.set("inlineSourceMap", js.undefined)
    
    @scala.inline
    def setInlineSources(value: inlineSources): Self = this.set("inlineSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineSources: Self = this.set("inlineSources", js.undefined)
    
    @scala.inline
    def setIsolatedModules(value: isolatedModules): Self = this.set("isolatedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolatedModules: Self = this.set("isolatedModules", js.undefined)
    
    @scala.inline
    def setJsx(value: jsx): Self = this.set("jsx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
    
    @scala.inline
    def setJsxFactory(value: jsxFactory): Self = this.set("jsxFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsxFactory: Self = this.set("jsxFactory", js.undefined)
    
    @scala.inline
    def setKeyofStringsOnly(value: keyofStringsOnly): Self = this.set("keyofStringsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyofStringsOnly: Self = this.set("keyofStringsOnly", js.undefined)
    
    @scala.inline
    def setLib(value: lib): Self = this.set("lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLib: Self = this.set("lib", js.undefined)
    
    @scala.inline
    def setLocale(value: locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMapRoot(value: mapRoot): Self = this.set("mapRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapRoot: Self = this.set("mapRoot", js.undefined)
    
    @scala.inline
    def setMaxNodeModuleJsDepth(value: maxNodeModuleJsDepth): Self = this.set("maxNodeModuleJsDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNodeModuleJsDepth: Self = this.set("maxNodeModuleJsDepth", js.undefined)
    
    @scala.inline
    def setModule(value: module): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setModuleResolution(value: moduleResolution): Self = this.set("moduleResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleResolution: Self = this.set("moduleResolution", js.undefined)
    
    @scala.inline
    def setNewLine(value: newLine): Self = this.set("newLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewLine: Self = this.set("newLine", js.undefined)
    
    @scala.inline
    def setNoEmit(value: noEmit): Self = this.set("noEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmit: Self = this.set("noEmit", js.undefined)
    
    @scala.inline
    def setNoEmitHelpers(value: noEmitHelpers): Self = this.set("noEmitHelpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmitHelpers: Self = this.set("noEmitHelpers", js.undefined)
    
    @scala.inline
    def setNoEmitOnError(value: noEmitOnError): Self = this.set("noEmitOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmitOnError: Self = this.set("noEmitOnError", js.undefined)
    
    @scala.inline
    def setNoErrorTruncation(value: noErrorTruncation): Self = this.set("noErrorTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoErrorTruncation: Self = this.set("noErrorTruncation", js.undefined)
    
    @scala.inline
    def setNoFallthroughCasesInSwitch(value: noFallthroughCasesInSwitch): Self = this.set("noFallthroughCasesInSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoFallthroughCasesInSwitch: Self = this.set("noFallthroughCasesInSwitch", js.undefined)
    
    @scala.inline
    def setNoImplicitAny(value: noImplicitAny): Self = this.set("noImplicitAny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoImplicitAny: Self = this.set("noImplicitAny", js.undefined)
    
    @scala.inline
    def setNoImplicitReturns(value: noImplicitReturns): Self = this.set("noImplicitReturns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoImplicitReturns: Self = this.set("noImplicitReturns", js.undefined)
    
    @scala.inline
    def setNoImplicitThis(value: noImplicitThis): Self = this.set("noImplicitThis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoImplicitThis: Self = this.set("noImplicitThis", js.undefined)
    
    @scala.inline
    def setNoImplicitUseStrict(value: noImplicitUseStrict): Self = this.set("noImplicitUseStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoImplicitUseStrict: Self = this.set("noImplicitUseStrict", js.undefined)
    
    @scala.inline
    def setNoLib(value: noLib): Self = this.set("noLib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoLib: Self = this.set("noLib", js.undefined)
    
    @scala.inline
    def setNoResolve(value: noResolve): Self = this.set("noResolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResolve: Self = this.set("noResolve", js.undefined)
    
    @scala.inline
    def setNoStrictGenericChecks(value: noStrictGenericChecks): Self = this.set("noStrictGenericChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoStrictGenericChecks: Self = this.set("noStrictGenericChecks", js.undefined)
    
    @scala.inline
    def setNoUnusedLocals(value: noUnusedLocals): Self = this.set("noUnusedLocals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoUnusedLocals: Self = this.set("noUnusedLocals", js.undefined)
    
    @scala.inline
    def setNoUnusedParameters(value: noUnusedParameters): Self = this.set("noUnusedParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoUnusedParameters: Self = this.set("noUnusedParameters", js.undefined)
    
    @scala.inline
    def setOut(value: out): Self = this.set("out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    
    @scala.inline
    def setOutDir(value: outDir): Self = this.set("outDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutDir: Self = this.set("outDir", js.undefined)
    
    @scala.inline
    def setOutFile(value: outFile): Self = this.set("outFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutFile: Self = this.set("outFile", js.undefined)
    
    @scala.inline
    def setPaths(value: paths): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setPreserveConstEnums(value: preserveConstEnums): Self = this.set("preserveConstEnums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveConstEnums: Self = this.set("preserveConstEnums", js.undefined)
    
    @scala.inline
    def setPreserveSymlinks(value: preserveSymlinks): Self = this.set("preserveSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveSymlinks: Self = this.set("preserveSymlinks", js.undefined)
    
    @scala.inline
    def setProject(value: project): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setReactNamespace(value: reactNamespace): Self = this.set("reactNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReactNamespace: Self = this.set("reactNamespace", js.undefined)
    
    @scala.inline
    def setRemoveComments(value: removeComments): Self = this.set("removeComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveComments: Self = this.set("removeComments", js.undefined)
    
    @scala.inline
    def setResolveJsonModule(value: resolveJsonModule): Self = this.set("resolveJsonModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveJsonModule: Self = this.set("resolveJsonModule", js.undefined)
    
    @scala.inline
    def setRootDir(value: rootDir): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDir: Self = this.set("rootDir", js.undefined)
    
    @scala.inline
    def setRootDirs(value: rootDirs): Self = this.set("rootDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDirs: Self = this.set("rootDirs", js.undefined)
    
    @scala.inline
    def setSkipDefaultLibCheck(value: skipDefaultLibCheck): Self = this.set("skipDefaultLibCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipDefaultLibCheck: Self = this.set("skipDefaultLibCheck", js.undefined)
    
    @scala.inline
    def setSkipLibCheck(value: skipLibCheck): Self = this.set("skipLibCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipLibCheck: Self = this.set("skipLibCheck", js.undefined)
    
    @scala.inline
    def setSourceMap(value: sourceMap): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setSourceRoot(value: sourceRoot): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    
    @scala.inline
    def setStrict(value: strict): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setStrictBindCallApply(value: strictBindCallApply): Self = this.set("strictBindCallApply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictBindCallApply: Self = this.set("strictBindCallApply", js.undefined)
    
    @scala.inline
    def setStrictFunctionTypes(value: strictFunctionTypes): Self = this.set("strictFunctionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictFunctionTypes: Self = this.set("strictFunctionTypes", js.undefined)
    
    @scala.inline
    def setStrictNullChecks(value: strictNullChecks): Self = this.set("strictNullChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictNullChecks: Self = this.set("strictNullChecks", js.undefined)
    
    @scala.inline
    def setStrictPropertyInitialization(value: strictPropertyInitialization): Self = this.set("strictPropertyInitialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictPropertyInitialization: Self = this.set("strictPropertyInitialization", js.undefined)
    
    @scala.inline
    def setStripInternal(value: stripInternal): Self = this.set("stripInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripInternal: Self = this.set("stripInternal", js.undefined)
    
    @scala.inline
    def setSuppressExcessPropertyErrors(value: suppressExcessPropertyErrors): Self = this.set("suppressExcessPropertyErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressExcessPropertyErrors: Self = this.set("suppressExcessPropertyErrors", js.undefined)
    
    @scala.inline
    def setSuppressImplicitAnyIndexErrors(value: suppressImplicitAnyIndexErrors): Self = this.set("suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressImplicitAnyIndexErrors: Self = this.set("suppressImplicitAnyIndexErrors", js.undefined)
    
    @scala.inline
    def setTarget(value: target): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTraceResolution(value: traceResolution): Self = this.set("traceResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceResolution: Self = this.set("traceResolution", js.undefined)
    
    @scala.inline
    def setTsBuildInfoFile(value: tsBuildInfoFile): Self = this.set("tsBuildInfoFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTsBuildInfoFile: Self = this.set("tsBuildInfoFile", js.undefined)
    
    @scala.inline
    def setTypeRoots(value: typeRoots): Self = this.set("typeRoots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeRoots: Self = this.set("typeRoots", js.undefined)
    
    @scala.inline
    def setTypes(value: types): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setUseDefineForClassFields(value: useDefineForClassFields): Self = this.set("useDefineForClassFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefineForClassFields: Self = this.set("useDefineForClassFields", js.undefined)
  }
}
