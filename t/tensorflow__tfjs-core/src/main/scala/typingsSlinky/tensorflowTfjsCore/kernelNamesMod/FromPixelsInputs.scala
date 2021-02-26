package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.tensorflowTfjsCore.distTypesMod.PixelData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromPixelsInputs extends StObject {
  
  var pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
}
object FromPixelsInputs {
  
  @scala.inline
  def apply(pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): FromPixelsInputs = {
    val __obj = js.Dynamic.literal(pixels = pixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsInputs]
  }
  
  @scala.inline
  implicit class FromPixelsInputsMutableBuilder[Self <: FromPixelsInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPixels(value: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsHTMLVideoElement(value: HTMLVideoElement): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsImageData(value: ImageData): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
  }
}
