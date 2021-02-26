package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data to the RemoteParticipantComposingChanged event. */
@js.native
trait RemoteParticipantComposingChangedEventArgs extends StObject {
  
  /** Gets a Boolean value indicating if the remote participant is currently composing a message. */
  var isComposing: Boolean = js.native
  
  /** Gets the address of the remote chat participant. */
  var participantAddress: String = js.native
  
  /** Gets the ID for the message transport. */
  var transportId: String = js.native
}
object RemoteParticipantComposingChangedEventArgs {
  
  @scala.inline
  def apply(isComposing: Boolean, participantAddress: String, transportId: String): RemoteParticipantComposingChangedEventArgs = {
    val __obj = js.Dynamic.literal(isComposing = isComposing.asInstanceOf[js.Any], participantAddress = participantAddress.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteParticipantComposingChangedEventArgs]
  }
  
  @scala.inline
  implicit class RemoteParticipantComposingChangedEventArgsMutableBuilder[Self <: RemoteParticipantComposingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantAddress(value: String): Self = StObject.set(x, "participantAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportId(value: String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
  }
}
