package typingsSlinky.wepy.anon

import typingsSlinky.wepy.wxEnhancedMod.LagLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Padding extends StObject {
  
  var padding: js.Array[Double] = js.native
  
  var points: js.Array[LagLng] = js.native
}
object Padding {
  
  @scala.inline
  def apply(padding: js.Array[Double], points: js.Array[LagLng]): Padding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[LagLng]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: LagLng*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
