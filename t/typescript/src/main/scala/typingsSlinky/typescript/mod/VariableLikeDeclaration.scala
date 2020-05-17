package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.VariableDeclaration
  - typingsSlinky.typescript.mod.ParameterDeclaration
  - typingsSlinky.typescript.mod.BindingElement
  - typingsSlinky.typescript.mod.PropertyDeclaration
  - typingsSlinky.typescript.mod.PropertyAssignment
  - typingsSlinky.typescript.mod.PropertySignature
  - typingsSlinky.typescript.mod.JsxAttribute
  - typingsSlinky.typescript.mod.ShorthandPropertyAssignment
  - typingsSlinky.typescript.mod.EnumMember
  - typingsSlinky.typescript.mod.JSDocPropertyTag
  - typingsSlinky.typescript.mod.JSDocParameterTag
*/
trait VariableLikeDeclaration extends js.Object

object VariableLikeDeclaration {
  @scala.inline
  implicit def apply(value: BindingElement): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: EnumMember): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: JSDocParameterTag): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: JSDocPropertyTag): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: JsxAttribute): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: ParameterDeclaration): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: PropertyAssignment): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: PropertyDeclaration): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: PropertySignature): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: ShorthandPropertyAssignment): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
  @scala.inline
  implicit def apply(value: VariableDeclaration): VariableLikeDeclaration = value.asInstanceOf[VariableLikeDeclaration]
}

