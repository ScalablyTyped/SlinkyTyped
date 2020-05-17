package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SignatureDeclaration
  - typingsSlinky.typescript.mod.VariableDeclaration
  - typingsSlinky.typescript.mod.ParameterDeclaration
  - typingsSlinky.typescript.mod.PropertySignature
  - typingsSlinky.typescript.mod.PropertyDeclaration
  - typingsSlinky.typescript.mod.TypePredicateNode
  - typingsSlinky.typescript.mod.ParenthesizedTypeNode
  - typingsSlinky.typescript.mod.TypeOperatorNode
  - typingsSlinky.typescript.mod.MappedTypeNode
  - typingsSlinky.typescript.mod.AssertionExpression
  - typingsSlinky.typescript.mod.TypeAliasDeclaration
  - typingsSlinky.typescript.mod.JSDocTypeExpression
  - typingsSlinky.typescript.mod.JSDocNonNullableType
  - typingsSlinky.typescript.mod.JSDocNullableType
  - typingsSlinky.typescript.mod.JSDocOptionalType
  - typingsSlinky.typescript.mod.JSDocVariadicType
*/
trait HasType extends js.Object

object HasType {
  @scala.inline
  implicit def apply(value: AssertionExpression): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: JSDocNonNullableType): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: JSDocNullableType): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: JSDocOptionalType): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: JSDocTypeExpression): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: JSDocVariadicType): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: MappedTypeNode): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: ParameterDeclaration): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: ParenthesizedTypeNode): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: PropertyDeclaration): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: PropertySignature): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: SignatureDeclaration): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: TypeAliasDeclaration): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: TypeOperatorNode): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: TypePredicateNode): HasType = value.asInstanceOf[HasType]
  @scala.inline
  implicit def apply(value: VariableDeclaration): HasType = value.asInstanceOf[HasType]
}

