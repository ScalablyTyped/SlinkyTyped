package typingsSlinky.stylableCore

import typingsSlinky.postcss.mod.Node
import typingsSlinky.std.Record
import typingsSlinky.stylableCore.anon.OutputValue
import typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
import typingsSlinky.stylableCore.stylableMetaMod.StylableSymbol
import typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta
import typingsSlinky.stylableCore.stylableResolverMod.CSSResolve
import typingsSlinky.stylableCore.stylableResolverMod.JSResolve
import typingsSlinky.stylableCore.stylableResolverMod.StylableResolver
import typingsSlinky.stylableCore.stylableTransformerMod.StylableTransformer
import typingsSlinky.stylableCore.stylableTransformerMod.replaceValueHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("@stylable/core/cjs/functions", "evalDeclarationValue")
  @js.native
  def evalDeclarationValue(
    resolver: StylableResolver,
    value: String,
    meta: StylableMeta,
    node: js.UndefOr[Node],
    variableOverride: js.UndefOr[(Record[String, String]) | Null],
    valueHook: js.UndefOr[replaceValueHook],
    diagnostics: js.UndefOr[Diagnostics],
    passedThrough: js.UndefOr[js.Array[String]],
    cssVarsMapping: js.UndefOr[Record[String, String]],
    args: js.UndefOr[js.Array[String]]
  ): String = js.native
  
  object functionWarnings {
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings.CANNOT_FIND_IMPORTED_VAR")
    @js.native
    def CANNOT_FIND_IMPORTED_VAR(varName: String): String = js.native
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings.CANNOT_USE_AS_VALUE")
    @js.native
    def CANNOT_USE_AS_VALUE(`type`: String, varName: String): String = js.native
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings.CANNOT_USE_JS_AS_VALUE")
    @js.native
    def CANNOT_USE_JS_AS_VALUE(varName: String): String = js.native
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings.COULD_NOT_RESOLVE_VALUE")
    @js.native
    def COULD_NOT_RESOLVE_VALUE(args: String): String = js.native
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings.CYCLIC_VALUE")
    @js.native
    def CYCLIC_VALUE(cyclicChain: js.Array[String]): String = js.native
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings.FAIL_TO_EXECUTE_FORMATTER")
    @js.native
    def FAIL_TO_EXECUTE_FORMATTER(resolvedValue: String, message: String): String = js.native
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings.MULTI_ARGS_IN_VALUE")
    @js.native
    def MULTI_ARGS_IN_VALUE(args: String): String = js.native
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings.UNKNOWN_FORMATTER")
    @js.native
    def UNKNOWN_FORMATTER(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings.UNKNOWN_VAR")
    @js.native
    def UNKNOWN_VAR(name: String): String = js.native
  }
  
  @JSImport("@stylable/core/cjs/functions", "processDeclarationValue")
  @js.native
  def processDeclarationValue(
    resolver: StylableResolver,
    value: String,
    meta: StylableMeta,
    node: js.UndefOr[Node],
    variableOverride: js.UndefOr[(Record[String, String]) | Null],
    valueHook: js.UndefOr[replaceValueHook],
    diagnostics: js.UndefOr[Diagnostics],
    passedThrough: js.UndefOr[js.Array[String]],
    cssVarsMapping: js.UndefOr[Record[String, String]],
    args: js.UndefOr[js.Array[String]]
  ): OutputValue = js.native
  
  @JSImport("@stylable/core/cjs/functions", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node
  ): Record[String, String] = js.native
  @JSImport("@stylable/core/cjs/functions", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.UndefOr[scala.Nothing],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core/cjs/functions", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core/cjs/functions", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core/cjs/functions", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core/cjs/functions", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.UndefOr[scala.Nothing],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core/cjs/functions", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core/cjs/functions", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  
  type ResolvedFormatter = Record[String, JSResolve | CSSResolve[StylableSymbol] | ValueFormatter | Null]
  
  type ValueFormatter = js.Function1[/* name */ String, String]
}
