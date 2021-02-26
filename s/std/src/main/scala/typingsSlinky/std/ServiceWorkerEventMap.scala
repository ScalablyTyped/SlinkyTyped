package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerEventMap extends AbstractWorkerEventMap {
  
  var statechange: org.scalajs.dom.raw.Event = js.native
}
object ServiceWorkerEventMap {
  
  @scala.inline
  def apply(error: org.scalajs.dom.raw.ErrorEvent, statechange: org.scalajs.dom.raw.Event): ServiceWorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerEventMap]
  }
  
  @scala.inline
  implicit class ServiceWorkerEventMapMutableBuilder[Self <: ServiceWorkerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
