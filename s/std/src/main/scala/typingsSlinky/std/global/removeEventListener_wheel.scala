package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_wheel extends js.Object {
  
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.WheelEvent, _]
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.WheelEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.WheelEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}
