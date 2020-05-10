package typingsSlinky.timezoneSupport.data19002050Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZoneData extends js.Object {
  var links: js.Array[String] = js.native
  var zones: PackedTimeZones = js.native
}

object TimeZoneData {
  @scala.inline
  def apply(links: js.Array[String], zones: PackedTimeZones): TimeZoneData = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneData]
  }
  @scala.inline
  implicit class TimeZoneDataOps[Self <: TimeZoneData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZones(value: PackedTimeZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

