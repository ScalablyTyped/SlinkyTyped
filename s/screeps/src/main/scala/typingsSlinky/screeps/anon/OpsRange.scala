package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`40`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsRange extends js.Object {
  var className: operator = js.native
  var cooldown: typingsSlinky.screeps.screepsNumbers.`8` = js.native
  var duration: typingsSlinky.screeps.screepsNumbers.`10` = js.native
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`20`, 
    typingsSlinky.screeps.screepsNumbers.`21`, 
    typingsSlinky.screeps.screepsNumbers.`22`, 
    typingsSlinky.screeps.screepsNumbers.`23`, 
    typingsSlinky.screeps.screepsNumbers.`24`
  ] = js.native
  var ops: js.Tuple5[
    `50`, 
    `40`, 
    typingsSlinky.screeps.screepsNumbers.`30`, 
    typingsSlinky.screeps.screepsNumbers.`20`, 
    typingsSlinky.screeps.screepsNumbers.`10`
  ] = js.native
  var range: `50` = js.native
}

object OpsRange {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typingsSlinky.screeps.screepsNumbers.`8`,
    duration: typingsSlinky.screeps.screepsNumbers.`10`,
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`20`, 
      typingsSlinky.screeps.screepsNumbers.`21`, 
      typingsSlinky.screeps.screepsNumbers.`22`, 
      typingsSlinky.screeps.screepsNumbers.`23`, 
      typingsSlinky.screeps.screepsNumbers.`24`
    ],
    ops: js.Tuple5[
      `50`, 
      `40`, 
      typingsSlinky.screeps.screepsNumbers.`30`, 
      typingsSlinky.screeps.screepsNumbers.`20`, 
      typingsSlinky.screeps.screepsNumbers.`10`
    ],
    range: `50`
  ): OpsRange = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsRange]
  }
  @scala.inline
  implicit class OpsRangeOps[Self <: OpsRange] (val x: Self) extends AnyVal {
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
    def withCooldown(value: typingsSlinky.screeps.screepsNumbers.`8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: typingsSlinky.screeps.screepsNumbers.`10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`20`, 
          typingsSlinky.screeps.screepsNumbers.`21`, 
          typingsSlinky.screeps.screepsNumbers.`22`, 
          typingsSlinky.screeps.screepsNumbers.`23`, 
          typingsSlinky.screeps.screepsNumbers.`24`
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOps(
      value: js.Tuple5[
          `50`, 
          `40`, 
          typingsSlinky.screeps.screepsNumbers.`30`, 
          typingsSlinky.screeps.screepsNumbers.`20`, 
          typingsSlinky.screeps.screepsNumbers.`10`
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: `50`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

