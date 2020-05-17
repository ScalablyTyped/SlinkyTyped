package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.FunctionDeclaration
  - typingsSlinky.typescript.mod.MethodDeclaration
  - typingsSlinky.typescript.mod.GetAccessorDeclaration
  - typingsSlinky.typescript.mod.SetAccessorDeclaration
  - typingsSlinky.typescript.mod.ConstructorDeclaration
  - typingsSlinky.typescript.mod.FunctionExpression
  - typingsSlinky.typescript.mod.ArrowFunction
*/
trait FunctionLikeDeclaration extends js.Object

object FunctionLikeDeclaration {
  @scala.inline
  implicit def apply(value: ArrowFunction): FunctionLikeDeclaration = value.asInstanceOf[FunctionLikeDeclaration]
  @scala.inline
  implicit def apply(value: ConstructorDeclaration): FunctionLikeDeclaration = value.asInstanceOf[FunctionLikeDeclaration]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): FunctionLikeDeclaration = value.asInstanceOf[FunctionLikeDeclaration]
  @scala.inline
  implicit def apply(value: FunctionExpression): FunctionLikeDeclaration = value.asInstanceOf[FunctionLikeDeclaration]
  @scala.inline
  implicit def apply(value: GetAccessorDeclaration): FunctionLikeDeclaration = value.asInstanceOf[FunctionLikeDeclaration]
  @scala.inline
  implicit def apply(value: MethodDeclaration): FunctionLikeDeclaration = value.asInstanceOf[FunctionLikeDeclaration]
  @scala.inline
  implicit def apply(value: SetAccessorDeclaration): FunctionLikeDeclaration = value.asInstanceOf[FunctionLikeDeclaration]
}

