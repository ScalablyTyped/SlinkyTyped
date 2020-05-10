package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the property values for a PlayReady-ND transmitter certificate. */
@js.native
trait INDTransmitterProperties extends js.Object {
  /** Gets the certificate type for the transmitter. */
  var certificateType: NDCertificateType = js.native
  /** Gets the client identifier from the transmitter certificate. */
  var clientID: Double = js.native
  /** Gets the expiration date and time from the transmitter certificate. */
  var expirationDate: js.Date = js.native
  /** Gets the model digest from a transmitter certificate. */
  var modelDigest: Double = js.native
  /** Gets the model manufacturer name from a transmitter certificate. */
  var modelManufacturerName: String = js.native
  /** Gets the model name from a transmitter certificate. */
  var modelName: String = js.native
  /** Gets the model number from a transmitter certificate. */
  var modelNumber: String = js.native
  /** Gets the platform identifier from a transmitter certificate. */
  var platformIdentifier: NDCertificatePlatformID = js.native
  /** Gets the security level from a transmitter certificate. */
  var securityLevel: Double = js.native
  /** Gets the security version from a transmitter certificate. */
  var securityVersion: Double = js.native
  /** Gets the list of supported features from the transmitter certificate. */
  var supportedFeatures: NDCertificateFeature = js.native
}

object INDTransmitterProperties {
  @scala.inline
  def apply(
    certificateType: NDCertificateType,
    clientID: Double,
    expirationDate: js.Date,
    modelDigest: Double,
    modelManufacturerName: String,
    modelName: String,
    modelNumber: String,
    platformIdentifier: NDCertificatePlatformID,
    securityLevel: Double,
    securityVersion: Double,
    supportedFeatures: NDCertificateFeature
  ): INDTransmitterProperties = {
    val __obj = js.Dynamic.literal(certificateType = certificateType.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], modelDigest = modelDigest.asInstanceOf[js.Any], modelManufacturerName = modelManufacturerName.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], platformIdentifier = platformIdentifier.asInstanceOf[js.Any], securityLevel = securityLevel.asInstanceOf[js.Any], securityVersion = securityVersion.asInstanceOf[js.Any], supportedFeatures = supportedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDTransmitterProperties]
  }
  @scala.inline
  implicit class INDTransmitterPropertiesOps[Self <: INDTransmitterProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateType(value: NDCertificateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelDigest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelManufacturerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelManufacturerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformIdentifier(value: NDCertificatePlatformID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedFeatures(value: NDCertificateFeature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

