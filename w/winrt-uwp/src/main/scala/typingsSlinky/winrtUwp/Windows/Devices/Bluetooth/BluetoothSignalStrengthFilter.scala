package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Groups parameters used to configure received signal strength indicator (RSSI)-based filtering. */
@js.native
trait BluetoothSignalStrengthFilter extends js.Object {
  /** The minimum received signal strength indicator (RSSI) value in dBm on which RSSI events will be propagated or considered in range if the previous events were considered out of range. */
  var inRangeThresholdInDBm: Double = js.native
  /** The minimum received signal strength indicator (RSSI) value in dBm on which RSSI events will be considered out of range. */
  var outOfRangeThresholdInDBm: Double = js.native
  /** The timeout for a received signal strength indicator (RSSI) event to be considered out of range. */
  var outOfRangeTimeout: Double = js.native
  /** The interval at which received signal strength indicator (RSSI) events are sampled. */
  var samplingInterval: Double = js.native
}

object BluetoothSignalStrengthFilter {
  @scala.inline
  def apply(
    inRangeThresholdInDBm: Double,
    outOfRangeThresholdInDBm: Double,
    outOfRangeTimeout: Double,
    samplingInterval: Double
  ): BluetoothSignalStrengthFilter = {
    val __obj = js.Dynamic.literal(inRangeThresholdInDBm = inRangeThresholdInDBm.asInstanceOf[js.Any], outOfRangeThresholdInDBm = outOfRangeThresholdInDBm.asInstanceOf[js.Any], outOfRangeTimeout = outOfRangeTimeout.asInstanceOf[js.Any], samplingInterval = samplingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothSignalStrengthFilter]
  }
  @scala.inline
  implicit class BluetoothSignalStrengthFilterOps[Self <: BluetoothSignalStrengthFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInRangeThresholdInDBm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRangeThresholdInDBm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutOfRangeThresholdInDBm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRangeThresholdInDBm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutOfRangeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRangeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamplingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

