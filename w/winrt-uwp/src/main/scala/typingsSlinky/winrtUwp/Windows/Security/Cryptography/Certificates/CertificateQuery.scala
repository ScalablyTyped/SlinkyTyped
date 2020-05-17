package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters for a query for certificates from the certificate store for an app. */
@js.native
trait CertificateQuery extends js.Object {
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension to search for. */
  var enhancedKeyUsages: IVector[String] = js.native
  /** Gets or sets the certificate friendly name to search for. */
  var friendlyName: String = js.native
  /** Gets or sets a value that indicates whether only hardware certificates (SC or TPM) are to be returned from the query. */
  var hardwareOnly: Boolean = js.native
  /** Gets or sets whether to include duplicates. */
  var includeDuplicates: Boolean = js.native
  /** Gets or sets whether to include expired certificates. */
  var includeExpiredCertificates: Boolean = js.native
  /** Gets or sets the name of the certificate issuer to search for. */
  var issuerName: String = js.native
  /** Gets or sets the store name. */
  var storeName: String = js.native
  /** Gets or sets a certificate thumbprint to search for. */
  var thumbprint: Double = js.native
}

object CertificateQuery {
  @scala.inline
  def apply(
    enhancedKeyUsages: IVector[String],
    friendlyName: String,
    hardwareOnly: Boolean,
    includeDuplicates: Boolean,
    includeExpiredCertificates: Boolean,
    issuerName: String,
    storeName: String,
    thumbprint: Double
  ): CertificateQuery = {
    val __obj = js.Dynamic.literal(enhancedKeyUsages = enhancedKeyUsages.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], hardwareOnly = hardwareOnly.asInstanceOf[js.Any], includeDuplicates = includeDuplicates.asInstanceOf[js.Any], includeExpiredCertificates = includeExpiredCertificates.asInstanceOf[js.Any], issuerName = issuerName.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateQuery]
  }
  @scala.inline
  implicit class CertificateQueryOps[Self <: CertificateQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnhancedKeyUsages(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedKeyUsages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHardwareOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeExpiredCertificates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExpiredCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbprint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

