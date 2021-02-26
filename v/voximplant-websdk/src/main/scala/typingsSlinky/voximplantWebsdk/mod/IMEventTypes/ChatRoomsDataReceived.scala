package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.ChatRoom
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when information about chat rooms where user participates received
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
  implicit class ChatRoomsDataReceivedMutableBuilder[Self <: ChatRoomsDataReceived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRooms(value: js.Array[ChatRoom]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomsVarargs(value: ChatRoom*): Self = StObject.set(x, "rooms", js.Array(value :_*))
  }
}
