package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a MessageWebSocket . */
@js.native
trait MessageWebSocketControl extends js.Object {
  /** The maximum message size, in bytes, for a WebSocket message to be configured on the MessageWebSocket object. */
  var maxMessageSize: Double = js.native
  /** The WebSocket message type to be configured on a MessageWebSocket object for write operations. */
  var messageType: SocketMessageType = js.native
  /** The size, in bytes, of the send buffer to be used for sending data on a MessageWebSocket object. */
  var outboundBufferSizeInBytes: Double = js.native
  /** The credential to use to authenticate to the proxy server through HTTP header authentication using a MessageWebSocket object. */
  var proxyCredential: PasswordCredential = js.native
  /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a MessageWebSocket object. */
  var serverCredential: PasswordCredential = js.native
  /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
  var supportedProtocols: IVector[String] = js.native
}

object MessageWebSocketControl {
  @scala.inline
  def apply(
    maxMessageSize: Double,
    messageType: SocketMessageType,
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): MessageWebSocketControl = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketControl]
  }
  @scala.inline
  implicit class MessageWebSocketControlOps[Self <: MessageWebSocketControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxMessageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageType(value: SocketMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundBufferSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundBufferSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyCredential(value: PasswordCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCredential(value: PasswordCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedProtocols(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedProtocols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

