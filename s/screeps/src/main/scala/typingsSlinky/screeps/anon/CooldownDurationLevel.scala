package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`1000`
import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsNumbers.`800`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CooldownDurationLevel extends js.Object {
  
  var className: operator = js.native
  
  var cooldown: `1000` = js.native
  
  var duration: `800` = js.native
  
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`0`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`7`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
  
  var ops: `100` = js.native
  
  var range: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}
object CooldownDurationLevel {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: `1000`,
    duration: `800`,
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    ops: `100`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): CooldownDurationLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CooldownDurationLevel]
  }
  
  @scala.inline
  implicit class CooldownDurationLevelOps[Self <: CooldownDurationLevel] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: operator): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `1000`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `800`): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`0`, 
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`7`, 
          typingsSlinky.screeps.screepsNumbers.`14`, 
          typingsSlinky.screeps.screepsNumbers.`22`
        ]
    ): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: `100`): Self = this.set("ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
