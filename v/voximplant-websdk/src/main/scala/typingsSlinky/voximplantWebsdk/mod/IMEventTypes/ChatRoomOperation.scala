package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.ChatRoomOperationType
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat room participant was banned/unbanned
  */
@js.native
trait ChatRoomOperation extends VoxImplantIMEvent {
  
  /**
    * Operation type
    */
  var operation: ChatRoomOperationType = js.native
  
  /**
    * Operation result: true/false - success/failure
    */
  var result: Boolean = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
}
object ChatRoomOperation {
  
  @scala.inline
  def apply(operation: ChatRoomOperationType, result: Boolean, room: String): ChatRoomOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomOperation]
  }
  
  @scala.inline
  implicit class ChatRoomOperationMutableBuilder[Self <: ChatRoomOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: ChatRoomOperationType): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
