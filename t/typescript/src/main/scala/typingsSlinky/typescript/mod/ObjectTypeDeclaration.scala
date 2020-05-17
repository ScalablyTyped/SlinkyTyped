package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ClassLikeDeclaration
  - typingsSlinky.typescript.mod.InterfaceDeclaration
  - typingsSlinky.typescript.mod.TypeLiteralNode
*/
trait ObjectTypeDeclaration extends js.Object

object ObjectTypeDeclaration {
  @scala.inline
  implicit def apply(value: ClassLikeDeclaration): ObjectTypeDeclaration = value.asInstanceOf[ObjectTypeDeclaration]
  @scala.inline
  implicit def apply(value: InterfaceDeclaration): ObjectTypeDeclaration = value.asInstanceOf[ObjectTypeDeclaration]
  @scala.inline
  implicit def apply(value: TypeLiteralNode): ObjectTypeDeclaration = value.asInstanceOf[ObjectTypeDeclaration]
}

