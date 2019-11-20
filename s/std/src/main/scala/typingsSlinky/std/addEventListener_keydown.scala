package typingsSlinky.std

import typingsSlinky.std.stdStrings.keydown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_keydown extends js.Object {
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _]
  ): Unit = js.native
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

