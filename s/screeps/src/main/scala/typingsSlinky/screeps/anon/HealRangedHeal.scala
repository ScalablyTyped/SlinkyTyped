package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealRangedHeal extends js.Object {
  
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
  implicit class HealRangedHealOps[Self <: HealRangedHeal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeal(value: typingsSlinky.screeps.screepsNumbers.`4`): Self = this.set("heal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedHeal(value: typingsSlinky.screeps.screepsNumbers.`4`): Self = this.set("rangedHeal", value.asInstanceOf[js.Any])
  }
}
