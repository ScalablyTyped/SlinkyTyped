package typingsSlinky.screeps.anon

import typingsSlinky.screeps.EventHealType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealType extends StObject {
  
  var amount: Double = js.native
  
  var healType: EventHealType = js.native
  
  var targetId: String = js.native
}
object HealType {
  
  @scala.inline
  def apply(amount: Double, healType: EventHealType, targetId: String): HealType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], healType = healType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealType]
  }
  
  @scala.inline
  implicit class HealTypeMutableBuilder[Self <: HealType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealType(value: EventHealType): Self = StObject.set(x, "healType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
