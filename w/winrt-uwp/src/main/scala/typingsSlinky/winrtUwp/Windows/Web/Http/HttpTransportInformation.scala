package typingsSlinky.winrtUwp.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the underlying transport used by the HTTP connection. */
@js.native
trait HttpTransportInformation extends js.Object {
  /** Gets the certificate from the server with the SSL information. */
  var serverCertificate: Certificate = js.native
  /** Gets the category of an error on an SSL connection. */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  /** Gets the list of errors that occurred making an SSL connection. */
  var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
  /** Gets the intermediate certificates sent by the server during SSL negotiation on this HttpTransportInformation object. */
  var serverIntermediateCertificates: IVectorView[Certificate] = js.native
}

object HttpTransportInformation {
  @scala.inline
  def apply(
    serverCertificate: Certificate,
    serverCertificateErrorSeverity: SocketSslErrorSeverity,
    serverCertificateErrors: IVectorView[ChainValidationResult],
    serverIntermediateCertificates: IVectorView[Certificate]
  ): HttpTransportInformation = {
    val __obj = js.Dynamic.literal(serverCertificate = serverCertificate.asInstanceOf[js.Any], serverCertificateErrorSeverity = serverCertificateErrorSeverity.asInstanceOf[js.Any], serverCertificateErrors = serverCertificateErrors.asInstanceOf[js.Any], serverIntermediateCertificates = serverIntermediateCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTransportInformation]
  }
  @scala.inline
  implicit class HttpTransportInformationOps[Self <: HttpTransportInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

