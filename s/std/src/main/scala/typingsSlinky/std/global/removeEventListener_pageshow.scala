package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.pageshow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_pageshow extends js.Object {
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PageTransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PageTransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

