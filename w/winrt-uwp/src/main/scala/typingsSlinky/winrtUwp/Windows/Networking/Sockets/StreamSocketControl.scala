package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket control data on a StreamSocket object. */
@js.native
trait StreamSocketControl extends StObject {
  
  /** Gets or sets the client SSL/TLS certificate that will be sent to the server if the server requests a client certificate. */
  var clientCertificate: Certificate = js.native
  
  /** Get a vector of SSL server errors to ignore when making an SSL connection with a StreamSocket . */
  var ignorableServerCertificateErrors: IVector[ChainValidationResult] = js.native
  
  /** A value that indicates whether keep-alive packets are sent to the remote destination on a StreamSocket object. */
  var keepAlive: Boolean = js.native
  
  /** A value that indicates whether the Nagle algorithm is used on a StreamSocket object. */
  var noDelay: Boolean = js.native
  
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamSocket object. */
  var outboundBufferSizeInBytes: Double = js.native
  
  /** The hop limit on an outbound packet sent to a unicast IP address by the StreamSocket object. */
  var outboundUnicastHopLimit: Double = js.native
  
  /** The quality of service on a StreamSocket object. */
  var qualityOfService: SocketQualityOfService = js.native
  
  /** A value that indicates whether, when multiple connection attempts are being made, the attempts are made in parallel or serially. */
  var serializeConnectionAttempts: Boolean = js.native
}
object StreamSocketControl {
  
  @scala.inline
  def apply(
    clientCertificate: Certificate,
    ignorableServerCertificateErrors: IVector[ChainValidationResult],
    keepAlive: Boolean,
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    outboundUnicastHopLimit: Double,
    qualityOfService: SocketQualityOfService,
    serializeConnectionAttempts: Boolean
  ): StreamSocketControl = {
    val __obj = js.Dynamic.literal(clientCertificate = clientCertificate.asInstanceOf[js.Any], ignorableServerCertificateErrors = ignorableServerCertificateErrors.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], noDelay = noDelay.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any], serializeConnectionAttempts = serializeConnectionAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketControl]
  }
  
  @scala.inline
  implicit class StreamSocketControlMutableBuilder[Self <: StreamSocketControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientCertificate(value: Certificate): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorableServerCertificateErrors(value: IVector[ChainValidationResult]): Self = StObject.set(x, "ignorableServerCertificateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundBufferSizeInBytes(value: Double): Self = StObject.set(x, "outboundBufferSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundUnicastHopLimit(value: Double): Self = StObject.set(x, "outboundUnicastHopLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityOfService(value: SocketQualityOfService): Self = StObject.set(x, "qualityOfService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeConnectionAttempts(value: Boolean): Self = StObject.set(x, "serializeConnectionAttempts", value.asInstanceOf[js.Any])
  }
}
