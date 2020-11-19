package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.keydown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_keydown extends js.Object {
  
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _]
  ): Unit = js.native
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}
