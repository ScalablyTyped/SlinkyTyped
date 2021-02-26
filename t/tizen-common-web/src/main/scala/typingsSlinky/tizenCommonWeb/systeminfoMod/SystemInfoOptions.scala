package typingsSlinky.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoOptions extends StObject {
  
  /**
    * An attribute to indicate that the `successCallback()` method in the watch
    *
    * operation will be triggered only if the device property is a number and its value is greater than or equal to this number.
    * This attribute has no effect on the `get()` method.
    */
  var highThreshold: Double = js.native
  
  /**
    * An attribute to indicate that the `successCallback()` method in the watch operation must be triggered only if the property is a number and its value is lower than or equal to this number.
    *
    * If both `highThreshold` and `lowThreshold` parameters are specified, the `successCallback()` is triggered if and only if the property value is either lower than the value of `lowThreshold` or higher than the value of `highThreshold`.
    * This attribute has no effect on the get method.
    */
  var lowThreshold: Double = js.native
  
  /**
    * The number of milliseconds beyond which the operation must be interrupted.
    */
  var timeout: Double = js.native
}
object SystemInfoOptions {
  
  @scala.inline
  def apply(highThreshold: Double, lowThreshold: Double, timeout: Double): SystemInfoOptions = {
    val __obj = js.Dynamic.literal(highThreshold = highThreshold.asInstanceOf[js.Any], lowThreshold = lowThreshold.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoOptions]
  }
  
  @scala.inline
  implicit class SystemInfoOptionsMutableBuilder[Self <: SystemInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighThreshold(value: Double): Self = StObject.set(x, "highThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowThreshold(value: Double): Self = StObject.set(x, "lowThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
