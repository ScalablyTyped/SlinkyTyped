package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.ParticipantInfo
import typingsSlinky.voximplantWebsdk.mod.UserStatuses
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if chat room participant presence status was updated
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
  implicit class ChatRoomPresenceUpdateOps[Self <: ChatRoomPresenceUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipant(value: ParticipantInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresence(value: UserStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

