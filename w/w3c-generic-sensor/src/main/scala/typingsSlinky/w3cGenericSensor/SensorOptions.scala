package typingsSlinky.w3cGenericSensor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SensorOptions extends StObject {
  
  var frequency: js.UndefOr[Double] = js.native
}
object SensorOptions {
  
  @scala.inline
  def apply(): SensorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensorOptions]
  }
  
  @scala.inline
  implicit class SensorOptionsMutableBuilder[Self <: SensorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
