package typingsSlinky.sharepoint

import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.sharepointStrings.drag
import typingsSlinky.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_drag extends js.Object {
  def apply(
    `type`: drag,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

