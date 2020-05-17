package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.transitionend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_transitionend extends js.Object {
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

