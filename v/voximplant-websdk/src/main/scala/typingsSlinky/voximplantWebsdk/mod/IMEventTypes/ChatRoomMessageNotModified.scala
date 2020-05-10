package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched in case of error during chat room message modification
		*/
@js.native
trait ChatRoomMessageNotModified extends VoxImplantIMEvent {
  /**
  			* Error code
  			*/
  var code: Double = js.native
  /**
  			* Message id
  			*/
  var message_id: String = js.native
  /**
  			* Private/public message flag
  			*/
  var private_message: String = js.native
  /**
  			* Room id
  			*/
  var room: String = js.native
}

object ChatRoomMessageNotModified {
  @scala.inline
  def apply(code: Double, message_id: String, private_message: String, room: String): ChatRoomMessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomMessageNotModified]
  }
  @scala.inline
  implicit class ChatRoomMessageNotModifiedOps[Self <: ChatRoomMessageNotModified] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_message")(value.asInstanceOf[js.Any])
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

