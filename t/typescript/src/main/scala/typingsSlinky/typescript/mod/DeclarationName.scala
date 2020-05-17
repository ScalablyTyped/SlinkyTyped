package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.PrivateIdentifier
  - typingsSlinky.typescript.mod.StringLiteralLike
  - typingsSlinky.typescript.mod.NumericLiteral
  - typingsSlinky.typescript.mod.ComputedPropertyName
  - typingsSlinky.typescript.mod.ElementAccessExpression
  - typingsSlinky.typescript.mod.BindingPattern
  - typingsSlinky.typescript.mod.EntityNameExpression
*/
trait DeclarationName extends js.Object

object DeclarationName {
  @scala.inline
  implicit def apply(value: BindingPattern): DeclarationName = value.asInstanceOf[DeclarationName]
  @scala.inline
  implicit def apply(value: ComputedPropertyName): DeclarationName = value.asInstanceOf[DeclarationName]
  @scala.inline
  implicit def apply(value: ElementAccessExpression): DeclarationName = value.asInstanceOf[DeclarationName]
  @scala.inline
  implicit def apply(value: EntityNameExpression): DeclarationName = value.asInstanceOf[DeclarationName]
  @scala.inline
  implicit def apply(value: Identifier): DeclarationName = value.asInstanceOf[DeclarationName]
  @scala.inline
  implicit def apply(value: NumericLiteral): DeclarationName = value.asInstanceOf[DeclarationName]
  @scala.inline
  implicit def apply(value: PrivateIdentifier): DeclarationName = value.asInstanceOf[DeclarationName]
  @scala.inline
  implicit def apply(value: StringLiteralLike): DeclarationName = value.asInstanceOf[DeclarationName]
}

