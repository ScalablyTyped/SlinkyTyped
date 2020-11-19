package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heal extends js.Object {
  
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
  implicit class HealOps[Self <: Heal] (val x: Self) extends AnyVal {
    
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
    def setHeal(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = this.set("heal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangedHeal(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = this.set("rangedHeal", value.asInstanceOf[js.Any])
  }
}
