package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a StreamSocket object. */
@js.native
trait StreamSocketInformation extends js.Object {
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
  implicit class StreamSocketInformationOps[Self <: StreamSocketInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidthStatistics(value: BandwidthStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidthStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalAddress(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectionLevel(value: SocketProtectionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteAddress(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteHostName(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteHostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundTripTimeStatistics(value: RoundTripTimeStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundTripTimeStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCertificateErrorSeverity(value: SocketSslErrorSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateErrorSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCertificateErrors(value: IVectorView[ChainValidationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerIntermediateCertificates(value: IVectorView[Certificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverIntermediateCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionKey(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

