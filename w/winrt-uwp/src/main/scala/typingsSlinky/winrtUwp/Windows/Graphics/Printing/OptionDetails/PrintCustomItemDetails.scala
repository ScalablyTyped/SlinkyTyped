package typingsSlinky.winrtUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows apps to add a collection of enumerable options to the app print experience. */
@js.native
trait PrintCustomItemDetails extends StObject {
  
  /** Gets or sets the display name of the custom print task option item. */
  var itemDisplayName: String = js.native
  
  /** Gets the ID of the custom print task option item. */
  var itemId: String = js.native
}
object PrintCustomItemDetails {
  
  @scala.inline
  def apply(itemDisplayName: String, itemId: String): PrintCustomItemDetails = {
    val __obj = js.Dynamic.literal(itemDisplayName = itemDisplayName.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCustomItemDetails]
  }
  
  @scala.inline
  implicit class PrintCustomItemDetailsMutableBuilder[Self <: PrintCustomItemDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemDisplayName(value: String): Self = StObject.set(x, "itemDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
  }
}
