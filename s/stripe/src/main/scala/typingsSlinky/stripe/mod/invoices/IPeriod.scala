package typingsSlinky.stripe.mod.invoices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPeriod extends StObject {
  
  /**
    * The period end date
    */
  var end: Double = js.native
  
  /**
    * The period start date
    */
  var start: Double = js.native
}
object IPeriod {
  
  @scala.inline
  def apply(end: Double, start: Double): IPeriod = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeriod]
  }
  
  @scala.inline
  implicit class IPeriodMutableBuilder[Self <: IPeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
