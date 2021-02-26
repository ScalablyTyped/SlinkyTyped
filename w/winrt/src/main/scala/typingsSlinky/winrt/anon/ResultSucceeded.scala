package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.Data.Json.JsonArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSucceeded extends StObject {
  
  var result: JsonArray = js.native
  
  var succeeded: Boolean = js.native
}
object ResultSucceeded {
  
  @scala.inline
  def apply(result: JsonArray, succeeded: Boolean): ResultSucceeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSucceeded]
  }
  
  @scala.inline
  implicit class ResultSucceededMutableBuilder[Self <: ResultSucceeded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: JsonArray): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
