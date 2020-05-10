package typingsSlinky.timezoneSupport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZoneOffset extends js.Object {
  var abbreviation: js.UndefOr[String] = js.native
  var offset: Double = js.native
}

object TimeZoneOffset {
  @scala.inline
  def apply(offset: Double): TimeZoneOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneOffset]
  }
  @scala.inline
  implicit class TimeZoneOffsetOps[Self <: TimeZoneOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbbreviation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbbreviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviation")(js.undefined)
        ret
    }
  }
  
}

