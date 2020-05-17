package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.animationstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_animationstart extends js.Object {
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
    options: EventListenerOptions
  ): Unit = js.native
}

