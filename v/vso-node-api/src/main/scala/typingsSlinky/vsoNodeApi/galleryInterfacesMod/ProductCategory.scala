package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductCategory extends StObject {
  
  var children: js.Array[ProductCategory] = js.native
  
  /**
    * Indicator whether this is a leaf or there are children under this category
    */
  var hasChildren: Boolean = js.native
  
  /**
    * Individual Guid of the Category
    */
  var id: String = js.native
  
  /**
    * Category Title in the requested language
    */
  var title: String = js.native
}
object ProductCategory {
  
  @scala.inline
  def apply(children: js.Array[ProductCategory], hasChildren: Boolean, id: String, title: String): ProductCategory = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hasChildren = hasChildren.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCategory]
  }
  
  @scala.inline
  implicit class ProductCategoryMutableBuilder[Self <: ProductCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ProductCategory]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ProductCategory*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
