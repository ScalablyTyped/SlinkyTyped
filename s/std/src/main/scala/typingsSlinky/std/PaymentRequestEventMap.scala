package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentRequestEventMap extends StObject {
  
  var shippingaddresschange: org.scalajs.dom.raw.Event = js.native
  
  var shippingoptionchange: org.scalajs.dom.raw.Event = js.native
}
object PaymentRequestEventMap {
  
  @scala.inline
  def apply(shippingaddresschange: org.scalajs.dom.raw.Event, shippingoptionchange: org.scalajs.dom.raw.Event): PaymentRequestEventMap = {
    val __obj = js.Dynamic.literal(shippingaddresschange = shippingaddresschange.asInstanceOf[js.Any], shippingoptionchange = shippingoptionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestEventMap]
  }
  
  @scala.inline
  implicit class PaymentRequestEventMapMutableBuilder[Self <: PaymentRequestEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShippingaddresschange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "shippingaddresschange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingoptionchange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "shippingoptionchange", value.asInstanceOf[js.Any])
  }
}
