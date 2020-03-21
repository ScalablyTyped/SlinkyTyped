package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.ChatRoom
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when information about chat rooms where user participates received
		*/
trait ChatRoomsDataReceived extends VoxImplantIMEvent {
  /**
  			* Rooms list
  			*/
  var rooms: js.Array[ChatRoom]
}

object ChatRoomsDataReceived {
  @scala.inline
  def apply(rooms: js.Array[ChatRoom]): ChatRoomsDataReceived = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatRoomsDataReceived]
  }
}

