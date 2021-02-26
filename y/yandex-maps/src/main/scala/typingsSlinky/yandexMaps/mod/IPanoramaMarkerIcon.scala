package typingsSlinky.yandexMaps.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaMarkerIcon extends StObject {
  
  var image: HTMLCanvasElement | HTMLImageElement = js.native
  
  var offset: js.Array[Double] = js.native
}
object IPanoramaMarkerIcon {
  
  @scala.inline
  def apply(image: HTMLCanvasElement | HTMLImageElement, offset: js.Array[Double]): IPanoramaMarkerIcon = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaMarkerIcon]
  }
  
  @scala.inline
  implicit class IPanoramaMarkerIconMutableBuilder[Self <: IPanoramaMarkerIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: HTMLCanvasElement | HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
  }
}
