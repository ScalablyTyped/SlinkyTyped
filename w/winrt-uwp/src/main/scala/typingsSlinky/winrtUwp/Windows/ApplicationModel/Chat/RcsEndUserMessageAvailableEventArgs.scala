package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for a MessageAvailableChanged event. */
@js.native
trait RcsEndUserMessageAvailableEventArgs extends StObject {
  
  /** Gets a Boolean value indicating if a new message is available. */
  var isMessageAvailable: Boolean = js.native
  
  /** Gets the actual message to display, or empty if IsMessageAvailable is FALSE. */
  var message: RcsEndUserMessage = js.native
}
object RcsEndUserMessageAvailableEventArgs {
  
  @scala.inline
  def apply(isMessageAvailable: Boolean, message: RcsEndUserMessage): RcsEndUserMessageAvailableEventArgs = {
    val __obj = js.Dynamic.literal(isMessageAvailable = isMessageAvailable.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAvailableEventArgs]
  }
  
  @scala.inline
  implicit class RcsEndUserMessageAvailableEventArgsMutableBuilder[Self <: RcsEndUserMessageAvailableEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMessageAvailable(value: Boolean): Self = StObject.set(x, "isMessageAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: RcsEndUserMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
