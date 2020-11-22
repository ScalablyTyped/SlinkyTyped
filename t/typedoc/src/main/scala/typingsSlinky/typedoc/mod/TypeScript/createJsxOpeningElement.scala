package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.JsxAttributes
import typingsSlinky.typescript.mod.JsxOpeningElement
import typingsSlinky.typescript.mod.JsxTagNameExpression
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJsxOpeningElement")
@js.native
object createJsxOpeningElement extends js.Object {
  
  def apply(tagName: JsxTagNameExpression, typeArguments: js.UndefOr[scala.Nothing], attributes: JsxAttributes): JsxOpeningElement = js.native
  /** @deprecated Use `factory.createJsxOpeningElement` or the factory supplied by your transformation context instead. */
  def apply(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxOpeningElement = js.native
}
