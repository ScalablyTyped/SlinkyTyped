package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_keyup extends js.Object {
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _]
  ): Unit = js.native
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

