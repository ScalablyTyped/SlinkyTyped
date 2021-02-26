package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentRangeHeaderValue extends StObject {
  
  /** The HttpContentRangeHeaderValue version of the string. */ var contentRangeHeaderValue: HttpContentRangeHeaderValue = js.native
  
  /** true if input is valid HttpContentRangeHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}
object ContentRangeHeaderValue {
  
  @scala.inline
  def apply(contentRangeHeaderValue: HttpContentRangeHeaderValue, returnValue: Boolean): ContentRangeHeaderValue = {
    val __obj = js.Dynamic.literal(contentRangeHeaderValue = contentRangeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeHeaderValue]
  }
  
  @scala.inline
  implicit class ContentRangeHeaderValueMutableBuilder[Self <: ContentRangeHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentRangeHeaderValue(value: HttpContentRangeHeaderValue): Self = StObject.set(x, "contentRangeHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
