package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.pagehide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_pagehide extends js.Object {
  def apply(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PageTransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

