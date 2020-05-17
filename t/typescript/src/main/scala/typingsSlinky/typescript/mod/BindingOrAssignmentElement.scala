package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.VariableDeclaration
  - typingsSlinky.typescript.mod.ParameterDeclaration
  - typingsSlinky.typescript.mod.BindingElement
  - typingsSlinky.typescript.mod.PropertyAssignment
  - typingsSlinky.typescript.mod.ShorthandPropertyAssignment
  - typingsSlinky.typescript.mod.SpreadAssignment
  - typingsSlinky.typescript.mod.OmittedExpression
  - typingsSlinky.typescript.mod.SpreadElement
  - typingsSlinky.typescript.mod.ArrayLiteralExpression
  - typingsSlinky.typescript.mod.ObjectLiteralExpression
  - typingsSlinky.typescript.mod.AssignmentExpression[typingsSlinky.typescript.mod.EqualsToken]
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.PropertyAccessExpression
  - typingsSlinky.typescript.mod.ElementAccessExpression
*/
trait BindingOrAssignmentElement extends js.Object

object BindingOrAssignmentElement {
  @scala.inline
  implicit def apply(value: ArrayLiteralExpression): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: AssignmentExpression[EqualsToken]): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: BindingElement): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: ElementAccessExpression): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: Identifier): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: ObjectLiteralExpression): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: OmittedExpression): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: ParameterDeclaration): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: PropertyAccessExpression): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: PropertyAssignment): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: ShorthandPropertyAssignment): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: SpreadAssignment): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: SpreadElement): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
  @scala.inline
  implicit def apply(value: VariableDeclaration): BindingOrAssignmentElement = value.asInstanceOf[BindingOrAssignmentElement]
}

