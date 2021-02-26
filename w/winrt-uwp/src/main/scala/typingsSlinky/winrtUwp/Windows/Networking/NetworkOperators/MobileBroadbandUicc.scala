package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Universal Integrated Circuit Card (UICC), normally called a SIM Card on a mobile broadband device. */
@js.native
trait MobileBroadbandUicc extends StObject {
  
  /**
    * Asynchronously retrieves a list of mobile broadband UICC (SIM card) applications.
    * @return An asynchronous retrieval operation. On successful completion, returns an object with the results of the retrieval operation.
    */
  def getUiccAppsAsync(): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult] = js.native
  
  /** Gets the unique SIM Card identity on a mobile broadband device. */
  var simIccId: String = js.native
}
object MobileBroadbandUicc {
  
  @scala.inline
  def apply(
    getUiccAppsAsync: () => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult],
    simIccId: String
  ): MobileBroadbandUicc = {
    val __obj = js.Dynamic.literal(getUiccAppsAsync = js.Any.fromFunction0(getUiccAppsAsync), simIccId = simIccId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUicc]
  }
  
  @scala.inline
  implicit class MobileBroadbandUiccMutableBuilder[Self <: MobileBroadbandUicc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUiccAppsAsync(value: () => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult]): Self = StObject.set(x, "getUiccAppsAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSimIccId(value: String): Self = StObject.set(x, "simIccId", value.asInstanceOf[js.Any])
  }
}
