package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.IndexAccess
  - typingsSlinky.solidityParserAntlr.mod.TupleExpression
  - typingsSlinky.solidityParserAntlr.mod.BinaryOperation
  - typingsSlinky.solidityParserAntlr.mod.Conditional
  - typingsSlinky.solidityParserAntlr.mod.MemberAccess
  - typingsSlinky.solidityParserAntlr.mod.FunctionCall
  - typingsSlinky.solidityParserAntlr.mod.PrimaryExpression
*/
trait Expression extends ASTNode
object Expression {
  
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
  def BooleanLiteral(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral,
    value: Boolean
  ): typingsSlinky.solidityParserAntlr.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.BooleanLiteral]
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
  def ElementaryTypeNameExpression(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName
  ): typingsSlinky.solidityParserAntlr.mod.ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ElementaryTypeNameExpression]
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
  def Identifier(name: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Identifier): typingsSlinky.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Identifier]
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
  def NumberLiteral(number: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): typingsSlinky.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.NumberLiteral]
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
}
