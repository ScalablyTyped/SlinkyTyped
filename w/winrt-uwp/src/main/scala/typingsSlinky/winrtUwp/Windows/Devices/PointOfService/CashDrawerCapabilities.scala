package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the cash drawer capabilities. */
@js.native
trait CashDrawerCapabilities extends js.Object {
  /** Indicated whether cash drawer open sensor is available. */
  var isDrawerOpenSensorAvailable: Boolean = js.native
  /** Whether statistics reporting is supported by the cash drawer. */
  var isStatisticsReportingSupported: Boolean = js.native
  /** Whether statistics updating is supported by the cash drawer. */
  var isStatisticsUpdatingSupported: Boolean = js.native
  /** Whether the status from multiple drawers is supported. */
  var isStatusMultiDrawerDetectSupported: Boolean = js.native
  /** Whether status reporting is supported by the cash drawer. */
  var isStatusReportingSupported: Boolean = js.native
  /** Whether the cash drawer has standard or advanced power reporting. */
  var powerReportingType: UnifiedPosPowerReportingType = js.native
}

object CashDrawerCapabilities {
  @scala.inline
  def apply(
    isDrawerOpenSensorAvailable: Boolean,
    isStatisticsReportingSupported: Boolean,
    isStatisticsUpdatingSupported: Boolean,
    isStatusMultiDrawerDetectSupported: Boolean,
    isStatusReportingSupported: Boolean,
    powerReportingType: UnifiedPosPowerReportingType
  ): CashDrawerCapabilities = {
    val __obj = js.Dynamic.literal(isDrawerOpenSensorAvailable = isDrawerOpenSensorAvailable.asInstanceOf[js.Any], isStatisticsReportingSupported = isStatisticsReportingSupported.asInstanceOf[js.Any], isStatisticsUpdatingSupported = isStatisticsUpdatingSupported.asInstanceOf[js.Any], isStatusMultiDrawerDetectSupported = isStatusMultiDrawerDetectSupported.asInstanceOf[js.Any], isStatusReportingSupported = isStatusReportingSupported.asInstanceOf[js.Any], powerReportingType = powerReportingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerCapabilities]
  }
  @scala.inline
  implicit class CashDrawerCapabilitiesOps[Self <: CashDrawerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDrawerOpenSensorAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDrawerOpenSensorAvailable")(value.asInstanceOf[js.Any])
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
    def withIsStatusMultiDrawerDetectSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatusMultiDrawerDetectSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStatusReportingSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatusReportingSupported")(value.asInstanceOf[js.Any])
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

