package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effect extends StObject {
  
  var className: operator = js.native
  
  var cooldown: `50` = js.native
  
  var effect: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`1`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`4`, 
    typingsSlinky.screeps.screepsNumbers.`6`, 
    typingsSlinky.screeps.screepsNumbers.`8`
  ] = js.native
  
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`0`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`7`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
}
object Effect {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: `50`,
    effect: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`1`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`4`, 
      typingsSlinky.screeps.screepsNumbers.`6`, 
      typingsSlinky.screeps.screepsNumbers.`8`
    ],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ]
  ): Effect = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  
  @scala.inline
  implicit class EffectMutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `50`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`1`, 
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`4`, 
          typingsSlinky.screeps.screepsNumbers.`6`, 
          typingsSlinky.screeps.screepsNumbers.`8`
        ]
    ): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
  }
}
