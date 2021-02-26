package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerContainerEventMap extends StObject {
  
  var controllerchange: org.scalajs.dom.raw.Event = js.native
  
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  
  var messageerror: org.scalajs.dom.raw.MessageEvent = js.native
}
object ServiceWorkerContainerEventMap {
  
  @scala.inline
  def apply(
    controllerchange: org.scalajs.dom.raw.Event,
    message: org.scalajs.dom.raw.MessageEvent,
    messageerror: org.scalajs.dom.raw.MessageEvent
  ): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
  
  @scala.inline
  implicit class ServiceWorkerContainerEventMapMutableBuilder[Self <: ServiceWorkerContainerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControllerchange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "controllerchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
