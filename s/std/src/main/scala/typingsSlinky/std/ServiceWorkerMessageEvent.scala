package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This ServiceWorker API interface contains information about an event sent to a ServiceWorkerContainer target. This extends the default message event to allow setting a ServiceWorker object as the source of a message. The event object is accessed via the handler function of a message event, when fired by a message received from a service worker. */
@js.native
trait ServiceWorkerMessageEvent extends Event {
  
  val data: js.Any = js.native
  
  val lastEventId: java.lang.String = js.native
  
  val origin: java.lang.String = js.native
  
  val ports: js.Array[org.scalajs.dom.raw.MessagePort] | Null = js.native
  
  val source: org.scalajs.dom.experimental.serviceworkers.ServiceWorker | org.scalajs.dom.raw.MessagePort | Null = js.native
}
