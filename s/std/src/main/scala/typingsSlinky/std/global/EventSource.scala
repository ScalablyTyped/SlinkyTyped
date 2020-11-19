package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.EventSourceInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("EventSource")
@js.native
class EventSource protected ()
  extends typingsSlinky.std.EventSource {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, eventSourceInitDict: EventSourceInit) = this()
}
@JSGlobal("EventSource")
@js.native
object EventSource
  extends Instantiable1[/* url */ java.lang.String, org.scalajs.dom.raw.EventSource]
     with Instantiable2[
      /* url */ java.lang.String, 
      /* eventSourceInitDict */ EventSourceInit, 
      org.scalajs.dom.raw.EventSource
    ] {
  
  val CLOSED: Double = js.native
  
  val CONNECTING: Double = js.native
  
  val OPEN: Double = js.native
}
