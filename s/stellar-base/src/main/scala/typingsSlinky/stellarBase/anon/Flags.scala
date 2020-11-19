package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.xdrMod.xdr.Int64
import typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flags extends js.Object {
  
  var amount: Int64 = js.native
  
  var buying: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  var ext: OfferEntryExt = js.native
  
  var flags: Double = js.native
  
  var offerId: Int64 = js.native
  
  var price: typingsSlinky.stellarBase.xdrMod.xdr.Price = js.native
  
  var sellerId: typingsSlinky.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var selling: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
}
object Flags {
  
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
  ): Flags = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], sellerId = sellerId.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: Int64): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Self = this.set("buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: OfferEntryExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferId(value: Int64): Self = this.set("offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: typingsSlinky.stellarBase.xdrMod.xdr.Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerId(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountId): Self = this.set("sellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Self = this.set("selling", value.asInstanceOf[js.Any])
  }
}
