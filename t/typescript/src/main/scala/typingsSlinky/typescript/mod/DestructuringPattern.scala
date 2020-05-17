package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.BindingPattern
  - typingsSlinky.typescript.mod.ObjectLiteralExpression
  - typingsSlinky.typescript.mod.ArrayLiteralExpression
*/
trait DestructuringPattern extends js.Object

object DestructuringPattern {
  @scala.inline
  implicit def apply(value: ArrayLiteralExpression): DestructuringPattern = value.asInstanceOf[DestructuringPattern]
  @scala.inline
  implicit def apply(value: BindingPattern): DestructuringPattern = value.asInstanceOf[DestructuringPattern]
  @scala.inline
  implicit def apply(value: ObjectLiteralExpression): DestructuringPattern = value.asInstanceOf[DestructuringPattern]
}

