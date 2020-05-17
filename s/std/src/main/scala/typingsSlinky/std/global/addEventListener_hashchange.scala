package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.hashchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_hashchange extends js.Object {
  def apply(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _]
  ): Unit = js.native
  def apply(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

