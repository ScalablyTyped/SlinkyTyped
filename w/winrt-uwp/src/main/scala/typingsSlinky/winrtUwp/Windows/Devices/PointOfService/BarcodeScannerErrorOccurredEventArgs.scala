package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ErrorOccurred event. */
@js.native
trait BarcodeScannerErrorOccurredEventArgs extends StObject {
  
  /** Gets the data associated with the ErrorOccurred event. */
  var errorData: UnifiedPosErrorData = js.native
  
  /** Indicates whether it is worthwhile to make another attempt at the operation. */
  var isRetriable: Boolean = js.native
  
  /** Gets any data that was successfully read. */
  var partialInputData: BarcodeScannerReport = js.native
}
object BarcodeScannerErrorOccurredEventArgs {
  
  @scala.inline
  def apply(errorData: UnifiedPosErrorData, isRetriable: Boolean, partialInputData: BarcodeScannerReport): BarcodeScannerErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], isRetriable = isRetriable.asInstanceOf[js.Any], partialInputData = partialInputData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerErrorOccurredEventArgs]
  }
  
  @scala.inline
  implicit class BarcodeScannerErrorOccurredEventArgsMutableBuilder[Self <: BarcodeScannerErrorOccurredEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorData(value: UnifiedPosErrorData): Self = StObject.set(x, "errorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRetriable(value: Boolean): Self = StObject.set(x, "isRetriable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialInputData(value: BarcodeScannerReport): Self = StObject.set(x, "partialInputData", value.asInstanceOf[js.Any])
  }
}
