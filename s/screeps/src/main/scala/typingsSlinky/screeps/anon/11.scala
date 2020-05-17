package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `11` extends js.Object {
  var fatigue: typingsSlinky.screeps.screepsNumbers.`4` = js.native
}

object `11` {
  @scala.inline
  def apply(fatigue: typingsSlinky.screeps.screepsNumbers.`4`): `11` = {
    val __obj = js.Dynamic.literal(fatigue = fatigue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  @scala.inline
  implicit class `11Ops`[Self <: `11`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatigue(value: typingsSlinky.screeps.screepsNumbers.`4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatigue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

