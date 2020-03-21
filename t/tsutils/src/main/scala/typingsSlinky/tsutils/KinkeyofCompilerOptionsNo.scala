package typingsSlinky.tsutils

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
trait KinkeyofCompilerOptionsNo extends js.Object {
  var allowJs: typingsSlinky.tsutils.tsutilsStrings.allowJs
  var allowSyntheticDefaultImports: typingsSlinky.tsutils.tsutilsStrings.allowSyntheticDefaultImports
  var allowUmdGlobalAccess: typingsSlinky.tsutils.tsutilsStrings.allowUmdGlobalAccess
  var allowUnreachableCode: typingsSlinky.tsutils.tsutilsStrings.allowUnreachableCode
  var allowUnusedLabels: typingsSlinky.tsutils.tsutilsStrings.allowUnusedLabels
  var alwaysStrict: typingsSlinky.tsutils.tsutilsStrings.alwaysStrict
  var assumeChangesOnlyAffectDirectDependencies: typingsSlinky.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies
  var baseUrl: typingsSlinky.tsutils.tsutilsStrings.baseUrl
  var charset: typingsSlinky.tsutils.tsutilsStrings.charset
  var checkJs: typingsSlinky.tsutils.tsutilsStrings.checkJs
  var composite: typingsSlinky.tsutils.tsutilsStrings.composite
  var declaration: typingsSlinky.tsutils.tsutilsStrings.declaration
  var declarationDir: typingsSlinky.tsutils.tsutilsStrings.declarationDir
  var declarationMap: typingsSlinky.tsutils.tsutilsStrings.declarationMap
  var disableSizeLimit: typingsSlinky.tsutils.tsutilsStrings.disableSizeLimit
  var disableSolutionSearching: typingsSlinky.tsutils.tsutilsStrings.disableSolutionSearching
  var disableSourceOfProjectReferenceRedirect: typingsSlinky.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect
  var downlevelIteration: typingsSlinky.tsutils.tsutilsStrings.downlevelIteration
  var emitBOM: typingsSlinky.tsutils.tsutilsStrings.emitBOM
  var emitDeclarationOnly: typingsSlinky.tsutils.tsutilsStrings.emitDeclarationOnly
  var emitDecoratorMetadata: typingsSlinky.tsutils.tsutilsStrings.emitDecoratorMetadata
  var esModuleInterop: typingsSlinky.tsutils.tsutilsStrings.esModuleInterop
  var experimentalDecorators: typingsSlinky.tsutils.tsutilsStrings.experimentalDecorators
  var forceConsistentCasingInFileNames: typingsSlinky.tsutils.tsutilsStrings.forceConsistentCasingInFileNames
  var importHelpers: typingsSlinky.tsutils.tsutilsStrings.importHelpers
  var importsNotUsedAsValues: typingsSlinky.tsutils.tsutilsStrings.importsNotUsedAsValues
  var incremental: typingsSlinky.tsutils.tsutilsStrings.incremental
  var inlineSourceMap: typingsSlinky.tsutils.tsutilsStrings.inlineSourceMap
  var inlineSources: typingsSlinky.tsutils.tsutilsStrings.inlineSources
  var isolatedModules: typingsSlinky.tsutils.tsutilsStrings.isolatedModules
  var jsx: typingsSlinky.tsutils.tsutilsStrings.jsx
  var jsxFactory: typingsSlinky.tsutils.tsutilsStrings.jsxFactory
  var keyofStringsOnly: typingsSlinky.tsutils.tsutilsStrings.keyofStringsOnly
  var lib: typingsSlinky.tsutils.tsutilsStrings.lib
  var locale: typingsSlinky.tsutils.tsutilsStrings.locale
  var mapRoot: typingsSlinky.tsutils.tsutilsStrings.mapRoot
  var maxNodeModuleJsDepth: typingsSlinky.tsutils.tsutilsStrings.maxNodeModuleJsDepth
  var module: typingsSlinky.tsutils.tsutilsStrings.module
  var moduleResolution: typingsSlinky.tsutils.tsutilsStrings.moduleResolution
  var newLine: typingsSlinky.tsutils.tsutilsStrings.newLine
  var noEmit: typingsSlinky.tsutils.tsutilsStrings.noEmit
  var noEmitHelpers: typingsSlinky.tsutils.tsutilsStrings.noEmitHelpers
  var noEmitOnError: typingsSlinky.tsutils.tsutilsStrings.noEmitOnError
  var noErrorTruncation: typingsSlinky.tsutils.tsutilsStrings.noErrorTruncation
  var noFallthroughCasesInSwitch: typingsSlinky.tsutils.tsutilsStrings.noFallthroughCasesInSwitch
  var noImplicitAny: typingsSlinky.tsutils.tsutilsStrings.noImplicitAny
  var noImplicitReturns: typingsSlinky.tsutils.tsutilsStrings.noImplicitReturns
  var noImplicitThis: typingsSlinky.tsutils.tsutilsStrings.noImplicitThis
  var noImplicitUseStrict: typingsSlinky.tsutils.tsutilsStrings.noImplicitUseStrict
  var noLib: typingsSlinky.tsutils.tsutilsStrings.noLib
  var noResolve: typingsSlinky.tsutils.tsutilsStrings.noResolve
  var noStrictGenericChecks: typingsSlinky.tsutils.tsutilsStrings.noStrictGenericChecks
  var noUnusedLocals: typingsSlinky.tsutils.tsutilsStrings.noUnusedLocals
  var noUnusedParameters: typingsSlinky.tsutils.tsutilsStrings.noUnusedParameters
  var out: typingsSlinky.tsutils.tsutilsStrings.out
  var outDir: typingsSlinky.tsutils.tsutilsStrings.outDir
  var outFile: typingsSlinky.tsutils.tsutilsStrings.outFile
  var paths: typingsSlinky.tsutils.tsutilsStrings.paths
  var preserveConstEnums: typingsSlinky.tsutils.tsutilsStrings.preserveConstEnums
  var preserveSymlinks: typingsSlinky.tsutils.tsutilsStrings.preserveSymlinks
  var project: typingsSlinky.tsutils.tsutilsStrings.project
  var reactNamespace: typingsSlinky.tsutils.tsutilsStrings.reactNamespace
  var removeComments: typingsSlinky.tsutils.tsutilsStrings.removeComments
  var resolveJsonModule: typingsSlinky.tsutils.tsutilsStrings.resolveJsonModule
  var rootDir: typingsSlinky.tsutils.tsutilsStrings.rootDir
  var rootDirs: typingsSlinky.tsutils.tsutilsStrings.rootDirs
  var skipDefaultLibCheck: typingsSlinky.tsutils.tsutilsStrings.skipDefaultLibCheck
  var skipLibCheck: typingsSlinky.tsutils.tsutilsStrings.skipLibCheck
  var sourceMap: typingsSlinky.tsutils.tsutilsStrings.sourceMap
  var sourceRoot: typingsSlinky.tsutils.tsutilsStrings.sourceRoot
  var strict: typingsSlinky.tsutils.tsutilsStrings.strict
  var strictBindCallApply: typingsSlinky.tsutils.tsutilsStrings.strictBindCallApply
  var strictFunctionTypes: typingsSlinky.tsutils.tsutilsStrings.strictFunctionTypes
  var strictNullChecks: typingsSlinky.tsutils.tsutilsStrings.strictNullChecks
  var strictPropertyInitialization: typingsSlinky.tsutils.tsutilsStrings.strictPropertyInitialization
  var stripInternal: typingsSlinky.tsutils.tsutilsStrings.stripInternal
  var suppressExcessPropertyErrors: typingsSlinky.tsutils.tsutilsStrings.suppressExcessPropertyErrors
  var suppressImplicitAnyIndexErrors: typingsSlinky.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors
  var target: typingsSlinky.tsutils.tsutilsStrings.target
  var traceResolution: typingsSlinky.tsutils.tsutilsStrings.traceResolution
  var tsBuildInfoFile: typingsSlinky.tsutils.tsutilsStrings.tsBuildInfoFile
  var typeRoots: typingsSlinky.tsutils.tsutilsStrings.typeRoots
  var types: typingsSlinky.tsutils.tsutilsStrings.types
  var useDefineForClassFields: typingsSlinky.tsutils.tsutilsStrings.useDefineForClassFields
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
}

