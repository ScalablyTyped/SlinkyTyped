package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebSocketInformation extends StObject {
  
  var bandwidthStatistics: BandwidthStatistics = js.native
  
  var localAddress: HostName = js.native
  
  var protocol: String = js.native
}
object IWebSocketInformation {
  
  @scala.inline
  def apply(bandwidthStatistics: BandwidthStatistics, localAddress: HostName, protocol: String): IWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketInformation]
  }
  
  @scala.inline
  implicit class IWebSocketInformationMutableBuilder[Self <: IWebSocketInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidthStatistics(value: BandwidthStatistics): Self = StObject.set(x, "bandwidthStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
