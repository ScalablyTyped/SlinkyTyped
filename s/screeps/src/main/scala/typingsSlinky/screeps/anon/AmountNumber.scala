package typingsSlinky.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmountNumber extends StObject {
  
  var amount: Double = js.native
}
object AmountNumber {
  
  @scala.inline
  def apply(amount: Double): AmountNumber = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountNumber]
  }
  
  @scala.inline
  implicit class AmountNumberMutableBuilder[Self <: AmountNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
  }
}
