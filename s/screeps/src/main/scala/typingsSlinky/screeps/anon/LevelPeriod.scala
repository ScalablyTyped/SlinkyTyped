package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelPeriod extends js.Object {
  
  var className: operator = js.native
  
  var cooldown: `100` = js.native
  
  var duration: `100` = js.native
  
  var effect: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`4`, 
    typingsSlinky.screeps.screepsNumbers.`6`, 
    typingsSlinky.screeps.screepsNumbers.`8`, 
    typingsSlinky.screeps.screepsNumbers.`10`
  ] = js.native
  
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`10`, 
    typingsSlinky.screeps.screepsNumbers.`11`, 
    typingsSlinky.screeps.screepsNumbers.`12`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
  
  var period: typingsSlinky.screeps.screepsNumbers.`10` = js.native
  
  var range: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}
object LevelPeriod {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: `100`,
    duration: `100`,
    effect: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`4`, 
      typingsSlinky.screeps.screepsNumbers.`6`, 
      typingsSlinky.screeps.screepsNumbers.`8`, 
      typingsSlinky.screeps.screepsNumbers.`10`
    ],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`10`, 
      typingsSlinky.screeps.screepsNumbers.`11`, 
      typingsSlinky.screeps.screepsNumbers.`12`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    period: typingsSlinky.screeps.screepsNumbers.`10`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): LevelPeriod = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelPeriod]
  }
  
  @scala.inline
  implicit class LevelPeriodOps[Self <: LevelPeriod] (val x: Self) extends AnyVal {
    
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
    def setCooldown(value: `100`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `100`): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`4`, 
          typingsSlinky.screeps.screepsNumbers.`6`, 
          typingsSlinky.screeps.screepsNumbers.`8`, 
          typingsSlinky.screeps.screepsNumbers.`10`
        ]
    ): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`10`, 
          typingsSlinky.screeps.screepsNumbers.`11`, 
          typingsSlinky.screeps.screepsNumbers.`12`, 
          typingsSlinky.screeps.screepsNumbers.`14`, 
          typingsSlinky.screeps.screepsNumbers.`22`
        ]
    ): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: typingsSlinky.screeps.screepsNumbers.`10`): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
