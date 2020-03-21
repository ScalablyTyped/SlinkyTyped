package typingsSlinky.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PointerEvent
import typingsSlinky.sharepoint.sharepointStrings.pointerleave
import typingsSlinky.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_pointerleave extends js.Object {
  def apply(
    `type`: pointerleave,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

