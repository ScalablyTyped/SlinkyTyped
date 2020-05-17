package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.PropertyAssignment
  - typingsSlinky.typescript.mod.ShorthandPropertyAssignment
  - typingsSlinky.typescript.mod.SpreadAssignment
  - typingsSlinky.typescript.mod.MethodDeclaration
  - typingsSlinky.typescript.mod.AccessorDeclaration
*/
trait ObjectLiteralElementLike extends js.Object

object ObjectLiteralElementLike {
  @scala.inline
  implicit def apply(value: AccessorDeclaration): ObjectLiteralElementLike = value.asInstanceOf[ObjectLiteralElementLike]
  @scala.inline
  implicit def apply(value: MethodDeclaration): ObjectLiteralElementLike = value.asInstanceOf[ObjectLiteralElementLike]
  @scala.inline
  implicit def apply(value: PropertyAssignment): ObjectLiteralElementLike = value.asInstanceOf[ObjectLiteralElementLike]
  @scala.inline
  implicit def apply(value: ShorthandPropertyAssignment): ObjectLiteralElementLike = value.asInstanceOf[ObjectLiteralElementLike]
  @scala.inline
  implicit def apply(value: SpreadAssignment): ObjectLiteralElementLike = value.asInstanceOf[ObjectLiteralElementLike]
}

