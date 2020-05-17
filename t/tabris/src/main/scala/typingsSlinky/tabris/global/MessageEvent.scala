package typingsSlinky.tabris.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.tabris.MessageEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MessageEvent")
@js.native
class MessageEvent protected ()
  extends typingsSlinky.tabris.MessageEvent {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: MessageEventInit) = this()
}

@JSGlobal("MessageEvent")
@js.native
object MessageEvent
  extends Instantiable1[/* type */ String, typingsSlinky.tabris.MessageEvent]
     with Instantiable2[
      /* type */ String, 
      /* eventInitDict */ MessageEventInit, 
      typingsSlinky.tabris.MessageEvent
    ]

