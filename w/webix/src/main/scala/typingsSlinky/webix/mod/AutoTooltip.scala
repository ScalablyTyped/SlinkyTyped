package typingsSlinky.webix.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoTooltip extends js.Object {
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  var $tooltipOut: Unit = js.native
}
@JSImport("webix", "AutoTooltip")
@js.native
object AutoTooltip extends TopLevel[AutoTooltip]
