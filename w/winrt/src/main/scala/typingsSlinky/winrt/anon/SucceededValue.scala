package typingsSlinky.winrt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SucceededValue extends StObject {
  
  var succeeded: Boolean = js.native
  
  var value: Double = js.native
}
object SucceededValue {
  
  @scala.inline
  def apply(succeeded: Boolean, value: Double): SucceededValue = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SucceededValue]
  }
  
  @scala.inline
  implicit class SucceededValueMutableBuilder[Self <: SucceededValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
