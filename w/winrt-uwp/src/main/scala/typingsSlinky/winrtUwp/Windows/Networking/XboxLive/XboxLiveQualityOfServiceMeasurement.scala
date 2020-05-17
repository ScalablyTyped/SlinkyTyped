package typingsSlinky.winrtUwp.Windows.Networking.XboxLive

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveQualityOfServiceMeasurement extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddresses: IVector[XboxLiveDeviceAddress] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var metricResults: IVectorView[XboxLiveQualityOfServiceMetricResult] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var metrics: IVector[XboxLiveQualityOfServiceMetric] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var numberOfProbesToAttempt: Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var numberOfResultsPending: Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var privatePayloadResults: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var shouldRequestPrivatePayloads: Boolean = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var timeoutInMilliseconds: Double = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResult(deviceAddress: XboxLiveDeviceAddress, metric: XboxLiveQualityOfServiceMetric): XboxLiveQualityOfServiceMetricResult = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResultsForDevice(deviceAddress: XboxLiveDeviceAddress): IVectorView[XboxLiveQualityOfServiceMetricResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResultsForMetric(metric: XboxLiveQualityOfServiceMetric): IVectorView[XboxLiveQualityOfServiceMetricResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getPrivatePayloadResult(deviceAddress: XboxLiveDeviceAddress): XboxLiveQualityOfServicePrivatePayloadResult = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def measureAsync(): IPromiseWithIAsyncAction = js.native
}

object XboxLiveQualityOfServiceMeasurement {
  @scala.inline
  def apply(
    deviceAddresses: IVector[XboxLiveDeviceAddress],
    getMetricResult: (XboxLiveDeviceAddress, XboxLiveQualityOfServiceMetric) => XboxLiveQualityOfServiceMetricResult,
    getMetricResultsForDevice: XboxLiveDeviceAddress => IVectorView[XboxLiveQualityOfServiceMetricResult],
    getMetricResultsForMetric: XboxLiveQualityOfServiceMetric => IVectorView[XboxLiveQualityOfServiceMetricResult],
    getPrivatePayloadResult: XboxLiveDeviceAddress => XboxLiveQualityOfServicePrivatePayloadResult,
    measureAsync: () => IPromiseWithIAsyncAction,
    metricResults: IVectorView[XboxLiveQualityOfServiceMetricResult],
    metrics: IVector[XboxLiveQualityOfServiceMetric],
    numberOfProbesToAttempt: Double,
    numberOfResultsPending: Double,
    privatePayloadResults: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult],
    shouldRequestPrivatePayloads: Boolean,
    timeoutInMilliseconds: Double
  ): XboxLiveQualityOfServiceMeasurement = {
    val __obj = js.Dynamic.literal(deviceAddresses = deviceAddresses.asInstanceOf[js.Any], getMetricResult = js.Any.fromFunction2(getMetricResult), getMetricResultsForDevice = js.Any.fromFunction1(getMetricResultsForDevice), getMetricResultsForMetric = js.Any.fromFunction1(getMetricResultsForMetric), getPrivatePayloadResult = js.Any.fromFunction1(getPrivatePayloadResult), measureAsync = js.Any.fromFunction0(measureAsync), metricResults = metricResults.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], numberOfProbesToAttempt = numberOfProbesToAttempt.asInstanceOf[js.Any], numberOfResultsPending = numberOfResultsPending.asInstanceOf[js.Any], privatePayloadResults = privatePayloadResults.asInstanceOf[js.Any], shouldRequestPrivatePayloads = shouldRequestPrivatePayloads.asInstanceOf[js.Any], timeoutInMilliseconds = timeoutInMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveQualityOfServiceMeasurement]
  }
  @scala.inline
  implicit class XboxLiveQualityOfServiceMeasurementOps[Self <: XboxLiveQualityOfServiceMeasurement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceAddresses(value: IVector[XboxLiveDeviceAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMetricResult(
      value: (XboxLiveDeviceAddress, XboxLiveQualityOfServiceMetric) => XboxLiveQualityOfServiceMetricResult
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetricResult")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetMetricResultsForDevice(value: XboxLiveDeviceAddress => IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetricResultsForDevice")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMetricResultsForMetric(value: XboxLiveQualityOfServiceMetric => IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetricResultsForMetric")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPrivatePayloadResult(value: XboxLiveDeviceAddress => XboxLiveQualityOfServicePrivatePayloadResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrivatePayloadResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMeasureAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMetricResults(value: IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: IVector[XboxLiveQualityOfServiceMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfProbesToAttempt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfProbesToAttempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfResultsPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfResultsPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivatePayloadResults(value: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privatePayloadResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldRequestPrivatePayloads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRequestPrivatePayloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutInMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

