package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_popstate extends js.Object {
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
    options: AddEventListenerOptions
  ): Unit = js.native
}

