package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.JsxSelfClosingElement
  - typingsSlinky.typescript.mod.JsxOpeningElement
*/
trait JsxOpeningLikeElement extends CallLikeExpression

object JsxOpeningLikeElement {
  @scala.inline
  implicit def apply(value: JsxOpeningElement): JsxOpeningLikeElement = value.asInstanceOf[JsxOpeningLikeElement]
  @scala.inline
  implicit def apply(value: JsxSelfClosingElement): JsxOpeningLikeElement = value.asInstanceOf[JsxOpeningLikeElement]
}

