package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.CallExpression
  - typingsSlinky.typescript.mod.NewExpression
  - typingsSlinky.typescript.mod.TaggedTemplateExpression
  - typingsSlinky.typescript.mod.JsxOpeningElement
  - typingsSlinky.typescript.mod.JsxSelfClosingElement
*/
trait HasTypeArguments extends js.Object

object HasTypeArguments {
  @scala.inline
  implicit def apply(value: CallExpression): HasTypeArguments = value.asInstanceOf[HasTypeArguments]
  @scala.inline
  implicit def apply(value: JsxOpeningElement): HasTypeArguments = value.asInstanceOf[HasTypeArguments]
  @scala.inline
  implicit def apply(value: JsxSelfClosingElement): HasTypeArguments = value.asInstanceOf[HasTypeArguments]
  @scala.inline
  implicit def apply(value: NewExpression): HasTypeArguments = value.asInstanceOf[HasTypeArguments]
  @scala.inline
  implicit def apply(value: TaggedTemplateExpression): HasTypeArguments = value.asInstanceOf[HasTypeArguments]
}

