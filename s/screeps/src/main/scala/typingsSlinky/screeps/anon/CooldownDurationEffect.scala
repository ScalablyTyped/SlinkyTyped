package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`1000`
import typingsSlinky.screeps.screepsNumbers.`200`
import typingsSlinky.screeps.screepsNumbers.`800`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CooldownDurationEffect extends js.Object {
  var className: operator = js.native
  var cooldown: `800` = js.native
  var duration: `1000` = js.native
  var effect: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`1`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`3`, 
    typingsSlinky.screeps.screepsNumbers.`4`, 
    typingsSlinky.screeps.screepsNumbers.`5`
  ] = js.native
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`10`, 
    typingsSlinky.screeps.screepsNumbers.`11`, 
    typingsSlinky.screeps.screepsNumbers.`12`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
  var ops: `200` = js.native
  var range: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}

object CooldownDurationEffect {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `800`,
    duration: `1000`,
    effect: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`1`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`3`, 
      typingsSlinky.screeps.screepsNumbers.`4`, 
      typingsSlinky.screeps.screepsNumbers.`5`
    ],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`10`, 
      typingsSlinky.screeps.screepsNumbers.`11`, 
      typingsSlinky.screeps.screepsNumbers.`12`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    ops: `200`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): CooldownDurationEffect = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CooldownDurationEffect]
  }
  @scala.inline
  implicit class CooldownDurationEffectOps[Self <: CooldownDurationEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: operator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCooldown(value: `800`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: `1000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffect(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`1`, 
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`3`, 
          typingsSlinky.screeps.screepsNumbers.`4`, 
          typingsSlinky.screeps.screepsNumbers.`5`
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`10`, 
          typingsSlinky.screeps.screepsNumbers.`11`, 
          typingsSlinky.screeps.screepsNumbers.`12`, 
          typingsSlinky.screeps.screepsNumbers.`14`, 
          typingsSlinky.screeps.screepsNumbers.`22`
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOps(value: `200`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

