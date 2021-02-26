package typingsSlinky.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets information about a RemoteSystemAdded event, namely the RemoteSystem that was added. */
@js.native
trait RemoteSystemAddedEventArgs extends StObject {
  
  /** The RemoteSystem object representing the device that was added to the set of discoverable devices, causing the containing RemoteSystemAdded event to be raised. */
  var remoteSystem: RemoteSystem = js.native
}
object RemoteSystemAddedEventArgs {
  
  @scala.inline
  def apply(remoteSystem: RemoteSystem): RemoteSystemAddedEventArgs = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemAddedEventArgs]
  }
  
  @scala.inline
  implicit class RemoteSystemAddedEventArgsMutableBuilder[Self <: RemoteSystemAddedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoteSystem(value: RemoteSystem): Self = StObject.set(x, "remoteSystem", value.asInstanceOf[js.Any])
  }
}
