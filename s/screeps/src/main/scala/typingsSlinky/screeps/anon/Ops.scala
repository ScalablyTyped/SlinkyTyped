package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`1000000`
import typingsSlinky.screeps.screepsNumbers.`1000`
import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsNumbers.`2000000`
import typingsSlinky.screeps.screepsNumbers.`4000000`
import typingsSlinky.screeps.screepsNumbers.`500000`
import typingsSlinky.screeps.screepsNumbers.`7000000`
import typingsSlinky.screeps.screepsNumbers.`800`
import typingsSlinky.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ops extends StObject {
  
  var className: operator = js.native
  
  var cooldown: `800` = js.native
  
  var duration: `1000` = js.native
  
  var effect: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`] = js.native
  
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
object Ops {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: `800`,
    duration: `1000`,
    effect: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    ops: `100`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): Ops = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ops]
  }
  
  @scala.inline
  implicit class OpsMutableBuilder[Self <: Ops] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `800`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `1000`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
    def setOps(value: `100`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
