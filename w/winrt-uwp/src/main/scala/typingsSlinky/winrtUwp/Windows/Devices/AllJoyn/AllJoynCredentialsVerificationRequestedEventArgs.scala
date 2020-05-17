package typingsSlinky.winrtUwp.Windows.Devices.AllJoyn

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to allow the application to indicate whether the credentials provided by a peer are valid. */
@js.native
trait AllJoynCredentialsVerificationRequestedEventArgs extends js.Object {
  /** The mechanism used to authenticate credentials. */
  var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
  /** The cryptography certificate provided for authentication. */
  var peerCertificate: Certificate = js.native
  /** The category of an errors encountered authenticating the cryptography certificate. */
  var peerCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  /** A list of errors that occurred during authentication of the provided cryptography certificate. */
  var peerCertificateErrors: IVectorView[ChainValidationResult] = js.native
  /** Retrieves the intermediate certificates sent during authentication. */
  var peerIntermediateCertificates: IVectorView[Certificate] = js.native
  /** The unique bus name of the remote app being authenticated. */
  var peerUniqueName: String = js.native
  /** Calling this method indicates that the credentials provided for authentication are valid. */
  def accept(): Unit = js.native
  /**
    * Conducts verification of provided of credentials asynchronously.
    * @return The verification deferral.
    */
  def getDeferral(): Deferral = js.native
}

object AllJoynCredentialsVerificationRequestedEventArgs {
  @scala.inline
  def apply(
    accept: () => Unit,
    authenticationMechanism: AllJoynAuthenticationMechanism,
    getDeferral: () => Deferral,
    peerCertificate: Certificate,
    peerCertificateErrorSeverity: SocketSslErrorSeverity,
    peerCertificateErrors: IVectorView[ChainValidationResult],
    peerIntermediateCertificates: IVectorView[Certificate],
    peerUniqueName: String
  ): AllJoynCredentialsVerificationRequestedEventArgs = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), authenticationMechanism = authenticationMechanism.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), peerCertificate = peerCertificate.asInstanceOf[js.Any], peerCertificateErrorSeverity = peerCertificateErrorSeverity.asInstanceOf[js.Any], peerCertificateErrors = peerCertificateErrors.asInstanceOf[js.Any], peerIntermediateCertificates = peerIntermediateCertificates.asInstanceOf[js.Any], peerUniqueName = peerUniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynCredentialsVerificationRequestedEventArgs]
  }
  @scala.inline
  implicit class AllJoynCredentialsVerificationRequestedEventArgsOps[Self <: AllJoynCredentialsVerificationRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAuthenticationMechanism(value: AllJoynAuthenticationMechanism): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationMechanism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => Deferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeerCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerCertificateErrorSeverity(value: SocketSslErrorSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerCertificateErrorSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerCertificateErrors(value: IVectorView[ChainValidationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerCertificateErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerIntermediateCertificates(value: IVectorView[Certificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIntermediateCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerUniqueName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

