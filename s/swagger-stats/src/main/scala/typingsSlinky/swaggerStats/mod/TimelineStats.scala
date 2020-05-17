package typingsSlinky.swaggerStats.mod

import typingsSlinky.std.Record
import typingsSlinky.swaggerStats.anon.Bucketcurrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineStats extends js.Object {
  var data: Record[String, TimelineStatsData] = js.native
  var settings: Bucketcurrent = js.native
}

object TimelineStats {
  @scala.inline
  def apply(data: Record[String, TimelineStatsData], settings: Bucketcurrent): TimelineStats = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineStats]
  }
  @scala.inline
  implicit class TimelineStatsOps[Self <: TimelineStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Record[String, TimelineStatsData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: Bucketcurrent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

