package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.transitionend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_transitionend extends js.Object {
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
    options: EventListenerOptions
  ): Unit = js.native
}

