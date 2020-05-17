package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_abort extends js.Object {
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
    options: AddEventListenerOptions
  ): Unit = js.native
}

