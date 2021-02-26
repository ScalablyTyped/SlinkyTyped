package typingsSlinky.vegaLite.srcMarkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectBinSpacingMixins extends StObject {
  
  /**
    * Offset between bars for binned field. The ideal value for this is either 0 (preferred by statisticians) or 1 (Vega-Lite default, D3 example style).
    *
    * __Default value:__ `1`
    *
    * @minimum 0
    */
  var binSpacing: js.UndefOr[Double] = js.native
}
object RectBinSpacingMixins {
  
  @scala.inline
  def apply(): RectBinSpacingMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectBinSpacingMixins]
  }
  
  @scala.inline
  implicit class RectBinSpacingMixinsMutableBuilder[Self <: RectBinSpacingMixins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinSpacing(value: Double): Self = StObject.set(x, "binSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinSpacingUndefined: Self = StObject.set(x, "binSpacing", js.undefined)
  }
}
