package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6` extends js.Object {
  
  var attack: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}
object `6` {
  
  @scala.inline
  def apply(attack: typingsSlinky.screeps.screepsNumbers.`3`): `6` = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6Ops`[Self <: `6`] (val x: Self) extends AnyVal {
    
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
    def setAttack(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = this.set("attack", value.asInstanceOf[js.Any])
  }
}
