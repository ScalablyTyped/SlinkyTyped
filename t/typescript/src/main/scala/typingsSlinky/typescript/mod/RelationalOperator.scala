package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanToken
import typingsSlinky.typescript.mod.SyntaxKind.InKeyword
import typingsSlinky.typescript.mod.SyntaxKind.InstanceOfKeyword
import typingsSlinky.typescript.mod.SyntaxKind.LessThanEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.LessThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.LessThanToken
  - typingsSlinky.typescript.mod.SyntaxKind.LessThanEqualsToken
  - typingsSlinky.typescript.mod.SyntaxKind.GreaterThanToken
  - typingsSlinky.typescript.mod.SyntaxKind.GreaterThanEqualsToken
  - typingsSlinky.typescript.mod.SyntaxKind.InstanceOfKeyword
  - typingsSlinky.typescript.mod.SyntaxKind.InKeyword
*/
trait RelationalOperator extends RelationalOperatorOrHigher

object RelationalOperator {
  @scala.inline
  implicit def apply(value: GreaterThanEqualsToken): RelationalOperator = value.asInstanceOf[RelationalOperator]
  @scala.inline
  implicit def apply(value: GreaterThanToken): RelationalOperator = value.asInstanceOf[RelationalOperator]
  @scala.inline
  implicit def apply(value: InKeyword): RelationalOperator = value.asInstanceOf[RelationalOperator]
  @scala.inline
  implicit def apply(value: InstanceOfKeyword): RelationalOperator = value.asInstanceOf[RelationalOperator]
  @scala.inline
  implicit def apply(value: LessThanEqualsToken): RelationalOperator = value.asInstanceOf[RelationalOperator]
  @scala.inline
  implicit def apply(value: LessThanToken): RelationalOperator = value.asInstanceOf[RelationalOperator]
}

