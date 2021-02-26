package typingsSlinky.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShopResource extends StObject {
  
  def fetchInfo(): js.Promise[Shop] = js.native
  
  def fetchPolicies(): js.Promise[Shop] = js.native
}
object ShopResource {
  
  @scala.inline
  def apply(fetchInfo: () => js.Promise[Shop], fetchPolicies: () => js.Promise[Shop]): ShopResource = {
    val __obj = js.Dynamic.literal(fetchInfo = js.Any.fromFunction0(fetchInfo), fetchPolicies = js.Any.fromFunction0(fetchPolicies))
    __obj.asInstanceOf[ShopResource]
  }
  
  @scala.inline
  implicit class ShopResourceMutableBuilder[Self <: ShopResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchInfo(value: () => js.Promise[Shop]): Self = StObject.set(x, "fetchInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFetchPolicies(value: () => js.Promise[Shop]): Self = StObject.set(x, "fetchPolicies", js.Any.fromFunction0(value))
  }
}
