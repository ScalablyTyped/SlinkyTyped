package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.devicelight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_devicelight extends js.Object {
  def apply(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.DeviceLightEvent, _]
  ): Unit = js.native
  def apply(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.DeviceLightEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.DeviceLightEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

