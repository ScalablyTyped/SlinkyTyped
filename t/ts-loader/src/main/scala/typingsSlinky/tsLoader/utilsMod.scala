package typingsSlinky.tsLoader

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chalk.mod.Chalk
import typingsSlinky.tsLoader.anon.Character
import typingsSlinky.tsLoader.anon.File
import typingsSlinky.tsLoader.anon.Typeoftypescript
import typingsSlinky.tsLoader.interfacesMod.DependencyGraph
import typingsSlinky.tsLoader.interfacesMod.LoaderOptions
import typingsSlinky.tsLoader.interfacesMod.ReverseDependencyGraph
import typingsSlinky.tsLoader.interfacesMod.TSInstance
import typingsSlinky.tsLoader.interfacesMod.WebpackError
import typingsSlinky.tsLoader.tsLoaderBooleans.`true`
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.ResolvedProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def appendSuffixIfMatch(patterns: js.Array[js.RegExp], filePath: String, suffix: String): String = js.native
  
  def appendSuffixesIfMatch(suffixDict: StringDictionary[js.Array[js.RegExp]], filePath: String): String = js.native
  
  def arrify[T](`val`: T): js.Array[T] = js.native
  def arrify[T](`val`: js.Array[T]): js.Array[T] = js.native
  
  def collectAllDependants(reverseDependencyGraph: ReverseDependencyGraph, fileName: String): js.Array[String] = js.native
  def collectAllDependants(
    reverseDependencyGraph: ReverseDependencyGraph,
    fileName: String,
    collected: StringDictionary[Boolean]
  ): js.Array[String] = js.native
  
  def collectAllDependencies(dependencyGraph: DependencyGraph, filePath: String): js.Array[String] = js.native
  def collectAllDependencies(dependencyGraph: DependencyGraph, filePath: String, collected: StringDictionary[Boolean]): js.Array[String] = js.native
  
  def ensureProgram(instance: TSInstance): js.UndefOr[Program] = js.native
  
  def formatErrors(
    diagnostics: js.UndefOr[scala.Nothing],
    loaderOptions: LoaderOptions,
    colors: Chalk,
    compiler: Typeoftypescript,
    merge: File,
    context: String
  ): js.Array[WebpackError] = js.native
  def formatErrors(
    diagnostics: js.Array[Diagnostic],
    loaderOptions: LoaderOptions,
    colors: Chalk,
    compiler: Typeoftypescript,
    merge: File,
    context: String
  ): js.Array[WebpackError] = js.native
  
  def getAndCacheOutputJSFileName(inputFileName: String, projectReference: ResolvedProjectReference, instance: TSInstance): String = js.native
  
  def getAndCacheProjectReference(filePath: String, instance: TSInstance): js.UndefOr[ResolvedProjectReference] = js.native
  
  def isUsingProjectReferences(instance: TSInstance): Boolean = js.native
  
  def makeError(message: String): WebpackError = js.native
  def makeError(message: String, file: js.UndefOr[scala.Nothing], location: Character): WebpackError = js.native
  def makeError(message: String, file: String): WebpackError = js.native
  def makeError(message: String, file: String, location: Character): WebpackError = js.native
  
  def readFile(fileName: String): js.UndefOr[String] = js.native
  def readFile(fileName: String, encoding: String): js.UndefOr[String] = js.native
  
  def supportsProjectReferences(instance: TSInstance): js.UndefOr[`true`] = js.native
  
  def supportsSolutionBuild(loaderOptions: LoaderOptions, compiler: Typeoftypescript): Boolean = js.native
  
  def unorderedRemoveItem[T](array: js.Array[T], item: T): Boolean = js.native
  
  def validateSourceMapOncePerProject(
    instance: TSInstance,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    jsFileName: String,
    project: ResolvedProjectReference
  ): Unit = js.native
}
