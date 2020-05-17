package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents pixel data of a `Canvas` widget.
  */
@js.native
trait ImageData extends js.Object {
  /**
    * A one-dimensional array containing the data in RGBA order, with integer values between 0 and 255 (inclusive).
    */
  val data: js.typedarray.Uint8ClampedArray = js.native
  /**
    * The actual height of the ImageData, in pixels.
    */
  val height: Double = js.native
  /**
    * The actual height of the ImageData, in pixels.
    */
  val width: Double = js.native
}

object ImageData {
  @scala.inline
  def apply(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): ImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
  @scala.inline
  implicit class ImageDataOps[Self <: ImageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.Uint8ClampedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

