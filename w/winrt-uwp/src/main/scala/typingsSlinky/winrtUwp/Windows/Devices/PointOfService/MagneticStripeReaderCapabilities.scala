package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides capabilities information for the magnetic stripe reader. */
@js.native
trait MagneticStripeReaderCapabilities extends js.Object {
  /** Gets the authentication level supported by the device. */
  var authenticationLevel: MagneticStripeReaderAuthenticationLevel = js.native
  /** Gets the type of card authentication data that is supported by the device. */
  var cardAuthentication: String = js.native
  /** Indicates whether the device supports ISO cards. */
  var isIsoSupported: Boolean = js.native
  /** Indicates whether device supports JIS Type-I cards. */
  var isJisOneSupported: Boolean = js.native
  /** Indicates whether the device supports JIS Type-II cards. */
  var isJisTwoSupported: Boolean = js.native
  /** Indicates whether the device supports reporting of usage statistics. */
  var isStatisticsReportingSupported: Boolean = js.native
  /** Indicates whether the device supports updating of usage statistics. */
  var isStatisticsUpdatingSupported: Boolean = js.native
  /** Indicates whether the device is capable of masking track data. */
  var isTrackDataMaskingSupported: Boolean = js.native
  /** Indicates whether the devices is able to transmit start and end sentinels. */
  var isTransmitSentinelsSupported: Boolean = js.native
  /** Gets the power reporting capabilities of the device. */
  var powerReportingType: UnifiedPosPowerReportingType = js.native
  /** Gets the supported encryption algorithm. */
  var supportedEncryptionAlgorithms: Double = js.native
}

object MagneticStripeReaderCapabilities {
  @scala.inline
  def apply(
    authenticationLevel: MagneticStripeReaderAuthenticationLevel,
    cardAuthentication: String,
    isIsoSupported: Boolean,
    isJisOneSupported: Boolean,
    isJisTwoSupported: Boolean,
    isStatisticsReportingSupported: Boolean,
    isStatisticsUpdatingSupported: Boolean,
    isTrackDataMaskingSupported: Boolean,
    isTransmitSentinelsSupported: Boolean,
    powerReportingType: UnifiedPosPowerReportingType,
    supportedEncryptionAlgorithms: Double
  ): MagneticStripeReaderCapabilities = {
    val __obj = js.Dynamic.literal(authenticationLevel = authenticationLevel.asInstanceOf[js.Any], cardAuthentication = cardAuthentication.asInstanceOf[js.Any], isIsoSupported = isIsoSupported.asInstanceOf[js.Any], isJisOneSupported = isJisOneSupported.asInstanceOf[js.Any], isJisTwoSupported = isJisTwoSupported.asInstanceOf[js.Any], isStatisticsReportingSupported = isStatisticsReportingSupported.asInstanceOf[js.Any], isStatisticsUpdatingSupported = isStatisticsUpdatingSupported.asInstanceOf[js.Any], isTrackDataMaskingSupported = isTrackDataMaskingSupported.asInstanceOf[js.Any], isTransmitSentinelsSupported = isTransmitSentinelsSupported.asInstanceOf[js.Any], powerReportingType = powerReportingType.asInstanceOf[js.Any], supportedEncryptionAlgorithms = supportedEncryptionAlgorithms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderCapabilities]
  }
  @scala.inline
  implicit class MagneticStripeReaderCapabilitiesOps[Self <: MagneticStripeReaderCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationLevel(value: MagneticStripeReaderAuthenticationLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardAuthentication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIsoSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIsoSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsJisOneSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJisOneSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsJisTwoSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJisTwoSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStatisticsReportingSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatisticsReportingSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStatisticsUpdatingSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatisticsUpdatingSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTrackDataMaskingSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrackDataMaskingSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTransmitSentinelsSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransmitSentinelsSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerReportingType(value: UnifiedPosPowerReportingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerReportingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedEncryptionAlgorithms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedEncryptionAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

