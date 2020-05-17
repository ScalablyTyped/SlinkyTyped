package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.PlusToken
  - typingsSlinky.typescript.mod.SyntaxKind.MinusToken
*/
trait AdditiveOperator extends AdditiveOperatorOrHigher

object AdditiveOperator {
  @scala.inline
  implicit def apply(value: typingsSlinky.typescript.mod.SyntaxKind.MinusToken): AdditiveOperator = value.asInstanceOf[AdditiveOperator]
  @scala.inline
  implicit def apply(value: typingsSlinky.typescript.mod.SyntaxKind.PlusToken): AdditiveOperator = value.asInstanceOf[AdditiveOperator]
}

