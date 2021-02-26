package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTypeHeaderValue extends StObject {
  
  /** The HttpMediaTypeHeaderValue version of the string. */ var mediaTypeHeaderValue: HttpMediaTypeHeaderValue = js.native
  
  /** true if input is valid HttpMediaTypeHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}
object MediaTypeHeaderValue {
  
  @scala.inline
  def apply(mediaTypeHeaderValue: HttpMediaTypeHeaderValue, returnValue: Boolean): MediaTypeHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeHeaderValue = mediaTypeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTypeHeaderValue]
  }
  
  @scala.inline
  implicit class MediaTypeHeaderValueMutableBuilder[Self <: MediaTypeHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaTypeHeaderValue(value: HttpMediaTypeHeaderValue): Self = StObject.set(x, "mediaTypeHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
