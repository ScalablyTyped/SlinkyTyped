package typingsSlinky.std.global

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_scroll extends js.Object {
  def apply(
    `type`: typingsSlinky.std.stdStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): Unit = js.native
  def apply(
    `type`: typingsSlinky.std.stdStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: typingsSlinky.std.stdStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

