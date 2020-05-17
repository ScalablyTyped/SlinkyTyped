package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.ThisExpression
  - typingsSlinky.typescript.mod.JsxTagNamePropertyAccess
*/
trait JsxTagNameExpression extends js.Object

object JsxTagNameExpression {
  @scala.inline
  implicit def apply(value: Identifier): JsxTagNameExpression = value.asInstanceOf[JsxTagNameExpression]
  @scala.inline
  implicit def apply(value: JsxTagNamePropertyAccess): JsxTagNameExpression = value.asInstanceOf[JsxTagNameExpression]
  @scala.inline
  implicit def apply(value: ThisExpression): JsxTagNameExpression = value.asInstanceOf[JsxTagNameExpression]
}

