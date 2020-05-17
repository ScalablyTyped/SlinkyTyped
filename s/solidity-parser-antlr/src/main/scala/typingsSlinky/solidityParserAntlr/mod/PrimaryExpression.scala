package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.BooleanLiteral
  - typingsSlinky.solidityParserAntlr.mod.NumberLiteral
  - typingsSlinky.solidityParserAntlr.mod.Identifier
  - typingsSlinky.solidityParserAntlr.mod.TupleExpression
  - typingsSlinky.solidityParserAntlr.mod.ElementaryTypeNameExpression
*/
trait PrimaryExpression extends Expression

object PrimaryExpression {
  @scala.inline
  implicit def apply(value: BooleanLiteral): PrimaryExpression = value.asInstanceOf[PrimaryExpression]
  @scala.inline
  implicit def apply(value: ElementaryTypeNameExpression): PrimaryExpression = value.asInstanceOf[PrimaryExpression]
  @scala.inline
  implicit def apply(value: Identifier): PrimaryExpression = value.asInstanceOf[PrimaryExpression]
  @scala.inline
  implicit def apply(value: NumberLiteral): PrimaryExpression = value.asInstanceOf[PrimaryExpression]
  @scala.inline
  implicit def apply(value: TupleExpression): PrimaryExpression = value.asInstanceOf[PrimaryExpression]
}

