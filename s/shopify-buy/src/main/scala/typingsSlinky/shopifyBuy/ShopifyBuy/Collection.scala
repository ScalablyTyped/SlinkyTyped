package typingsSlinky.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection extends StObject {
  
  var body_html: String = js.native
  
  var handle: String = js.native
  
  var id: String = js.native
  
  var image: Image = js.native
  
  var metafields: js.Array[_] = js.native
  
  var published: Boolean = js.native
  
  var published_at: String = js.native
  
  var published_scope: String = js.native
  
  var sort_order: String = js.native
  
  var template_suffix: String = js.native
  
  var title: String = js.native
  
  var updated_at: String = js.native
}
object Collection {
  
  @scala.inline
  def apply(
    body_html: String,
    handle: String,
    id: String,
    image: Image,
    metafields: js.Array[_],
    published: Boolean,
    published_at: String,
    published_scope: String,
    sort_order: String,
    template_suffix: String,
    title: String,
    updated_at: String
  ): Collection = {
    val __obj = js.Dynamic.literal(body_html = body_html.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], published_scope = published_scope.asInstanceOf[js.Any], sort_order = sort_order.asInstanceOf[js.Any], template_suffix = template_suffix.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit class CollectionMutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetafields(value: js.Array[_]): Self = StObject.set(x, "metafields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetafieldsVarargs(value: js.Any*): Self = StObject.set(x, "metafields", js.Array(value :_*))
    
    @scala.inline
    def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublished_scope(value: String): Self = StObject.set(x, "published_scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort_order(value: String): Self = StObject.set(x, "sort_order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate_suffix(value: String): Self = StObject.set(x, "template_suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
