package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsHttpLanguageRangeWithQualityHeaderValue extends StObject {
  
  /** An array of HttpLanguageRangeWithQualityHeaderValue items that start at startIndex in the HttpLanguageRangeWithQualityHeaderValueCollection . */ var items: HttpLanguageRangeWithQualityHeaderValue = js.native
  
  /** The number of items retrieved. */ var returnValue: Double = js.native
}
object ItemsHttpLanguageRangeWithQualityHeaderValue {
  
  @scala.inline
  def apply(items: HttpLanguageRangeWithQualityHeaderValue, returnValue: Double): ItemsHttpLanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpLanguageRangeWithQualityHeaderValue]
  }
  
  @scala.inline
  implicit class ItemsHttpLanguageRangeWithQualityHeaderValueMutableBuilder[Self <: ItemsHttpLanguageRangeWithQualityHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HttpLanguageRangeWithQualityHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
