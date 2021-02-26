package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyAmount extends StObject {
  
  var buyAmount: Int64 = js.native
  
  var buying: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  var offerId: Int64 = js.native
  
  var price: typingsSlinky.stellarBase.xdrMod.xdr.Price = js.native
  
  var selling: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
}
object BuyAmount {
  
  @scala.inline
  def apply(
    buyAmount: Int64,
    buying: typingsSlinky.stellarBase.xdrMod.xdr.Asset,
    offerId: Int64,
    price: typingsSlinky.stellarBase.xdrMod.xdr.Price,
    selling: typingsSlinky.stellarBase.xdrMod.xdr.Asset
  ): BuyAmount = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyAmount]
  }
  
  @scala.inline
  implicit class BuyAmountMutableBuilder[Self <: BuyAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyAmount(value: Int64): Self = StObject.set(x, "buyAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferId(value: Int64): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: typingsSlinky.stellarBase.xdrMod.xdr.Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
