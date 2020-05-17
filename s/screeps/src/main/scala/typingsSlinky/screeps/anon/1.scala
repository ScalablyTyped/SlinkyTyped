package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  var harvest: typingsSlinky.screeps.screepsNumbers.`7` = js.native
}

object `1` {
  @scala.inline
  def apply(harvest: typingsSlinky.screeps.screepsNumbers.`7`): `1` = {
    val __obj = js.Dynamic.literal(harvest = harvest.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHarvest(value: typingsSlinky.screeps.screepsNumbers.`7`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harvest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

