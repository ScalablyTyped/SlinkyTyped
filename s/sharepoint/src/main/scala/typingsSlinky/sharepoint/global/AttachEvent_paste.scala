package typingsSlinky.sharepoint.global

import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.sharepointStrings.paste
import typingsSlinky.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_paste extends js.Object {
  def apply(
    `type`: paste,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

