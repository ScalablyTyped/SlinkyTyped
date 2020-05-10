package typingsSlinky.timeago.Timeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedStrings extends js.Object {
  var day: String | DynamicMessage = js.native
  var days: String | DynamicMessage = js.native
  var hour: String | DynamicMessage = js.native
  var hours: String | DynamicMessage = js.native
  var inPast: String = js.native
  var minute: String | DynamicMessage = js.native
  var minutes: String | DynamicMessage = js.native
  var month: String | DynamicMessage = js.native
  var months: String | DynamicMessage = js.native
  var numbers: js.Array[String] = js.native
  var prefixAgo: String | Null = js.native
  var prefixFromNow: String | Null = js.native
  var seconds: String | DynamicMessage = js.native
  var suffixAgo: String | Null = js.native
  var suffixFromNow: String | Null = js.native
  var wordSeparator: String = js.native
  var year: String | DynamicMessage = js.native
  var years: String | DynamicMessage = js.native
}

object LocalizedStrings {
  @scala.inline
  def apply(
    day: String | DynamicMessage,
    days: String | DynamicMessage,
    hour: String | DynamicMessage,
    hours: String | DynamicMessage,
    inPast: String,
    minute: String | DynamicMessage,
    minutes: String | DynamicMessage,
    month: String | DynamicMessage,
    months: String | DynamicMessage,
    numbers: js.Array[String],
    seconds: String | DynamicMessage,
    wordSeparator: String,
    year: String | DynamicMessage,
    years: String | DynamicMessage
  ): LocalizedStrings = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], inPast = inPast.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], wordSeparator = wordSeparator.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedStrings]
  }
  @scala.inline
  implicit class LocalizedStringsOps[Self <: LocalizedStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDay(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDays(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHour(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoursFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHours(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInPast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinuteFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMinute(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinutesFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMinutes(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMonth(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMonths(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumbers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeconds(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withYear(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withYears(value: String | DynamicMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixAgo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixAgo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixAgoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixAgo")(null)
        ret
    }
    @scala.inline
    def withPrefixFromNow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixFromNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixFromNowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixFromNow")(null)
        ret
    }
    @scala.inline
    def withSuffixAgo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixAgo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffixAgoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixAgo")(null)
        ret
    }
    @scala.inline
    def withSuffixFromNow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixFromNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffixFromNowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixFromNow")(null)
        ret
    }
  }
  
}

