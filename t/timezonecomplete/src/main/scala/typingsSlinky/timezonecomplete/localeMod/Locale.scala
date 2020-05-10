package typingsSlinky.timezonecomplete.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var dayPeriodAbbreviated: DayPeriod = js.native
  /**
    * Fixed day period names (AM/PM/noon/midnight, format 'a' and 'b')
    */
  var dayPeriodNarrow: DayPeriod = js.native
  var dayPeriodWide: DayPeriod = js.native
  var eraAbbreviated: js.Tuple2[String, String] = js.native
  /**
    * Era names: AD, BC
    */
  var eraNarrow: js.Tuple2[String, String] = js.native
  var eraWide: js.Tuple2[String, String] = js.native
  /**
    * Month names
    */
  var longMonthNames: js.Array[String] = js.native
  /**
    * Week day names, starting with sunday
    */
  var longWeekdayNames: js.Array[String] = js.native
  /**
    * Month letters
    */
  var monthLetters: js.Array[String] = js.native
  /**
    * Quarter abbreviations e.g. 1st, 2nd, 3rd, 4th
    */
  var quarterAbbreviations: js.Array[String] = js.native
  /**
    * The letter indicating a quarter e.g. "Q" (becomes Q1, Q2, Q3, Q4)
    */
  var quarterLetter: String = js.native
  /**
    * The word for 'quarter'
    */
  var quarterWord: String = js.native
  /**
    * Three-letter month names
    */
  var shortMonthNames: js.Array[String] = js.native
  var shortWeekdayNames: js.Array[String] = js.native
  /**
    * In some languages, months need different names when used stand-alone
    */
  var standAloneLongMonthNames: js.Array[String] = js.native
  var standAloneMonthLetters: js.Array[String] = js.native
  var standAloneQuarterAbbreviations: js.Array[String] = js.native
  /**
    * In some languages, quarters need different names when used stand-alone
    */
  var standAloneQuarterLetter: String = js.native
  var standAloneQuarterWord: String = js.native
  var standAloneShortMonthNames: js.Array[String] = js.native
  var weekdayLetters: js.Array[String] = js.native
  var weekdayTwoLetters: js.Array[String] = js.native
}

object Locale {
  @scala.inline
  def apply(
    dayPeriodAbbreviated: DayPeriod,
    dayPeriodNarrow: DayPeriod,
    dayPeriodWide: DayPeriod,
    eraAbbreviated: js.Tuple2[String, String],
    eraNarrow: js.Tuple2[String, String],
    eraWide: js.Tuple2[String, String],
    longMonthNames: js.Array[String],
    longWeekdayNames: js.Array[String],
    monthLetters: js.Array[String],
    quarterAbbreviations: js.Array[String],
    quarterLetter: String,
    quarterWord: String,
    shortMonthNames: js.Array[String],
    shortWeekdayNames: js.Array[String],
    standAloneLongMonthNames: js.Array[String],
    standAloneMonthLetters: js.Array[String],
    standAloneQuarterAbbreviations: js.Array[String],
    standAloneQuarterLetter: String,
    standAloneQuarterWord: String,
    standAloneShortMonthNames: js.Array[String],
    weekdayLetters: js.Array[String],
    weekdayTwoLetters: js.Array[String]
  ): Locale = {
    val __obj = js.Dynamic.literal(dayPeriodAbbreviated = dayPeriodAbbreviated.asInstanceOf[js.Any], dayPeriodNarrow = dayPeriodNarrow.asInstanceOf[js.Any], dayPeriodWide = dayPeriodWide.asInstanceOf[js.Any], eraAbbreviated = eraAbbreviated.asInstanceOf[js.Any], eraNarrow = eraNarrow.asInstanceOf[js.Any], eraWide = eraWide.asInstanceOf[js.Any], longMonthNames = longMonthNames.asInstanceOf[js.Any], longWeekdayNames = longWeekdayNames.asInstanceOf[js.Any], monthLetters = monthLetters.asInstanceOf[js.Any], quarterAbbreviations = quarterAbbreviations.asInstanceOf[js.Any], quarterLetter = quarterLetter.asInstanceOf[js.Any], quarterWord = quarterWord.asInstanceOf[js.Any], shortMonthNames = shortMonthNames.asInstanceOf[js.Any], shortWeekdayNames = shortWeekdayNames.asInstanceOf[js.Any], standAloneLongMonthNames = standAloneLongMonthNames.asInstanceOf[js.Any], standAloneMonthLetters = standAloneMonthLetters.asInstanceOf[js.Any], standAloneQuarterAbbreviations = standAloneQuarterAbbreviations.asInstanceOf[js.Any], standAloneQuarterLetter = standAloneQuarterLetter.asInstanceOf[js.Any], standAloneQuarterWord = standAloneQuarterWord.asInstanceOf[js.Any], standAloneShortMonthNames = standAloneShortMonthNames.asInstanceOf[js.Any], weekdayLetters = weekdayLetters.asInstanceOf[js.Any], weekdayTwoLetters = weekdayTwoLetters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
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
    def withDayPeriodNarrow(value: DayPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPeriodNarrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayPeriodWide(value: DayPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPeriodWide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEraAbbreviated(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eraAbbreviated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEraNarrow(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eraNarrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEraWide(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eraWide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongWeekdayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longWeekdayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthLetters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuarterAbbreviations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterAbbreviations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuarterLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuarterWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortWeekdayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortWeekdayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandAloneLongMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneLongMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandAloneMonthLetters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneMonthLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandAloneQuarterAbbreviations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneQuarterAbbreviations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandAloneQuarterLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneQuarterLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandAloneQuarterWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneQuarterWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandAloneShortMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standAloneShortMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdayLetters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdayTwoLetters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayTwoLetters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

