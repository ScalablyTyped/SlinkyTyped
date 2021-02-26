package typingsSlinky.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Retargeting {
  
  @js.native
  trait API extends StObject {
    
    def Add(audienceId: Double): Unit = js.native
    
    def Event(eventName: String): Unit = js.native
    
    def Hit(): Unit = js.native
    
    def Init(code: String): Unit = js.native
    
    def ProductEvent(priceListId: Double, eventName: typingsSlinky.vkOpenapi.vk.OpenAPI.Retargeting.ProductEvent): Unit = js.native
    def ProductEvent(
      priceListId: Double,
      eventName: typingsSlinky.vkOpenapi.vk.OpenAPI.Retargeting.ProductEvent,
      eventParams: ProductEventParams
    ): Unit = js.native
  }
  
  @js.native
  trait Product extends StObject {
    
    var group_id: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var price: js.UndefOr[Double] = js.native
    
    var price_from: js.UndefOr[NumericBoolean] = js.native
    
    var price_old: js.UndefOr[Double] = js.native
    
    var recommended_ids: js.UndefOr[String] = js.native
  }
  object Product {
    
    @scala.inline
    def apply(id: String): Product = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Product]
    }
    
    @scala.inline
    implicit class ProductMutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup_id(value: String): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup_idUndefined: Self = StObject.set(x, "group_id", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      @scala.inline
      def setPrice_from(value: NumericBoolean): Self = StObject.set(x, "price_from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice_fromUndefined: Self = StObject.set(x, "price_from", js.undefined)
      
      @scala.inline
      def setPrice_old(value: Double): Self = StObject.set(x, "price_old", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice_oldUndefined: Self = StObject.set(x, "price_old", js.undefined)
      
      @scala.inline
      def setRecommended_ids(value: String): Self = StObject.set(x, "recommended_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecommended_idsUndefined: Self = StObject.set(x, "recommended_ids", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.view_home
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.view_category
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.view_product
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.view_search
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.view_other
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_wishlist
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_cart
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.remove_from_wishlist
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.remove_from_cart
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.init_checkout
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.add_payment_info
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.purchase
  */
  trait ProductEvent extends StObject
  object ProductEvent {
    
    @scala.inline
    def add_payment_info: typingsSlinky.vkOpenapi.vkOpenapiStrings.add_payment_info = "add_payment_info".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.add_payment_info]
    
    @scala.inline
    def add_to_cart: typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_cart = "add_to_cart".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_cart]
    
    @scala.inline
    def add_to_wishlist: typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_wishlist]
    
    @scala.inline
    def init_checkout: typingsSlinky.vkOpenapi.vkOpenapiStrings.init_checkout = "init_checkout".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.init_checkout]
    
    @scala.inline
    def purchase: typingsSlinky.vkOpenapi.vkOpenapiStrings.purchase = "purchase".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.purchase]
    
    @scala.inline
    def remove_from_cart: typingsSlinky.vkOpenapi.vkOpenapiStrings.remove_from_cart = "remove_from_cart".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.remove_from_cart]
    
    @scala.inline
    def remove_from_wishlist: typingsSlinky.vkOpenapi.vkOpenapiStrings.remove_from_wishlist = "remove_from_wishlist".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.remove_from_wishlist]
    
    @scala.inline
    def view_category: typingsSlinky.vkOpenapi.vkOpenapiStrings.view_category = "view_category".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.view_category]
    
    @scala.inline
    def view_home: typingsSlinky.vkOpenapi.vkOpenapiStrings.view_home = "view_home".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.view_home]
    
    @scala.inline
    def view_other: typingsSlinky.vkOpenapi.vkOpenapiStrings.view_other = "view_other".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.view_other]
    
    @scala.inline
    def view_product: typingsSlinky.vkOpenapi.vkOpenapiStrings.view_product = "view_product".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.view_product]
    
    @scala.inline
    def view_search: typingsSlinky.vkOpenapi.vkOpenapiStrings.view_search = "view_search".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.view_search]
  }
  
  @js.native
  trait ProductEventParams extends StObject {
    
    var business_value: js.UndefOr[Double] = js.native
    
    var category_ids: js.UndefOr[String] = js.native
    
    var currency_code: js.UndefOr[String] = js.native
    
    var products: js.UndefOr[js.Array[Product]] = js.native
    
    var products_recommended_ids: js.UndefOr[String] = js.native
    
    var search_string: js.UndefOr[String] = js.native
    
    var total_price: js.UndefOr[Double] = js.native
  }
  object ProductEventParams {
    
    @scala.inline
    def apply(): ProductEventParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProductEventParams]
    }
    
    @scala.inline
    implicit class ProductEventParamsMutableBuilder[Self <: ProductEventParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusiness_value(value: Double): Self = StObject.set(x, "business_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusiness_valueUndefined: Self = StObject.set(x, "business_value", js.undefined)
      
      @scala.inline
      def setCategory_ids(value: String): Self = StObject.set(x, "category_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategory_idsUndefined: Self = StObject.set(x, "category_ids", js.undefined)
      
      @scala.inline
      def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency_codeUndefined: Self = StObject.set(x, "currency_code", js.undefined)
      
      @scala.inline
      def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
      
      @scala.inline
      def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value :_*))
      
      @scala.inline
      def setProducts_recommended_ids(value: String): Self = StObject.set(x, "products_recommended_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProducts_recommended_idsUndefined: Self = StObject.set(x, "products_recommended_ids", js.undefined)
      
      @scala.inline
      def setSearch_string(value: String): Self = StObject.set(x, "search_string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_stringUndefined: Self = StObject.set(x, "search_string", js.undefined)
      
      @scala.inline
      def setTotal_price(value: Double): Self = StObject.set(x, "total_price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_priceUndefined: Self = StObject.set(x, "total_price", js.undefined)
    }
  }
}
