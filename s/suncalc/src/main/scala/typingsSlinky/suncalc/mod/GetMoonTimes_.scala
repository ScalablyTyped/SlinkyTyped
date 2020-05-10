package typingsSlinky.suncalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMoonTimes_ extends js.Object {
  var alwaysDown: Boolean = js.native
  var alwaysUp: Boolean = js.native
  var rise: js.Date = js.native
  var set: js.Date = js.native
}

object GetMoonTimes_ {
  @scala.inline
  def apply(alwaysDown: Boolean, alwaysUp: Boolean, rise: js.Date, set: js.Date): GetMoonTimes_ = {
    val __obj = js.Dynamic.literal(alwaysDown = alwaysDown.asInstanceOf[js.Any], alwaysUp = alwaysUp.asInstanceOf[js.Any], rise = rise.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMoonTimes_]
  }
  @scala.inline
  implicit class GetMoonTimes_Ops[Self <: GetMoonTimes_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRise(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

