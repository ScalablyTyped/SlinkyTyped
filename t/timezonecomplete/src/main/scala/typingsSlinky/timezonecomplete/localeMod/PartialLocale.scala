package typingsSlinky.timezonecomplete.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialLocale extends js.Object {
  var dayPeriodAbbreviated: js.UndefOr[DayPeriod] = js.native
  /**
    * Fixed day period names (AM/PM/noon/midnight, format 'a' and 'b')
    */
  var dayPeriodNarrow: js.UndefOr[DayPeriod] = js.native
  var dayPeriodWide: js.UndefOr[DayPeriod] = js.native
  var eraAbbreviated: js.UndefOr[js.Tuple2[String, String]] = js.native
  /**
    * Era names: AD, BC
    */
  var eraNarrow: js.UndefOr[js.Tuple2[String, String]] = js.native
  var eraWide: js.UndefOr[js.Tuple2[String, String]] = js.native
  /**
    * Month names
    */
  var longMonthNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Week day names, starting with sunday
    */
  var longWeekdayNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Month letters
    */
  var monthLetters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Quarter abbreviations e.g. 1st, 2nd, 3rd, 4th
    */
  var quarterAbbreviations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The letter indicating a quarter e.g. "Q" (becomes Q1, Q2, Q3, Q4)
    */
  var quarterLetter: js.UndefOr[String] = js.native
  /**
    * The word for 'quarter'
    */
  var quarterWord: js.UndefOr[String] = js.native
  /**
    * Three-letter month names
    */
  var shortMonthNames: js.UndefOr[js.Array[String]] = js.native
  var shortWeekdayNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * In some languages, months need different names when used stand-alone
    */
  var standAloneLongMonthNames: js.UndefOr[js.Array[String]] = js.native
  var standAloneMonthLetters: js.UndefOr[js.Array[String]] = js.native
  var standAloneQuarterAbbreviations: js.UndefOr[js.Array[String]] = js.native
  /**
    * In some languages, quarters need different names when used stand-alone
    */
  var standAloneQuarterLetter: js.UndefOr[String] = js.native
  var standAloneQuarterWord: js.UndefOr[String] = js.native
  var standAloneShortMonthNames: js.UndefOr[js.Array[String]] = js.native
  var weekdayLetters: js.UndefOr[js.Array[String]] = js.native
  var weekdayTwoLetters: js.UndefOr[js.Array[String]] = js.native
}

object PartialLocale {
  @scala.inline
  def apply(): PartialLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLocale]
  }
  @scala.inline
  implicit class PartialLocaleOps[Self <: PartialLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayPeriodAbbreviated(value: DayPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPeriodAbbreviated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPeriodAbbreviated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPeriodAbbreviated")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPeriodNarrow(value: DayPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPeriodNarrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPeriodNarrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPeriodNarrow")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPeriodWide(value: DayPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPeriodWide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPeriodWide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPeriodWide")(js.undefined)
        ret
    }
    @scala.inline
    def withEraAbbreviated(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eraAbbreviated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEraAbbreviated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eraAbbreviated")(js.undefined)
        ret
    }
    @scala.inline
    def withEraNarrow(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eraNarrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEraNarrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eraNarrow")(js.undefined)
        ret
    }
    @scala.inline
    def withEraWide(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eraWide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEraWide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eraWide")(js.undefined)
        ret
    }
    @scala.inline
    def withLongMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longMonthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withLongWeekdayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longWeekdayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongWeekdayNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longWeekdayNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthLetters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLetters")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarterAbbreviations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterAbbreviations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarterAbbreviations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterAbbreviations")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarterLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarterLetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterLetter")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarterWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarterWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterWord")(js.undefined)
        ret
    }
    @scala.inline
    def withShortMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withShortWeekdayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortWeekdayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortWeekdayNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortWeekdayNames")(js.undefined)
        ret
    }
    @scala.inline
    def withStandAloneLongMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneLongMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandAloneLongMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneLongMonthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withStandAloneMonthLetters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneMonthLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandAloneMonthLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneMonthLetters")(js.undefined)
        ret
    }
    @scala.inline
    def withStandAloneQuarterAbbreviations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneQuarterAbbreviations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandAloneQuarterAbbreviations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneQuarterAbbreviations")(js.undefined)
        ret
    }
    @scala.inline
    def withStandAloneQuarterLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneQuarterLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandAloneQuarterLetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneQuarterLetter")(js.undefined)
        ret
    }
    @scala.inline
    def withStandAloneQuarterWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneQuarterWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandAloneQuarterWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneQuarterWord")(js.undefined)
        ret
    }
    @scala.inline
    def withStandAloneShortMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneShortMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandAloneShortMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneShortMonthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdayLetters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdayLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayLetters")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdayTwoLetters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayTwoLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdayTwoLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayTwoLetters")(js.undefined)
        ret
    }
  }
  
}

