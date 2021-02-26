package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the cash drawer capabilities. */
@js.native
trait CashDrawerCapabilities extends StObject {
  
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
  implicit class CashDrawerCapabilitiesMutableBuilder[Self <: CashDrawerCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDrawerOpenSensorAvailable(value: Boolean): Self = StObject.set(x, "isDrawerOpenSensorAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsReportingSupported(value: Boolean): Self = StObject.set(x, "isStatisticsReportingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsUpdatingSupported(value: Boolean): Self = StObject.set(x, "isStatisticsUpdatingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatusMultiDrawerDetectSupported(value: Boolean): Self = StObject.set(x, "isStatusMultiDrawerDetectSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatusReportingSupported(value: Boolean): Self = StObject.set(x, "isStatusReportingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerReportingType(value: UnifiedPosPowerReportingType): Self = StObject.set(x, "powerReportingType", value.asInstanceOf[js.Any])
  }
}
