package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket control data on a StreamWebSocket object. */
@js.native
trait StreamWebSocketControl extends StObject {
  
  /** A value that indicates whether the Nagle algorithm is used on a StreamWebSocket object. */
  var noDelay: Boolean = js.native
  
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamWebSocket object. */
  var outboundBufferSizeInBytes: Double = js.native
  
  /** The credential to use to authenticate to the proxy server through HTTP header authentication using a StreamWebSocket object. */
  var proxyCredential: PasswordCredential = js.native
  
  /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a StreamWebSocket object. */
  var serverCredential: PasswordCredential = js.native
  
  /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
  var supportedProtocols: IVector[String] = js.native
}
object StreamWebSocketControl {
  
  @scala.inline
  def apply(
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): StreamWebSocketControl = {
    val __obj = js.Dynamic.literal(noDelay = noDelay.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamWebSocketControl]
  }
  
  @scala.inline
  implicit class StreamWebSocketControlMutableBuilder[Self <: StreamWebSocketControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundBufferSizeInBytes(value: Double): Self = StObject.set(x, "outboundBufferSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyCredential(value: PasswordCredential): Self = StObject.set(x, "proxyCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCredential(value: PasswordCredential): Self = StObject.set(x, "serverCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedProtocols(value: IVector[String]): Self = StObject.set(x, "supportedProtocols", value.asInstanceOf[js.Any])
  }
}
