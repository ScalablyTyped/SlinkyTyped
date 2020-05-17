package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the usages of a certificate key. */
@js.native
trait CertificateKeyUsages extends js.Object {
  /** Gets or sets if the key is for cRLSign. */
  var crlSign: Boolean = js.native
  /** Gets or sets if the key is for data encipherment. */
  var dataEncipherment: Boolean = js.native
  /** Gets or sets if the key is for digital signature. */
  var digitalSignature: Boolean = js.native
  /** Gets or sets if the key is for encipher only. */
  var encipherOnly: Boolean = js.native
  /** Gets or sets if the key is for key agreement. */
  var keyAgreement: Boolean = js.native
  /** Gets or sets if the key is for key certificate sign. */
  var keyCertificateSign: Boolean = js.native
  /** Gets or sets if the key is for key encipherment. */
  var keyEncipherment: Boolean = js.native
  /** Gets or sets if the key is for non-repudiation. */
  var nonRepudiation: Boolean = js.native
}

object CertificateKeyUsages {
  @scala.inline
  def apply(
    crlSign: Boolean,
    dataEncipherment: Boolean,
    digitalSignature: Boolean,
    encipherOnly: Boolean,
    keyAgreement: Boolean,
    keyCertificateSign: Boolean,
    keyEncipherment: Boolean,
    nonRepudiation: Boolean
  ): CertificateKeyUsages = {
    val __obj = js.Dynamic.literal(crlSign = crlSign.asInstanceOf[js.Any], dataEncipherment = dataEncipherment.asInstanceOf[js.Any], digitalSignature = digitalSignature.asInstanceOf[js.Any], encipherOnly = encipherOnly.asInstanceOf[js.Any], keyAgreement = keyAgreement.asInstanceOf[js.Any], keyCertificateSign = keyCertificateSign.asInstanceOf[js.Any], keyEncipherment = keyEncipherment.asInstanceOf[js.Any], nonRepudiation = nonRepudiation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateKeyUsages]
  }
  @scala.inline
  implicit class CertificateKeyUsagesOps[Self <: CertificateKeyUsages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrlSign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataEncipherment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEncipherment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigitalSignature(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digitalSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncipherOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encipherOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyAgreement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAgreement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyCertificateSign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCertificateSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyEncipherment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncipherment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonRepudiation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonRepudiation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

