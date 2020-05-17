package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.CallExpression
  - typingsSlinky.typescript.mod.NewExpression
  - typingsSlinky.typescript.mod.TaggedTemplateExpression
  - typingsSlinky.typescript.mod.Decorator
  - typingsSlinky.typescript.mod.JsxOpeningLikeElement
*/
trait CallLikeExpression extends js.Object

object CallLikeExpression {
  @scala.inline
  implicit def apply(value: CallExpression): CallLikeExpression = value.asInstanceOf[CallLikeExpression]
  @scala.inline
  implicit def apply(value: Decorator): CallLikeExpression = value.asInstanceOf[CallLikeExpression]
  @scala.inline
  implicit def apply(value: JsxOpeningLikeElement): CallLikeExpression = value.asInstanceOf[CallLikeExpression]
  @scala.inline
  implicit def apply(value: NewExpression): CallLikeExpression = value.asInstanceOf[CallLikeExpression]
  @scala.inline
  implicit def apply(value: TaggedTemplateExpression): CallLikeExpression = value.asInstanceOf[CallLikeExpression]
}

