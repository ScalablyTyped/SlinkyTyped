package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.MinusMinusToken
import typingsSlinky.typescript.mod.SyntaxKind.PlusPlusToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.PlusPlusToken
  - typingsSlinky.typescript.mod.SyntaxKind.MinusMinusToken
*/
trait PostfixUnaryOperator extends js.Object

object PostfixUnaryOperator {
  @scala.inline
  implicit def apply(value: MinusMinusToken): PostfixUnaryOperator = value.asInstanceOf[PostfixUnaryOperator]
  @scala.inline
  implicit def apply(value: PlusPlusToken): PostfixUnaryOperator = value.asInstanceOf[PostfixUnaryOperator]
}

