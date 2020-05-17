package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters to use when building a certificate chain. */
@js.native
trait ChainBuildingParameters extends js.Object {
  /** Gets or sets a value that indicates whether Authority Information Access (AIA) is enabled. */
  var authorityInformationAccessEnabled: Boolean = js.native
  /** Gets or sets a value indicating that the current time is to be used for the validation timestamp. */
  var currentTimeValidationEnabled: Boolean = js.native
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension. */
  var enhancedKeyUsages: IVector[String] = js.native
  /** Gets the list of root certificates that will be trusted. */
  var exclusiveTrustRoots: IVector[Certificate] = js.native
  /** Gets or sets a value indicating whether to request new URLs to use for chain building and revocation checking or to use cached URLs. */
  var networkRetrievalEnabled: Boolean = js.native
  /** Gets or sets a value indicating whether revocation checking is enabled. */
  var revocationCheckEnabled: Boolean = js.native
  /** Gets or sets the time stamp used to determine whether the certificate chain was time valid. */
  var validationTimestamp: js.Date = js.native
}

object ChainBuildingParameters {
  @scala.inline
  def apply(
    authorityInformationAccessEnabled: Boolean,
    currentTimeValidationEnabled: Boolean,
    enhancedKeyUsages: IVector[String],
    exclusiveTrustRoots: IVector[Certificate],
    networkRetrievalEnabled: Boolean,
    revocationCheckEnabled: Boolean,
    validationTimestamp: js.Date
  ): ChainBuildingParameters = {
    val __obj = js.Dynamic.literal(authorityInformationAccessEnabled = authorityInformationAccessEnabled.asInstanceOf[js.Any], currentTimeValidationEnabled = currentTimeValidationEnabled.asInstanceOf[js.Any], enhancedKeyUsages = enhancedKeyUsages.asInstanceOf[js.Any], exclusiveTrustRoots = exclusiveTrustRoots.asInstanceOf[js.Any], networkRetrievalEnabled = networkRetrievalEnabled.asInstanceOf[js.Any], revocationCheckEnabled = revocationCheckEnabled.asInstanceOf[js.Any], validationTimestamp = validationTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainBuildingParameters]
  }
  @scala.inline
  implicit class ChainBuildingParametersOps[Self <: ChainBuildingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorityInformationAccessEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorityInformationAccessEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTimeValidationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTimeValidationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnhancedKeyUsages(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedKeyUsages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclusiveTrustRoots(value: IVector[Certificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveTrustRoots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkRetrievalEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkRetrievalEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevocationCheckEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationCheckEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

