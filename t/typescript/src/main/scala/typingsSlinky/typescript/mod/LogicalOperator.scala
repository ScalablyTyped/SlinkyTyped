package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.AmpersandAmpersandToken
import typingsSlinky.typescript.mod.SyntaxKind.BarBarToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.AmpersandAmpersandToken
  - typingsSlinky.typescript.mod.SyntaxKind.BarBarToken
*/
trait LogicalOperator extends LogicalOperatorOrHigher

object LogicalOperator {
  @scala.inline
  implicit def apply(value: AmpersandAmpersandToken): LogicalOperator = value.asInstanceOf[LogicalOperator]
  @scala.inline
  implicit def apply(value: BarBarToken): LogicalOperator = value.asInstanceOf[LogicalOperator]
}

