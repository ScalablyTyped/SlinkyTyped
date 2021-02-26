package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when instant message was removed by user
  */
@js.native
trait MessageRemoved extends VoxImplantIMEvent {
  
  /**
    *    User id (of the user who sent the message)
    */
  var id: String = js.native
  
  /**
    *    Message id
    */
  var message_id: String = js.native
  
  /**
    *    User id (of the user to whom the message was sent)
    */
  var to: String = js.native
}
object MessageRemoved {
  
  @scala.inline
  def apply(id: String, message_id: String, to: String): MessageRemoved = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRemoved]
  }
  
  @scala.inline
  implicit class MessageRemovedMutableBuilder[Self <: MessageRemoved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
