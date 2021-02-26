package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket information on a StreamWebSocket object. */
@js.native
trait StreamWebSocketInformation extends StObject {
  
  /** Gets bandwidth information for network data transfer on a StreamWebSocket object. */
  var bandwidthStatistics: BandwidthStatistics = js.native
  
  /** Gets the IP address associated with a StreamWebSocket object. */
  var localAddress: HostName = js.native
  
  /** Gets the WebSocket sub-protocol negotiated with the server during WebSocket handshake on a StreamWebSocket object. */
  var protocol: String = js.native
}
object StreamWebSocketInformation {
  
  @scala.inline
  def apply(bandwidthStatistics: BandwidthStatistics, localAddress: HostName, protocol: String): StreamWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamWebSocketInformation]
  }
  
  @scala.inline
  implicit class StreamWebSocketInformationMutableBuilder[Self <: StreamWebSocketInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidthStatistics(value: BandwidthStatistics): Self = StObject.set(x, "bandwidthStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
