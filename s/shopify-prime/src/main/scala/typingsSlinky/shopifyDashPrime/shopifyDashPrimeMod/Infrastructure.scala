package typingsSlinky.shopifyDashPrime.shopifyDashPrimeMod

import typingsSlinky.shopifyDashPrime.Anon_Accept
import typingsSlinky.shopifyDashPrime.Anon_Status
import typingsSlinky.shopifyDashPrime.distInfrastructureShopifyUnderscoreErrorMod.ErrorType1
import typingsSlinky.shopifyDashPrime.distInfrastructureShopifyUnderscoreErrorMod.ErrorType2
import typingsSlinky.shopifyDashPrime.distInfrastructureShopifyUnderscoreErrorMod.ErrorType3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime", "Infrastructure")
@js.native
object Infrastructure extends js.Object {
  @js.native
  class BaseService protected ()
    extends typingsSlinky.shopifyDashPrime.distInfrastructureMod.BaseService {
    def this(shopDomain: String, accessToken: String, resource: String) = this()
  }
  
  @js.native
  class ShopifyError protected ()
    extends typingsSlinky.shopifyDashPrime.distInfrastructureMod.ShopifyError {
    def this(response: Anon_Status, body: ErrorType1) = this()
    def this(response: Anon_Status, body: ErrorType2) = this()
    def this(response: Anon_Status, body: ErrorType3) = this()
  }
  
  /* static members */
  @js.native
  object BaseService extends js.Object {
    def buildDefaultHeaders(): Anon_Accept = js.native
  }
  
}

