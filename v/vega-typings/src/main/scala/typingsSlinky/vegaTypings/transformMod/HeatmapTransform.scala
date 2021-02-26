package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.heatmap
import typingsSlinky.vegaTypings.vegaTypingsStrings.independent
import typingsSlinky.vegaTypings.vegaTypingsStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapTransform extends _Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.native
  
  var color: js.UndefOr[String | TransformField] = js.native
  
  var field: js.UndefOr[String | TransformField] = js.native
  
  var opacity: js.UndefOr[Double | TransformField] = js.native
  
  var resolve: js.UndefOr[independent | shared | SignalRef] = js.native
  
  var `type`: heatmap = js.native
}
object HeatmapTransform {
  
  @scala.inline
  def apply(`type`: heatmap): HeatmapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapTransform]
  }
  
  @scala.inline
  implicit class HeatmapTransformMutableBuilder[Self <: HeatmapTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setColor(value: String | TransformField): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setField(value: String | TransformField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | TransformField): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setResolve(value: independent | shared | SignalRef): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setType(value: heatmap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
