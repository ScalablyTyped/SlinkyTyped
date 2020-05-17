package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.EqualsToken
  - typingsSlinky.typescript.mod.CompoundAssignmentOperator
*/
trait AssignmentOperator extends AssignmentOperatorOrHigher

object AssignmentOperator {
  @scala.inline
  implicit def apply(value: CompoundAssignmentOperator): AssignmentOperator = value.asInstanceOf[AssignmentOperator]
  @scala.inline
  implicit def apply(value: typingsSlinky.typescript.mod.SyntaxKind.EqualsToken): AssignmentOperator = value.asInstanceOf[AssignmentOperator]
}

