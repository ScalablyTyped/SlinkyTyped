package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ImageData")
@js.native
class ImageData protected ()
  extends typingsSlinky.std.ImageData {
  def this(array: js.typedarray.Uint8ClampedArray, width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(array: js.typedarray.Uint8ClampedArray, width: Double, height: Double) = this()
  /**
    * Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255.
    */
  /* CompleteClass */
  override val data: js.typedarray.Uint8ClampedArray = js.native
  /**
    * Returns the actual dimensions of the data in the ImageData object, in pixels.
    */
  /* CompleteClass */
  override val height: Double = js.native
  /**
    * Returns the actual dimensions of the data in the ImageData object, in pixels.
    */
  /* CompleteClass */
  override val width: Double = js.native
}

@JSGlobal("ImageData")
@js.native
object ImageData
  extends Instantiable2[
      (/* width */ Double) | (/* array */ js.typedarray.Uint8ClampedArray), 
      /* width */ Double, 
      org.scalajs.dom.raw.ImageData
    ]
     with Instantiable3[
      /* array */ js.typedarray.Uint8ClampedArray, 
      /* width */ Double, 
      /* height */ Double, 
      org.scalajs.dom.raw.ImageData
    ]

