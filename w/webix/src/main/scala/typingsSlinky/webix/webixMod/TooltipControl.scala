package typingsSlinky.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipControl extends js.Object {
  var delay: Double = js.native
  @JSName("$tooltipIn")
  def $tooltipIn(target: HTMLElement, event: Event): Unit = js.native
  @JSName("$tooltipMove")
  def $tooltipMove(target: HTMLElement, event: Event, text: String): Unit = js.native
  @JSName("$tooltipOut")
  def $tooltipOut(previousTarget: HTMLElement, target: HTMLElement, event: Event): Unit = js.native
  def addTooltip(target: String, config: js.Any): Unit = js.native
  def addTooltip(target: typingsSlinky.std.HTMLElement, config: js.Any): Unit = js.native
  def getMaster(target: HTMLElement): js.Any = js.native
  def getTooltip(): baseview = js.native
  def removeTooltip(target: String): Unit = js.native
  def removeTooltip(target: typingsSlinky.std.HTMLElement): Unit = js.native
}

@JSImport("webix", "TooltipControl")
@js.native
object TooltipControl extends TopLevel[TooltipControl]

