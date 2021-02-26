package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerEventMap extends AbstractWorkerEventMap {
  
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  
  var messageerror: org.scalajs.dom.raw.MessageEvent = js.native
}
object WorkerEventMap {
  
  @scala.inline
  def apply(
    error: org.scalajs.dom.raw.ErrorEvent,
    message: org.scalajs.dom.raw.MessageEvent,
    messageerror: org.scalajs.dom.raw.MessageEvent
  ): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerEventMap]
  }
  
  @scala.inline
  implicit class WorkerEventMapMutableBuilder[Self <: WorkerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
