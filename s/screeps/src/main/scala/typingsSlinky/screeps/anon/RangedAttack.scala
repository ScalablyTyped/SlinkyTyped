package typingsSlinky.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangedAttack extends StObject {
  
  var rangedAttack: typingsSlinky.screeps.screepsNumbers.`2` = js.native
  
  var rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`2` = js.native
}
object RangedAttack {
  
  @scala.inline
  def apply(
    rangedAttack: typingsSlinky.screeps.screepsNumbers.`2`,
    rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`2`
  ): RangedAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedAttack]
  }
  
  @scala.inline
  implicit class RangedAttackMutableBuilder[Self <: RangedAttack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRangedAttack(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = StObject.set(x, "rangedAttack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedMassAttack(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = StObject.set(x, "rangedMassAttack", value.asInstanceOf[js.Any])
  }
}
