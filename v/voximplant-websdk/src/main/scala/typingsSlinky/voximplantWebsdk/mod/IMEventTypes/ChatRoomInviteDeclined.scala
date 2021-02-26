package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched if an invitation to chat room was declined by the invitee
  */
@js.native
trait ChatRoomInviteDeclined extends VoxImplantIMEvent {
  
  /**
    * User id (invitee)
    */
  var invitee: String = js.native
  
  /**
    * A reason of the invitation
    */
  var reason: String = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
}
object ChatRoomInviteDeclined {
  
  @scala.inline
  def apply(invitee: String, reason: String, room: String): ChatRoomInviteDeclined = {
    val __obj = js.Dynamic.literal(invitee = invitee.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInviteDeclined]
  }
  
  @scala.inline
  implicit class ChatRoomInviteDeclinedMutableBuilder[Self <: ChatRoomInviteDeclined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitee(value: String): Self = StObject.set(x, "invitee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
