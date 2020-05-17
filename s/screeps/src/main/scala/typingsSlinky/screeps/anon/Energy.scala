package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`10000`
import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsNumbers.`15000`
import typingsSlinky.screeps.screepsNumbers.`20000`
import typingsSlinky.screeps.screepsNumbers.`25000`
import typingsSlinky.screeps.screepsNumbers.`5000`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Energy extends js.Object {
  var className: operator = js.native
  var cooldown: typingsSlinky.screeps.screepsNumbers.`20` = js.native
  var duration: `50` = js.native
  var effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`] = js.native
  var energy: `100` = js.native
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`0`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`7`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
}

object Energy {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typingsSlinky.screeps.screepsNumbers.`20`,
    duration: `50`,
    effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`],
    energy: `100`,
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ]
  ): Energy = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Energy]
  }
  @scala.inline
  implicit class EnergyOps[Self <: Energy] (val x: Self) extends AnyVal {
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
    def withCooldown(value: typingsSlinky.screeps.screepsNumbers.`20`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: `50`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffect(value: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnergy(value: `100`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`0`, 
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`7`, 
          typingsSlinky.screeps.screepsNumbers.`14`, 
          typingsSlinky.screeps.screepsNumbers.`22`
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

