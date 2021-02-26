package typingsSlinky.vegaLite.channeldefMod

import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.scaleMod.Scale
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleMixins extends StObject {
  
  /**
    * An object defining properties of the channel's scale, which is the function that transforms values in the data domain (numbers, dates, strings, etc) to visual values (pixels, colors, sizes) of the encoding channels.
    *
    * If `null`, the scale will be [disabled and the data value will be directly encoded](https://vega.github.io/vega-lite/docs/scale.html#disable).
    *
    * __Default value:__ If undefined, default [scale properties](https://vega.github.io/vega-lite/docs/scale.html) are applied.
    *
    * __See also:__ [`scale`](https://vega.github.io/vega-lite/docs/scale.html) documentation.
    */
  var scale: js.UndefOr[(Scale[ExprRef | SignalRef]) | Null] = js.native
}
object ScaleMixins {
  
  @scala.inline
  def apply(): ScaleMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleMixins]
  }
  
  @scala.inline
  implicit class ScaleMixinsMutableBuilder[Self <: ScaleMixins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Scale[ExprRef | SignalRef]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleNull: Self = StObject.set(x, "scale", null)
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
