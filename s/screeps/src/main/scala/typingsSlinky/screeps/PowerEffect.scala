package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Effect applied to room object as result of a `PowerCreep.usePower`.
  */
@js.native
trait PowerEffect extends RoomObjectEffect {
  /**
    * Effect ID of the applied effect. `PWR_*` constant.
    */
  var effect: PowerConstant = js.native
  /**
    * Power level of the applied effect.
    */
  var level: Double = js.native
  /**
    * @deprecated Power ID of the applied effect. `PWR_*` constant. No longer documented, will be removed.
    */
  var power: PowerConstant = js.native
  /**
    * How many ticks will the effect last.
    */
  var ticksRemaining: Double = js.native
}

object PowerEffect {
  @scala.inline
  def apply(effect: PowerConstant, level: Double, power: PowerConstant, ticksRemaining: Double): PowerEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], ticksRemaining = ticksRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerEffect]
  }
  @scala.inline
  implicit class PowerEffectOps[Self <: PowerEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: PowerConstant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPower(value: PowerConstant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicksRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksRemaining")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

