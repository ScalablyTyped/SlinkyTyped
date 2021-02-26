package typingsSlinky.shopifyBuy

import typingsSlinky.shopifyBuy.ShopifyBuy.Client
import typingsSlinky.shopifyBuy.ShopifyBuy.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shopify-buy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("shopify-buy", "NO_IMAGE_URI")
  @js.native
  def NO_IMAGE_URI: String = js.native
  @scala.inline
  def NO_IMAGE_URI_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_IMAGE_URI")(x.asInstanceOf[js.Any])
  
  @JSImport("shopify-buy", "buildClient")
  @js.native
  def buildClient(config: Config): Client = js.native
}
