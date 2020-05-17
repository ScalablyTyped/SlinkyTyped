package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.dragleave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_dragleave extends js.Object {
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.DragEvent, _]
  ): Unit = js.native
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.DragEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

