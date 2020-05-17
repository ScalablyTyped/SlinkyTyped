package typingsSlinky.stellarBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinTime extends js.Object {
  var maxTime: js.UndefOr[Double | String] = js.native
  var minTime: js.UndefOr[Double | String] = js.native
}

object MinTime {
  @scala.inline
  def apply(): MinTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinTime]
  }
  @scala.inline
  implicit class MinTimeOps[Self <: MinTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxTime(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTime(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(js.undefined)
        ret
    }
  }
  
}

