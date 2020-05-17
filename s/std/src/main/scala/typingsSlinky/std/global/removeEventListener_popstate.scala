package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_popstate extends js.Object {
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.PopStateEvent, _]
  ): Unit = js.native
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.PopStateEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.PopStateEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

