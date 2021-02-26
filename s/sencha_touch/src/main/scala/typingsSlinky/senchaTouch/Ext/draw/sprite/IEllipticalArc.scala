package typingsSlinky.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEllipticalArc extends IEllipse {
  
  /** [Config Option] (Boolean) */
  var anticlockwise: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.native
}
object IEllipticalArc {
  
  @scala.inline
  def apply(): IEllipticalArc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEllipticalArc]
  }
  
  @scala.inline
  implicit class IEllipticalArcMutableBuilder[Self <: IEllipticalArc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnticlockwise(value: Boolean): Self = StObject.set(x, "anticlockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnticlockwiseUndefined: Self = StObject.set(x, "anticlockwise", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
