package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.tensorflowTfjsCore.distTypesMod.PixelData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromPixelsInputs extends js.Object {
  var pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
}

object FromPixelsInputs {
  @scala.inline
  def apply(pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): FromPixelsInputs = {
    val __obj = js.Dynamic.literal(pixels = pixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsInputs]
  }
  @scala.inline
  implicit class FromPixelsInputsOps[Self <: FromPixelsInputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPixelsImageData(value: ImageData): Self = this.set("pixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelsHTMLImageElement(value: HTMLImageElement): Self = this.set("pixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixels(value: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): Self = this.set("pixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelsHTMLVideoElement(value: HTMLVideoElement): Self = this.set("pixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelsHTMLCanvasElement(value: HTMLCanvasElement): Self = this.set("pixels", value.asInstanceOf[js.Any])
  }
  
}

