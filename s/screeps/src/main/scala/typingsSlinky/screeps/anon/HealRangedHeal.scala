package typingsSlinky.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealRangedHeal extends StObject {
  
  var heal: typingsSlinky.screeps.screepsNumbers.`4` = js.native
  
  var rangedHeal: typingsSlinky.screeps.screepsNumbers.`4` = js.native
}
object HealRangedHeal {
  
  @scala.inline
  def apply(
    heal: typingsSlinky.screeps.screepsNumbers.`4`,
    rangedHeal: typingsSlinky.screeps.screepsNumbers.`4`
  ): HealRangedHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealRangedHeal]
  }
  
  @scala.inline
  implicit class HealRangedHealMutableBuilder[Self <: HealRangedHeal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeal(value: typingsSlinky.screeps.screepsNumbers.`4`): Self = StObject.set(x, "heal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedHeal(value: typingsSlinky.screeps.screepsNumbers.`4`): Self = StObject.set(x, "rangedHeal", value.asInstanceOf[js.Any])
  }
}
