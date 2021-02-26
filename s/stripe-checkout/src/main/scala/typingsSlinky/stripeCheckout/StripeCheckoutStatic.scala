package typingsSlinky.stripeCheckout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeCheckoutStatic extends StObject {
  
  def configure(options: StripeCheckoutOptions): StripeCheckoutHandler = js.native
}
object StripeCheckoutStatic {
  
  @scala.inline
  def apply(configure: StripeCheckoutOptions => StripeCheckoutHandler): StripeCheckoutStatic = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[StripeCheckoutStatic]
  }
  
  @scala.inline
  implicit class StripeCheckoutStaticMutableBuilder[Self <: StripeCheckoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigure(value: StripeCheckoutOptions => StripeCheckoutHandler): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
  }
}
