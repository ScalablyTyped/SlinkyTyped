package typingsSlinky.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TOOLS
@js.native
trait IDragTool extends ITool {
  
  var series: ISeries = js.native
}
object IDragTool {
  
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    series: ISeries
  ): IDragTool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragTool]
  }
  
  @scala.inline
  implicit class IDragToolMutableBuilder[Self <: IDragTool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeries(value: ISeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
  }
}
