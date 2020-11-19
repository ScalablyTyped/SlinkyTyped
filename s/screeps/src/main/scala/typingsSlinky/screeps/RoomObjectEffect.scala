package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Discriminated union of possible effects on `effect`
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.NaturalEffect
  - typingsSlinky.screeps.PowerEffect
*/
trait RoomObjectEffect extends js.Object
object RoomObjectEffect {
  
  @scala.inline
  def NaturalEffect(effect: EffectConstant, ticksRemaining: Double): RoomObjectEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomObjectEffect]
  }
  
  @scala.inline
  def PowerEffect(effect: PowerConstant, level: Double, power: PowerConstant, ticksRemaining: Double): RoomObjectEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomObjectEffect]
  }
}
