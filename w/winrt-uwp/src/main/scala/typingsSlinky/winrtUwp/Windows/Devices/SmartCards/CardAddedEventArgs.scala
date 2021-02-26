package typingsSlinky.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CardAdded event. */
@js.native
trait CardAddedEventArgs extends StObject {
  
  /** Gets info about the smart card that was inserted into the smart card reader. */
  var smartCard: SmartCard = js.native
}
object CardAddedEventArgs {
  
  @scala.inline
  def apply(smartCard: SmartCard): CardAddedEventArgs = {
    val __obj = js.Dynamic.literal(smartCard = smartCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardAddedEventArgs]
  }
  
  @scala.inline
  implicit class CardAddedEventArgsMutableBuilder[Self <: CardAddedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSmartCard(value: SmartCard): Self = StObject.set(x, "smartCard", value.asInstanceOf[js.Any])
  }
}
