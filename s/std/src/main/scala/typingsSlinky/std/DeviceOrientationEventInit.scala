package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceOrientationEventInit extends EventInit {
  
  var absolute: js.UndefOr[scala.Boolean] = js.native
  
  var alpha: js.UndefOr[Double | Null] = js.native
  
  var beta: js.UndefOr[Double | Null] = js.native
  
  var gamma: js.UndefOr[Double | Null] = js.native
}
object DeviceOrientationEventInit {
  
  @scala.inline
  def apply(): org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEventInit]
  }
  
  @scala.inline
  implicit class DeviceOrientationEventInitMutableBuilder[Self <: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolute(value: scala.Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaNull: Self = StObject.set(x, "alpha", null)
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetaNull: Self = StObject.set(x, "beta", null)
    
    @scala.inline
    def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
    
    @scala.inline
    def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGammaNull: Self = StObject.set(x, "gamma", null)
    
    @scala.inline
    def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
  }
}
