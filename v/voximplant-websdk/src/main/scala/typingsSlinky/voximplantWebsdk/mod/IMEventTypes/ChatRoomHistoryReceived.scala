package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.IMHistoryMessage
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room history received
		*/
@js.native
trait ChatRoomHistoryReceived extends VoxImplantIMEvent {
  /**
  			* Message id specified in getInstantMessagingHistory method
  			*/
  var message_id: String = js.native
  /**
  			* List of messages
  			*/
  var messages: js.Array[IMHistoryMessage] = js.native
  /**
  			* Room id
  			*/
  var room: String = js.native
}

object ChatRoomHistoryReceived {
  @scala.inline
  def apply(message_id: String, messages: js.Array[IMHistoryMessage], room: String): ChatRoomHistoryReceived = {
    val __obj = js.Dynamic.literal(message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomHistoryReceived]
  }
  @scala.inline
  implicit class ChatRoomHistoryReceivedOps[Self <: ChatRoomHistoryReceived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[IMHistoryMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
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

