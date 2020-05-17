package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerMessageEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ServiceWorkerMessageEvent")
@js.native
class ServiceWorkerMessageEvent protected ()
  extends typingsSlinky.std.ServiceWorkerMessageEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ServiceWorkerMessageEventInit) = this()
}

@JSGlobal("ServiceWorkerMessageEvent")
@js.native
object ServiceWorkerMessageEvent
  extends Instantiable1[/* type */ java.lang.String, typingsSlinky.std.ServiceWorkerMessageEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ServiceWorkerMessageEventInit, 
      typingsSlinky.std.ServiceWorkerMessageEvent
    ]

