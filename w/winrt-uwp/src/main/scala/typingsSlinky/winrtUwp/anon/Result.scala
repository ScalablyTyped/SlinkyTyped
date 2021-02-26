package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Matrix4x4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  /** If a correlation exists, this will be set to a 4x4 transform matrix that changes basis from the infrared frame source coordinate system to the target entity coordinate system. */ var result: Matrix4x4 = js.native
  
  /** True if a correlation exists, otherwise false. */ var returnValue: Boolean = js.native
}
object Result {
  
  @scala.inline
  def apply(result: Matrix4x4, returnValue: Boolean): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Matrix4x4): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
