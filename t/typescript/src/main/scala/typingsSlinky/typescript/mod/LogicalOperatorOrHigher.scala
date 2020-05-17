package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.BitwiseOperatorOrHigher
  - typingsSlinky.typescript.mod.LogicalOperator
*/
trait LogicalOperatorOrHigher extends AssignmentOperatorOrHigher

object LogicalOperatorOrHigher {
  @scala.inline
  implicit def apply(value: BitwiseOperatorOrHigher): LogicalOperatorOrHigher = value.asInstanceOf[LogicalOperatorOrHigher]
  @scala.inline
  implicit def apply(value: LogicalOperator): LogicalOperatorOrHigher = value.asInstanceOf[LogicalOperatorOrHigher]
}

