package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effect extends js.Object {
  
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
  implicit class EffectOps[Self <: Effect] (val x: Self) extends AnyVal {
    
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
    def setCooldown(value: `50`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`1`, 
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`4`, 
          typingsSlinky.screeps.screepsNumbers.`6`, 
          typingsSlinky.screeps.screepsNumbers.`8`
        ]
    ): Self = this.set("effect", value.asInstanceOf[js.Any])
    
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
  }
}
