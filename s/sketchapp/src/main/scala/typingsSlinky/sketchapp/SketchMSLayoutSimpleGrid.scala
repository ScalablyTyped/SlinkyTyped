package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.simpleGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSLayoutSimpleGrid extends SketchMSLayout {
  
  var _class: simpleGrid = js.native
  
  var gridSize: Double = js.native
  
  var isEnabled: Double = js.native
  
  var thickGridTimes: Double = js.native
}
object SketchMSLayoutSimpleGrid {
  
  @scala.inline
  def apply(_class: simpleGrid, gridSize: Double, isEnabled: Double, thickGridTimes: Double): SketchMSLayoutSimpleGrid = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayoutSimpleGrid]
  }
  
  @scala.inline
  implicit class SketchMSLayoutSimpleGridMutableBuilder[Self <: SketchMSLayoutSimpleGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThickGridTimes(value: Double): Self = StObject.set(x, "thickGridTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: simpleGrid): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
