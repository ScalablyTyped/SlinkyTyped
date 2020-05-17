package typingsSlinky.winrtUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveQualityOfServiceMetricResult extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddress: XboxLiveDeviceAddress = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var metric: XboxLiveQualityOfServiceMetric = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: XboxLiveQualityOfServiceMeasurementStatus = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: Double = js.native
}

object XboxLiveQualityOfServiceMetricResult {
  @scala.inline
  def apply(
    deviceAddress: XboxLiveDeviceAddress,
    metric: XboxLiveQualityOfServiceMetric,
    status: XboxLiveQualityOfServiceMeasurementStatus,
    value: Double
  ): XboxLiveQualityOfServiceMetricResult = {
    val __obj = js.Dynamic.literal(deviceAddress = deviceAddress.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveQualityOfServiceMetricResult]
  }
  @scala.inline
  implicit class XboxLiveQualityOfServiceMetricResultOps[Self <: XboxLiveQualityOfServiceMetricResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceAddress(value: XboxLiveDeviceAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetric(value: XboxLiveQualityOfServiceMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: XboxLiveQualityOfServiceMeasurementStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

