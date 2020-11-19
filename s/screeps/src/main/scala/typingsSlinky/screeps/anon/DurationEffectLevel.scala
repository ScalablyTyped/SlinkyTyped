package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`1000`
import typingsSlinky.screeps.screepsNumbers.`200`
import typingsSlinky.screeps.screepsNumbers.`40`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsNumbers.`800`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationEffectLevel extends js.Object {
  
  var className: operator = js.native
  
  var cooldown: `800` = js.native
  
  var duration: `1000` = js.native
  
  var effect: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`10`, 
    typingsSlinky.screeps.screepsNumbers.`20`, 
    typingsSlinky.screeps.screepsNumbers.`30`, 
    `40`, 
    `50`
  ] = js.native
  
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`20`, 
    typingsSlinky.screeps.screepsNumbers.`21`, 
    typingsSlinky.screeps.screepsNumbers.`22`, 
    typingsSlinky.screeps.screepsNumbers.`23`, 
    typingsSlinky.screeps.screepsNumbers.`24`
  ] = js.native
  
  var ops: `200` = js.native
  
  var range: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}
object DurationEffectLevel {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: `800`,
    duration: `1000`,
    effect: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`10`, 
      typingsSlinky.screeps.screepsNumbers.`20`, 
      typingsSlinky.screeps.screepsNumbers.`30`, 
      `40`, 
      `50`
    ],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`20`, 
      typingsSlinky.screeps.screepsNumbers.`21`, 
      typingsSlinky.screeps.screepsNumbers.`22`, 
      typingsSlinky.screeps.screepsNumbers.`23`, 
      typingsSlinky.screeps.screepsNumbers.`24`
    ],
    ops: `200`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): DurationEffectLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEffectLevel]
  }
  
  @scala.inline
  implicit class DurationEffectLevelOps[Self <: DurationEffectLevel] (val x: Self) extends AnyVal {
    
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
    def setCooldown(value: `800`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `1000`): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`10`, 
          typingsSlinky.screeps.screepsNumbers.`20`, 
          typingsSlinky.screeps.screepsNumbers.`30`, 
          `40`, 
          `50`
        ]
    ): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`20`, 
          typingsSlinky.screeps.screepsNumbers.`21`, 
          typingsSlinky.screeps.screepsNumbers.`22`, 
          typingsSlinky.screeps.screepsNumbers.`23`, 
          typingsSlinky.screeps.screepsNumbers.`24`
        ]
    ): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: `200`): Self = this.set("ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
