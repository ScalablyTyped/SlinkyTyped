package typingsSlinky.winrtDashUwp.Windows.Web.Http

import typingsSlinky.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtDashUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typingsSlinky.winrtDashUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsSlinky.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the underlying transport used by the HTTP connection. */
@JSGlobal("Windows.Web.Http.HttpTransportInformation")
@js.native
abstract class HttpTransportInformation () extends js.Object {
  /** Gets the certificate from the server with the SSL information. */
  var serverCertificate: Certificate = js.native
  /** Gets the category of an error on an SSL connection. */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  /** Gets the list of errors that occurred making an SSL connection. */
  var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
  /** Gets the intermediate certificates sent by the server during SSL negotiation on this HttpTransportInformation object. */
  var serverIntermediateCertificates: IVectorView[Certificate] = js.native
}

