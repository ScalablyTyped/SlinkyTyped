package typingsSlinky.winrtUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains transformations that can be applied to pixel data. */
@js.native
trait BitmapTransform extends js.Object {
  /** Specifies the bounding rectangle that is used to crop the bitmap. This rectangle is defined in the coordinate space after scale, rotation, and flip are applied. */
  var bounds: BitmapBounds = js.native
  /** Specifies the flip operation that is used to transform the bitmap. */
  var flip: BitmapFlip = js.native
  /** Specifies the interpolation mode that is used to scale the bitmap. */
  var interpolationMode: BitmapInterpolationMode = js.native
  /** Specifies the rotation operation that is used to transform the bitmap. */
  var rotation: BitmapRotation = js.native
  /** Specifies the height, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
  var scaledHeight: Double = js.native
  /** Specifies the width, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
  var scaledWidth: Double = js.native
}

object BitmapTransform {
  @scala.inline
  def apply(
    bounds: BitmapBounds,
    flip: BitmapFlip,
    interpolationMode: BitmapInterpolationMode,
    rotation: BitmapRotation,
    scaledHeight: Double,
    scaledWidth: Double
  ): BitmapTransform = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], interpolationMode = interpolationMode.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaledHeight = scaledHeight.asInstanceOf[js.Any], scaledWidth = scaledWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTransform]
  }
  @scala.inline
  implicit class BitmapTransformOps[Self <: BitmapTransform] (val x: Self) extends AnyVal {
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

