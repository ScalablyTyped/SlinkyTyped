package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationLevel extends js.Object {
  
  var className: operator = js.native
  
  var cooldown: typingsSlinky.screeps.screepsNumbers.`5` = js.native
  
  var duration: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`1`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`3`, 
    typingsSlinky.screeps.screepsNumbers.`4`, 
    typingsSlinky.screeps.screepsNumbers.`5`
  ] = js.native
  
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`0`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`7`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
  
  var ops: typingsSlinky.screeps.screepsNumbers.`10` = js.native
  
  var range: typingsSlinky.screeps.screepsNumbers.`20` = js.native
}
object DurationLevel {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: typingsSlinky.screeps.screepsNumbers.`5`,
    duration: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`1`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`3`, 
      typingsSlinky.screeps.screepsNumbers.`4`, 
      typingsSlinky.screeps.screepsNumbers.`5`
    ],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    ops: typingsSlinky.screeps.screepsNumbers.`10`,
    range: typingsSlinky.screeps.screepsNumbers.`20`
  ): DurationLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationLevel]
  }
  
  @scala.inline
  implicit class DurationLevelOps[Self <: DurationLevel] (val x: Self) extends AnyVal {
    
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
    def setCooldown(value: typingsSlinky.screeps.screepsNumbers.`5`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`1`, 
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`3`, 
          typingsSlinky.screeps.screepsNumbers.`4`, 
          typingsSlinky.screeps.screepsNumbers.`5`
        ]
    ): Self = this.set("duration", value.asInstanceOf[js.Any])
    
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
    def setOps(value: typingsSlinky.screeps.screepsNumbers.`10`): Self = this.set("ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typingsSlinky.screeps.screepsNumbers.`20`): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
