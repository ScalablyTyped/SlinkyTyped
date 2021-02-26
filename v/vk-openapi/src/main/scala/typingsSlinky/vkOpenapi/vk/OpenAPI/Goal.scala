package typingsSlinky.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Goal {
  
  type API = js.Function2[/* goalEvent */ GoalEvent, /* goalParams */ js.UndefOr[GoalParams], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_cart
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_wishlist
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.customize_product
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.initiate_checkout
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.add_payment_info
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.purchase
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.contact
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.lead
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.schedule
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.complete_registration
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.submit_application
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.start_trial
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.subscribe
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.page_view
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.view_content
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.search
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.find_location
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.donate
    - typingsSlinky.vkOpenapi.vkOpenapiStrings.conversion
  */
  trait GoalEvent extends StObject
  object GoalEvent {
    
    @scala.inline
    def add_payment_info: typingsSlinky.vkOpenapi.vkOpenapiStrings.add_payment_info = "add_payment_info".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.add_payment_info]
    
    @scala.inline
    def add_to_cart: typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_cart = "add_to_cart".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_cart]
    
    @scala.inline
    def add_to_wishlist: typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.add_to_wishlist]
    
    @scala.inline
    def complete_registration: typingsSlinky.vkOpenapi.vkOpenapiStrings.complete_registration = "complete_registration".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.complete_registration]
    
    @scala.inline
    def contact: typingsSlinky.vkOpenapi.vkOpenapiStrings.contact = "contact".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.contact]
    
    @scala.inline
    def conversion: typingsSlinky.vkOpenapi.vkOpenapiStrings.conversion = "conversion".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.conversion]
    
    @scala.inline
    def customize_product: typingsSlinky.vkOpenapi.vkOpenapiStrings.customize_product = "customize_product".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.customize_product]
    
    @scala.inline
    def donate: typingsSlinky.vkOpenapi.vkOpenapiStrings.donate = "donate".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.donate]
    
    @scala.inline
    def find_location: typingsSlinky.vkOpenapi.vkOpenapiStrings.find_location = "find_location".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.find_location]
    
    @scala.inline
    def initiate_checkout: typingsSlinky.vkOpenapi.vkOpenapiStrings.initiate_checkout = "initiate_checkout".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.initiate_checkout]
    
    @scala.inline
    def lead: typingsSlinky.vkOpenapi.vkOpenapiStrings.lead = "lead".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.lead]
    
    @scala.inline
    def page_view: typingsSlinky.vkOpenapi.vkOpenapiStrings.page_view = "page_view".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.page_view]
    
    @scala.inline
    def purchase: typingsSlinky.vkOpenapi.vkOpenapiStrings.purchase = "purchase".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.purchase]
    
    @scala.inline
    def schedule: typingsSlinky.vkOpenapi.vkOpenapiStrings.schedule = "schedule".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.schedule]
    
    @scala.inline
    def search: typingsSlinky.vkOpenapi.vkOpenapiStrings.search = "search".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.search]
    
    @scala.inline
    def start_trial: typingsSlinky.vkOpenapi.vkOpenapiStrings.start_trial = "start_trial".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.start_trial]
    
    @scala.inline
    def submit_application: typingsSlinky.vkOpenapi.vkOpenapiStrings.submit_application = "submit_application".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.submit_application]
    
    @scala.inline
    def subscribe: typingsSlinky.vkOpenapi.vkOpenapiStrings.subscribe = "subscribe".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.subscribe]
    
    @scala.inline
    def view_content: typingsSlinky.vkOpenapi.vkOpenapiStrings.view_content = "view_content".asInstanceOf[typingsSlinky.vkOpenapi.vkOpenapiStrings.view_content]
  }
  
  @js.native
  trait GoalParams extends StObject {
    
    var value: js.UndefOr[Double] = js.native
  }
  object GoalParams {
    
    @scala.inline
    def apply(): GoalParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoalParams]
    }
    
    @scala.inline
    implicit class GoalParamsMutableBuilder[Self <: GoalParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
