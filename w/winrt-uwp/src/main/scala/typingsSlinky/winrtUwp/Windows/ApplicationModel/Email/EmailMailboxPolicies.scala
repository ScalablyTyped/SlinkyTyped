package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the encryption and signing policies associates with an email mailbox. */
@js.native
trait EmailMailboxPolicies extends js.Object {
  /** Gets a Boolean value that indicates whether software certificates are allowed. */
  var allowSmimeSoftCertificates: Boolean = js.native
  /** Gets the allowable SMIME encryption algorithms for the purpose of negotiating with an app. */
  var allowedSmimeEncryptionAlgorithmNegotiation: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation = js.native
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts encrypted messages. */
  var mustEncryptSmimeMessages: Boolean = js.native
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts signed messages. */
  var mustSignSmimeMessages: Boolean = js.native
  /** Gets the required SMIME encryption algorithm. */
  var requiredSmimeEncryptionAlgorithm: EmailMailboxSmimeEncryptionAlgorithm = js.native
  /** Gets the required SMIME signing algorithm. */
  var requiredSmimeSigningAlgorithm: EmailMailboxSmimeSigningAlgorithm = js.native
}

object EmailMailboxPolicies {
  @scala.inline
  def apply(
    allowSmimeSoftCertificates: Boolean,
    allowedSmimeEncryptionAlgorithmNegotiation: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation,
    mustEncryptSmimeMessages: Boolean,
    mustSignSmimeMessages: Boolean,
    requiredSmimeEncryptionAlgorithm: EmailMailboxSmimeEncryptionAlgorithm,
    requiredSmimeSigningAlgorithm: EmailMailboxSmimeSigningAlgorithm
  ): EmailMailboxPolicies = {
    val __obj = js.Dynamic.literal(allowSmimeSoftCertificates = allowSmimeSoftCertificates.asInstanceOf[js.Any], allowedSmimeEncryptionAlgorithmNegotiation = allowedSmimeEncryptionAlgorithmNegotiation.asInstanceOf[js.Any], mustEncryptSmimeMessages = mustEncryptSmimeMessages.asInstanceOf[js.Any], mustSignSmimeMessages = mustSignSmimeMessages.asInstanceOf[js.Any], requiredSmimeEncryptionAlgorithm = requiredSmimeEncryptionAlgorithm.asInstanceOf[js.Any], requiredSmimeSigningAlgorithm = requiredSmimeSigningAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxPolicies]
  }
  @scala.inline
  implicit class EmailMailboxPoliciesOps[Self <: EmailMailboxPolicies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSmimeSoftCertificates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSmimeSoftCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedSmimeEncryptionAlgorithmNegotiation(value: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSmimeEncryptionAlgorithmNegotiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMustEncryptSmimeMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustEncryptSmimeMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMustSignSmimeMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustSignSmimeMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredSmimeEncryptionAlgorithm(value: EmailMailboxSmimeEncryptionAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredSmimeEncryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredSmimeSigningAlgorithm(value: EmailMailboxSmimeSigningAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredSmimeSigningAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

