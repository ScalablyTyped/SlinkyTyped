package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.VariableDeclarationStatement
  - typingsSlinky.solidityParserAntlr.mod.ExpressionStatement
*/
trait SimpleStatement extends Statement

object SimpleStatement {
  @scala.inline
  implicit def apply(value: ExpressionStatement): SimpleStatement = value.asInstanceOf[SimpleStatement]
  @scala.inline
  implicit def apply(value: VariableDeclarationStatement): SimpleStatement = value.asInstanceOf[SimpleStatement]
}

