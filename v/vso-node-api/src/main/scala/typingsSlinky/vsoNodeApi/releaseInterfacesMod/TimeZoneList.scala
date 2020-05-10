package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZoneList extends js.Object {
  var utcTimeZone: TimeZone = js.native
  var validTimeZones: js.Array[TimeZone] = js.native
}

object TimeZoneList {
  @scala.inline
  def apply(utcTimeZone: TimeZone, validTimeZones: js.Array[TimeZone]): TimeZoneList = {
    val __obj = js.Dynamic.literal(utcTimeZone = utcTimeZone.asInstanceOf[js.Any], validTimeZones = validTimeZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneList]
  }
  @scala.inline
  implicit class TimeZoneListOps[Self <: TimeZoneList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtcTimeZone(value: TimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidTimeZones(value: js.Array[TimeZone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validTimeZones")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

