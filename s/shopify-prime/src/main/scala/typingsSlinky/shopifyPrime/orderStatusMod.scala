package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/enums/order_status", JSImport.Namespace)
@js.native
object orderStatusMod extends js.Object {
  
  trait _OrderStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.open
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.closed
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.cancelled
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.any
    - java.lang.String
  */
  type OrderStatus = _OrderStatus | String
}
