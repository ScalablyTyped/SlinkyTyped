package typingsSlinky.webix.webix

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoTooltip extends js.Object {
  @JSName("$tooltipOut")
  var $tooltipOut: Unit
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit
}

object AutoTooltip {
  @scala.inline
  def apply(
    $tooltipIn: HTMLElement => HTMLElement,
    $tooltipMove: (HTMLElement, Event, String) => Unit,
    $tooltipOut: Unit
  ): AutoTooltip = {
    val __obj = js.Dynamic.literal($tooltipIn = js.Any.fromFunction1($tooltipIn), $tooltipMove = js.Any.fromFunction3($tooltipMove), $tooltipOut = $tooltipOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTooltip]
  }
}

