package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.unhandledrejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_unhandledrejection extends js.Object {
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

