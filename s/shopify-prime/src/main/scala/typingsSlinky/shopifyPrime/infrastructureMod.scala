package typingsSlinky.shopifyPrime

import typingsSlinky.shopifyPrime.anon.Accept
import typingsSlinky.shopifyPrime.anon.Status
import typingsSlinky.shopifyPrime.shopifyErrorMod.ErrorType1
import typingsSlinky.shopifyPrime.shopifyErrorMod.ErrorType2
import typingsSlinky.shopifyPrime.shopifyErrorMod.ErrorType3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/infrastructure", JSImport.Namespace)
@js.native
object infrastructureMod extends js.Object {
  
  @js.native
  class BaseService protected ()
    extends typingsSlinky.shopifyPrime.baseServiceMod.BaseService {
    def this(shopDomain: String, accessToken: String, resource: String) = this()
  }
  /* static members */
  @js.native
  object BaseService extends js.Object {
    
    def buildDefaultHeaders(): Accept = js.native
  }
  
  @js.native
  class ShopifyError protected ()
    extends typingsSlinky.shopifyPrime.shopifyErrorMod.ShopifyError {
    def this(response: Status, body: ErrorType1) = this()
    def this(response: Status, body: ErrorType2) = this()
    def this(response: Status, body: ErrorType3) = this()
  }
}
