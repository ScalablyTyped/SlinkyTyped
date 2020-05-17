package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.focusin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_focusin extends js.Object {
  def apply(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.FocusEvent, _]
  ): Unit = js.native
  def apply(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.FocusEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

