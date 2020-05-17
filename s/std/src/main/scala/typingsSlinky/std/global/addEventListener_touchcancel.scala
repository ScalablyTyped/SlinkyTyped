package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.touchcancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_touchcancel extends js.Object {
  def apply(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TouchEvent, _]
  ): Unit = js.native
  def apply(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TouchEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

