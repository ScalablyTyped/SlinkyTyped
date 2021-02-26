package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when an RFCOMM inbound or outbound connections are established. */
@js.native
trait RfcommConnectionTrigger extends StObject {
  
  /** Gets or sets whether the app wants to handle multiple connections at a time. */
  var allowMultipleConnections: Boolean = js.native
  
  /** Gets or sets the RfcommInboundConnectionInformation object that describes how the system will advertise and listen for inbound connections on behalf of the app. */
  var inboundConnection: RfcommInboundConnectionInformation = js.native
  
  /** Gets or sets the RfcommOutboundConnectionInformation object that describes how the system will create outgoing connections on behalf of the app. */
  var outboundConnection: RfcommOutboundConnectionInformation = js.native
  
  /** Gets or sets the minimum protection level required for connections that are created or accepted on behalf of the app. */
  var protectionLevel: SocketProtectionLevel = js.native
  
  /** Gets or sets specific remote Bluetooth device the system will connect to, or accept connections from, on behalf of the app. */
  var remoteHostName: HostName = js.native
}
object RfcommConnectionTrigger {
  
  @scala.inline
  def apply(
    allowMultipleConnections: Boolean,
    inboundConnection: RfcommInboundConnectionInformation,
    outboundConnection: RfcommOutboundConnectionInformation,
    protectionLevel: SocketProtectionLevel,
    remoteHostName: HostName
  ): RfcommConnectionTrigger = {
    val __obj = js.Dynamic.literal(allowMultipleConnections = allowMultipleConnections.asInstanceOf[js.Any], inboundConnection = inboundConnection.asInstanceOf[js.Any], outboundConnection = outboundConnection.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommConnectionTrigger]
  }
  
  @scala.inline
  implicit class RfcommConnectionTriggerMutableBuilder[Self <: RfcommConnectionTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultipleConnections(value: Boolean): Self = StObject.set(x, "allowMultipleConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundConnection(value: RfcommInboundConnectionInformation): Self = StObject.set(x, "inboundConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundConnection(value: RfcommOutboundConnectionInformation): Self = StObject.set(x, "outboundConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLevel(value: SocketProtectionLevel): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteHostName(value: HostName): Self = StObject.set(x, "remoteHostName", value.asInstanceOf[js.Any])
  }
}
