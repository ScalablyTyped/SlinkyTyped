package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.dashed
import typingsSlinky.screeps.screepsStrings.dotted
import typingsSlinky.screeps.screepsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyStyle extends js.Object {
  
  /**
    * Fill color in any web format, default is #ffffff(white).
    */
  var fill: js.UndefOr[String] = js.native
  
  /**
    * Either undefined (solid line), dashed, or dotted.Default is undefined.
    */
  var lineStyle: js.UndefOr[dashed | dotted | solid] = js.native
  
  /**
    * Opacity value, default is 0.5.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Stroke color in any web format, default is undefined (no stroke).
    */
  var stroke: js.UndefOr[String] = js.native
  
  /**
    * Stroke line width, default is 0.1.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}
object PolyStyle {
  
  @scala.inline
  def apply(): PolyStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolyStyle]
  }
  
  @scala.inline
  implicit class PolyStyleOps[Self <: PolyStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setLineStyle(value: dashed | dotted | solid): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
}
