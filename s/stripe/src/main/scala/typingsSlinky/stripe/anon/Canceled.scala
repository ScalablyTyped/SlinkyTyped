package typingsSlinky.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canceled extends StObject {
  
  var canceled: Double = js.native
  
  var fulfiled: Double = js.native
  
  var paid: Double = js.native
  
  var returned: Double = js.native
}
object Canceled {
  
  @scala.inline
  def apply(canceled: Double, fulfiled: Double, paid: Double, returned: Double): Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], fulfiled = fulfiled.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], returned = returned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canceled]
  }
  
  @scala.inline
  implicit class CanceledMutableBuilder[Self <: Canceled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfiled(value: Double): Self = StObject.set(x, "fulfiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaid(value: Double): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturned(value: Double): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
  }
}
