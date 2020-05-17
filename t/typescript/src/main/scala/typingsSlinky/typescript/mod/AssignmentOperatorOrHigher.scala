package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.QuestionQuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.QuestionQuestionToken
  - typingsSlinky.typescript.mod.LogicalOperatorOrHigher
  - typingsSlinky.typescript.mod.AssignmentOperator
*/
trait AssignmentOperatorOrHigher extends BinaryOperator

object AssignmentOperatorOrHigher {
  @scala.inline
  implicit def apply(value: AssignmentOperator): AssignmentOperatorOrHigher = value.asInstanceOf[AssignmentOperatorOrHigher]
  @scala.inline
  implicit def apply(value: LogicalOperatorOrHigher): AssignmentOperatorOrHigher = value.asInstanceOf[AssignmentOperatorOrHigher]
  @scala.inline
  implicit def apply(value: QuestionQuestionToken): AssignmentOperatorOrHigher = value.asInstanceOf[AssignmentOperatorOrHigher]
}

