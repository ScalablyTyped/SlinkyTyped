package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaName
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumValue
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Mapping
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateMutability
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Block
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Continue
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Identifier
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Conditional
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexNumber
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess
  - typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess
*/
trait ASTNodeTypeString extends js.Object

object ASTNodeTypeString {
  @scala.inline
  def ArrayTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName = this.cast("ArrayTypeName")
  @scala.inline
  def AssemblyAssignment: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment = this.cast("AssemblyAssignment")
  @scala.inline
  def AssemblyBlock: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock = this.cast("AssemblyBlock")
  @scala.inline
  def AssemblyCall: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall = this.cast("AssemblyCall")
  @scala.inline
  def AssemblyCase: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase = this.cast("AssemblyCase")
  @scala.inline
  def AssemblyFor: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor = this.cast("AssemblyFor")
  @scala.inline
  def AssemblyFunctionDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition = this.cast("AssemblyFunctionDefinition")
  @scala.inline
  def AssemblyFunctionReturns: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns = this.cast("AssemblyFunctionReturns")
  @scala.inline
  def AssemblyIf: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf = this.cast("AssemblyIf")
  @scala.inline
  def AssemblyItem: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem = this.cast("AssemblyItem")
  @scala.inline
  def AssemblyLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral = this.cast("AssemblyLiteral")
  @scala.inline
  def AssemblyLocalDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition = this.cast("AssemblyLocalDefinition")
  @scala.inline
  def AssemblyStackAssignment: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment = this.cast("AssemblyStackAssignment")
  @scala.inline
  def AssemblySwitch: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch = this.cast("AssemblySwitch")
  @scala.inline
  def BinaryOperation: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation = this.cast("BinaryOperation")
  @scala.inline
  def Block: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Block = this.cast("Block")
  @scala.inline
  def BooleanLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral = this.cast("BooleanLiteral")
  @scala.inline
  def Break: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break = this.cast("Break")
  @scala.inline
  def BreakStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement = this.cast("BreakStatement")
  @scala.inline
  def Conditional: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Conditional = this.cast("Conditional")
  @scala.inline
  def Continue: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Continue = this.cast("Continue")
  @scala.inline
  def ContinueStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement = this.cast("ContinueStatement")
  @scala.inline
  def ContractDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition = this.cast("ContractDefinition")
  @scala.inline
  def DecimalNumber: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber = this.cast("DecimalNumber")
  @scala.inline
  def DoWhileStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement = this.cast("DoWhileStatement")
  @scala.inline
  def ElementaryTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName = this.cast("ElementaryTypeName")
  @scala.inline
  def ElementaryTypeNameExpression: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression = this.cast("ElementaryTypeNameExpression")
  @scala.inline
  def EmitStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement = this.cast("EmitStatement")
  @scala.inline
  def EnumDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition = this.cast("EnumDefinition")
  @scala.inline
  def EnumValue: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumValue = this.cast("EnumValue")
  @scala.inline
  def EventDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition = this.cast("EventDefinition")
  @scala.inline
  def ExpressionStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement = this.cast("ExpressionStatement")
  @scala.inline
  def ForStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement = this.cast("ForStatement")
  @scala.inline
  def FunctionCall: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall = this.cast("FunctionCall")
  @scala.inline
  def FunctionDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition = this.cast("FunctionDefinition")
  @scala.inline
  def FunctionTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName = this.cast("FunctionTypeName")
  @scala.inline
  def HexLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral = this.cast("HexLiteral")
  @scala.inline
  def HexNumber: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexNumber = this.cast("HexNumber")
  @scala.inline
  def Identifier: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Identifier = this.cast("Identifier")
  @scala.inline
  def IdentifierList: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList = this.cast("IdentifierList")
  @scala.inline
  def IfStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement = this.cast("IfStatement")
  @scala.inline
  def ImportDirective: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective = this.cast("ImportDirective")
  @scala.inline
  def IndexAccess: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess = this.cast("IndexAccess")
  @scala.inline
  def InheritanceSpecifier: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier = this.cast("InheritanceSpecifier")
  @scala.inline
  def InlineAssemblyStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement = this.cast("InlineAssemblyStatement")
  @scala.inline
  def LabelDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition = this.cast("LabelDefinition")
  @scala.inline
  def Mapping: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Mapping = this.cast("Mapping")
  @scala.inline
  def MemberAccess: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess = this.cast("MemberAccess")
  @scala.inline
  def ModifierDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition = this.cast("ModifierDefinition")
  @scala.inline
  def ModifierInvocation: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation = this.cast("ModifierInvocation")
  @scala.inline
  def NumberLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral = this.cast("NumberLiteral")
  @scala.inline
  def PragmaDirective: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective = this.cast("PragmaDirective")
  @scala.inline
  def PragmaName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaName = this.cast("PragmaName")
  @scala.inline
  def PragmaValue: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue = this.cast("PragmaValue")
  @scala.inline
  def ReturnStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement = this.cast("ReturnStatement")
  @scala.inline
  def SourceUnit: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit = this.cast("SourceUnit")
  @scala.inline
  def StateMutability: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateMutability = this.cast("StateMutability")
  @scala.inline
  def StateVariableDeclaration: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration = this.cast("StateVariableDeclaration")
  @scala.inline
  def StorageLocation: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation = this.cast("StorageLocation")
  @scala.inline
  def StringLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral = this.cast("StringLiteral")
  @scala.inline
  def StructDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition = this.cast("StructDefinition")
  @scala.inline
  def SubAssembly: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly = this.cast("SubAssembly")
  @scala.inline
  def ThrowStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement = this.cast("ThrowStatement")
  @scala.inline
  def TupleExpression: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression = this.cast("TupleExpression")
  @scala.inline
  def UserDefinedTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName = this.cast("UserDefinedTypeName")
  @scala.inline
  def UsingForDeclaration: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration = this.cast("UsingForDeclaration")
  @scala.inline
  def VariableDeclaration: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration = this.cast("VariableDeclaration")
  @scala.inline
  def VariableDeclarationStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement = this.cast("VariableDeclarationStatement")
  @scala.inline
  def WhileStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement = this.cast("WhileStatement")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

