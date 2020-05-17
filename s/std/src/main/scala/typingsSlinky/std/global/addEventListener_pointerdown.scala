package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.pointerdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_pointerdown extends js.Object {
  def apply(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.PointerEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

