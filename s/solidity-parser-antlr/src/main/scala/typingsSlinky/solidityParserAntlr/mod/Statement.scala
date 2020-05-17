package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.IfStatement
  - typingsSlinky.solidityParserAntlr.mod.WhileStatement
  - typingsSlinky.solidityParserAntlr.mod.ForStatement
  - typingsSlinky.solidityParserAntlr.mod.Block
  - typingsSlinky.solidityParserAntlr.mod.InlineAssemblyStatement
  - typingsSlinky.solidityParserAntlr.mod.DoWhileStatement
  - typingsSlinky.solidityParserAntlr.mod.ContinueStatement
  - typingsSlinky.solidityParserAntlr.mod.BreakStatement
  - typingsSlinky.solidityParserAntlr.mod.ReturnStatement
  - typingsSlinky.solidityParserAntlr.mod.EmitStatement
  - typingsSlinky.solidityParserAntlr.mod.ThrowStatement
  - typingsSlinky.solidityParserAntlr.mod.SimpleStatement
  - typingsSlinky.solidityParserAntlr.mod.VariableDeclarationStatement
*/
trait Statement extends js.Object

object Statement {
  @scala.inline
  implicit def apply(value: Block): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: BreakStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ContinueStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: DoWhileStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: EmitStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ForStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: IfStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: InlineAssemblyStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ReturnStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: SimpleStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ThrowStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: VariableDeclarationStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: WhileStatement): Statement = value.asInstanceOf[Statement]
}

