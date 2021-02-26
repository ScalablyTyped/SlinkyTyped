package typingsSlinky.victory.anon

import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axis extends StObject {
  
  var axis: js.UndefOr[CSSProperties] = js.native
  
  var axisLabel: js.UndefOr[CSSProperties] = js.native
  
  var grid: js.UndefOr[CSSProperties] = js.native
  
  var tickLabels: js.UndefOr[CSSProperties] = js.native
  
  var ticks: js.UndefOr[CSSProperties] = js.native
}
object Axis {
  
  @scala.inline
  def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  
  @scala.inline
  implicit class AxisMutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: CSSProperties): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLabel(value: CSSProperties): Self = StObject.set(x, "axisLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLabelUndefined: Self = StObject.set(x, "axisLabel", js.undefined)
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setGrid(value: CSSProperties): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setTickLabels(value: CSSProperties): Self = StObject.set(x, "tickLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLabelsUndefined: Self = StObject.set(x, "tickLabels", js.undefined)
    
    @scala.inline
    def setTicks(value: CSSProperties): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
