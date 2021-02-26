package typingsSlinky.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITool extends StObject {
  
  var active: Boolean = js.native
  
  var chart: IChart = js.native
  
  def clicked(p: IPoint): Boolean = js.native
  
  def draw(): Unit = js.native
  
  def mousedown(event: js.Any): Boolean = js.native
  
  def mousemove(event: js.Any): Boolean = js.native
}
object ITool {
  
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean
  ): ITool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove))
    __obj.asInstanceOf[ITool]
  }
  
  @scala.inline
  implicit class IToolMutableBuilder[Self <: ITool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicked(value: IPoint => Boolean): Self = StObject.set(x, "clicked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMousedown(value: js.Any => Boolean): Self = StObject.set(x, "mousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMousemove(value: js.Any => Boolean): Self = StObject.set(x, "mousemove", js.Any.fromFunction1(value))
  }
}
