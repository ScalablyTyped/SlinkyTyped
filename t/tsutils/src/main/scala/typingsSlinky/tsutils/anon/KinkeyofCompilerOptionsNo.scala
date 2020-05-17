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
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof typescript.typescript.CompilerOptions ]: std.NonNullable<typescript.typescript.CompilerOptions[K]> extends boolean? K : never} */
@js.native
trait KinkeyofCompilerOptionsNo extends js.Object {
  var allowJs: typingsSlinky.tsutils.tsutilsStrings.allowJs = js.native
  var allowSyntheticDefaultImports: typingsSlinky.tsutils.tsutilsStrings.allowSyntheticDefaultImports = js.native
  var allowUmdGlobalAccess: typingsSlinky.tsutils.tsutilsStrings.allowUmdGlobalAccess = js.native
  var allowUnreachableCode: typingsSlinky.tsutils.tsutilsStrings.allowUnreachableCode = js.native
  var allowUnusedLabels: typingsSlinky.tsutils.tsutilsStrings.allowUnusedLabels = js.native
  var alwaysStrict: typingsSlinky.tsutils.tsutilsStrings.alwaysStrict = js.native
  var assumeChangesOnlyAffectDirectDependencies: typingsSlinky.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies = js.native
  var baseUrl: typingsSlinky.tsutils.tsutilsStrings.baseUrl = js.native
  var charset: typingsSlinky.tsutils.tsutilsStrings.charset = js.native
  var checkJs: typingsSlinky.tsutils.tsutilsStrings.checkJs = js.native
  var composite: typingsSlinky.tsutils.tsutilsStrings.composite = js.native
  var declaration: typingsSlinky.tsutils.tsutilsStrings.declaration = js.native
  var declarationDir: typingsSlinky.tsutils.tsutilsStrings.declarationDir = js.native
  var declarationMap: typingsSlinky.tsutils.tsutilsStrings.declarationMap = js.native
  var disableSizeLimit: typingsSlinky.tsutils.tsutilsStrings.disableSizeLimit = js.native
  var disableSolutionSearching: typingsSlinky.tsutils.tsutilsStrings.disableSolutionSearching = js.native
  var disableSourceOfProjectReferenceRedirect: typingsSlinky.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect = js.native
  var downlevelIteration: typingsSlinky.tsutils.tsutilsStrings.downlevelIteration = js.native
  var emitBOM: typingsSlinky.tsutils.tsutilsStrings.emitBOM = js.native
  var emitDeclarationOnly: typingsSlinky.tsutils.tsutilsStrings.emitDeclarationOnly = js.native
  var emitDecoratorMetadata: typingsSlinky.tsutils.tsutilsStrings.emitDecoratorMetadata = js.native
  var esModuleInterop: typingsSlinky.tsutils.tsutilsStrings.esModuleInterop = js.native
  var experimentalDecorators: typingsSlinky.tsutils.tsutilsStrings.experimentalDecorators = js.native
  var forceConsistentCasingInFileNames: typingsSlinky.tsutils.tsutilsStrings.forceConsistentCasingInFileNames = js.native
  var importHelpers: typingsSlinky.tsutils.tsutilsStrings.importHelpers = js.native
  var importsNotUsedAsValues: typingsSlinky.tsutils.tsutilsStrings.importsNotUsedAsValues = js.native
  var incremental: typingsSlinky.tsutils.tsutilsStrings.incremental = js.native
  var inlineSourceMap: typingsSlinky.tsutils.tsutilsStrings.inlineSourceMap = js.native
  var inlineSources: typingsSlinky.tsutils.tsutilsStrings.inlineSources = js.native
  var isolatedModules: typingsSlinky.tsutils.tsutilsStrings.isolatedModules = js.native
  var jsx: typingsSlinky.tsutils.tsutilsStrings.jsx = js.native
  var jsxFactory: typingsSlinky.tsutils.tsutilsStrings.jsxFactory = js.native
  var keyofStringsOnly: typingsSlinky.tsutils.tsutilsStrings.keyofStringsOnly = js.native
  var lib: typingsSlinky.tsutils.tsutilsStrings.lib = js.native
  var locale: typingsSlinky.tsutils.tsutilsStrings.locale = js.native
  var mapRoot: typingsSlinky.tsutils.tsutilsStrings.mapRoot = js.native
  var maxNodeModuleJsDepth: typingsSlinky.tsutils.tsutilsStrings.maxNodeModuleJsDepth = js.native
  var module: typingsSlinky.tsutils.tsutilsStrings.module = js.native
  var moduleResolution: typingsSlinky.tsutils.tsutilsStrings.moduleResolution = js.native
  var newLine: typingsSlinky.tsutils.tsutilsStrings.newLine = js.native
  var noEmit: typingsSlinky.tsutils.tsutilsStrings.noEmit = js.native
  var noEmitHelpers: typingsSlinky.tsutils.tsutilsStrings.noEmitHelpers = js.native
  var noEmitOnError: typingsSlinky.tsutils.tsutilsStrings.noEmitOnError = js.native
  var noErrorTruncation: typingsSlinky.tsutils.tsutilsStrings.noErrorTruncation = js.native
  var noFallthroughCasesInSwitch: typingsSlinky.tsutils.tsutilsStrings.noFallthroughCasesInSwitch = js.native
  var noImplicitAny: typingsSlinky.tsutils.tsutilsStrings.noImplicitAny = js.native
  var noImplicitReturns: typingsSlinky.tsutils.tsutilsStrings.noImplicitReturns = js.native
  var noImplicitThis: typingsSlinky.tsutils.tsutilsStrings.noImplicitThis = js.native
  var noImplicitUseStrict: typingsSlinky.tsutils.tsutilsStrings.noImplicitUseStrict = js.native
  var noLib: typingsSlinky.tsutils.tsutilsStrings.noLib = js.native
  var noResolve: typingsSlinky.tsutils.tsutilsStrings.noResolve = js.native
  var noStrictGenericChecks: typingsSlinky.tsutils.tsutilsStrings.noStrictGenericChecks = js.native
  var noUnusedLocals: typingsSlinky.tsutils.tsutilsStrings.noUnusedLocals = js.native
  var noUnusedParameters: typingsSlinky.tsutils.tsutilsStrings.noUnusedParameters = js.native
  var out: typingsSlinky.tsutils.tsutilsStrings.out = js.native
  var outDir: typingsSlinky.tsutils.tsutilsStrings.outDir = js.native
  var outFile: typingsSlinky.tsutils.tsutilsStrings.outFile = js.native
  var paths: typingsSlinky.tsutils.tsutilsStrings.paths = js.native
  var preserveConstEnums: typingsSlinky.tsutils.tsutilsStrings.preserveConstEnums = js.native
  var preserveSymlinks: typingsSlinky.tsutils.tsutilsStrings.preserveSymlinks = js.native
  var project: typingsSlinky.tsutils.tsutilsStrings.project = js.native
  var reactNamespace: typingsSlinky.tsutils.tsutilsStrings.reactNamespace = js.native
  var removeComments: typingsSlinky.tsutils.tsutilsStrings.removeComments = js.native
  var resolveJsonModule: typingsSlinky.tsutils.tsutilsStrings.resolveJsonModule = js.native
  var rootDir: typingsSlinky.tsutils.tsutilsStrings.rootDir = js.native
  var rootDirs: typingsSlinky.tsutils.tsutilsStrings.rootDirs = js.native
  var skipDefaultLibCheck: typingsSlinky.tsutils.tsutilsStrings.skipDefaultLibCheck = js.native
  var skipLibCheck: typingsSlinky.tsutils.tsutilsStrings.skipLibCheck = js.native
  var sourceMap: typingsSlinky.tsutils.tsutilsStrings.sourceMap = js.native
  var sourceRoot: typingsSlinky.tsutils.tsutilsStrings.sourceRoot = js.native
  var strict: typingsSlinky.tsutils.tsutilsStrings.strict = js.native
  var strictBindCallApply: typingsSlinky.tsutils.tsutilsStrings.strictBindCallApply = js.native
  var strictFunctionTypes: typingsSlinky.tsutils.tsutilsStrings.strictFunctionTypes = js.native
  var strictNullChecks: typingsSlinky.tsutils.tsutilsStrings.strictNullChecks = js.native
  var strictPropertyInitialization: typingsSlinky.tsutils.tsutilsStrings.strictPropertyInitialization = js.native
  var stripInternal: typingsSlinky.tsutils.tsutilsStrings.stripInternal = js.native
  var suppressExcessPropertyErrors: typingsSlinky.tsutils.tsutilsStrings.suppressExcessPropertyErrors = js.native
  var suppressImplicitAnyIndexErrors: typingsSlinky.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors = js.native
  var target: typingsSlinky.tsutils.tsutilsStrings.target = js.native
  var traceResolution: typingsSlinky.tsutils.tsutilsStrings.traceResolution = js.native
  var tsBuildInfoFile: typingsSlinky.tsutils.tsutilsStrings.tsBuildInfoFile = js.native
  var typeRoots: typingsSlinky.tsutils.tsutilsStrings.typeRoots = js.native
  var types: typingsSlinky.tsutils.tsutilsStrings.types = js.native
  var useDefineForClassFields: typingsSlinky.tsutils.tsutilsStrings.useDefineForClassFields = js.native
}

object KinkeyofCompilerOptionsNo {
  @scala.inline
  def apply(
    allowJs: allowJs,
    allowSyntheticDefaultImports: allowSyntheticDefaultImports,
    allowUmdGlobalAccess: allowUmdGlobalAccess,
    allowUnreachableCode: allowUnreachableCode,
    allowUnusedLabels: allowUnusedLabels,
    alwaysStrict: alwaysStrict,
    assumeChangesOnlyAffectDirectDependencies: assumeChangesOnlyAffectDirectDependencies,
    baseUrl: baseUrl,
    charset: charset,
    checkJs: checkJs,
    composite: composite,
    declaration: declaration,
    declarationDir: declarationDir,
    declarationMap: declarationMap,
    disableSizeLimit: disableSizeLimit,
    disableSolutionSearching: disableSolutionSearching,
    disableSourceOfProjectReferenceRedirect: disableSourceOfProjectReferenceRedirect,
    downlevelIteration: downlevelIteration,
    emitBOM: emitBOM,
    emitDeclarationOnly: emitDeclarationOnly,
    emitDecoratorMetadata: emitDecoratorMetadata,
    esModuleInterop: esModuleInterop,
    experimentalDecorators: experimentalDecorators,
    forceConsistentCasingInFileNames: forceConsistentCasingInFileNames,
    importHelpers: importHelpers,
    importsNotUsedAsValues: importsNotUsedAsValues,
    incremental: incremental,
    inlineSourceMap: inlineSourceMap,
    inlineSources: inlineSources,
    isolatedModules: isolatedModules,
    jsx: jsx,
    jsxFactory: jsxFactory,
    keyofStringsOnly: keyofStringsOnly,
    lib: lib,
    locale: locale,
    mapRoot: mapRoot,
    maxNodeModuleJsDepth: maxNodeModuleJsDepth,
    module: module,
    moduleResolution: moduleResolution,
    newLine: newLine,
    noEmit: noEmit,
    noEmitHelpers: noEmitHelpers,
    noEmitOnError: noEmitOnError,
    noErrorTruncation: noErrorTruncation,
    noFallthroughCasesInSwitch: noFallthroughCasesInSwitch,
    noImplicitAny: noImplicitAny,
    noImplicitReturns: noImplicitReturns,
    noImplicitThis: noImplicitThis,
    noImplicitUseStrict: noImplicitUseStrict,
    noLib: noLib,
    noResolve: noResolve,
    noStrictGenericChecks: noStrictGenericChecks,
    noUnusedLocals: noUnusedLocals,
    noUnusedParameters: noUnusedParameters,
    out: out,
    outDir: outDir,
    outFile: outFile,
    paths: paths,
    preserveConstEnums: preserveConstEnums,
    preserveSymlinks: preserveSymlinks,
    project: project,
    reactNamespace: reactNamespace,
    removeComments: removeComments,
    resolveJsonModule: resolveJsonModule,
    rootDir: rootDir,
    rootDirs: rootDirs,
    skipDefaultLibCheck: skipDefaultLibCheck,
    skipLibCheck: skipLibCheck,
    sourceMap: sourceMap,
    sourceRoot: sourceRoot,
    strict: strict,
    strictBindCallApply: strictBindCallApply,
    strictFunctionTypes: strictFunctionTypes,
    strictNullChecks: strictNullChecks,
    strictPropertyInitialization: strictPropertyInitialization,
    stripInternal: stripInternal,
    suppressExcessPropertyErrors: suppressExcessPropertyErrors,
    suppressImplicitAnyIndexErrors: suppressImplicitAnyIndexErrors,
    target: target,
    traceResolution: traceResolution,
    tsBuildInfoFile: tsBuildInfoFile,
    typeRoots: typeRoots,
    types: types,
    useDefineForClassFields: useDefineForClassFields
  ): KinkeyofCompilerOptionsNo = {
    val __obj = js.Dynamic.literal(allowJs = allowJs.asInstanceOf[js.Any], allowSyntheticDefaultImports = allowSyntheticDefaultImports.asInstanceOf[js.Any], allowUmdGlobalAccess = allowUmdGlobalAccess.asInstanceOf[js.Any], allowUnreachableCode = allowUnreachableCode.asInstanceOf[js.Any], allowUnusedLabels = allowUnusedLabels.asInstanceOf[js.Any], alwaysStrict = alwaysStrict.asInstanceOf[js.Any], assumeChangesOnlyAffectDirectDependencies = assumeChangesOnlyAffectDirectDependencies.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], checkJs = checkJs.asInstanceOf[js.Any], composite = composite.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], declarationDir = declarationDir.asInstanceOf[js.Any], declarationMap = declarationMap.asInstanceOf[js.Any], disableSizeLimit = disableSizeLimit.asInstanceOf[js.Any], disableSolutionSearching = disableSolutionSearching.asInstanceOf[js.Any], disableSourceOfProjectReferenceRedirect = disableSourceOfProjectReferenceRedirect.asInstanceOf[js.Any], downlevelIteration = downlevelIteration.asInstanceOf[js.Any], emitBOM = emitBOM.asInstanceOf[js.Any], emitDeclarationOnly = emitDeclarationOnly.asInstanceOf[js.Any], emitDecoratorMetadata = emitDecoratorMetadata.asInstanceOf[js.Any], esModuleInterop = esModuleInterop.asInstanceOf[js.Any], experimentalDecorators = experimentalDecorators.asInstanceOf[js.Any], forceConsistentCasingInFileNames = forceConsistentCasingInFileNames.asInstanceOf[js.Any], importHelpers = importHelpers.asInstanceOf[js.Any], importsNotUsedAsValues = importsNotUsedAsValues.asInstanceOf[js.Any], incremental = incremental.asInstanceOf[js.Any], inlineSourceMap = inlineSourceMap.asInstanceOf[js.Any], inlineSources = inlineSources.asInstanceOf[js.Any], isolatedModules = isolatedModules.asInstanceOf[js.Any], jsx = jsx.asInstanceOf[js.Any], jsxFactory = jsxFactory.asInstanceOf[js.Any], keyofStringsOnly = keyofStringsOnly.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mapRoot = mapRoot.asInstanceOf[js.Any], maxNodeModuleJsDepth = maxNodeModuleJsDepth.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleResolution = moduleResolution.asInstanceOf[js.Any], newLine = newLine.asInstanceOf[js.Any], noEmit = noEmit.asInstanceOf[js.Any], noEmitHelpers = noEmitHelpers.asInstanceOf[js.Any], noEmitOnError = noEmitOnError.asInstanceOf[js.Any], noErrorTruncation = noErrorTruncation.asInstanceOf[js.Any], noFallthroughCasesInSwitch = noFallthroughCasesInSwitch.asInstanceOf[js.Any], noImplicitAny = noImplicitAny.asInstanceOf[js.Any], noImplicitReturns = noImplicitReturns.asInstanceOf[js.Any], noImplicitThis = noImplicitThis.asInstanceOf[js.Any], noImplicitUseStrict = noImplicitUseStrict.asInstanceOf[js.Any], noLib = noLib.asInstanceOf[js.Any], noResolve = noResolve.asInstanceOf[js.Any], noStrictGenericChecks = noStrictGenericChecks.asInstanceOf[js.Any], noUnusedLocals = noUnusedLocals.asInstanceOf[js.Any], noUnusedParameters = noUnusedParameters.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], outFile = outFile.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], preserveConstEnums = preserveConstEnums.asInstanceOf[js.Any], preserveSymlinks = preserveSymlinks.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNamespace = reactNamespace.asInstanceOf[js.Any], removeComments = removeComments.asInstanceOf[js.Any], resolveJsonModule = resolveJsonModule.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], rootDirs = rootDirs.asInstanceOf[js.Any], skipDefaultLibCheck = skipDefaultLibCheck.asInstanceOf[js.Any], skipLibCheck = skipLibCheck.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], strictBindCallApply = strictBindCallApply.asInstanceOf[js.Any], strictFunctionTypes = strictFunctionTypes.asInstanceOf[js.Any], strictNullChecks = strictNullChecks.asInstanceOf[js.Any], strictPropertyInitialization = strictPropertyInitialization.asInstanceOf[js.Any], stripInternal = stripInternal.asInstanceOf[js.Any], suppressExcessPropertyErrors = suppressExcessPropertyErrors.asInstanceOf[js.Any], suppressImplicitAnyIndexErrors = suppressImplicitAnyIndexErrors.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], traceResolution = traceResolution.asInstanceOf[js.Any], tsBuildInfoFile = tsBuildInfoFile.asInstanceOf[js.Any], typeRoots = typeRoots.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], useDefineForClassFields = useDefineForClassFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinkeyofCompilerOptionsNo]
  }
  @scala.inline
  implicit class KinkeyofCompilerOptionsNoOps[Self <: KinkeyofCompilerOptionsNo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowJs(value: allowJs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowJs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowSyntheticDefaultImports(value: allowSyntheticDefaultImports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSyntheticDefaultImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUmdGlobalAccess(value: allowUmdGlobalAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUmdGlobalAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUnreachableCode(value: allowUnreachableCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnreachableCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUnusedLabels(value: allowUnusedLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnusedLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysStrict(value: alwaysStrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssumeChangesOnlyAffectDirectDependencies(value: assumeChangesOnlyAffectDirectDependencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeChangesOnlyAffectDirectDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: baseUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharset(value: charset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckJs(value: checkJs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkJs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComposite(value: composite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclaration(value: declaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclarationDir(value: declarationDir): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclarationMap(value: declarationMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableSizeLimit(value: disableSizeLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableSolutionSearching(value: disableSolutionSearching): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSolutionSearching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableSourceOfProjectReferenceRedirect(value: disableSourceOfProjectReferenceRedirect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSourceOfProjectReferenceRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownlevelIteration(value: downlevelIteration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlevelIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitBOM(value: emitBOM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitBOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitDeclarationOnly(value: emitDeclarationOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitDeclarationOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitDecoratorMetadata(value: emitDecoratorMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitDecoratorMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEsModuleInterop(value: esModuleInterop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModuleInterop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExperimentalDecorators(value: experimentalDecorators): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalDecorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceConsistentCasingInFileNames(value: forceConsistentCasingInFileNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceConsistentCasingInFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportHelpers(value: importHelpers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importHelpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportsNotUsedAsValues(value: importsNotUsedAsValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importsNotUsedAsValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncremental(value: incremental): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incremental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineSourceMap(value: inlineSourceMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineSourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineSources(value: inlineSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsolatedModules(value: isolatedModules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolatedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsx(value: jsx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsxFactory(value: jsxFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyofStringsOnly(value: keyofStringsOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyofStringsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLib(value: lib): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapRoot(value: mapRoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxNodeModuleJsDepth(value: maxNodeModuleJsDepth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeModuleJsDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule(value: module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleResolution(value: moduleResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLine(value: newLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoEmit(value: noEmit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoEmitHelpers(value: noEmitHelpers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitHelpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoEmitOnError(value: noEmitOnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoErrorTruncation(value: noErrorTruncation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noErrorTruncation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoFallthroughCasesInSwitch(value: noFallthroughCasesInSwitch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFallthroughCasesInSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoImplicitAny(value: noImplicitAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitAny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoImplicitReturns(value: noImplicitReturns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitReturns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoImplicitThis(value: noImplicitThis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitThis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoImplicitUseStrict(value: noImplicitUseStrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitUseStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoLib(value: noLib): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResolve(value: noResolve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoStrictGenericChecks(value: noStrictGenericChecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStrictGenericChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoUnusedLocals(value: noUnusedLocals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnusedLocals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoUnusedParameters(value: noUnusedParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnusedParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOut(value: out): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutDir(value: outDir): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutFile(value: outFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: paths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveConstEnums(value: preserveConstEnums): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveConstEnums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveSymlinks(value: preserveSymlinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: project): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReactNamespace(value: reactNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveComments(value: removeComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveJsonModule(value: resolveJsonModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveJsonModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDir(value: rootDir): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDirs(value: rootDirs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipDefaultLibCheck(value: skipDefaultLibCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDefaultLibCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipLibCheck(value: skipLibCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLibCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMap(value: sourceMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRoot(value: sourceRoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrict(value: strict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrictBindCallApply(value: strictBindCallApply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictBindCallApply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrictFunctionTypes(value: strictFunctionTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictFunctionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrictNullChecks(value: strictNullChecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNullChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrictPropertyInitialization(value: strictPropertyInitialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictPropertyInitialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStripInternal(value: stripInternal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripInternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressExcessPropertyErrors(value: suppressExcessPropertyErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressExcessPropertyErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressImplicitAnyIndexErrors(value: suppressImplicitAnyIndexErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressImplicitAnyIndexErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceResolution(value: traceResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTsBuildInfoFile(value: tsBuildInfoFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsBuildInfoFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeRoots(value: typeRoots): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeRoots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: types): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseDefineForClassFields(value: useDefineForClassFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefineForClassFields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

