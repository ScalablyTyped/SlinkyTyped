package typingsSlinky.solidityParserAntlr.mod

import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.default
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.external
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.internal
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.SourceUnit
  - typingsSlinky.solidityParserAntlr.mod.PragmaDirective
  - typingsSlinky.solidityParserAntlr.mod.ImportDirective
  - typingsSlinky.solidityParserAntlr.mod.ContractDefinition
  - typingsSlinky.solidityParserAntlr.mod.InheritanceSpecifier
  - typingsSlinky.solidityParserAntlr.mod.StateVariableDeclaration
  - typingsSlinky.solidityParserAntlr.mod.UsingForDeclaration
  - typingsSlinky.solidityParserAntlr.mod.StructDefinition
  - typingsSlinky.solidityParserAntlr.mod.ModifierDefinition
  - typingsSlinky.solidityParserAntlr.mod.ModifierInvocation
  - typingsSlinky.solidityParserAntlr.mod.FunctionDefinition
  - typingsSlinky.solidityParserAntlr.mod.EventDefinition
  - typingsSlinky.solidityParserAntlr.mod.EnumValue
  - typingsSlinky.solidityParserAntlr.mod.EnumDefinition
  - typingsSlinky.solidityParserAntlr.mod.VariableDeclaration
  - typingsSlinky.solidityParserAntlr.mod.TypeName
  - typingsSlinky.solidityParserAntlr.mod.UserDefinedTypeName
  - typingsSlinky.solidityParserAntlr.mod.Mapping
  - typingsSlinky.solidityParserAntlr.mod.FunctionTypeName
  - typingsSlinky.solidityParserAntlr.mod.Block
  - typingsSlinky.solidityParserAntlr.mod.ExpressionStatement
  - typingsSlinky.solidityParserAntlr.mod.IfStatement
  - typingsSlinky.solidityParserAntlr.mod.WhileStatement
  - typingsSlinky.solidityParserAntlr.mod.ForStatement
  - typingsSlinky.solidityParserAntlr.mod.InlineAssemblyStatement
  - typingsSlinky.solidityParserAntlr.mod.DoWhileStatement
  - typingsSlinky.solidityParserAntlr.mod.ContinueStatement
  - typingsSlinky.solidityParserAntlr.mod.BreakStatement
  - typingsSlinky.solidityParserAntlr.mod.ReturnStatement
  - typingsSlinky.solidityParserAntlr.mod.EmitStatement
  - typingsSlinky.solidityParserAntlr.mod.ThrowStatement
  - typingsSlinky.solidityParserAntlr.mod.VariableDeclarationStatement
  - typingsSlinky.solidityParserAntlr.mod.ElementaryTypeName
  - typingsSlinky.solidityParserAntlr.mod.AssemblyBlock
  - typingsSlinky.solidityParserAntlr.mod.AssemblyCall
  - typingsSlinky.solidityParserAntlr.mod.AssemblyLocalDefinition
  - typingsSlinky.solidityParserAntlr.mod.AssemblyAssignment
  - typingsSlinky.solidityParserAntlr.mod.AssemblyStackAssignment
  - typingsSlinky.solidityParserAntlr.mod.LabelDefinition
  - typingsSlinky.solidityParserAntlr.mod.AssemblySwitch
  - typingsSlinky.solidityParserAntlr.mod.AssemblyCase
  - typingsSlinky.solidityParserAntlr.mod.AssemblyFunctionDefinition
  - typingsSlinky.solidityParserAntlr.mod.AssemblyFunctionReturns
  - typingsSlinky.solidityParserAntlr.mod.AssemblyFor
  - typingsSlinky.solidityParserAntlr.mod.AssemblyIf
  - typingsSlinky.solidityParserAntlr.mod.AssemblyLiteral
  - typingsSlinky.solidityParserAntlr.mod.SubAssembly
  - typingsSlinky.solidityParserAntlr.mod.TupleExpression
  - typingsSlinky.solidityParserAntlr.mod.ElementaryTypeNameExpression
  - typingsSlinky.solidityParserAntlr.mod.BinaryOperation
  - typingsSlinky.solidityParserAntlr.mod.Conditional
  - typingsSlinky.solidityParserAntlr.mod.IndexAccess
  - typingsSlinky.solidityParserAntlr.mod.AssemblyItem
  - typingsSlinky.solidityParserAntlr.mod.Expression
*/
trait ASTNode extends StObject
object ASTNode {
  
  @scala.inline
  def ArrayTypeName(
    baseTypeName: TypeName,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName
  ): typingsSlinky.solidityParserAntlr.mod.ArrayTypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ArrayTypeName]
  }
  
  @scala.inline
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
  ): typingsSlinky.solidityParserAntlr.mod.AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyAssignment]
  }
  
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  ): typingsSlinky.solidityParserAntlr.mod.AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyBlock]
  }
  
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
  ): typingsSlinky.solidityParserAntlr.mod.AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyCall]
  }
  
  @scala.inline
  def AssemblyCase(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase): typingsSlinky.solidityParserAntlr.mod.AssemblyCase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyCase]
  }
  
  @scala.inline
  def AssemblyFor(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): typingsSlinky.solidityParserAntlr.mod.AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyFor]
  }
  
  @scala.inline
  def AssemblyFunctionDefinition(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition): typingsSlinky.solidityParserAntlr.mod.AssemblyFunctionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyFunctionDefinition]
  }
  
  @scala.inline
  def AssemblyFunctionReturns(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns): typingsSlinky.solidityParserAntlr.mod.AssemblyFunctionReturns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyFunctionReturns]
  }
  
  @scala.inline
  def AssemblyIf(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf): typingsSlinky.solidityParserAntlr.mod.AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyIf]
  }
  
  @scala.inline
  def AssemblyLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): typingsSlinky.solidityParserAntlr.mod.AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyLiteral]
  }
  
  @scala.inline
  def AssemblyLocalDefinition(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): typingsSlinky.solidityParserAntlr.mod.AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyLocalDefinition]
  }
  
  @scala.inline
  def AssemblyStackAssignment(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): typingsSlinky.solidityParserAntlr.mod.AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyStackAssignment]
  }
  
  @scala.inline
  def AssemblySwitch(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch): typingsSlinky.solidityParserAntlr.mod.AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblySwitch]
  }
  
  @scala.inline
  def BinaryOperation(
    left: Expression,
    operator: BinOp,
    right: Expression,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation
  ): typingsSlinky.solidityParserAntlr.mod.BinaryOperation = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.BinaryOperation]
  }
  
  @scala.inline
  def Block(
    statements: js.Array[Statement],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Block
  ): typingsSlinky.solidityParserAntlr.mod.Block = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Block]
  }
  
  @scala.inline
  def BooleanLiteral(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral,
    value: Boolean
  ): typingsSlinky.solidityParserAntlr.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.BooleanLiteral]
  }
  
  @scala.inline
  def Break(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break): typingsSlinky.solidityParserAntlr.mod.Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Break]
  }
  
  @scala.inline
  def BreakStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement): typingsSlinky.solidityParserAntlr.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.BreakStatement]
  }
  
  @scala.inline
  def Conditional(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Conditional
  ): typingsSlinky.solidityParserAntlr.mod.Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Conditional]
  }
  
  @scala.inline
  def Continue(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Continue): typingsSlinky.solidityParserAntlr.mod.Continue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Continue]
  }
  
  @scala.inline
  def ContinueStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): typingsSlinky.solidityParserAntlr.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ContinueStatement]
  }
  
  @scala.inline
  def ContractDefinition(
    baseContracts: js.Array[InheritanceSpecifier],
    kind: String,
    name: String,
    subNodes: js.Array[ASTNode],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition
  ): typingsSlinky.solidityParserAntlr.mod.ContractDefinition = {
    val __obj = js.Dynamic.literal(baseContracts = baseContracts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subNodes = subNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ContractDefinition]
  }
  
  @scala.inline
  def DecimalNumber(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber, value: String): typingsSlinky.solidityParserAntlr.mod.DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.DecimalNumber]
  }
  
  @scala.inline
  def DoWhileStatement(
    body: Statement,
    condition: Expression,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
  ): typingsSlinky.solidityParserAntlr.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.DoWhileStatement]
  }
  
  @scala.inline
  def ElementaryTypeName(
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName
  ): typingsSlinky.solidityParserAntlr.mod.ElementaryTypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ElementaryTypeName]
  }
  
  @scala.inline
  def ElementaryTypeNameExpression(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName
  ): typingsSlinky.solidityParserAntlr.mod.ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ElementaryTypeNameExpression]
  }
  
  @scala.inline
  def EmitStatement(
    eventCall: FunctionCall,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  ): typingsSlinky.solidityParserAntlr.mod.EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.EmitStatement]
  }
  
  @scala.inline
  def EnumDefinition(
    members: js.Array[EnumValue],
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition
  ): typingsSlinky.solidityParserAntlr.mod.EnumDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.EnumDefinition]
  }
  
  @scala.inline
  def EnumValue(name: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumValue): typingsSlinky.solidityParserAntlr.mod.EnumValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.EnumValue]
  }
  
  @scala.inline
  def EventDefinition(
    name: String,
    parameters: js.Array[VariableDeclaration],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition
  ): typingsSlinky.solidityParserAntlr.mod.EventDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.EventDefinition]
  }
  
  @scala.inline
  def ExpressionStatement(
    expression: Expression,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
  ): typingsSlinky.solidityParserAntlr.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ExpressionStatement]
  }
  
  @scala.inline
  def ForStatement(body: Statement, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): typingsSlinky.solidityParserAntlr.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ForStatement]
  }
  
  @scala.inline
  def FunctionCall(
    arguments: js.Array[Expression],
    expression: Expression,
    names: js.Array[String],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall
  ): typingsSlinky.solidityParserAntlr.mod.FunctionCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.FunctionCall]
  }
  
  @scala.inline
  def FunctionDefinition(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition,
    visibility: default | external | internal | public | `private`
  ): typingsSlinky.solidityParserAntlr.mod.FunctionDefinition = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.FunctionDefinition]
  }
  
  @scala.inline
  def FunctionTypeName(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName,
    visibility: String
  ): typingsSlinky.solidityParserAntlr.mod.FunctionTypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.FunctionTypeName]
  }
  
  @scala.inline
  def HexLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral, value: String): typingsSlinky.solidityParserAntlr.mod.HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.HexLiteral]
  }
  
  @scala.inline
  def HexNumber(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexNumber, value: String): typingsSlinky.solidityParserAntlr.mod.HexNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.HexNumber]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Identifier): typingsSlinky.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Identifier]
  }
  
  @scala.inline
  def IfStatement(
    condition: Expression,
    trueBody: Statement,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  ): typingsSlinky.solidityParserAntlr.mod.IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.IfStatement]
  }
  
  @scala.inline
  def ImportDirective(
    path: String,
    symbolAliases: js.Array[js.Tuple2[String, String]],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective,
    unitAlias: String
  ): typingsSlinky.solidityParserAntlr.mod.ImportDirective = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ImportDirective]
  }
  
  @scala.inline
  def IndexAccess(
    base: Expression,
    index: Expression,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess
  ): typingsSlinky.solidityParserAntlr.mod.IndexAccess = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.IndexAccess]
  }
  
  @scala.inline
  def InheritanceSpecifier(
    arguments: js.Array[Expression],
    baseName: UserDefinedTypeName,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier
  ): typingsSlinky.solidityParserAntlr.mod.InheritanceSpecifier = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.InheritanceSpecifier]
  }
  
  @scala.inline
  def InlineAssemblyStatement(
    body: AssemblyBlock,
    language: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  ): typingsSlinky.solidityParserAntlr.mod.InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.InlineAssemblyStatement]
  }
  
  @scala.inline
  def LabelDefinition(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition): typingsSlinky.solidityParserAntlr.mod.LabelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.LabelDefinition]
  }
  
  @scala.inline
  def Mapping(
    keyType: ElementaryTypeName,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Mapping,
    valueType: TypeName
  ): typingsSlinky.solidityParserAntlr.mod.Mapping = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Mapping]
  }
  
  @scala.inline
  def MemberAccess(
    expression: Expression,
    memberName: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess
  ): typingsSlinky.solidityParserAntlr.mod.MemberAccess = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.MemberAccess]
  }
  
  @scala.inline
  def ModifierDefinition(
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition
  ): typingsSlinky.solidityParserAntlr.mod.ModifierDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ModifierDefinition]
  }
  
  @scala.inline
  def ModifierInvocation(
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation
  ): typingsSlinky.solidityParserAntlr.mod.ModifierInvocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ModifierInvocation]
  }
  
  @scala.inline
  def NumberLiteral(number: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): typingsSlinky.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.NumberLiteral]
  }
  
  @scala.inline
  def PragmaDirective(
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective,
    value: String
  ): typingsSlinky.solidityParserAntlr.mod.PragmaDirective = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.PragmaDirective]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement): typingsSlinky.solidityParserAntlr.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ReturnStatement]
  }
  
  @scala.inline
  def SourceUnit(
    children: js.Array[ASTNode],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit
  ): typingsSlinky.solidityParserAntlr.mod.SourceUnit = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.SourceUnit]
  }
  
  @scala.inline
  def StateVariableDeclaration(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration,
    variables: js.Array[VariableDeclaration]
  ): typingsSlinky.solidityParserAntlr.mod.StateVariableDeclaration = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.StateVariableDeclaration]
  }
  
  @scala.inline
  def StringLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral, value: String): typingsSlinky.solidityParserAntlr.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.StringLiteral]
  }
  
  @scala.inline
  def StructDefinition(
    members: js.Array[VariableDeclaration],
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition
  ): typingsSlinky.solidityParserAntlr.mod.StructDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.StructDefinition]
  }
  
  @scala.inline
  def SubAssembly(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): typingsSlinky.solidityParserAntlr.mod.SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.SubAssembly]
  }
  
  @scala.inline
  def ThrowStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): typingsSlinky.solidityParserAntlr.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ThrowStatement]
  }
  
  @scala.inline
  def TupleExpression(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression
  ): typingsSlinky.solidityParserAntlr.mod.TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.TupleExpression]
  }
  
  @scala.inline
  def UserDefinedTypeName(
    namePath: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
  ): typingsSlinky.solidityParserAntlr.mod.UserDefinedTypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.UserDefinedTypeName]
  }
  
  @scala.inline
  def UsingForDeclaration(
    libraryName: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration,
    typeName: TypeName
  ): typingsSlinky.solidityParserAntlr.mod.UsingForDeclaration = {
    val __obj = js.Dynamic.literal(libraryName = libraryName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.UsingForDeclaration]
  }
  
  @scala.inline
  def VariableDeclaration(
    isIndexed: Boolean,
    isStateVar: Boolean,
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration,
    typeName: TypeName
  ): typingsSlinky.solidityParserAntlr.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed.asInstanceOf[js.Any], isStateVar = isStateVar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.VariableDeclaration]
  }
  
  @scala.inline
  def VariableDeclarationStatement(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode]
  ): typingsSlinky.solidityParserAntlr.mod.VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.VariableDeclarationStatement]
  }
  
  @scala.inline
  def WhileStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement): typingsSlinky.solidityParserAntlr.mod.WhileStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.WhileStatement]
  }
}
