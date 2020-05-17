package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.PercentToken
import typingsSlinky.typescript.mod.SyntaxKind.SlashToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.AsteriskToken
  - typingsSlinky.typescript.mod.SyntaxKind.SlashToken
  - typingsSlinky.typescript.mod.SyntaxKind.PercentToken
*/
trait MultiplicativeOperator extends MultiplicativeOperatorOrHigher

object MultiplicativeOperator {
  @scala.inline
  implicit def apply(value: typingsSlinky.typescript.mod.SyntaxKind.AsteriskToken): MultiplicativeOperator = value.asInstanceOf[MultiplicativeOperator]
  @scala.inline
  implicit def apply(value: PercentToken): MultiplicativeOperator = value.asInstanceOf[MultiplicativeOperator]
  @scala.inline
  implicit def apply(value: SlashToken): MultiplicativeOperator = value.asInstanceOf[MultiplicativeOperator]
}

