package typingsSlinky.std.global

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.canplaythrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_canplaythrough extends js.Object {
  
  def apply(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
