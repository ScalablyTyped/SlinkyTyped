package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.AmpersandToken
import typingsSlinky.typescript.mod.SyntaxKind.BarToken
import typingsSlinky.typescript.mod.SyntaxKind.CaretToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.AmpersandToken
  - typingsSlinky.typescript.mod.SyntaxKind.BarToken
  - typingsSlinky.typescript.mod.SyntaxKind.CaretToken
*/
trait BitwiseOperator extends BitwiseOperatorOrHigher

object BitwiseOperator {
  @scala.inline
  implicit def apply(value: AmpersandToken): BitwiseOperator = value.asInstanceOf[BitwiseOperator]
  @scala.inline
  implicit def apply(value: BarToken): BitwiseOperator = value.asInstanceOf[BitwiseOperator]
  @scala.inline
  implicit def apply(value: CaretToken): BitwiseOperator = value.asInstanceOf[BitwiseOperator]
}

