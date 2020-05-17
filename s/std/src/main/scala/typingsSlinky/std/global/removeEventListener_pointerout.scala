package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.pointerout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_pointerout extends js.Object {
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.PointerEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

