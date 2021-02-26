package typingsSlinky.winrtUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveInboundEndpointPairCreatedEventArgs extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var endpointPair: XboxLiveEndpointPair = js.native
}
object XboxLiveInboundEndpointPairCreatedEventArgs {
  
  @scala.inline
  def apply(endpointPair: XboxLiveEndpointPair): XboxLiveInboundEndpointPairCreatedEventArgs = {
    val __obj = js.Dynamic.literal(endpointPair = endpointPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveInboundEndpointPairCreatedEventArgs]
  }
  
  @scala.inline
  implicit class XboxLiveInboundEndpointPairCreatedEventArgsMutableBuilder[Self <: XboxLiveInboundEndpointPairCreatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointPair(value: XboxLiveEndpointPair): Self = StObject.set(x, "endpointPair", value.asInstanceOf[js.Any])
  }
}
