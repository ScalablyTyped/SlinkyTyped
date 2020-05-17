package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.BindingOrAssignmentPattern
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.PropertyAccessExpression
  - typingsSlinky.typescript.mod.ElementAccessExpression
  - typingsSlinky.typescript.mod.OmittedExpression
*/
trait BindingOrAssignmentElementTarget extends js.Object

object BindingOrAssignmentElementTarget {
  @scala.inline
  implicit def apply(value: BindingOrAssignmentPattern): BindingOrAssignmentElementTarget = value.asInstanceOf[BindingOrAssignmentElementTarget]
  @scala.inline
  implicit def apply(value: ElementAccessExpression): BindingOrAssignmentElementTarget = value.asInstanceOf[BindingOrAssignmentElementTarget]
  @scala.inline
  implicit def apply(value: Identifier): BindingOrAssignmentElementTarget = value.asInstanceOf[BindingOrAssignmentElementTarget]
  @scala.inline
  implicit def apply(value: OmittedExpression): BindingOrAssignmentElementTarget = value.asInstanceOf[BindingOrAssignmentElementTarget]
  @scala.inline
  implicit def apply(value: PropertyAccessExpression): BindingOrAssignmentElementTarget = value.asInstanceOf[BindingOrAssignmentElementTarget]
}

