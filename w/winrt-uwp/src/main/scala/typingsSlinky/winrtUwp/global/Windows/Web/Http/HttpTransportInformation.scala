package typingsSlinky.winrtUwp.global.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the underlying transport used by the HTTP connection. */
@JSGlobal("Windows.Web.Http.HttpTransportInformation")
@js.native
abstract class HttpTransportInformation ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.HttpTransportInformation {
  /** Gets the certificate from the server with the SSL information. */
  /* CompleteClass */
  override var serverCertificate: Certificate = js.native
  /** Gets the category of an error on an SSL connection. */
  /* CompleteClass */
  override var serverCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  /** Gets the list of errors that occurred making an SSL connection. */
  /* CompleteClass */
  override var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
  /** Gets the intermediate certificates sent by the server during SSL negotiation on this HttpTransportInformation object. */
  /* CompleteClass */
  override var serverIntermediateCertificates: IVectorView[Certificate] = js.native
}

