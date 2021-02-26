package typingsSlinky.winrtUwp.Windows.Networking.Proximity

import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains properties that the TriggeredConnectionStateChanged event passes to an application. */
@js.native
trait TriggeredConnectionStateChangedEventArgs extends StObject {
  
  /** Gets the unique identifier for the connection in progress. */
  var id: Double = js.native
  
  /** Gets the StreamSocket instance for the connection. */
  var socket: StreamSocket = js.native
  
  /** Gets the state of the connection in progress. */
  var state: TriggeredConnectState = js.native
}
object TriggeredConnectionStateChangedEventArgs {
  
  @scala.inline
  def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): TriggeredConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeredConnectionStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class TriggeredConnectionStateChangedEventArgsMutableBuilder[Self <: TriggeredConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocket(value: StreamSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: TriggeredConnectState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
