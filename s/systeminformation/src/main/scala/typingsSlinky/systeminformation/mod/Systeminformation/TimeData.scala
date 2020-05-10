package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 1. General
@js.native
trait TimeData extends js.Object {
  var current: String = js.native
  var timezone: String = js.native
  var timezoneName: String = js.native
  var uptime: String = js.native
}

object TimeData {
  @scala.inline
  def apply(current: String, timezone: String, timezoneName: String, uptime: String): TimeData = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], timezoneName = timezoneName.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeData]
  }
  @scala.inline
  implicit class TimeDataOps[Self <: TimeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezoneName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUptime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

