package typingsSlinky.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitmapTransform extends IBitmapTransform
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
}
