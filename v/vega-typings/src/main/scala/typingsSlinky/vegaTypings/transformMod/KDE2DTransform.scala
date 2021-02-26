package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.kde2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KDE2DTransform extends _Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.native
  
  var bandwidth: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  
  var cellSize: js.UndefOr[Double | SignalRef] = js.native
  
  // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var counts: js.UndefOr[Boolean | SignalRef] = js.native
  
  var groupby: js.UndefOr[(js.Array[String | TransformField]) | SignalRef] = js.native
  
  var size: (js.Array[Double | SignalRef]) | SignalRef = js.native
  
  var `type`: kde2d = js.native
  
  var weight: js.UndefOr[String | TransformField] = js.native
  
  // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var x: String | TransformField = js.native
  
  var y: String | TransformField = js.native
}
object KDE2DTransform {
  
  @scala.inline
  def apply(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: kde2d,
    x: String | TransformField,
    y: String | TransformField
  ): KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KDE2DTransform]
  }
  
  @scala.inline
  implicit class KDE2DTransformMutableBuilder[Self <: KDE2DTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setBandwidth(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setBandwidthVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bandwidth", js.Array(value :_*))
    
    @scala.inline
    def setCellSize(value: Double | SignalRef): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellSizeUndefined: Self = StObject.set(x, "cellSize", js.undefined)
    
    @scala.inline
    def setCounts(value: Boolean | SignalRef): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    @scala.inline
    def setGroupby(value: (js.Array[String | TransformField]) | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: (String | TransformField)*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "size", js.Array(value :_*))
    
    @scala.inline
    def setType(value: kde2d): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: String | TransformField): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    @scala.inline
    def setX(value: String | TransformField): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String | TransformField): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
