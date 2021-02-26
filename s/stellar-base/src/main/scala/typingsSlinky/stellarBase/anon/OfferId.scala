package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.xdrMod.xdr.Int64
import typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferId extends StObject {
  
  var amount: Int64 = js.native
  
  var buying: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  var ext: OfferEntryExt = js.native
  
  var flags: Double = js.native
  
  var offerId: Int64 = js.native
  
  var price: typingsSlinky.stellarBase.xdrMod.xdr.Price = js.native
  
  var sellerId: typingsSlinky.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var selling: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
}
object OfferId {
  
  @scala.inline
  def apply(
    amount: Int64,
    buying: typingsSlinky.stellarBase.xdrMod.xdr.Asset,
    ext: OfferEntryExt,
    flags: Double,
    offerId: Int64,
    price: typingsSlinky.stellarBase.xdrMod.xdr.Price,
    sellerId: typingsSlinky.stellarBase.xdrMod.xdr.AccountId,
    selling: typingsSlinky.stellarBase.xdrMod.xdr.Asset
  ): OfferId = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], sellerId = sellerId.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferId]
  }
  
  @scala.inline
  implicit class OfferIdMutableBuilder[Self <: OfferId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Int64): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: OfferEntryExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferId(value: Int64): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: typingsSlinky.stellarBase.xdrMod.xdr.Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerId(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "sellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
