package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when participant left the chat room
  */
@js.native
trait ChatRoomParticipantExit extends VoxImplantIMEvent {
  
  /**
    * User id
    */
  var participant: String = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
}
object ChatRoomParticipantExit {
  
  @scala.inline
  def apply(participant: String, room: String): ChatRoomParticipantExit = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomParticipantExit]
  }
  
  @scala.inline
  implicit class ChatRoomParticipantExitMutableBuilder[Self <: ChatRoomParticipantExit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParticipant(value: String): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
