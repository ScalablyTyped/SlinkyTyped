package typingsSlinky.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties for image information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
@js.native
trait ImageDisplayProperties extends StObject {
  
  /** Gets or sets the subtitle of the image. */
  var subtitle: String = js.native
  
  /** Gets or sets the title of the image. */
  var title: String = js.native
}
object ImageDisplayProperties {
  
  @scala.inline
  def apply(subtitle: String, title: String): ImageDisplayProperties = {
    val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDisplayProperties]
  }
  
  @scala.inline
  implicit class ImageDisplayPropertiesMutableBuilder[Self <: ImageDisplayProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
