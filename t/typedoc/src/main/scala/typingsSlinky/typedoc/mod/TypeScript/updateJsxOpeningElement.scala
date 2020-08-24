package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.JsxAttributes
import typingsSlinky.typescript.mod.JsxOpeningElement
import typingsSlinky.typescript.mod.JsxTagNameExpression
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateJsxOpeningElement")
@js.native
object updateJsxOpeningElement extends js.Object {
  def apply(
    node: JsxOpeningElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: JsxAttributes
  ): JsxOpeningElement = js.native
  def apply(
    node: JsxOpeningElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.Array[TypeNode],
    attributes: JsxAttributes
  ): JsxOpeningElement = js.native
}

