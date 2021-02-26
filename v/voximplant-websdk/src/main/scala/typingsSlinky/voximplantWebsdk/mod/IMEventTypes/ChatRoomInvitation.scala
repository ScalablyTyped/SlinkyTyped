package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when invitation to chat room received
  */
@js.native
trait ChatRoomInvitation extends VoxImplantIMEvent {
  
  /**
    * The body of the message
    */
  var body: String = js.native
  
  /**
    * User id (inviter)
    */
  var from: String = js.native
  
  /**
    * Password for the room
    */
  var password: String = js.native
  
  /**
    * A reason of the invitation
    */
  var reason: String = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
}
object ChatRoomInvitation {
  
  @scala.inline
  def apply(body: String, from: String, password: String, reason: String, room: String): ChatRoomInvitation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInvitation]
  }
  
  @scala.inline
  implicit class ChatRoomInvitationMutableBuilder[Self <: ChatRoomInvitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
