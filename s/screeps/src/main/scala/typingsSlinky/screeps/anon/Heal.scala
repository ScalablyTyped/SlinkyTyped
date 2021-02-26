package typingsSlinky.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heal extends StObject {
  
  var heal: typingsSlinky.screeps.screepsNumbers.`2` = js.native
  
  var rangedHeal: typingsSlinky.screeps.screepsNumbers.`2` = js.native
}
object Heal {
  
  @scala.inline
  def apply(
    heal: typingsSlinky.screeps.screepsNumbers.`2`,
    rangedHeal: typingsSlinky.screeps.screepsNumbers.`2`
  ): Heal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heal]
  }
  
  @scala.inline
  implicit class HealMutableBuilder[Self <: Heal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeal(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = StObject.set(x, "heal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedHeal(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = StObject.set(x, "rangedHeal", value.asInstanceOf[js.Any])
  }
}
