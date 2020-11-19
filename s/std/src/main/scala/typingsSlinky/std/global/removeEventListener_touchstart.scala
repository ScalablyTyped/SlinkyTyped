package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_touchstart extends js.Object {
  
  def apply(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TouchEvent, _]
  ): Unit = js.native
  def apply(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TouchEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}
