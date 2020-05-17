package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the barcode scanner capabilities. */
@js.native
trait BarcodeScannerCapabilities extends js.Object {
  /** Indicates whether the barcode scanner supports image preview. */
  var isImagePreviewSupported: Boolean = js.native
  /** Indicates whether the barcode scanner supports the software trigger functionality. */
  var isSoftwareTriggerSupported: Boolean = js.native
  /** Indicates whether the barcode scanner supports reporting of usage statistics. */
  var isStatisticsReportingSupported: Boolean = js.native
  /** Indicates whether the barcode scanner supports updating or resetting of usage statistics. */
  var isStatisticsUpdatingSupported: Boolean = js.native
  /** Gets the power reporting type for the barcode scanner. */
  var powerReportingType: UnifiedPosPowerReportingType = js.native
}

object BarcodeScannerCapabilities {
  @scala.inline
  def apply(
    isImagePreviewSupported: Boolean,
    isSoftwareTriggerSupported: Boolean,
    isStatisticsReportingSupported: Boolean,
    isStatisticsUpdatingSupported: Boolean,
    powerReportingType: UnifiedPosPowerReportingType
  ): BarcodeScannerCapabilities = {
    val __obj = js.Dynamic.literal(isImagePreviewSupported = isImagePreviewSupported.asInstanceOf[js.Any], isSoftwareTriggerSupported = isSoftwareTriggerSupported.asInstanceOf[js.Any], isStatisticsReportingSupported = isStatisticsReportingSupported.asInstanceOf[js.Any], isStatisticsUpdatingSupported = isStatisticsUpdatingSupported.asInstanceOf[js.Any], powerReportingType = powerReportingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerCapabilities]
  }
  @scala.inline
  implicit class BarcodeScannerCapabilitiesOps[Self <: BarcodeScannerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsImagePreviewSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImagePreviewSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSoftwareTriggerSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSoftwareTriggerSupported")(value.asInstanceOf[js.Any])
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
    def withPowerReportingType(value: UnifiedPosPowerReportingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerReportingType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

