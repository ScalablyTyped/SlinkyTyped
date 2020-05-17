package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ClassDeclaration
  - typingsSlinky.typescript.mod.ClassExpression
*/
trait ClassLikeDeclaration
  extends DeclarationWithTypeParameterChildren
     with HasJSDoc
     with ObjectTypeDeclaration

object ClassLikeDeclaration {
  @scala.inline
  implicit def apply(value: ClassDeclaration): ClassLikeDeclaration = value.asInstanceOf[ClassLikeDeclaration]
  @scala.inline
  implicit def apply(value: ClassExpression): ClassLikeDeclaration = value.asInstanceOf[ClassLikeDeclaration]
}

