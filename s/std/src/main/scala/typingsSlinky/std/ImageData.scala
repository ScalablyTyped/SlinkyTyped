package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The underlying pixel data of an area of a <canvas> element. It is created using the ImageData() constructor or creator methods on the CanvasRenderingContext2D object associated with a canvas: createImageData() and getImageData(). It can also be used to set a part of the canvas by using putImageData(). */
@js.native
trait ImageData extends StObject {
  
  /**
    * Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255.
    */
  val data: js.typedarray.Uint8ClampedArray = js.native
  
  /**
    * Returns the actual dimensions of the data in the ImageData object, in pixels.
    */
  val height: Double = js.native
  
  /**
    * Returns the actual dimensions of the data in the ImageData object, in pixels.
    */
  val width: Double = js.native
}
object ImageData {
  
  @scala.inline
  def apply(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): org.scalajs.dom.raw.ImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.ImageData]
  }
  
  @scala.inline
  implicit class ImageDataMutableBuilder[Self <: org.scalajs.dom.raw.ImageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
