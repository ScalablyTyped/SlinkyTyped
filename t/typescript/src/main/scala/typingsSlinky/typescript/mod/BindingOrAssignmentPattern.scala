package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ObjectBindingOrAssignmentPattern
  - typingsSlinky.typescript.mod.ArrayBindingOrAssignmentPattern
*/
trait BindingOrAssignmentPattern extends BindingOrAssignmentElementTarget

object BindingOrAssignmentPattern {
  @scala.inline
  implicit def apply(value: ArrayBindingOrAssignmentPattern): BindingOrAssignmentPattern = value.asInstanceOf[BindingOrAssignmentPattern]
  @scala.inline
  implicit def apply(value: ObjectBindingOrAssignmentPattern): BindingOrAssignmentPattern = value.asInstanceOf[BindingOrAssignmentPattern]
}

