package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Harvest extends js.Object {
  var harvest: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}

object Harvest {
  @scala.inline
  def apply(harvest: typingsSlinky.screeps.screepsNumbers.`3`): Harvest = {
    val __obj = js.Dynamic.literal(harvest = harvest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Harvest]
  }
  @scala.inline
  implicit class HarvestOps[Self <: Harvest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHarvest(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harvest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

