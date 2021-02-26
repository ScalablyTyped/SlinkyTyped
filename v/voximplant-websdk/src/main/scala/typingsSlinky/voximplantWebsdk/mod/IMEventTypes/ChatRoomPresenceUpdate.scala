package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.ParticipantInfo
import typingsSlinky.voximplantWebsdk.mod.UserStatuses
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched if chat room participant presence status was updated
  */
@js.native
trait ChatRoomPresenceUpdate extends VoxImplantIMEvent {
  
  /**
    * Optional presence message
    */
  var message: String = js.native
  
  /**
    * Participant info
    */
  var participant: ParticipantInfo = js.native
  
  /**
    * Current presence status
    */
  var presence: UserStatuses = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
}
object ChatRoomPresenceUpdate {
  
  @scala.inline
  def apply(message: String, participant: ParticipantInfo, presence: UserStatuses, room: String): ChatRoomPresenceUpdate = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomPresenceUpdate]
  }
  
  @scala.inline
  implicit class ChatRoomPresenceUpdateMutableBuilder[Self <: ChatRoomPresenceUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipant(value: ParticipantInfo): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresence(value: UserStatuses): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
