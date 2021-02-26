package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsHttpCookiePairHeaderValue extends StObject {
  
  /** An array of HttpCookiePairHeaderValue items that start at startIndex in the HttpCookiePairHeaderValueCollection . */ var items: HttpCookiePairHeaderValue = js.native
  
  /** The number of HttpCookiePairHeaderValue items retrieved. */ var returnValue: Double = js.native
}
object ItemsHttpCookiePairHeaderValue {
  
  @scala.inline
  def apply(items: HttpCookiePairHeaderValue, returnValue: Double): ItemsHttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpCookiePairHeaderValue]
  }
  
  @scala.inline
  implicit class ItemsHttpCookiePairHeaderValueMutableBuilder[Self <: ItemsHttpCookiePairHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HttpCookiePairHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
