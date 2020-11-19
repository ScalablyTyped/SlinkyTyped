package typingsSlinky.webix.global.webix

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("webix.event")
@js.native
object event extends js.Object {
  
  def apply(node: String, event: String, handler: WebixCallback): String | Double = js.native
  def apply(node: String, event: String, handler: WebixCallback, context: js.Any): String | Double = js.native
  def apply(node: HTMLElement, event: String, handler: WebixCallback): String | Double = js.native
  def apply(node: HTMLElement, event: String, handler: WebixCallback, context: js.Any): String | Double = js.native
}
