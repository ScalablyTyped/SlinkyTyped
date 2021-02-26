package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatagramSocketInformation extends StObject {
  
  var localAddress: HostName = js.native
  
  var localPort: String = js.native
  
  var remoteAddress: HostName = js.native
  
  var remotePort: String = js.native
}
object IDatagramSocketInformation {
  
  @scala.inline
  def apply(localAddress: HostName, localPort: String, remoteAddress: HostName, remotePort: String): IDatagramSocketInformation = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatagramSocketInformation]
  }
  
  @scala.inline
  implicit class IDatagramSocketInformationMutableBuilder[Self <: IDatagramSocketInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAddress(value: HostName): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePort(value: String): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
  }
}
