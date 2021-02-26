package typingsSlinky.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveRasterImages extends PluginConfig {
  
  var removeRasterImages: Boolean | js.Object = js.native
}
object PluginRemoveRasterImages {
  
  @scala.inline
  def apply(removeRasterImages: Boolean | js.Object): PluginRemoveRasterImages = {
    val __obj = js.Dynamic.literal(removeRasterImages = removeRasterImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveRasterImages]
  }
  
  @scala.inline
  implicit class PluginRemoveRasterImagesMutableBuilder[Self <: PluginRemoveRasterImages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveRasterImages(value: Boolean | js.Object): Self = StObject.set(x, "removeRasterImages", value.asInstanceOf[js.Any])
  }
}
