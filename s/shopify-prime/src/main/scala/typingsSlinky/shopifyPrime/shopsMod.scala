package typingsSlinky.shopifyPrime

import typingsSlinky.shopifyPrime.infrastructureMod.BaseService
import typingsSlinky.shopifyPrime.optionsBaseMod.FieldOptions
import typingsSlinky.shopifyPrime.shopMod.Shop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/services/shops", JSImport.Namespace)
@js.native
object shopsMod extends js.Object {
  
  @js.native
  class Shops protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    
    /**
      * Forces the shop to uninstall your Shopify app. Uninstalling an application is an irreversible operation. Be entirely sure that you no longer need to make API calls for the shop in which the application has been installed.
      */
    def forceUninstallApp(): js.Promise[Unit] = js.native
    
    /**
      * Returns shop data for the shop.
      * @param options Options for filtering the result.
      */
    def get(): js.Promise[Shop] = js.native
    def get(options: FieldOptions): js.Promise[Shop] = js.native
  }
  
  @js.native
  class default protected () extends Shops {
    def this(shopDomain: String, accessToken: String) = this()
  }
}
