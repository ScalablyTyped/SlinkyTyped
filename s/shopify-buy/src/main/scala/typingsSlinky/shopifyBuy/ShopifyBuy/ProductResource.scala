package typingsSlinky.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductResource extends StObject {
  
  def fetch(id: String): js.Promise[Product] = js.native
  
  def fetchAll(): js.Promise[js.Array[Product]] = js.native
  def fetchAll(pageSizeopt: Double): js.Promise[js.Array[Product]] = js.native
  
  def fetchByHandle(handle: String): js.Promise[Product] = js.native
  
  def fetchMultiple(ids: js.Array[String]): js.Promise[js.Array[Product]] = js.native
  
  def fetchQuery(query: Query): js.Promise[js.Array[Product]] = js.native
  
  /**
    *   Product Helper Namespace
    *   @link https://shopify.github.io/js-buy-sdk/ProductResource.html
    */
  def variantForOptions(product: Product, options: Option): ProductVariant = js.native
}
