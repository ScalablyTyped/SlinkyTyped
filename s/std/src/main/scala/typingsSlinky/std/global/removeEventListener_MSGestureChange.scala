package typingsSlinky.std.global

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.MSGestureChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_MSGestureChange extends js.Object {
  
  def apply(`type`: MSGestureChange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}
