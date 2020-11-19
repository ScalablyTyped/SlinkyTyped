package typingsSlinky.shopifyPrime.shopifyErrorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.shopifyPrime.anon.Status
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/infrastructure/shopify_error", "ShopifyError")
@js.native
class ShopifyError protected () extends Error {
  def this(response: Status, body: ErrorType1) = this()
  def this(response: Status, body: ErrorType2) = this()
  def this(response: Status, body: ErrorType3) = this()
  
  /**
    * True when the requesting application has made too many requests and reached Shopify's API rate limit.
    */
  var apiRateLimitReached: Boolean = js.native
  
  var body: ErrorType1 | ErrorType2 | ErrorType3 = js.native
  
  var errors: StringDictionary[js.Array[String]] = js.native
  
  val isShopifyPrime: Boolean = js.native
  
  var statusCode: Double = js.native
  
  var statusText: String = js.native
}
