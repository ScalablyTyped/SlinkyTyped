package typingsSlinky.vegaLite.channeldefMod

import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.scaleMod.Scale
import typingsSlinky.vegaLite.srcTypeMod.Type
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/channeldef.ScaleMixins & vega-lite.vega-lite/build/src/channeldef.DatumDef<F, vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef> */
@js.native
trait ScaleDatumDef[F /* <: Field */] extends StObject {
  
  /**
    * For rect-based marks (`rect`, `bar`, and `image`), mark size relative to bandwidth of [band scales](https://vega.github.io/vega-lite/docs/scale.html#band), bins or time units. If set to `1`, the mark size is set to the bandwidth, the bin interval, or the time unit interval. If set to `0.5`, the mark size is half of the bandwidth or the time unit interval.
    *
    * For other marks, relative position on a band of a stacked, binned, time unit or band scale. If set to `0`, the marks will be positioned at the beginning of the band. If set to `0.5`, the marks will be positioned in the middle of the band.
    *
    * @minimum 0
    * @maximum 1
    */
  var band: js.UndefOr[Double] = js.native
  
  /**
    * A constant value in data domain.
    */
  var datum: js.UndefOr[PrimitiveValue | DateTime | ExprRef | SignalRef | RepeatRef] = js.native
  
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
  
  var `type`: js.UndefOr[Type] = js.native
}
object ScaleDatumDef {
  
  @scala.inline
  def apply[F /* <: Field */](): ScaleDatumDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleDatumDef[F]]
  }
  
  @scala.inline
  implicit class ScaleDatumDefMutableBuilder[Self <: ScaleDatumDef[_], F /* <: Field */] (val x: Self with ScaleDatumDef[F]) extends AnyVal {
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    @scala.inline
    def setDatum(value: PrimitiveValue | DateTime | ExprRef | SignalRef | RepeatRef): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatumNull: Self = StObject.set(x, "datum", null)
    
    @scala.inline
    def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    @scala.inline
    def setScale(value: Scale[ExprRef | SignalRef]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleNull: Self = StObject.set(x, "scale", null)
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
