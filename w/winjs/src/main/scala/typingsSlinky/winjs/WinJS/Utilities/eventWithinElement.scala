package typingsSlinky.winjs.WinJS.Utilities

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.eventWithinElement")
@js.native
object eventWithinElement extends js.Object {
  /**
    * Determines whether the specified event occurred within the specified element.
    * @param element The element.
    * @param event The event.
    * @returns true if the event occurred within the element; otherwise, false.
    **/
  def apply(element: HTMLElement, event: Event_): Boolean = js.native
}

