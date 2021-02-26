package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmountAsset extends StObject {
  
  var amount: Int64 = js.native
  
  var asset: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  var destination: typingsSlinky.stellarBase.xdrMod.xdr.AccountId = js.native
}
object AmountAsset {
  
  @scala.inline
  def apply(
    amount: Int64,
    asset: typingsSlinky.stellarBase.xdrMod.xdr.Asset,
    destination: typingsSlinky.stellarBase.xdrMod.xdr.AccountId
  ): AmountAsset = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountAsset]
  }
  
  @scala.inline
  implicit class AmountAssetMutableBuilder[Self <: AmountAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Int64): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
