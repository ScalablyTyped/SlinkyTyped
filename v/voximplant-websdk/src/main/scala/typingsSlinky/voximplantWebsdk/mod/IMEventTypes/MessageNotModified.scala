package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched if error happened during instant message modification
  */
@js.native
trait MessageNotModified extends VoxImplantIMEvent {
  
  /**
    *    Message new content
    */
  var code: Double = js.native
  
  /**
    *    Message id
    */
  var message_id: String = js.native
  
  /**
    *    User id (of the user to whom the message was sent)
    */
  var to: String = js.native
}
object MessageNotModified {
  
  @scala.inline
  def apply(code: Double, message_id: String, to: String): MessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageNotModified]
  }
  
  @scala.inline
  implicit class MessageNotModifiedMutableBuilder[Self <: MessageNotModified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
