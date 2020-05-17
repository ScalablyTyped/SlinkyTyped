package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.JsxText
  - typingsSlinky.typescript.mod.JsxExpression
  - typingsSlinky.typescript.mod.JsxElement
  - typingsSlinky.typescript.mod.JsxSelfClosingElement
  - typingsSlinky.typescript.mod.JsxFragment
*/
trait JsxChild extends js.Object

object JsxChild {
  @scala.inline
  implicit def apply(value: JsxElement): JsxChild = value.asInstanceOf[JsxChild]
  @scala.inline
  implicit def apply(value: JsxExpression): JsxChild = value.asInstanceOf[JsxChild]
  @scala.inline
  implicit def apply(value: JsxFragment): JsxChild = value.asInstanceOf[JsxChild]
  @scala.inline
  implicit def apply(value: JsxSelfClosingElement): JsxChild = value.asInstanceOf[JsxChild]
  @scala.inline
  implicit def apply(value: JsxText): JsxChild = value.asInstanceOf[JsxChild]
}

