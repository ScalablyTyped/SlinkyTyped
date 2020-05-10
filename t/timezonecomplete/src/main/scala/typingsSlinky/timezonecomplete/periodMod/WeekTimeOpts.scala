package typingsSlinky.timezonecomplete.periodMod

import typingsSlinky.timezonecomplete.basicsMod.WeekDay
import typingsSlinky.timezonecomplete.datetimeMod.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeekTimeOpts extends js.Object {
  /**
    * Desired time (hours 0-23)
    */
  var hour: Double = js.native
  /**
    * Desired time (milliseconds 0-999)
    */
  var millisecond: js.UndefOr[Double] = js.native
  /**
    * Desired time (minutes 0-59)
    */
  var minute: js.UndefOr[Double] = js.native
  /**
    * Timestamp to use as a basis
    */
  var reference: DateTime = js.native
  /**
    * Desired time (seconds 0-59)
    */
  var second: js.UndefOr[Double] = js.native
  /**
    * Desired day of week
    */
  var weekday: WeekDay = js.native
}

object WeekTimeOpts {
  @scala.inline
  def apply(hour: Double, reference: DateTime, weekday: WeekDay): WeekTimeOpts = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekTimeOpts]
  }
  @scala.inline
  implicit class WeekTimeOptsOps[Self <: WeekTimeOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekday(value: WeekDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMillisecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecond")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.undefined)
        ret
    }
  }
  
}

