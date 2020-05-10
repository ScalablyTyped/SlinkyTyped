package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStat extends js.Object {
  var stat: Stats = js.native
}

object AnonStat {
  @scala.inline
  def apply(stat: Stats): AnonStat = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStat]
  }
  @scala.inline
  implicit class AnonStatOps[Self <: AnonStat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStat(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

