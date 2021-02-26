package typingsSlinky.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a join session request that is used to determine if the request will be accepted and initiate the session connection. */
@js.native
trait AllJoynAcceptSessionJoinerEventArgs extends StObject {
  
  /** Called to accept the session connection. */
  def accept(): Unit = js.native
  
  /** Indicates if the app joining the session is on the same network. */
  var sameNetwork: Boolean = js.native
  
  /** The app joining the session is on the same physical node. */
  var samePhysicalNode: Boolean = js.native
  
  /** The session port being used to connect to the session. */
  var sessionPort: Double = js.native
  
  /** The traffic type supported during the session. */
  var trafficType: AllJoynTrafficType = js.native
  
  /** The unique bus name of the app requesting a session connection. */
  var uniqueName: String = js.native
}
object AllJoynAcceptSessionJoinerEventArgs {
  
  @scala.inline
  def apply(
    accept: () => Unit,
    sameNetwork: Boolean,
    samePhysicalNode: Boolean,
    sessionPort: Double,
    trafficType: AllJoynTrafficType,
    uniqueName: String
  ): AllJoynAcceptSessionJoinerEventArgs = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), sameNetwork = sameNetwork.asInstanceOf[js.Any], samePhysicalNode = samePhysicalNode.asInstanceOf[js.Any], sessionPort = sessionPort.asInstanceOf[js.Any], trafficType = trafficType.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynAcceptSessionJoinerEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynAcceptSessionJoinerEventArgsMutableBuilder[Self <: AllJoynAcceptSessionJoinerEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSameNetwork(value: Boolean): Self = StObject.set(x, "sameNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamePhysicalNode(value: Boolean): Self = StObject.set(x, "samePhysicalNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionPort(value: Double): Self = StObject.set(x, "sessionPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficType(value: AllJoynTrafficType): Self = StObject.set(x, "trafficType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
