package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBitmap
  extends CanvasImageSource
     with TexImageSource
     with Transferable {
  /**
    * Returns the intrinsic height of the image, in CSS pixels.
    */
  val height: Double = js.native
  /**
    * Returns the intrinsic width of the image, in CSS pixels.
    */
  val width: Double = js.native
  /**
    * Releases imageBitmap's underlying bitmap data.
    */
  def close(): Unit = js.native
}

@JSGlobal("ImageBitmap")
@js.native
object ImageBitmap extends Instantiable0[ImageBitmap]

