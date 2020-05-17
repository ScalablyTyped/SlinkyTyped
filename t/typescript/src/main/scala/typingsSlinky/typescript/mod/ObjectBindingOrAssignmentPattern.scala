package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ObjectBindingPattern
  - typingsSlinky.typescript.mod.ObjectLiteralExpression
*/
trait ObjectBindingOrAssignmentPattern extends BindingOrAssignmentPattern

object ObjectBindingOrAssignmentPattern {
  @scala.inline
  implicit def apply(value: ObjectBindingPattern): ObjectBindingOrAssignmentPattern = value.asInstanceOf[ObjectBindingOrAssignmentPattern]
  @scala.inline
  implicit def apply(value: ObjectLiteralExpression): ObjectBindingOrAssignmentPattern = value.asInstanceOf[ObjectBindingOrAssignmentPattern]
}

