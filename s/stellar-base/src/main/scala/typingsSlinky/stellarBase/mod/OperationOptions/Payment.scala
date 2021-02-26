package typingsSlinky.stellarBase.mod.OperationOptions

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payment
  extends BaseOptions
     with _OperationOptions {
  
  var amount: String = js.native
  
  var asset: Asset = js.native
  
  var destination: String = js.native
}
object Payment {
  
  @scala.inline
  def apply(amount: String, asset: Asset, destination: String): Payment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment]
  }
  
  @scala.inline
  implicit class PaymentMutableBuilder[Self <: Payment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
