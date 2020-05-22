package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/financial_status", JSImport.Namespace)
@js.native
object financialStatusMod extends js.Object {
  trait _FinancialStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.authorized
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.pending
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.paid
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.partially_paid
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.refunded
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.voided
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.partially_refunded
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.unpaid
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.any
    - java.lang.String
  */
  type FinancialStatus = _FinancialStatus | String
}

