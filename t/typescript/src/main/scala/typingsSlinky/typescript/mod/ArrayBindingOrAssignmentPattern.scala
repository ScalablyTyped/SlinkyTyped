package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ArrayBindingPattern
  - typingsSlinky.typescript.mod.ArrayLiteralExpression
*/
trait ArrayBindingOrAssignmentPattern extends BindingOrAssignmentPattern

object ArrayBindingOrAssignmentPattern {
  @scala.inline
  implicit def apply(value: ArrayBindingPattern): ArrayBindingOrAssignmentPattern = value.asInstanceOf[ArrayBindingOrAssignmentPattern]
  @scala.inline
  implicit def apply(value: ArrayLiteralExpression): ArrayBindingOrAssignmentPattern = value.asInstanceOf[ArrayBindingOrAssignmentPattern]
}

