package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an image that is associated with a product listing in the Windows Store. */
@js.native
trait StoreImage extends StObject {
  
  /** Gets the caption for the image. */
  var caption: String = js.native
  
  /** Gets the height of the image, in pixels. */
  var height: Double = js.native
  
  /** Gets the tag for the image. */
  var imagePurposeTag: String = js.native
  
  /** Gets the URI of the image. */
  var uri: Uri = js.native
  
  /** Gets the width of the image, in pixels. */
  var width: Double = js.native
}
object StoreImage {
  
  @scala.inline
  def apply(caption: String, height: Double, imagePurposeTag: String, uri: Uri, width: Double): StoreImage = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imagePurposeTag = imagePurposeTag.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreImage]
  }
  
  @scala.inline
  implicit class StoreImageMutableBuilder[Self <: StoreImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePurposeTag(value: String): Self = StObject.set(x, "imagePurposeTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
