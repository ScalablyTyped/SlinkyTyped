package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductCategoriesResult extends StObject {
  
  var categories: js.Array[ProductCategory] = js.native
}
object ProductCategoriesResult {
  
  @scala.inline
  def apply(categories: js.Array[ProductCategory]): ProductCategoriesResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCategoriesResult]
  }
  
  @scala.inline
  implicit class ProductCategoriesResultMutableBuilder[Self <: ProductCategoriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[ProductCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: ProductCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
  }
}
