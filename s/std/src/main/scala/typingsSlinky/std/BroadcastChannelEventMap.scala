package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastChannelEventMap extends StObject {
  
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  
  var messageerror: org.scalajs.dom.raw.MessageEvent = js.native
}
object BroadcastChannelEventMap {
  
  @scala.inline
  def apply(message: org.scalajs.dom.raw.MessageEvent, messageerror: org.scalajs.dom.raw.MessageEvent): BroadcastChannelEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastChannelEventMap]
  }
  
  @scala.inline
  implicit class BroadcastChannelEventMapMutableBuilder[Self <: BroadcastChannelEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
