package typingsSlinky.winrt.Windows.Globalization.DateTimeFormatting

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
@js.native
class DateTimeFormatter protected () extends IDateTimeFormatter {
  def this(formatTemplate: String) = this()
  def this(formatTemplate: String, languages: IIterable[String]) = this()
  def this(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat) = this()
  def this(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat
  ) = this()
  def this(
    formatTemplate: String,
    languages: IIterable[String],
    geographicRegion: String,
    calendar: String,
    clock: String
  ) = this()
  def this(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable[String]
  ) = this()
  def this(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable[String],
    geographicRegion: String,
    calendar: String,
    clock: String
  ) = this()
}

/* static members */
@JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
@js.native
object DateTimeFormatter extends js.Object {
  var longDate: DateTimeFormatter = js.native
  var longTime: DateTimeFormatter = js.native
  var shortDate: DateTimeFormatter = js.native
  var shortTime: DateTimeFormatter = js.native
}

