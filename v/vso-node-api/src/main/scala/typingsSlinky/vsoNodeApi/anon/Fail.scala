package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fail extends StObject {
  
  var fail: scala.Double = js.native
  
  var omit: scala.Double = js.native
}
object Fail {
  
  @scala.inline
  def apply(fail: scala.Double, omit: scala.Double): Fail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], omit = omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  
  @scala.inline
  implicit class FailMutableBuilder[Self <: Fail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFail(value: scala.Double): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmit(value: scala.Double): Self = StObject.set(x, "omit", value.asInstanceOf[js.Any])
  }
}
