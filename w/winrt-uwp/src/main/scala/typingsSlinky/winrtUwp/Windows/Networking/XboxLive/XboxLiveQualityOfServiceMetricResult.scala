package typingsSlinky.winrtUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveQualityOfServiceMetricResult extends StObject {
  
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
  implicit class XboxLiveQualityOfServiceMetricResultMutableBuilder[Self <: XboxLiveQualityOfServiceMetricResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceAddress(value: XboxLiveDeviceAddress): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: XboxLiveQualityOfServiceMetric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: XboxLiveQualityOfServiceMeasurementStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
