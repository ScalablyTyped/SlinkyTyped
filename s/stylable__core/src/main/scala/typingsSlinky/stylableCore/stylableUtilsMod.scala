package typingsSlinky.stylableCore

import typingsSlinky.postcss.mod.AtRule_
import typingsSlinky.postcss.mod.Declaration
import typingsSlinky.postcss.mod.Root_
import typingsSlinky.postcss.mod.Rule_
import typingsSlinky.std.Record
import typingsSlinky.stylableCore.anon.Selector
import typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
import typingsSlinky.stylableCore.stylableMetaMod.ImportSymbol
import typingsSlinky.stylableCore.stylableMetaMod.Imported
import typingsSlinky.stylableCore.stylableMetaMod.StylableSymbol
import typingsSlinky.stylableCore.stylableProcessorMod.DeclStylableProps
import typingsSlinky.stylableCore.stylableProcessorMod.SDecl
import typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta
import typingsSlinky.stylableCore.stylableResolverMod.StylableResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableUtilsMod {
  
  @JSImport("@stylable/core/cjs/stylable-utils", "CUSTOM_SELECTOR_RE")
  @js.native
  val CUSTOM_SELECTOR_RE: js.RegExp = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String): T = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T): T = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: js.UndefOr[scala.Nothing], isRoot: Boolean): T = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String): T = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T): T = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: js.UndefOr[scala.Nothing], isRoot: Boolean): T = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "expandCustomSelectors")
  @js.native
  def expandCustomSelectors(rule: Rule_, customSelectors: Record[String, String]): String = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "expandCustomSelectors")
  @js.native
  def expandCustomSelectors(rule: Rule_, customSelectors: Record[String, String], diagnostics: Diagnostics): String = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "findDeclaration")
  @js.native
  def findDeclaration(importNode: Imported, test: js.Any): Declaration = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "findRule")
  @js.native
  def findRule(root: Root_, selector: String): Null | Declaration = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "findRule")
  @js.native
  def findRule(root: Root_, selector: String, test: js.Any): Null | Declaration = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "generateScopedCSSVar")
  @js.native
  def generateScopedCSSVar(namespace: String, varName: String): String = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "getAlias")
  @js.native
  def getAlias(symbol: StylableSymbol): js.UndefOr[ImportSymbol] = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "getDeclStylable")
  @js.native
  def getDeclStylable(decl: SDecl): DeclStylableProps = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "getSourcePath")
  @js.native
  def getSourcePath(root: Root_, diagnostics: Diagnostics): String = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "isCSSVarProp")
  @js.native
  def isCSSVarProp(value: String): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "isValidClassName")
  @js.native
  def isValidClassName(className: String): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "isValidDeclaration")
  @js.native
  def isValidDeclaration(decl: Declaration): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "mergeRules")
  @js.native
  def mergeRules(mixinAst: Root_, rule: Rule_): Rule_ = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "removeUnusedRules")
  @js.native
  def removeUnusedRules(
    ast: Root_,
    meta: StylableMeta,
    _import: Imported,
    usedFiles: js.Array[String],
    resolvePath: js.Function2[/* ctx */ String, /* path */ String, String]
  ): Unit = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "scopeCSSVar")
  @js.native
  def scopeCSSVar(resolver: StylableResolver, meta: StylableMeta, symbolName: String): String = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "scopeSelector")
  @js.native
  def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String): Selector = js.native
  @JSImport("@stylable/core/cjs/stylable-utils", "scopeSelector")
  @js.native
  def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String, rootScopeLevel: Boolean): Selector = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "transformMatchesOnRule")
  @js.native
  def transformMatchesOnRule(rule: Rule_, lineBreak: Boolean): String = js.native
}
