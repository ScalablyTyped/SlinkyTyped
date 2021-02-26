package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a radio state change notification. */
@js.native
trait MobileBroadbandRadioStateChangeTriggerDetails extends StObject {
  
  /** Gets the collection of radio state change details associated with a notification. */
  var radioStateChanges: IVectorView[MobileBroadbandRadioStateChange] = js.native
}
object MobileBroadbandRadioStateChangeTriggerDetails {
  
  @scala.inline
  def apply(radioStateChanges: IVectorView[MobileBroadbandRadioStateChange]): MobileBroadbandRadioStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(radioStateChanges = radioStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandRadioStateChangeTriggerDetails]
  }
  
  @scala.inline
  implicit class MobileBroadbandRadioStateChangeTriggerDetailsMutableBuilder[Self <: MobileBroadbandRadioStateChangeTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadioStateChanges(value: IVectorView[MobileBroadbandRadioStateChange]): Self = StObject.set(x, "radioStateChanges", value.asInstanceOf[js.Any])
  }
}
