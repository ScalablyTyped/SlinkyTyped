package typingsSlinky.tabris.global

import typingsSlinky.tabris.JSX.ElementClass
import typingsSlinky.tabris.mod.JsxProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSX")
@js.native
object JSX extends js.Object {
  val jsxFactory: js.Symbol = js.native
  val jsxType: js.Symbol = js.native
  def createElement(`type`: String, attributes: js.Object, children: ElementClass*): ElementClass = js.native
  def createElement(`type`: js.Function, attributes: js.Object, children: ElementClass*): ElementClass = js.native
  def install(jsxProcessor: JsxProcessor): Unit = js.native
}

