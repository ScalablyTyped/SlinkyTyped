package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def ArrayTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName = "ArrayTypeName".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName]
  
  @scala.inline
  def AssemblyAssignment: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment = "AssemblyAssignment".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment]
  
  @scala.inline
  def AssemblyBlock: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock = "AssemblyBlock".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock]
  
  @scala.inline
  def AssemblyCall: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall = "AssemblyCall".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall]
  
  @scala.inline
  def AssemblyCase: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase = "AssemblyCase".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase]
  
  @scala.inline
  def AssemblyFor: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor = "AssemblyFor".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor]
  
  @scala.inline
  def AssemblyFunctionDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition = "AssemblyFunctionDefinition".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition]
  
  @scala.inline
  def AssemblyFunctionReturns: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns = "AssemblyFunctionReturns".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns]
  
  @scala.inline
  def AssemblyIf: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf = "AssemblyIf".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf]
  
  @scala.inline
  def AssemblyItem: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem = "AssemblyItem".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem]
  
  @scala.inline
  def AssemblyLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral = "AssemblyLiteral".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral]
  
  @scala.inline
  def AssemblyLocalDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition = "AssemblyLocalDefinition".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition]
  
  @scala.inline
  def AssemblyStackAssignment: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment = "AssemblyStackAssignment".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment]
  
  @scala.inline
  def AssemblySwitch: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch = "AssemblySwitch".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch]
  
  @scala.inline
  def BinaryOperation: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation = "BinaryOperation".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation]
  
  @scala.inline
  def Block: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Block = "Block".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Block]
  
  @scala.inline
  def BooleanLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral = "BooleanLiteral".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral]
  
  @scala.inline
  def Break: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break = "Break".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break]
  
  @scala.inline
  def BreakStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement = "BreakStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement]
  
  @scala.inline
  def Conditional: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Conditional = "Conditional".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Conditional]
  
  @scala.inline
  def Continue: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Continue = "Continue".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Continue]
  
  @scala.inline
  def ContinueStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement = "ContinueStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement]
  
  @scala.inline
  def ContractDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition = "ContractDefinition".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition]
  
  @scala.inline
  def DecimalNumber: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber = "DecimalNumber".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber]
  
  @scala.inline
  def DoWhileStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement = "DoWhileStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement]
  
  @scala.inline
  def ElementaryTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName = "ElementaryTypeName".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName]
  
  @scala.inline
  def ElementaryTypeNameExpression: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression = "ElementaryTypeNameExpression".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression]
  
  @scala.inline
  def EmitStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement = "EmitStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement]
  
  @scala.inline
  def EnumDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition = "EnumDefinition".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition]
  
  @scala.inline
  def EnumValue: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumValue = "EnumValue".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EnumValue]
  
  @scala.inline
  def EventDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition = "EventDefinition".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition]
  
  @scala.inline
  def ExpressionStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement = "ExpressionStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement]
  
  @scala.inline
  def ForStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement = "ForStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement]
  
  @scala.inline
  def FunctionCall: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall = "FunctionCall".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall]
  
  @scala.inline
  def FunctionDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition = "FunctionDefinition".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition]
  
  @scala.inline
  def FunctionTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName = "FunctionTypeName".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName]
  
  @scala.inline
  def HexLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral = "HexLiteral".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral]
  
  @scala.inline
  def HexNumber: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexNumber = "HexNumber".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexNumber]
  
  @scala.inline
  def Identifier: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Identifier = "Identifier".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Identifier]
  
  @scala.inline
  def IdentifierList: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList = "IdentifierList".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList]
  
  @scala.inline
  def IfStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement = "IfStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement]
  
  @scala.inline
  def ImportDirective: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective = "ImportDirective".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective]
  
  @scala.inline
  def IndexAccess: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess = "IndexAccess".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess]
  
  @scala.inline
  def InheritanceSpecifier: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier = "InheritanceSpecifier".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier]
  
  @scala.inline
  def InlineAssemblyStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement = "InlineAssemblyStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement]
  
  @scala.inline
  def LabelDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition = "LabelDefinition".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition]
  
  @scala.inline
  def Mapping: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Mapping = "Mapping".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Mapping]
  
  @scala.inline
  def MemberAccess: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess = "MemberAccess".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess]
  
  @scala.inline
  def ModifierDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition = "ModifierDefinition".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition]
  
  @scala.inline
  def ModifierInvocation: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation = "ModifierInvocation".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation]
  
  @scala.inline
  def NumberLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral = "NumberLiteral".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral]
  
  @scala.inline
  def PragmaDirective: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective = "PragmaDirective".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective]
  
  @scala.inline
  def PragmaName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaName = "PragmaName".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaName]
  
  @scala.inline
  def PragmaValue: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue = "PragmaValue".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue]
  
  @scala.inline
  def ReturnStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement = "ReturnStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement]
  
  @scala.inline
  def SourceUnit: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit = "SourceUnit".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit]
  
  @scala.inline
  def StateMutability: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateMutability = "StateMutability".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateMutability]
  
  @scala.inline
  def StateVariableDeclaration: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration = "StateVariableDeclaration".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration]
  
  @scala.inline
  def StorageLocation: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation = "StorageLocation".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation]
  
  @scala.inline
  def StringLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral = "StringLiteral".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral]
  
  @scala.inline
  def StructDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition = "StructDefinition".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition]
  
  @scala.inline
  def SubAssembly: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly = "SubAssembly".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly]
  
  @scala.inline
  def ThrowStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement = "ThrowStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement]
  
  @scala.inline
  def TupleExpression: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression = "TupleExpression".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression]
  
  @scala.inline
  def UserDefinedTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName = "UserDefinedTypeName".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName]
  
  @scala.inline
  def UsingForDeclaration: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration = "UsingForDeclaration".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration]
  
  @scala.inline
  def VariableDeclaration: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration = "VariableDeclaration".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration]
  
  @scala.inline
  def VariableDeclarationStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement = "VariableDeclarationStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement]
  
  @scala.inline
  def WhileStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement = "WhileStatement".asInstanceOf[typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement]
}
