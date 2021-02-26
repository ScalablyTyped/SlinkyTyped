package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Failed extends StObject {
  
  var failed: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
  
  var unknown: scala.Double = js.native
}
object Failed {
  
  @scala.inline
  def apply(failed: scala.Double, succeeded: scala.Double, unknown: scala.Double): Failed = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failed]
  }
  
  @scala.inline
  implicit class FailedMutableBuilder[Self <: Failed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
