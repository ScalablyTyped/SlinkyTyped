package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.StringLiteral
  - typingsSlinky.typescript.mod.NumericLiteral
  - typingsSlinky.typescript.mod.ComputedPropertyName
  - typingsSlinky.typescript.mod.PrivateIdentifier
*/
trait PropertyName extends js.Object

object PropertyName {
  @scala.inline
  implicit def apply(value: ComputedPropertyName): PropertyName = value.asInstanceOf[PropertyName]
  @scala.inline
  implicit def apply(value: Identifier): PropertyName = value.asInstanceOf[PropertyName]
  @scala.inline
  implicit def apply(value: NumericLiteral): PropertyName = value.asInstanceOf[PropertyName]
  @scala.inline
  implicit def apply(value: PrivateIdentifier): PropertyName = value.asInstanceOf[PropertyName]
  @scala.inline
  implicit def apply(value: StringLiteral): PropertyName = value.asInstanceOf[PropertyName]
}

