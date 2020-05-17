package typingsSlinky.std.global

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.MSPointerDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_MSPointerDown extends js.Object {
  def apply(`type`: MSPointerDown, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

