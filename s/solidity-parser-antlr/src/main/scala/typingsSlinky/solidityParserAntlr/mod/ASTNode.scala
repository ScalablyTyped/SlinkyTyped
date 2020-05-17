package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait ASTNode extends js.Object

object ASTNode {
  @scala.inline
  implicit def apply(value: AssemblyAssignment): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyBlock): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyCall): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyCase): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyFor): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyFunctionDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyFunctionReturns): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyIf): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyItem): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyLocalDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblyStackAssignment): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssemblySwitch): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BinaryOperation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Block): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BreakStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Conditional): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ContinueStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ContractDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DoWhileStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ElementaryTypeName): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ElementaryTypeNameExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: EmitStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: EnumDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: EnumValue): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: EventDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Expression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExpressionStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ForStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: FunctionDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: FunctionTypeName): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: IfStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ImportDirective): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: IndexAccess): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: InheritanceSpecifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: InlineAssemblyStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: LabelDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Mapping): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ModifierDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ModifierInvocation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: PragmaDirective): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ReturnStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: SourceUnit): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: StateVariableDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: StructDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: SubAssembly): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ThrowStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TupleExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TypeName): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: UserDefinedTypeName): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: UsingForDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: VariableDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: VariableDeclarationStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: WhileStatement): ASTNode = value.asInstanceOf[ASTNode]
}

