package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.MessageEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MessageEvent")
@js.native
class MessageEvent protected ()
  extends typingsSlinky.std.MessageEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MessageEventInit) = this()
}

@JSGlobal("MessageEvent")
@js.native
object MessageEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.MessageEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MessageEventInit, 
      org.scalajs.dom.raw.MessageEvent
    ]

