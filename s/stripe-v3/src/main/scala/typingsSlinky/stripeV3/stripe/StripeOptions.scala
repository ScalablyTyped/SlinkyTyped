package typingsSlinky.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeOptions extends StObject {
  
  var betas: js.UndefOr[js.Array[String]] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var stripeAccount: js.UndefOr[String] = js.native
}
object StripeOptions {
  
  @scala.inline
  def apply(): StripeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeOptions]
  }
  
  @scala.inline
  implicit class StripeOptionsMutableBuilder[Self <: StripeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBetas(value: js.Array[String]): Self = StObject.set(x, "betas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetasUndefined: Self = StObject.set(x, "betas", js.undefined)
    
    @scala.inline
    def setBetasVarargs(value: String*): Self = StObject.set(x, "betas", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
  }
}
