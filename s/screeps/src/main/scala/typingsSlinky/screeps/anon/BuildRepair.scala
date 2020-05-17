package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildRepair extends js.Object {
  var build: typingsSlinky.screeps.screepsNumbers.`2` = js.native
  var repair: typingsSlinky.screeps.screepsNumbers.`2` = js.native
}

object BuildRepair {
  @scala.inline
  def apply(build: typingsSlinky.screeps.screepsNumbers.`2`, repair: typingsSlinky.screeps.screepsNumbers.`2`): BuildRepair = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRepair]
  }
  @scala.inline
  implicit class BuildRepairOps[Self <: BuildRepair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepair(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repair")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

