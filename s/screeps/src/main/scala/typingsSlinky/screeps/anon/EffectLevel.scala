package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`0.5`
import typingsSlinky.screeps.screepsNumbers.`0.6`
import typingsSlinky.screeps.screepsNumbers.`0.7`
import typingsSlinky.screeps.screepsNumbers.`0.8`
import typingsSlinky.screeps.screepsNumbers.`0.9`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectLevel extends StObject {
  
  var className: operator = js.native
  
  var cooldown: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var duration: typingsSlinky.screeps.screepsNumbers.`5` = js.native
  
  var effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`] = js.native
  
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`0`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`7`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
  
  var ops: typingsSlinky.screeps.screepsNumbers.`10` = js.native
  
  var range: `50` = js.native
}
object EffectLevel {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: typingsSlinky.screeps.screepsNumbers.`0`,
    duration: typingsSlinky.screeps.screepsNumbers.`5`,
    effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    ops: typingsSlinky.screeps.screepsNumbers.`10`,
    range: `50`
  ): EffectLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectLevel]
  }
  
  @scala.inline
  implicit class EffectLevelMutableBuilder[Self <: EffectLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: typingsSlinky.screeps.screepsNumbers.`0`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: typingsSlinky.screeps.screepsNumbers.`5`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
    def setOps(value: typingsSlinky.screeps.screepsNumbers.`10`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: `50`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
