package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`1000`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNameCooldown extends js.Object {
  var className: operator = js.native
  var cooldown: `50` = js.native
  var duration: `1000` = js.native
  var effect: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`4`, 
    typingsSlinky.screeps.screepsNumbers.`6`, 
    typingsSlinky.screeps.screepsNumbers.`8`, 
    typingsSlinky.screeps.screepsNumbers.`10`
  ] = js.native
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`0`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`7`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
  var ops: typingsSlinky.screeps.screepsNumbers.`10` = js.native
  var range: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}

object ClassNameCooldown {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `50`,
    duration: `1000`,
    effect: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`4`, 
      typingsSlinky.screeps.screepsNumbers.`6`, 
      typingsSlinky.screeps.screepsNumbers.`8`, 
      typingsSlinky.screeps.screepsNumbers.`10`
    ],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    ops: typingsSlinky.screeps.screepsNumbers.`10`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): ClassNameCooldown = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameCooldown]
  }
  @scala.inline
  implicit class ClassNameCooldownOps[Self <: ClassNameCooldown] (val x: Self) extends AnyVal {
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
    def withCooldown(value: `50`): Self = {
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
          typingsSlinky.screeps.screepsNumbers.`2`, 
          typingsSlinky.screeps.screepsNumbers.`4`, 
          typingsSlinky.screeps.screepsNumbers.`6`, 
          typingsSlinky.screeps.screepsNumbers.`8`, 
          typingsSlinky.screeps.screepsNumbers.`10`
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withOps(value: typingsSlinky.screeps.screepsNumbers.`10`): Self = {
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

