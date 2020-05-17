package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.beforeunload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_beforeunload extends js.Object {
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _]
  ): Unit = js.native
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

