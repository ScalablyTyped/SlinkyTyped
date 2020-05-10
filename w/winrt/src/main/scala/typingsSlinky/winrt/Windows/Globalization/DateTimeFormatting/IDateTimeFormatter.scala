package typingsSlinky.winrt.Windows.Globalization.DateTimeFormatting

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateTimeFormatter extends js.Object {
  var calendar: String = js.native
  var clock: String = js.native
  var geographicRegion: String = js.native
  var includeDay: DayFormat = js.native
  var includeDayOfWeek: DayOfWeekFormat = js.native
  var includeHour: HourFormat = js.native
  var includeMinute: MinuteFormat = js.native
  var includeMonth: MonthFormat = js.native
  var includeSecond: SecondFormat = js.native
  var includeYear: YearFormat = js.native
  var languages: IVectorView[String] = js.native
  var numeralSystem: String = js.native
  var patterns: IVectorView[String] = js.native
  var resolvedGeographicRegion: String = js.native
  var resolvedLanguage: String = js.native
  var template: String = js.native
  def format(value: js.Date): String = js.native
}

object IDateTimeFormatter {
  @scala.inline
  def apply(
    calendar: String,
    clock: String,
    format: js.Date => String,
    geographicRegion: String,
    includeDay: DayFormat,
    includeDayOfWeek: DayOfWeekFormat,
    includeHour: HourFormat,
    includeMinute: MinuteFormat,
    includeMonth: MonthFormat,
    includeSecond: SecondFormat,
    includeYear: YearFormat,
    languages: IVectorView[String],
    numeralSystem: String,
    patterns: IVectorView[String],
    resolvedGeographicRegion: String,
    resolvedLanguage: String,
    template: String
  ): IDateTimeFormatter = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], clock = clock.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), geographicRegion = geographicRegion.asInstanceOf[js.Any], includeDay = includeDay.asInstanceOf[js.Any], includeDayOfWeek = includeDayOfWeek.asInstanceOf[js.Any], includeHour = includeHour.asInstanceOf[js.Any], includeMinute = includeMinute.asInstanceOf[js.Any], includeMonth = includeMonth.asInstanceOf[js.Any], includeSecond = includeSecond.asInstanceOf[js.Any], includeYear = includeYear.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateTimeFormatter]
  }
  @scala.inline
  implicit class IDateTimeFormatterOps[Self <: IDateTimeFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGeographicRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geographicRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeDay(value: DayFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeDayOfWeek(value: DayOfWeekFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeHour(value: HourFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMinute(value: MinuteFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMonth(value: MonthFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeSecond(value: SecondFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeYear(value: YearFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumeralSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatterns(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedGeographicRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedGeographicRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

