package typingsSlinky.sharp.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayOptions extends StObject {
  
  /** how to blend this image with the image below. (optional, default `'over'`) */
  var blend: js.UndefOr[Blend] = js.native
  
  /** number representing the DPI for vector overlay image. (optional, default 72) */
  var density: js.UndefOr[Double] = js.native
  
  /** gravity at which to place the overlay. (optional, default 'centre') */
  var gravity: js.UndefOr[Gravity_] = js.native
  
  /** Buffer containing image data, String containing the path to an image file, or Create object  */
  var input: js.UndefOr[String | Buffer | typingsSlinky.sharp.anon.Create] = js.native
  
  /** the pixel offset from the left edge. */
  var left: js.UndefOr[Double] = js.native
  
  /** Set to true to avoid premultipling the image below. Equivalent to the --premultiplied vips option. */
  var premultiplied: js.UndefOr[Boolean] = js.native
  
  /** describes overlay when using raw pixel data. */
  var raw: js.UndefOr[Raw] = js.native
  
  /** set to true to repeat the overlay image across the entire image with the given  gravity. (optional, default false) */
  var tile: js.UndefOr[Boolean] = js.native
  
  /** the pixel offset from the top edge. */
  var top: js.UndefOr[Double] = js.native
}
object OverlayOptions {
  
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit class OverlayOptionsMutableBuilder[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlend(value: Blend): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
    
    @scala.inline
    def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    @scala.inline
    def setGravity(value: Gravity_): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    @scala.inline
    def setInput(value: String | Buffer | typingsSlinky.sharp.anon.Create): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setPremultiplied(value: Boolean): Self = StObject.set(x, "premultiplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremultipliedUndefined: Self = StObject.set(x, "premultiplied", js.undefined)
    
    @scala.inline
    def setRaw(value: Raw): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setTile(value: Boolean): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
