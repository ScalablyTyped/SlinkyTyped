package typingsSlinky.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay extends StObject {
  
  var delay: Double = js.native
  
  var duration: Double = js.native
  
  var timingFunction: String = js.native
  
  var transformOrigin: String = js.native
}
object Delay {
  
  @scala.inline
  def apply(delay: Double, duration: Double, timingFunction: String, transformOrigin: String): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timingFunction = timingFunction.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
  }
}
