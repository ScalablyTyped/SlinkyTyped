package typingsSlinky.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Total extends StObject {
  
  var total: Double = js.native
}
object Total {
  
  @scala.inline
  def apply(total: Double): Total = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Total]
  }
  
  @scala.inline
  implicit class TotalMutableBuilder[Self <: Total] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
