package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.vegaTypingsStrings.regression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegressionTransform extends _Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  
  var extent: js.UndefOr[(js.Tuple2[Double, Double]) | SignalRef] = js.native
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  
  var method: js.UndefOr[RegressionMethod | SignalRef] = js.native
  
  var order: js.UndefOr[Double | SignalRef] = js.native
  
  var params: js.UndefOr[Boolean | SignalRef] = js.native
  
  var `type`: regression = js.native
  
  var x: FieldRef = js.native
  
  var y: FieldRef = js.native
}
object RegressionTransform {
  
  @scala.inline
  def apply(`type`: regression, x: FieldRef, y: FieldRef): RegressionTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegressionTransform]
  }
  
  @scala.inline
  implicit class RegressionTransformMutableBuilder[Self <: RegressionTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setExtent(value: (js.Tuple2[Double, Double]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: RegressionMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOrder(value: Double | SignalRef): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setParams(value: Boolean | SignalRef): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setType(value: regression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: FieldRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: FieldRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
