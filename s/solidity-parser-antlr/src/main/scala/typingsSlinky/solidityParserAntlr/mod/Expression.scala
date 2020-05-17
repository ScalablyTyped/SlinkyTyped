package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit def apply(value: BinaryOperation): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: Conditional): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: FunctionCall): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: IndexAccess): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: MemberAccess): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: PrimaryExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: TupleExpression): Expression = value.asInstanceOf[Expression]
}

