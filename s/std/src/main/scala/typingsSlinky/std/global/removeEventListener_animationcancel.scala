package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.animationcancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_animationcancel extends js.Object {
  
  def apply(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.AnimationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.AnimationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}
