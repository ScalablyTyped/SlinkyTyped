package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an RFC3161 unauthenticated timestamp attribute in a signed CMS message. */
@js.native
trait CmsTimestampInfo extends js.Object {
  /** Gets the list of certificates that is used for chain building for the signing certificate. */
  var certificates: IVectorView[Certificate] = js.native
  /** Gets the certificate that is used to sign the timestamp. */
  var signingCertificate: Certificate = js.native
  /** Gets the date and time of the timestamp. */
  var timestamp: js.Date = js.native
}

object CmsTimestampInfo {
  @scala.inline
  def apply(certificates: IVectorView[Certificate], signingCertificate: Certificate, timestamp: js.Date): CmsTimestampInfo = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], signingCertificate = signingCertificate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmsTimestampInfo]
  }
  @scala.inline
  implicit class CmsTimestampInfoOps[Self <: CmsTimestampInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificates(value: IVectorView[Certificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

