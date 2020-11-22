package typingsSlinky.stylableCore.mod

import typingsSlinky.postcss.mod.Declaration
import typingsSlinky.postcss.mod.Rule_
import typingsSlinky.stylableCore.selectorUtilsMod.SelectorAstNode
import typingsSlinky.stylableCore.stateValidatorsMod.StateResult
import typingsSlinky.stylableCore.stylableMetaMod.ClassSymbol
import typingsSlinky.stylableCore.stylableMetaMod.ElementSymbol
import typingsSlinky.stylableCore.stylableMetaMod.StylableSymbol
import typingsSlinky.stylableCore.stylableValueParsersMod.MappedStates
import typingsSlinky.stylableCore.typesMod.StateParsedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "pseudoStates")
@js.native
object pseudoStates extends js.Object {
  
  val booleanStateDelimiter: /* "--" */ String = js.native
  
  def createAttributeState(stateName: String, namespace: String, param: String): String = js.native
  
  def createBooleanStateClassName(stateName: String, namespace: String): String = js.native
  
  def createStateWithParamClassName(stateName: String, namespace: String, param: String): String = js.native
  
  def processPseudoStates(
    value: String,
    decl: Declaration,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): MappedStates = js.native
  
  def resolveStateParam(param: String): String = js.native
  
  def setStateToNode(
    states: MappedStates,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    name: String,
    node: SelectorAstNode,
    namespace: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): Unit = js.native
  def setStateToNode(
    states: MappedStates,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    name: String,
    node: SelectorAstNode,
    namespace: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): Unit = js.native
  
  val stateMiddleDelimiter: /* "-" */ String = js.native
  
  val stateWithParamDelimiter: String = js.native
  
  def transformPseudoStateSelector(
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ClassSymbol,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ClassSymbol,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ElementSymbol,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ElementSymbol,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ClassSymbol,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ClassSymbol,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ElementSymbol,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ElementSymbol,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta = js.native
  
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: js.UndefOr[scala.Nothing],
    validateDefinition: js.UndefOr[scala.Nothing],
    validateValue: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: js.UndefOr[scala.Nothing],
    validateDefinition: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: js.UndefOr[scala.Nothing],
    validateDefinition: Boolean,
    validateValue: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_,
    validateDefinition: js.UndefOr[scala.Nothing],
    validateValue: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_,
    validateDefinition: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_,
    validateDefinition: Boolean,
    validateValue: Boolean
  ): StateResult = js.native
  
  def validateStateDefinition(
    decl: Declaration,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): Unit = js.native
  
  @js.native
  object stateErrors extends js.Object {
    
    def NO_STATE_TYPE_GIVEN(name: String): String = js.native
    
    def STATE_STARTS_WITH_HYPHEN(name: String): String = js.native
    
    def TOO_MANY_ARGS_IN_VALIDATOR(name: String, validator: String, args: js.Array[String]): String = js.native
    
    def TOO_MANY_STATE_TYPES(name: String, types: js.Array[String]): String = js.native
    
    def UNKNOWN_STATE_TYPE(name: String, `type`: String): String = js.native
    
    def UNKNOWN_STATE_USAGE(name: String): String = js.native
  }
}
