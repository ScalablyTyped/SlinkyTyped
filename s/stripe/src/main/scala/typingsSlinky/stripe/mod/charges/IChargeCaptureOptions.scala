package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.mod.IDataOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChargeCaptureOptions extends IDataOptions {
  
  /**
    * A positive integer in the smallest currency unit (e.g 100 cents to charge
    * $1.00, or 1 to charge ¥1, a 0-decimal currency) representing how much to
    * charge the card. The minimum amount is £0.50 (or equivalent in charge
    * currency).
    */
  var amount: js.UndefOr[Double] = js.native
}
object IChargeCaptureOptions {
  
  @scala.inline
  def apply(): IChargeCaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChargeCaptureOptions]
  }
  
  @scala.inline
  implicit class IChargeCaptureOptionsMutableBuilder[Self <: IChargeCaptureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
  }
}
