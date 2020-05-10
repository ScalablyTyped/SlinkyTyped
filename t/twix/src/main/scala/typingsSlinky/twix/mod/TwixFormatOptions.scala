package typingsSlinky.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwixFormatOptions extends js.Object {
  var allDay: js.UndefOr[js.Any] = js.native
  var dayFormat: js.UndefOr[String] = js.native
   // boolean | string
  var explicitAllDay: js.UndefOr[Boolean] = js.native
  var groupMeridiems: js.UndefOr[Boolean] = js.native
  var hideDate: js.UndefOr[Boolean] = js.native
  var hideTime: js.UndefOr[Boolean] = js.native
  var hideYear: js.UndefOr[Boolean] = js.native
  var hourFormat: js.UndefOr[String] = js.native
  var implicitMinutes: js.UndefOr[Boolean] = js.native
  var implicitYear: js.UndefOr[Boolean] = js.native
  var lastNightEndsAt: js.UndefOr[Double] = js.native
  var meridiemFormat: js.UndefOr[String] = js.native
  var minuteFormat: js.UndefOr[String] = js.native
  var monthFormat: js.UndefOr[String] = js.native
  var showDate: js.UndefOr[Boolean] = js.native
  var showDayOfWeek: js.UndefOr[Boolean] = js.native
  var spaceBeforeMeridiem: js.UndefOr[Boolean] = js.native
  var twentyFourHour: js.UndefOr[Boolean] = js.native
  var weekdayFormat: js.UndefOr[String] = js.native
  var yearFormat: js.UndefOr[String] = js.native
}

object TwixFormatOptions {
  @scala.inline
  def apply(): TwixFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwixFormatOptions]
  }
  @scala.inline
  implicit class TwixFormatOptionsOps[Self <: TwixFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllDay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(js.undefined)
        ret
    }
    @scala.inline
    def withDayFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitAllDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitAllDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitAllDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitAllDay")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupMeridiems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMeridiems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupMeridiems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMeridiems")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDate")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHideYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideYear")(js.undefined)
        ret
    }
    @scala.inline
    def withHourFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicitMinutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicitYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitYear")(js.undefined)
        ret
    }
    @scala.inline
    def withLastNightEndsAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastNightEndsAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastNightEndsAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastNightEndsAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridiemFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeridiemFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDayOfWeek(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceBeforeMeridiem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBeforeMeridiem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceBeforeMeridiem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBeforeMeridiem")(js.undefined)
        ret
    }
    @scala.inline
    def withTwentyFourHour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twentyFourHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwentyFourHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twentyFourHour")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdayFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withYearFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearFormat")(js.undefined)
        ret
    }
  }
  
}

