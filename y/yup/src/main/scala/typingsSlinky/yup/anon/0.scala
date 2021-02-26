package typingsSlinky.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var min: js.Date | String = js.native
}
object `0` {
  
  @scala.inline
  def apply(min: js.Date | String): `0` = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMin(value: js.Date | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDate(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
