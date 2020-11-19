package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/enums/order_cancel_reason", JSImport.Namespace)
@js.native
object orderCancelReasonMod extends js.Object {
  
  trait _OrderCancelReason extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.customer
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.inventory
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.fraud
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.other
    - java.lang.String
  */
  type OrderCancelReason = _OrderCancelReason | String
}
