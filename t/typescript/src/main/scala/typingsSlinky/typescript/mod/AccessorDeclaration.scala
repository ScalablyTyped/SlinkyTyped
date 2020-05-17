package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.GetAccessorDeclaration
  - typingsSlinky.typescript.mod.SetAccessorDeclaration
*/
trait AccessorDeclaration
  extends SignatureDeclaration
     with HasJSDoc
     with ObjectLiteralElementLike

object AccessorDeclaration {
  @scala.inline
  implicit def apply(value: GetAccessorDeclaration): AccessorDeclaration = value.asInstanceOf[AccessorDeclaration]
  @scala.inline
  implicit def apply(value: SetAccessorDeclaration): AccessorDeclaration = value.asInstanceOf[AccessorDeclaration]
}

