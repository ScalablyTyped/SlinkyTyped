package typingsSlinky.winrtUwp.Windows.Security.Credentials

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of the KeyCredential.GetAttestationAsync method. */
@js.native
trait KeyCredentialAttestationResult extends js.Object {
  /** Gets the attestation information for the KeyCredential. */
  var attestationBuffer: IBuffer = js.native
  /** Gets the chain of certificates used to verify the attestation. */
  var certificateChainBuffer: IBuffer = js.native
  /** Gets the status of the key credential attestation. */
  var status: KeyCredentialAttestationStatus = js.native
}

object KeyCredentialAttestationResult {
  @scala.inline
  def apply(
    attestationBuffer: IBuffer,
    certificateChainBuffer: IBuffer,
    status: KeyCredentialAttestationStatus
  ): KeyCredentialAttestationResult = {
    val __obj = js.Dynamic.literal(attestationBuffer = attestationBuffer.asInstanceOf[js.Any], certificateChainBuffer = certificateChainBuffer.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCredentialAttestationResult]
  }
  @scala.inline
  implicit class KeyCredentialAttestationResultOps[Self <: KeyCredentialAttestationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttestationBuffer(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestationBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateChainBuffer(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChainBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: KeyCredentialAttestationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

