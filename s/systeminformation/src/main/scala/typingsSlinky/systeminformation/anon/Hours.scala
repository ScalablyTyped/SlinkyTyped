package typingsSlinky.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hours extends StObject {
  
  var hours: Double = js.native
}
object Hours {
  
  @scala.inline
  def apply(hours: Double): Hours = {
    val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hours]
  }
  
  @scala.inline
  implicit class HoursMutableBuilder[Self <: Hours] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
  }
}
