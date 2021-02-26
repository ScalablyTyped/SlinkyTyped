package typingsSlinky.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangedMassAttack extends StObject {
  
  var rangedAttack: typingsSlinky.screeps.screepsNumbers.`3` = js.native
  
  var rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}
object RangedMassAttack {
  
  @scala.inline
  def apply(
    rangedAttack: typingsSlinky.screeps.screepsNumbers.`3`,
    rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`3`
  ): RangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedMassAttack]
  }
  
  @scala.inline
  implicit class RangedMassAttackMutableBuilder[Self <: RangedMassAttack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRangedAttack(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = StObject.set(x, "rangedAttack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedMassAttack(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = StObject.set(x, "rangedMassAttack", value.asInstanceOf[js.Any])
  }
}
