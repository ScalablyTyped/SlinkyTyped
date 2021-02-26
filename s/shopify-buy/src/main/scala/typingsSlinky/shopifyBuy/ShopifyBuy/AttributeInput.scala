package typingsSlinky.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeInput extends StObject {
  
  var id: js.UndefOr[String | Double] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var variantId: js.UndefOr[String] = js.native
}
object AttributeInput {
  
  @scala.inline
  def apply(): AttributeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeInput]
  }
  
  @scala.inline
  implicit class AttributeInputMutableBuilder[Self <: AttributeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVariantId(value: String): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
