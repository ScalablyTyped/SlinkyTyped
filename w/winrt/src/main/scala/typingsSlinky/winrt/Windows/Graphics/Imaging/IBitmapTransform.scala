package typingsSlinky.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitmapTransform extends js.Object {
  var bounds: BitmapBounds = js.native
  var flip: BitmapFlip = js.native
  var interpolationMode: BitmapInterpolationMode = js.native
  var rotation: BitmapRotation = js.native
  var scaledHeight: Double = js.native
  var scaledWidth: Double = js.native
}

object IBitmapTransform {
  @scala.inline
  def apply(
    bounds: BitmapBounds,
    flip: BitmapFlip,
    interpolationMode: BitmapInterpolationMode,
    rotation: BitmapRotation,
    scaledHeight: Double,
    scaledWidth: Double
  ): IBitmapTransform = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], interpolationMode = interpolationMode.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaledHeight = scaledHeight.asInstanceOf[js.Any], scaledWidth = scaledWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapTransform]
  }
  @scala.inline
  implicit class IBitmapTransformOps[Self <: IBitmapTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: BitmapBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlip(value: BitmapFlip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpolationMode(value: BitmapInterpolationMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: BitmapRotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaledHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaledHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaledWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaledWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

