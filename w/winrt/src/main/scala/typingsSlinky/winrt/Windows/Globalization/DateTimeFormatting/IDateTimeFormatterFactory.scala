package typingsSlinky.winrt.Windows.Globalization.DateTimeFormatting

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateTimeFormatterFactory extends js.Object {
  def createDateTimeFormatter(formatTemplate: String): DateTimeFormatter = js.native
  def createDateTimeFormatterContext(
    formatTemplate: String,
    languages: IIterable[String],
    geographicRegion: String,
    calendar: String,
    clock: String
  ): DateTimeFormatter = js.native
  def createDateTimeFormatterDate(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat
  ): DateTimeFormatter = js.native
  def createDateTimeFormatterDateTimeContext(
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
  ): DateTimeFormatter = js.native
  def createDateTimeFormatterDateTimeLanguages(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable[String]
  ): DateTimeFormatter = js.native
  def createDateTimeFormatterLanguages(formatTemplate: String, languages: IIterable[String]): DateTimeFormatter = js.native
  def createDateTimeFormatterTime(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat): DateTimeFormatter = js.native
}

object IDateTimeFormatterFactory {
  @scala.inline
  def apply(
    createDateTimeFormatter: String => DateTimeFormatter,
    createDateTimeFormatterContext: (String, IIterable[String], String, String, String) => DateTimeFormatter,
    createDateTimeFormatterDate: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat) => DateTimeFormatter,
    createDateTimeFormatterDateTimeContext: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String], String, String, String) => DateTimeFormatter,
    createDateTimeFormatterDateTimeLanguages: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String]) => DateTimeFormatter,
    createDateTimeFormatterLanguages: (String, IIterable[String]) => DateTimeFormatter,
    createDateTimeFormatterTime: (HourFormat, MinuteFormat, SecondFormat) => DateTimeFormatter
  ): IDateTimeFormatterFactory = {
    val __obj = js.Dynamic.literal(createDateTimeFormatter = js.Any.fromFunction1(createDateTimeFormatter), createDateTimeFormatterContext = js.Any.fromFunction5(createDateTimeFormatterContext), createDateTimeFormatterDate = js.Any.fromFunction4(createDateTimeFormatterDate), createDateTimeFormatterDateTimeContext = js.Any.fromFunction11(createDateTimeFormatterDateTimeContext), createDateTimeFormatterDateTimeLanguages = js.Any.fromFunction8(createDateTimeFormatterDateTimeLanguages), createDateTimeFormatterLanguages = js.Any.fromFunction2(createDateTimeFormatterLanguages), createDateTimeFormatterTime = js.Any.fromFunction3(createDateTimeFormatterTime))
    __obj.asInstanceOf[IDateTimeFormatterFactory]
  }
  @scala.inline
  implicit class IDateTimeFormatterFactoryOps[Self <: IDateTimeFormatterFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDateTimeFormatter(value: String => DateTimeFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDateTimeFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateDateTimeFormatterContext(value: (String, IIterable[String], String, String, String) => DateTimeFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDateTimeFormatterContext")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCreateDateTimeFormatterDate(value: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat) => DateTimeFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDateTimeFormatterDate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCreateDateTimeFormatterDateTimeContext(
      value: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String], String, String, String) => DateTimeFormatter
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDateTimeFormatterDateTimeContext")(js.Any.fromFunction11(value))
        ret
    }
    @scala.inline
    def withCreateDateTimeFormatterDateTimeLanguages(
      value: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String]) => DateTimeFormatter
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDateTimeFormatterDateTimeLanguages")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withCreateDateTimeFormatterLanguages(value: (String, IIterable[String]) => DateTimeFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDateTimeFormatterLanguages")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateDateTimeFormatterTime(value: (HourFormat, MinuteFormat, SecondFormat) => DateTimeFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDateTimeFormatterTime")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

