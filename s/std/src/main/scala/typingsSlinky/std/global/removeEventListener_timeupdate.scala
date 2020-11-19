package typingsSlinky.std.global

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.timeupdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_timeupdate extends js.Object {
  
  def apply(`type`: timeupdate, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}
