package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.ChatRoom
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when information about chat rooms where user participates received
		*/
@js.native
trait ChatRoomsDataReceived extends VoxImplantIMEvent {
  /**
  			* Rooms list
  			*/
  var rooms: js.Array[ChatRoom] = js.native
}

object ChatRoomsDataReceived {
  @scala.inline
  def apply(rooms: js.Array[ChatRoom]): ChatRoomsDataReceived = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomsDataReceived]
  }
  @scala.inline
  implicit class ChatRoomsDataReceivedOps[Self <: ChatRoomsDataReceived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRooms(value: js.Array[ChatRoom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rooms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

