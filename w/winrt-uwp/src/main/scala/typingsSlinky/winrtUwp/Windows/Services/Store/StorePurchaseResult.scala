package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request to purchase an app or product that is offered by the app. */
@js.native
trait StorePurchaseResult extends StObject {
  
  /** Gets the error code for the purchase request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  
  /** Gets the status of the purchase request. */
  var status: StorePurchaseStatus = js.native
}
object StorePurchaseResult {
  
  @scala.inline
  def apply(extendedError: WinRTError, status: StorePurchaseStatus): StorePurchaseResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePurchaseResult]
  }
  
  @scala.inline
  implicit class StorePurchaseResultMutableBuilder[Self <: StorePurchaseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: StorePurchaseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
