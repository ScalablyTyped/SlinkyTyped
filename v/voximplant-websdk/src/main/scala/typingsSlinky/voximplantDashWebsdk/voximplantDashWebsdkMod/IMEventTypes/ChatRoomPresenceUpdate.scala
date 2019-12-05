package typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.ParticipantInfo
import typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.UserStatuses
import typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if chat room participant presence status was updated
		*/
trait ChatRoomPresenceUpdate extends VoxImplantIMEvent {
  /**
  			* Optional presence message
  			*/
  var message: String
  /**
  			* Participant info
  			*/
  var participant: ParticipantInfo
  /**
  			* Current presence status
  			*/
  var presence: UserStatuses
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomPresenceUpdate {
  @scala.inline
  def apply(message: String, participant: ParticipantInfo, presence: UserStatuses, room: String): ChatRoomPresenceUpdate = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatRoomPresenceUpdate]
  }
}

