package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat room message modified
  */
@js.native
trait ChatRoomMessageModified extends VoxImplantIMEvent {
  
  /**
    * New message content
    */
  var content: String = js.native
  
  /**
    * User id
    */
  var from: String = js.native
  
  /**
    * Modified message id
    */
  var message_id: String = js.native
  
  /**
    * Private/public message flag
    */
  var private_message: String = js.native
  
  /**
    * Resource name
    */
  var resource: String = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
  
  /**
    * Message timestamp
    */
  var timestamp: String = js.native
}
object ChatRoomMessageModified {
  
  @scala.inline
  def apply(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): ChatRoomMessageModified = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomMessageModified]
  }
  
  @scala.inline
  implicit class ChatRoomMessageModifiedMutableBuilder[Self <: ChatRoomMessageModified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_message(value: String): Self = StObject.set(x, "private_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
