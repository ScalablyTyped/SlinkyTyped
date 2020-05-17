package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var harvest: typingsSlinky.screeps.screepsNumbers.`5` = js.native
}

object `0` {
  @scala.inline
  def apply(harvest: typingsSlinky.screeps.screepsNumbers.`5`): `0` = {
    val __obj = js.Dynamic.literal(harvest = harvest.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHarvest(value: typingsSlinky.screeps.screepsNumbers.`5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harvest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

