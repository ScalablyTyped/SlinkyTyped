package typingsSlinky.tslint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def ENABLE_DISABLE_REGEX: js.RegExp = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ENABLE_DISABLE_REGEX").asInstanceOf[js.RegExp]
  
  @scala.inline
  def ancestorWhere[T /* <: typingsSlinky.typescript.mod.Node */](
    node: typingsSlinky.typescript.mod.Node,
    predicate: js.Function1[/* n */ typingsSlinky.typescript.mod.Node, /* is T */ scala.Boolean]
  ): js.UndefOr[T] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ancestorWhere")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def childOfKind(node: typingsSlinky.typescript.mod.Node, kind: typingsSlinky.typescript.mod.SyntaxKind): js.UndefOr[typingsSlinky.typescript.mod.Node] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("childOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Node]]
  
  @scala.inline
  def doesIntersect(
    failure: typingsSlinky.tslint.ruleMod.RuleFailure,
    disabledIntervals: js.Array[typingsSlinky.tslint.ruleMod.IDisabledInterval]
  ): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doesIntersect")(failure.asInstanceOf[js.Any], disabledIntervals.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def findFormatter(name: java.lang.String): js.UndefOr[typingsSlinky.tslint.formatterMod.FormatterConstructor] = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.tslint.formatterMod.FormatterConstructor]]
  @scala.inline
  def findFormatter(name: java.lang.String, formattersDirectory: java.lang.String): js.UndefOr[typingsSlinky.tslint.formatterMod.FormatterConstructor] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.tslint.formatterMod.FormatterConstructor]]
  @scala.inline
  def findFormatter(name: typingsSlinky.tslint.formatterMod.FormatterConstructor): js.UndefOr[typingsSlinky.tslint.formatterMod.FormatterConstructor] = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.tslint.formatterMod.FormatterConstructor]]
  @scala.inline
  def findFormatter(
    name: typingsSlinky.tslint.formatterMod.FormatterConstructor,
    formattersDirectory: java.lang.String
  ): js.UndefOr[typingsSlinky.tslint.formatterMod.FormatterConstructor] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.tslint.formatterMod.FormatterConstructor]]
  
  @scala.inline
  def findRule(name: java.lang.String): js.UndefOr[typingsSlinky.tslint.ruleMod.RuleConstructor] = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.tslint.ruleMod.RuleConstructor]]
  @scala.inline
  def findRule(name: java.lang.String, rulesDirectories: java.lang.String): js.UndefOr[typingsSlinky.tslint.ruleMod.RuleConstructor] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.tslint.ruleMod.RuleConstructor]]
  @scala.inline
  def findRule(name: java.lang.String, rulesDirectories: js.Array[java.lang.String]): js.UndefOr[typingsSlinky.tslint.ruleMod.RuleConstructor] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.tslint.ruleMod.RuleConstructor]]
  
  @scala.inline
  def forEachComment(node: typingsSlinky.typescript.mod.Node, cb: typingsSlinky.tslint.utilsMod.ForEachCommentCallback): scala.Unit = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def forEachToken(
    node: typingsSlinky.typescript.mod.Node,
    skipTrivia: scala.Boolean,
    cb: typingsSlinky.tslint.utilsMod.ForEachTokenCallback
  ): scala.Unit = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def forEachToken(
    node: typingsSlinky.typescript.mod.Node,
    skipTrivia: scala.Boolean,
    cb: typingsSlinky.tslint.utilsMod.ForEachTokenCallback,
    filter: typingsSlinky.tslint.utilsMod.FilterCallback
  ): scala.Unit = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getBindingElementVariableDeclaration(node: typingsSlinky.typescript.mod.BindingElement): typingsSlinky.typescript.mod.VariableDeclaration | scala.Null = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBindingElementVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.typescript.mod.VariableDeclaration | scala.Null]
  
  @scala.inline
  def getEqualsKind(node: typingsSlinky.typescript.mod.BinaryOperatorToken): js.UndefOr[typingsSlinky.tslint.utilsMod.EqualsKind] = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getEqualsKind")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.tslint.utilsMod.EqualsKind]]
  
  @scala.inline
  def getSourceFile(fileName: java.lang.String, source: java.lang.String): typingsSlinky.typescript.mod.SourceFile = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFile")(fileName.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.typescript.mod.SourceFile]
  
  @scala.inline
  def hasCommentAfterPosition(text: java.lang.String, position: scala.Double): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasCommentAfterPosition")(text.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasModifier(modifiers: js.UndefOr[scala.Nothing], modifierKinds: typingsSlinky.typescript.mod.SyntaxKind*): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(modifiers.asInstanceOf[js.Any], modifierKinds.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasModifier(
    modifiers: typingsSlinky.typescript.mod.ModifiersArray,
    modifierKinds: typingsSlinky.typescript.mod.SyntaxKind*
  ): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(modifiers.asInstanceOf[js.Any], modifierKinds.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isAssignment(node: typingsSlinky.typescript.mod.Node): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBlockScopeBoundary(node: typingsSlinky.typescript.mod.Node): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBlockScopedBindingElement(node: typingsSlinky.typescript.mod.BindingElement): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBlockScopedVariable(node: typingsSlinky.typescript.mod.VariableDeclaration): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariable")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isBlockScopedVariable(node: typingsSlinky.typescript.mod.VariableStatement): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariable")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isCombinedModifierFlagSet(
    node: typingsSlinky.typescript.mod.Declaration,
    flagToCheck: typingsSlinky.typescript.mod.ModifierFlags
  ): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCombinedModifierFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isCombinedNodeFlagSet(node: typingsSlinky.typescript.mod.Node, flagToCheck: typingsSlinky.typescript.mod.NodeFlags): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCombinedNodeFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isLoop(node: typingsSlinky.typescript.mod.Node): /* is typescript.typescript.IterationStatement */ scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isLoop")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IterationStatement */ scala.Boolean]
  
  @scala.inline
  def isNegativeNumberLiteral(node: typingsSlinky.typescript.mod.Node): /* is tslint.anon.PrefixUnaryExpressionoper */ scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNegativeNumberLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is tslint.anon.PrefixUnaryExpressionoper */ scala.Boolean]
  
  @scala.inline
  def isNestedModuleDeclaration(decl: typingsSlinky.typescript.mod.ModuleDeclaration): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNestedModuleDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNodeFlagSet(node: typingsSlinky.typescript.mod.Node, flagToCheck: typingsSlinky.typescript.mod.NodeFlags): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNodeFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNumeric(node: typingsSlinky.typescript.mod.Expression): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isObjectFlagSet(
    objectType: typingsSlinky.typescript.mod.ObjectType,
    flagToCheck: typingsSlinky.typescript.mod.ObjectFlags
  ): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isObjectFlagSet")(objectType.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isScopeBoundary(node: typingsSlinky.typescript.mod.Node): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isStrictNullChecksEnabled(options: typingsSlinky.typescript.mod.CompilerOptions): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isStrictNullChecksEnabled")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isSymbolFlagSet(symbol: typingsSlinky.typescript.mod.Symbol, flagToCheck: typingsSlinky.typescript.mod.SymbolFlags): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolFlagSet")(symbol.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTypeFlagSet(`type`: typingsSlinky.typescript.mod.Type, flagToCheck: typingsSlinky.typescript.mod.TypeFlags): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypeFlagSet")(`type`.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTypedRule(rule: typingsSlinky.tslint.ruleMod.IRule): /* is tslint.tslint/lib/language/rule/rule.ITypedRule */ scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypedRule")(rule.asInstanceOf[js.Any]).asInstanceOf[/* is tslint.tslint/lib/language/rule/rule.ITypedRule */ scala.Boolean]
  
  @scala.inline
  def isWhiteSpace(ch: scala.Double): scala.Boolean = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isWhiteSpace")(ch.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def loadRules(ruleOptionsList: js.Array[typingsSlinky.tslint.ruleMod.IOptions]): js.Array[typingsSlinky.tslint.ruleMod.IRule] = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(
    ruleOptionsList: js.Array[typingsSlinky.tslint.ruleMod.IOptions],
    rulesDirectories: js.UndefOr[scala.Nothing],
    isJs: scala.Boolean
  ): js.Array[typingsSlinky.tslint.ruleMod.IRule] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(
    ruleOptionsList: js.Array[typingsSlinky.tslint.ruleMod.IOptions],
    rulesDirectories: java.lang.String
  ): js.Array[typingsSlinky.tslint.ruleMod.IRule] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(
    ruleOptionsList: js.Array[typingsSlinky.tslint.ruleMod.IOptions],
    rulesDirectories: java.lang.String,
    isJs: scala.Boolean
  ): js.Array[typingsSlinky.tslint.ruleMod.IRule] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(
    ruleOptionsList: js.Array[typingsSlinky.tslint.ruleMod.IOptions],
    rulesDirectories: js.Array[java.lang.String]
  ): js.Array[typingsSlinky.tslint.ruleMod.IRule] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(
    ruleOptionsList: js.Array[typingsSlinky.tslint.ruleMod.IOptions],
    rulesDirectories: js.Array[java.lang.String],
    isJs: scala.Boolean
  ): js.Array[typingsSlinky.tslint.ruleMod.IRule] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.tslint.ruleMod.IRule]]
  
  @scala.inline
  def removeDisabledFailures(
    sourceFile: typingsSlinky.typescript.mod.SourceFile,
    failures: js.Array[typingsSlinky.tslint.ruleMod.RuleFailure]
  ): js.Array[typingsSlinky.tslint.ruleMod.RuleFailure] = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeDisabledFailures")(sourceFile.asInstanceOf[js.Any], failures.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.tslint.ruleMod.RuleFailure]]
  
  @scala.inline
  def someAncestor(
    node: typingsSlinky.typescript.mod.Node,
    predicate: js.Function1[/* n */ typingsSlinky.typescript.mod.Node, scala.Boolean]
  ): scala.Boolean = (typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("someAncestor")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def unwrapParentheses(node: typingsSlinky.typescript.mod.Expression): typingsSlinky.typescript.mod.Expression = typingsSlinky.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrapParentheses")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.typescript.mod.Expression]
}
