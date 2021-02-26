package typingsSlinky.vegaLite.specBaseMod

import typingsSlinky.std.Exclude
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaTypings.colorMod.Color
import typingsSlinky.vegaTypings.configMod.Cursor
import typingsSlinky.vegaTypings.configMod.StrokeCap
import typingsSlinky.vegaTypings.configMod.StrokeJoin
import typingsSlinky.vegaTypings.encodeMod.ColorValueRef
import typingsSlinky.vegaTypings.encodeMod.NumericValueRef
import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Pick<vega-lite.vega-lite/build/src/mark.MarkConfig<ES>, 'cornerRadius' | 'fillOpacity' | 'opacity' | 'strokeCap' | 'strokeDash' | 'strokeDashOffset' | 'strokeJoin' | 'strokeMiterLimit' | 'strokeOpacity' | 'strokeWidth'>> */
@js.native
trait BaseViewBackground[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  var cornerRadius: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    * The mouse cursor used over the view. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
    */
  var cursor: js.UndefOr[Cursor] = js.native
  
  /**
    * The fill color.
    *
    * __Default value:__ `undefined`
    */
  var fill: js.UndefOr[Color | Null | ES] = js.native
  
  var fillOpacity: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var opacity: js.UndefOr[Double | ES] = js.native
  
  /**
    * The stroke color.
    *
    * __Default value:__ `"#ddd"`
    */
  var stroke: js.UndefOr[Color | Null | ES] = js.native
  
  var strokeCap: js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeCap | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeDash: js.UndefOr[
    (Exclude[
      js.UndefOr[js.Array[Double] | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeDashOffset: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeJoin: js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeJoin | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeMiterLimit: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeOpacity: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeWidth: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
}
object BaseViewBackground {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): BaseViewBackground[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseViewBackground[ES]]
  }
  
  @scala.inline
  implicit class BaseViewBackgroundMutableBuilder[Self <: BaseViewBackground[_], ES /* <: ExprRef | SignalRef */] (val x: Self with BaseViewBackground[ES]) extends AnyVal {
    
    @scala.inline
    def setCornerRadius(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFill(value: Color | ES): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillNull: Self = StObject.set(x, "fill", null)
    
    @scala.inline
    def setFillOpacity(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | ES): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: Color | ES): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCap(
      value: (Exclude[
          js.UndefOr[StrokeCap | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeDash(
      value: (Exclude[
          js.UndefOr[js.Array[Double] | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashOffset(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
    
    @scala.inline
    def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    @scala.inline
    def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
    
    @scala.inline
    def setStrokeJoin(
      value: (Exclude[
          js.UndefOr[StrokeJoin | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterLimit(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
    
    @scala.inline
    def setStrokeNull: Self = StObject.set(x, "stroke", null)
    
    @scala.inline
    def setStrokeOpacity(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
