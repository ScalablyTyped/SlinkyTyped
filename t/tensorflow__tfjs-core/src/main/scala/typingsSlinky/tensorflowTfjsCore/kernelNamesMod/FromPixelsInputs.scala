package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.tensorflowTfjsCore.distTypesMod.PixelData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromPixelsInputs extends js.Object {
  var pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement
}

object FromPixelsInputs {
  @scala.inline
  def apply(pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): FromPixelsInputs = {
    val __obj = js.Dynamic.literal(pixels = pixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsInputs]
  }
}

