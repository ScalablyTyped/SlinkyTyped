package typingsSlinky.vueI18n.mod.VueI18n

import typingsSlinky.vueI18n.vueI18nStrings.long
import typingsSlinky.vueI18n.vueI18nStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecificDateTimeFormatOptions
  extends typingsSlinky.std.Intl.DateTimeFormatOptions
     with DateTimeFormatOptions {
  @JSName("day")
  var day_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  @JSName("era")
  var era_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.native
  @JSName("formatMatcher")
  var formatMatcher_SpecificDateTimeFormatOptions: js.UndefOr[FormatMatcher] = js.native
  @JSName("hour")
  var hour_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  @JSName("localeMatcher")
  var localeMatcher_SpecificDateTimeFormatOptions: js.UndefOr[LocaleMatcher] = js.native
  @JSName("minute")
  var minute_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  @JSName("month")
  var month_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital | DateTimeHumanReadable] = js.native
  @JSName("second")
  var second_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  @JSName("timeZoneName")
  var timeZoneName_SpecificDateTimeFormatOptions: js.UndefOr[long | short] = js.native
  @JSName("weekday")
  var weekday_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.native
  @JSName("year")
  var year_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
}

object SpecificDateTimeFormatOptions {
  @scala.inline
  def apply(): SpecificDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecificDateTimeFormatOptions]
  }
  @scala.inline
  implicit class SpecificDateTimeFormatOptionsOps[Self <: SpecificDateTimeFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: DateTimeDigital): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withEra(value: DateTimeHumanReadable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("era")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("era")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMatcher(value: FormatMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: DateTimeDigital): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleMatcher(value: LocaleMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: DateTimeDigital): Self = {
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
    def withMonth(value: DateTimeDigital | DateTimeHumanReadable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond(value: DateTimeDigital): Self = {
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
    @scala.inline
    def withTimeZoneName(value: long | short): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneName")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekday(value: DateTimeHumanReadable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: DateTimeDigital): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}

