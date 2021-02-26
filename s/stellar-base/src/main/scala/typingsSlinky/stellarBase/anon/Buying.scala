package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buying extends StObject {
  
  var amount: Int64 = js.native
  
  var buying: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  var offerId: Int64 = js.native
  
  var price: typingsSlinky.stellarBase.xdrMod.xdr.Price = js.native
  
  var selling: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
}
object Buying {
  
  @scala.inline
  def apply(
    amount: Int64,
    buying: typingsSlinky.stellarBase.xdrMod.xdr.Asset,
    offerId: Int64,
    price: typingsSlinky.stellarBase.xdrMod.xdr.Price,
    selling: typingsSlinky.stellarBase.xdrMod.xdr.Asset
  ): Buying = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buying]
  }
  
  @scala.inline
  implicit class BuyingMutableBuilder[Self <: Buying] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Int64): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
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
