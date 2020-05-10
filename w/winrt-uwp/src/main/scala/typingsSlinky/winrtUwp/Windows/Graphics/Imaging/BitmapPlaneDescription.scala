package typingsSlinky.winrtUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the format of a bitmap plane. */
@js.native
trait BitmapPlaneDescription extends js.Object {
  /** The height of the plane, in pixels. */
  var height: Double = js.native
  /** The start index of the pixel data within the plane. */
  var startIndex: Double = js.native
  /** The stride of the bitmap data. */
  var stride: Double = js.native
  /** The width of the plane, in pixels. */
  var width: Double = js.native
}

object BitmapPlaneDescription {
  @scala.inline
  def apply(height: Double, startIndex: Double, stride: Double, width: Double): BitmapPlaneDescription = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapPlaneDescription]
  }
  @scala.inline
  implicit class BitmapPlaneDescriptionOps[Self <: BitmapPlaneDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStride(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stride")(value.asInstanceOf[js.Any])
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

