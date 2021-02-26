package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNameCooldownDuration extends StObject {
  
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
  
  var ops: typingsSlinky.screeps.screepsNumbers.`5` = js.native
  
  var range: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}
object ClassNameCooldownDuration {
  
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
    ops: typingsSlinky.screeps.screepsNumbers.`5`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): ClassNameCooldownDuration = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameCooldownDuration]
  }
  
  @scala.inline
  implicit class ClassNameCooldownDurationMutableBuilder[Self <: ClassNameCooldownDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: typingsSlinky.screeps.screepsNumbers.`5`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`1`, 
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`3`, 
          typingsSlinky.screeps.screepsNumbers.`4`, 
          typingsSlinky.screeps.screepsNumbers.`5`
        ]
    ): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`0`, 
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`7`, 
          typingsSlinky.screeps.screepsNumbers.`14`, 
          typingsSlinky.screeps.screepsNumbers.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: typingsSlinky.screeps.screepsNumbers.`5`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
