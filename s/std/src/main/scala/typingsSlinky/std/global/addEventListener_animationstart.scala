package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.animationstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_animationstart extends js.Object {
  def apply(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.AnimationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.AnimationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

