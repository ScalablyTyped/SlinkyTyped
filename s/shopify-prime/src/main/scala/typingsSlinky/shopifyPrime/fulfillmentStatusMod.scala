package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/enums/fulfillment_status", JSImport.Namespace)
@js.native
object fulfillmentStatusMod extends js.Object {
  
  trait _FulfillmentStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.shipped
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.partial
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.unshipped
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.any
    - java.lang.String
  */
  type FulfillmentStatus = _FulfillmentStatus | String
}
