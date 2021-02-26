package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket information on a StreamSocket object. */
@js.native
trait StreamSocketInformation extends StObject {
  
  /** Gets bandwidth information for network data transfer on a StreamSocket object. */
  var bandwidthStatistics: BandwidthStatistics = js.native
  
  /** Gets the local IP address associated with a StreamSocket object. */
  var localAddress: HostName = js.native
  
  /** Get the TCP port number associated with a StreamSocket . */
  var localPort: String = js.native
  
  /** Gets the protection level that represents the integrity and encryption set on a StreamSocket object. */
  var protectionLevel: SocketProtectionLevel = js.native
  
  /** Get the IP address or hostname of the remote network destination associated with a StreamSocket object. */
  var remoteAddress: HostName = js.native
  
  /** Get the hostname or IP address of the remote network destination associated with a StreamSocket object. */
  var remoteHostName: HostName = js.native
  
  /** Get the TCP port number or service name of the remote network destination associated with a StreamSocket object. */
  var remotePort: String = js.native
  
  /** Get the service name or TCP port number of the remote network destination associated with a StreamSocket object. */
  var remoteServiceName: String = js.native
  
  /** Gets round trip time information for a StreamSocket object. */
  var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
  
  /** Gets the certificate from the server when making an SSL connection with a StreamSocket . */
  var serverCertificate: Certificate = js.native
  
  /** Gets the category of an error that occurred making an SSL connection with a StreamSocket . */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  
  /** Gets the list of errors that occurred making an SSL connection with a StreamSocket . */
  var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
  
  /** Gets the intermediate certificates sent by the server during SSL negotiation when making an SSL connection with a StreamSocket . */
  var serverIntermediateCertificates: IVectorView[Certificate] = js.native
  
  /** Get a byte array that represents the private shared secret exchanged by proximity devices. */
  var sessionKey: IBuffer = js.native
}
object StreamSocketInformation {
  
  @scala.inline
  def apply(
    bandwidthStatistics: BandwidthStatistics,
    localAddress: HostName,
    localPort: String,
    protectionLevel: SocketProtectionLevel,
    remoteAddress: HostName,
    remoteHostName: HostName,
    remotePort: String,
    remoteServiceName: String,
    roundTripTimeStatistics: RoundTripTimeStatistics,
    serverCertificate: Certificate,
    serverCertificateErrorSeverity: SocketSslErrorSeverity,
    serverCertificateErrors: IVectorView[ChainValidationResult],
    serverIntermediateCertificates: IVectorView[Certificate],
    sessionKey: IBuffer
  ): StreamSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any], roundTripTimeStatistics = roundTripTimeStatistics.asInstanceOf[js.Any], serverCertificate = serverCertificate.asInstanceOf[js.Any], serverCertificateErrorSeverity = serverCertificateErrorSeverity.asInstanceOf[js.Any], serverCertificateErrors = serverCertificateErrors.asInstanceOf[js.Any], serverIntermediateCertificates = serverIntermediateCertificates.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketInformation]
  }
  
  @scala.inline
  implicit class StreamSocketInformationMutableBuilder[Self <: StreamSocketInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidthStatistics(value: BandwidthStatistics): Self = StObject.set(x, "bandwidthStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLevel(value: SocketProtectionLevel): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAddress(value: HostName): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteHostName(value: HostName): Self = StObject.set(x, "remoteHostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePort(value: String): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundTripTimeStatistics(value: RoundTripTimeStatistics): Self = StObject.set(x, "roundTripTimeStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificate(value: Certificate): Self = StObject.set(x, "serverCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateErrorSeverity(value: SocketSslErrorSeverity): Self = StObject.set(x, "serverCertificateErrorSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateErrors(value: IVectorView[ChainValidationResult]): Self = StObject.set(x, "serverCertificateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIntermediateCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "serverIntermediateCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKey(value: IBuffer): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
  }
}
