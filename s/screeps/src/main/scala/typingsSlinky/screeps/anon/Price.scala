package typingsSlinky.screeps.anon

import typingsSlinky.screeps.MarketResourceConstant
import typingsSlinky.screeps.ORDER_BUY
import typingsSlinky.screeps.ORDER_SELL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Price extends StObject {
  
  var price: Double = js.native
  
  var resourceType: MarketResourceConstant = js.native
  
  var roomName: js.UndefOr[String] = js.native
  
  var totalAmount: Double = js.native
  
  var `type`: ORDER_BUY | ORDER_SELL = js.native
}
object Price {
  
  @scala.inline
  def apply(
    price: Double,
    resourceType: MarketResourceConstant,
    totalAmount: Double,
    `type`: ORDER_BUY | ORDER_SELL
  ): Price = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], totalAmount = totalAmount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
  
  @scala.inline
  implicit class PriceMutableBuilder[Self <: Price] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: MarketResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    
    @scala.inline
    def setTotalAmount(value: Double): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ORDER_BUY | ORDER_SELL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
