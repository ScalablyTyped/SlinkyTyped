package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.xdrMod.xdr.Claimant
import typingsSlinky.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Claimants extends StObject {
  
  var amount: Int64 = js.native
  
  var asset: typingsSlinky.stellarBase.xdrMod.xdr.Asset = js.native
  
  var claimants: js.Array[Claimant] = js.native
}
object Claimants {
  
  @scala.inline
  def apply(amount: Int64, asset: typingsSlinky.stellarBase.xdrMod.xdr.Asset, claimants: js.Array[Claimant]): Claimants = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], claimants = claimants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Claimants]
  }
  
  @scala.inline
  implicit class ClaimantsMutableBuilder[Self <: Claimants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Int64): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimants(value: js.Array[Claimant]): Self = StObject.set(x, "claimants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimantsVarargs(value: Claimant*): Self = StObject.set(x, "claimants", js.Array(value :_*))
  }
}
