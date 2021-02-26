package typingsSlinky.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaImage extends StObject {
  
  // Specify the MediaImage object’s sizes. It follows the spec of sizes attribute in HTML link element.
  var sizes: js.UndefOr[String] = js.native
  
  // URL from which the user agent can fetch the image’s data.
  var src: String = js.native
  
  // A hint as to the media type of the image.
  var `type`: js.UndefOr[String] = js.native
}
object MediaImage {
  
  @scala.inline
  def apply(src: String): MediaImage = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaImage]
  }
  
  @scala.inline
  implicit class MediaImageMutableBuilder[Self <: MediaImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
