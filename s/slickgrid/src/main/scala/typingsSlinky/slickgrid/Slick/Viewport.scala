package typingsSlinky.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewport extends StObject {
  
  var bottom: Double = js.native
  
  var leftPx: Double = js.native
  
  var rightPx: Double = js.native
  
  var top: Double = js.native
}
object Viewport {
  
  @scala.inline
  def apply(bottom: Double, leftPx: Double, rightPx: Double, top: Double): Viewport = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], leftPx = leftPx.asInstanceOf[js.Any], rightPx = rightPx.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  implicit class ViewportMutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftPx(value: Double): Self = StObject.set(x, "leftPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightPx(value: Double): Self = StObject.set(x, "rightPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
