package typingsSlinky.winrtUwp.global.Windows.Globalization

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat
import typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat
import typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat
import typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat
import typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat
import typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat
import typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables formatting of dates and times. */
object DateTimeFormatting {
  
  /** Formats dates and times. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
  @js.native
  class DateTimeFormatter protected ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter {
    /**
      * Creates a DateTimeFormatter object that is initialized by a format template string.
      * @param formatTemplate A format template string that specifies the requested components. The order of the components is irrelevant. This can also be a format pattern. See the remarks for the DateTimeFormatter class for a list of valid format templates and format patterns.
      */
    def this(formatTemplate: String) = this()
    /**
      * Creates a DateTimeFormatter object that is initialized by a format template string and language list.
      * @param formatTemplate A format template string that specifies the requested components. The order of the components is irrelevant. This can also be a format pattern. See the remarks for the DateTimeFormatter class for a list of valid format templates and format patterns.
      * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern and for formatting. See Remarks.
      */
    def this(formatTemplate: String, languages: IIterable[String]) = this()
    /**
      * Creates a DateTimeFormatter object that is initialized with hour, minute, and second formats.
      * @param hourFormat The desired hour format to include in the template.
      * @param minuteFormat The desired minute format to include in the template.
      * @param secondFormat The desired second format to include in the template.
      */
    def this(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat) = this()
    /**
      * Creates a DateTimeFormatter object that is initialized with year, month, day, and day of week formats.
      * @param yearFormat The desired year format to include in the template.
      * @param monthFormat The desired month format to include in the template.
      * @param dayFormat The desired day format to include in the template.
      * @param dayOfWeekFormat The desired day of week format to include in the template.
      */
    def this(
      yearFormat: YearFormat,
      monthFormat: MonthFormat,
      dayFormat: DayFormat,
      dayOfWeekFormat: DayOfWeekFormat
    ) = this()
    /**
      * Creates a DateTimeFormatter object that is initialized by a format template string, language list, geographic region, calendar, and clock.
      * @param formatTemplate A format template string that specifies the requested components. The order of the components is irrelevant. This can also be a format pattern. See the remarks for the DateTimeFormatter class for a list of valid format templates and format patterns.
      * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern, and for formatting. See Remarks.
      * @param geographicRegion The identifier for the geographic region. This identifier is used for resolving the template to a pattern.
      * @param calendar The calendar identifier to use.
      * @param clock The clock identifier to use.
      */
    def this(
      formatTemplate: String,
      languages: IIterable[String],
      geographicRegion: String,
      calendar: String,
      clock: String
    ) = this()
    /**
      * Creates a DateTimeFormatter object that is initialized with year, month, day, day of week, hour, minute, and second formats, and a language list.
      * @param yearFormat The year format to include in the template.
      * @param monthFormat The month format to include in the template.
      * @param dayFormat The day format to include in the template.
      * @param dayOfWeekFormat The day of week format to include in the template.
      * @param hourFormat The hour format to include in the template.
      * @param minuteFormat The minute format to include in the template.
      * @param secondFormat The second format to include in the template.
      * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern and for formatting. See Remarks.
      */
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
    /**
      * Creates a DateTimeFormatter object with all formats and identifiers specified.
      * @param yearFormat The desired year format to include in the template.
      * @param monthFormat The desired month format to include in the template.
      * @param dayFormat The desired day format to include in the template.
      * @param dayOfWeekFormat The desired day of week format to include in the template.
      * @param hourFormat The desired hour format to include in the template.
      * @param minuteFormat The desired minute format to include in the template.
      * @param secondFormat The desired second format to include in the template.
      * @param languages The list of language identifiers, in priority order, that represent the choice of languages. These identifiers are used for resolving the template to a pattern, and for formatting. See Remarks.
      * @param geographicRegion The identifier for the geographic region. This identifier is used for resolving the template to a pattern.
      * @param calendar The calendar identifier to use.
      * @param clock The clock identifier to use.
      */
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
  object DateTimeFormatter {
    
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the DateTimeFormatter object that formats dates according to the user's choice of long date pattern. */
    /* static member */
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.longDate")
    @js.native
    def longDate: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    @scala.inline
    def longDate_=(x: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longDate")(x.asInstanceOf[js.Any])
    
    /** Gets the DateTimeFormatter object that formats times according to the user's choice of long time pattern. */
    /* static member */
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.longTime")
    @js.native
    def longTime: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    @scala.inline
    def longTime_=(x: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longTime")(x.asInstanceOf[js.Any])
    
    /** Gets the DateTimeFormatter object that formats dates according to the user's choice of short date pattern. */
    /* static member */
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.shortDate")
    @js.native
    def shortDate: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    @scala.inline
    def shortDate_=(x: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortDate")(x.asInstanceOf[js.Any])
    
    /** Gets the DateTimeFormatter object that formats times according to the user's choice of short time pattern. */
    /* static member */
    @JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter.shortTime")
    @js.native
    def shortTime: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter = js.native
    @scala.inline
    def shortTime_=(x: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortTime")(x.asInstanceOf[js.Any])
  }
  
  /** Specifies the intended format for the day in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.DayFormat")
  @js.native
  object DayFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat with Double
      ] = js.native
    
    /* 1 */ val default: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat.default with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayFormat.none with Double = js.native
  }
  
  /** Specifies the intended format for the day of the week in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
  @js.native
  object DayOfWeekFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat with Double
      ] = js.native
    
    /* 1 */ val default: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.default with Double = js.native
    
    /* 2 */ val abbreviated: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.abbreviated with Double = js.native
    
    /* 3 */ val full: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.full with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.none with Double = js.native
  }
  
  /** Specifies the intended format for the hour in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.HourFormat")
  @js.native
  object HourFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat with Double
      ] = js.native
    
    /* 1 */ val default: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat.default with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.HourFormat.none with Double = js.native
  }
  
  /** Specifies the intended format for the minute in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.MinuteFormat")
  @js.native
  object MinuteFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat with Double
      ] = js.native
    
    /* 1 */ val default: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat.default with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MinuteFormat.none with Double = js.native
  }
  
  /** Specifies the intended format for the month in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
  @js.native
  object MonthFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat with Double
      ] = js.native
    
    /* 1 */ val default: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.default with Double = js.native
    
    /* 2 */ val abbreviated: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.abbreviated with Double = js.native
    
    /* 3 */ val full: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.full with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.none with Double = js.native
    
    /* 4 */ val numeric: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.MonthFormat.numeric with Double = js.native
  }
  
  /** Specifies the intended format for the second in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.SecondFormat")
  @js.native
  object SecondFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat with Double
      ] = js.native
    
    /* 1 */ val default: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat.default with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.SecondFormat.none with Double = js.native
  }
  
  /** Specifies the intended format for the year in a DateTimeFormatter object. */
  @JSGlobal("Windows.Globalization.DateTimeFormatting.YearFormat")
  @js.native
  object YearFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat with Double
      ] = js.native
    
    /* 1 */ val default: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.default with Double = js.native
    
    /* 2 */ val abbreviated: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.abbreviated with Double = js.native
    
    /* 3 */ val full: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.full with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting.YearFormat.none with Double = js.native
  }
}
