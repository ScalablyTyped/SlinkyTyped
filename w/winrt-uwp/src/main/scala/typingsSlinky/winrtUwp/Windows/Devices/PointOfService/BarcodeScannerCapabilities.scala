package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the barcode scanner capabilities. */
@js.native
trait BarcodeScannerCapabilities extends StObject {
  
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
  implicit class BarcodeScannerCapabilitiesMutableBuilder[Self <: BarcodeScannerCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsImagePreviewSupported(value: Boolean): Self = StObject.set(x, "isImagePreviewSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSoftwareTriggerSupported(value: Boolean): Self = StObject.set(x, "isSoftwareTriggerSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsReportingSupported(value: Boolean): Self = StObject.set(x, "isStatisticsReportingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsUpdatingSupported(value: Boolean): Self = StObject.set(x, "isStatisticsUpdatingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerReportingType(value: UnifiedPosPowerReportingType): Self = StObject.set(x, "powerReportingType", value.asInstanceOf[js.Any])
  }
}
