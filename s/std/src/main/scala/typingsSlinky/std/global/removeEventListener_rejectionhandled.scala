package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.rejectionhandled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_rejectionhandled extends js.Object {
  def apply(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

