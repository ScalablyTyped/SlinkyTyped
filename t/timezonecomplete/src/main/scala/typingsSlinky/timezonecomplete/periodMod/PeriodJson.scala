package typingsSlinky.timezonecomplete.periodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeriodJson extends js.Object {
  /**
    * Interval as a timezonecomplete duration string
    */
  var duration: String = js.native
  /**
    * Daylight saving time handling
    */
  var periodDst: PeriodDstJson = js.native
  /**
    * Reference date as iso timestamp + time zone
    */
  var reference: String = js.native
}

object PeriodJson {
  @scala.inline
  def apply(duration: String, periodDst: PeriodDstJson, reference: String): PeriodJson = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], periodDst = periodDst.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodJson]
  }
  @scala.inline
  implicit class PeriodJsonOps[Self <: PeriodJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriodDst(value: PeriodDstJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodDst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

