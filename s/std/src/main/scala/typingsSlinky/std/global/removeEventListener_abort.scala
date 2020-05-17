package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_abort extends js.Object {
  def apply(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.UIEvent, _]
  ): Unit = js.native
  def apply(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.UIEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.UIEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

