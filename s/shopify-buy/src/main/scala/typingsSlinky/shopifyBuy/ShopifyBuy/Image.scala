package typingsSlinky.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends GraphModel {
  
  var created_at: String = js.native
  
  var id: String | Double = js.native
  
  var position: Double = js.native
  
  var product_id: String = js.native
  
  var src: String = js.native
  
  var updated_at: String = js.native
  
  var variant_ids: js.Array[String] = js.native
}
object Image {
  
  @scala.inline
  def apply(
    created_at: String,
    id: String | Double,
    position: Double,
    product_id: String,
    src: String,
    updated_at: String,
    variant_ids: js.Array[String]
  ): Image = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], variant_ids = variant_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariant_ids(value: js.Array[String]): Self = StObject.set(x, "variant_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariant_idsVarargs(value: String*): Self = StObject.set(x, "variant_ids", js.Array(value :_*))
  }
}
