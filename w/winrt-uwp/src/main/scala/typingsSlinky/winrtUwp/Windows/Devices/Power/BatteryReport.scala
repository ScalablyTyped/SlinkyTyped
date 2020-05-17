package typingsSlinky.winrtUwp.Windows.Devices.Power

import typingsSlinky.winrtUwp.Windows.System.Power.BatteryStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
@js.native
trait BatteryReport extends js.Object {
  /** Gets the rate that the battery is charging. */
  var chargeRateInMilliwatts: Double = js.native
  /** Gets the estimated energy capacity of a new battery of this type. */
  var designCapacityInMilliwattHours: Double = js.native
  /** Gets the fully-charged energy capacity of the battery. */
  var fullChargeCapacityInMilliwattHours: Double = js.native
  /** Gets the remaining power capacity of the battery. */
  var remainingCapacityInMilliwattHours: Double = js.native
  /** Gets a BatteryStatus enumeration that indicates the status of the battery. */
  var status: BatteryStatus = js.native
}

object BatteryReport {
  @scala.inline
  def apply(
    chargeRateInMilliwatts: Double,
    designCapacityInMilliwattHours: Double,
    fullChargeCapacityInMilliwattHours: Double,
    remainingCapacityInMilliwattHours: Double,
    status: BatteryStatus
  ): BatteryReport = {
    val __obj = js.Dynamic.literal(chargeRateInMilliwatts = chargeRateInMilliwatts.asInstanceOf[js.Any], designCapacityInMilliwattHours = designCapacityInMilliwattHours.asInstanceOf[js.Any], fullChargeCapacityInMilliwattHours = fullChargeCapacityInMilliwattHours.asInstanceOf[js.Any], remainingCapacityInMilliwattHours = remainingCapacityInMilliwattHours.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatteryReport]
  }
  @scala.inline
  implicit class BatteryReportOps[Self <: BatteryReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChargeRateInMilliwatts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chargeRateInMilliwatts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesignCapacityInMilliwattHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designCapacityInMilliwattHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullChargeCapacityInMilliwattHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullChargeCapacityInMilliwattHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainingCapacityInMilliwattHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingCapacityInMilliwattHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: BatteryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

