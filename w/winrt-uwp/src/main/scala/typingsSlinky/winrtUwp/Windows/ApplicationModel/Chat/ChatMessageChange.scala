package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a revision to a chat message. */
@js.native
trait ChatMessageChange extends StObject {
  
  /** Gets the type of change made to a chat message, such as created, modified, etc. */
  var changeType: ChatMessageChangeType = js.native
  
  /** Gets the updated message text. */
  var message: ChatMessage = js.native
}
object ChatMessageChange {
  
  @scala.inline
  def apply(changeType: ChatMessageChangeType, message: ChatMessage): ChatMessageChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageChange]
  }
  
  @scala.inline
  implicit class ChatMessageChangeMutableBuilder[Self <: ChatMessageChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: ChatMessageChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: ChatMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
