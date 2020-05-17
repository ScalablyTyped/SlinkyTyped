package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanToken
import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanToken
import typingsSlinky.typescript.mod.SyntaxKind.LessThanLessThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.LessThanLessThanToken
  - typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanToken
  - typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanToken
*/
trait ShiftOperator extends ShiftOperatorOrHigher

object ShiftOperator {
  @scala.inline
  implicit def apply(value: GreaterThanGreaterThanGreaterThanToken): ShiftOperator = value.asInstanceOf[ShiftOperator]
  @scala.inline
  implicit def apply(value: GreaterThanGreaterThanToken): ShiftOperator = value.asInstanceOf[ShiftOperator]
  @scala.inline
  implicit def apply(value: LessThanLessThanToken): ShiftOperator = value.asInstanceOf[ShiftOperator]
}

