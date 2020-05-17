package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.CommaToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.AssignmentOperatorOrHigher
  - typingsSlinky.typescript.mod.SyntaxKind.CommaToken
*/
trait BinaryOperator extends js.Object

object BinaryOperator {
  @scala.inline
  implicit def apply(value: AssignmentOperatorOrHigher): BinaryOperator = value.asInstanceOf[BinaryOperator]
  @scala.inline
  implicit def apply(value: CommaToken): BinaryOperator = value.asInstanceOf[BinaryOperator]
}

