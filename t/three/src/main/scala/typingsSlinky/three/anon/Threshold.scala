package typingsSlinky.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Threshold extends StObject {
  
  var threshold: Double = js.native
}
object Threshold {
  
  @scala.inline
  def apply(threshold: Double): Threshold = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
  
  @scala.inline
  implicit class ThresholdMutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
