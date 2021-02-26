package typingsSlinky.winrtUwp.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the underlying transport used by the HTTP connection. */
@js.native
trait HttpTransportInformation extends StObject {
  
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
  implicit class HttpTransportInformationMutableBuilder[Self <: HttpTransportInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerCertificate(value: Certificate): Self = StObject.set(x, "serverCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateErrorSeverity(value: SocketSslErrorSeverity): Self = StObject.set(x, "serverCertificateErrorSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateErrors(value: IVectorView[ChainValidationResult]): Self = StObject.set(x, "serverCertificateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIntermediateCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "serverIntermediateCertificates", value.asInstanceOf[js.Any])
  }
}
