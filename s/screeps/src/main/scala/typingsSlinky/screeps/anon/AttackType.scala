package typingsSlinky.screeps.anon

import typingsSlinky.screeps.EventAttackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttackType extends StObject {
  
  var attackType: EventAttackType = js.native
  
  var damage: Double = js.native
  
  var targetId: String = js.native
}
object AttackType {
  
  @scala.inline
  def apply(attackType: EventAttackType, damage: Double, targetId: String): AttackType = {
    val __obj = js.Dynamic.literal(attackType = attackType.asInstanceOf[js.Any], damage = damage.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackType]
  }
  
  @scala.inline
  implicit class AttackTypeMutableBuilder[Self <: AttackType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttackType(value: EventAttackType): Self = StObject.set(x, "attackType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDamage(value: Double): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
