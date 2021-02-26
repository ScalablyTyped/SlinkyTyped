package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`0.2`
import typingsSlinky.screeps.screepsNumbers.`0.4`
import typingsSlinky.screeps.screepsNumbers.`0.6`
import typingsSlinky.screeps.screepsNumbers.`0.8`
import typingsSlinky.screeps.screepsNumbers.`1.0`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CooldownEffect extends StObject {
  
  var className: operator = js.native
  
  var cooldown: `50` = js.native
  
  var effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`] = js.native
  
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`0`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`7`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
  
  var ops: typingsSlinky.screeps.screepsNumbers.`2` = js.native
  
  var range: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}
object CooldownEffect {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: `50`,
    effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    ops: typingsSlinky.screeps.screepsNumbers.`2`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): CooldownEffect = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CooldownEffect]
  }
  
  @scala.inline
  implicit class CooldownEffectMutableBuilder[Self <: CooldownEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `50`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
    def setOps(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
