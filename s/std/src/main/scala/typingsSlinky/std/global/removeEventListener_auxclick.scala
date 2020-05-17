package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.auxclick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_auxclick extends js.Object {
  def apply(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.MouseEvent, _]
  ): Unit = js.native
  def apply(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

