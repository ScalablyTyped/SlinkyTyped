package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.TypeReferenceNode
  - typingsSlinky.typescript.mod.ExpressionWithTypeArguments
*/
trait TypeReferenceType extends js.Object

object TypeReferenceType {
  @scala.inline
  implicit def apply(value: ExpressionWithTypeArguments): TypeReferenceType = value.asInstanceOf[TypeReferenceType]
  @scala.inline
  implicit def apply(value: TypeReferenceNode): TypeReferenceType = value.asInstanceOf[TypeReferenceType]
}

