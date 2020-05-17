package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.VariableDeclaration
  - typingsSlinky.typescript.mod.ParameterDeclaration
  - typingsSlinky.typescript.mod.BindingElement
  - typingsSlinky.typescript.mod.PropertySignature
  - typingsSlinky.typescript.mod.PropertyDeclaration
  - typingsSlinky.typescript.mod.PropertyAssignment
  - typingsSlinky.typescript.mod.EnumMember
*/
trait HasExpressionInitializer extends HasInitializer

object HasExpressionInitializer {
  @scala.inline
  implicit def apply(value: BindingElement): HasExpressionInitializer = value.asInstanceOf[HasExpressionInitializer]
  @scala.inline
  implicit def apply(value: EnumMember): HasExpressionInitializer = value.asInstanceOf[HasExpressionInitializer]
  @scala.inline
  implicit def apply(value: ParameterDeclaration): HasExpressionInitializer = value.asInstanceOf[HasExpressionInitializer]
  @scala.inline
  implicit def apply(value: PropertyAssignment): HasExpressionInitializer = value.asInstanceOf[HasExpressionInitializer]
  @scala.inline
  implicit def apply(value: PropertyDeclaration): HasExpressionInitializer = value.asInstanceOf[HasExpressionInitializer]
  @scala.inline
  implicit def apply(value: PropertySignature): HasExpressionInitializer = value.asInstanceOf[HasExpressionInitializer]
  @scala.inline
  implicit def apply(value: VariableDeclaration): HasExpressionInitializer = value.asInstanceOf[HasExpressionInitializer]
}

