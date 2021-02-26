package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.Media.Capture.PowerlineFrequency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends StObject {
  
  var succeeded: Boolean = js.native
  
  var value: PowerlineFrequency = js.native
}
object Value {
  
  @scala.inline
  def apply(succeeded: Boolean, value: PowerlineFrequency): Value = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: PowerlineFrequency): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
