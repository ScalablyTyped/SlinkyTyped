package typingsSlinky.timezonecomplete

import typingsSlinky.timezonecomplete.basicsMod.TimeComponentOpts
import typingsSlinky.timezonecomplete.basicsMod.TimeComponents
import typingsSlinky.timezonecomplete.basicsMod.TimeUnit
import typingsSlinky.timezonecomplete.basicsMod.WeekDay
import typingsSlinky.timezonecomplete.javascriptMod.DateFunctions
import typingsSlinky.timezonecomplete.localeMod.Locale
import typingsSlinky.timezonecomplete.localeMod.PartialLocale
import typingsSlinky.timezonecomplete.parseMod.AwareTimeStruct
import typingsSlinky.timezonecomplete.periodMod.PeriodDst
import typingsSlinky.timezonecomplete.periodMod.PeriodJson
import typingsSlinky.timezonecomplete.periodMod.WeekTimeOpts
import typingsSlinky.timezonecomplete.timesourceMod.TimeSource
import typingsSlinky.timezonecomplete.tzDatabaseMod.AtType
import typingsSlinky.timezonecomplete.tzDatabaseMod.OnType
import typingsSlinky.timezonecomplete.tzDatabaseMod.RuleType
import typingsSlinky.timezonecomplete.tzDatabaseMod.ToType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timezonecomplete", "AtType")
  @js.native
  object AtType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.tzDatabaseMod.AtType with Double] = js.native
    
    /* 0 */ val Standard: typingsSlinky.timezonecomplete.tzDatabaseMod.AtType.Standard with Double = js.native
    
    /* 2 */ val Utc: typingsSlinky.timezonecomplete.tzDatabaseMod.AtType.Utc with Double = js.native
    
    /* 1 */ val Wall: typingsSlinky.timezonecomplete.tzDatabaseMod.AtType.Wall with Double = js.native
  }
  
  object DAY_PERIODS_ABBREVIATED {
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED.am")
    @js.native
    def am: String = js.native
    @scala.inline
    def am_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("am")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED.midnight")
    @js.native
    def midnight: String = js.native
    @scala.inline
    def midnight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midnight")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED.noon")
    @js.native
    def noon: String = js.native
    @scala.inline
    def noon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noon")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED.pm")
    @js.native
    def pm: String = js.native
    @scala.inline
    def pm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pm")(x.asInstanceOf[js.Any])
  }
  
  object DAY_PERIODS_NARROW {
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW.am")
    @js.native
    def am: String = js.native
    @scala.inline
    def am_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("am")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW.midnight")
    @js.native
    def midnight: String = js.native
    @scala.inline
    def midnight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midnight")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW.noon")
    @js.native
    def noon: String = js.native
    @scala.inline
    def noon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noon")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW.pm")
    @js.native
    def pm: String = js.native
    @scala.inline
    def pm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pm")(x.asInstanceOf[js.Any])
  }
  
  object DAY_PERIODS_WIDE {
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE.am")
    @js.native
    def am: String = js.native
    @scala.inline
    def am_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("am")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE.midnight")
    @js.native
    def midnight: String = js.native
    @scala.inline
    def midnight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midnight")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE.noon")
    @js.native
    def noon: String = js.native
    @scala.inline
    def noon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noon")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE.pm")
    @js.native
    def pm: String = js.native
    @scala.inline
    def pm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pm")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("timezonecomplete", "DEFAULT_LOCALE")
  @js.native
  val DEFAULT_LOCALE: Locale = js.native
  
  @JSImport("timezonecomplete", "DateFunctions")
  @js.native
  object DateFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.javascriptMod.DateFunctions with Double] = js.native
    
    /* 0 */ val Get: typingsSlinky.timezonecomplete.javascriptMod.DateFunctions.Get with Double = js.native
    
    /* 1 */ val GetUTC: typingsSlinky.timezonecomplete.javascriptMod.DateFunctions.GetUTC with Double = js.native
  }
  
  @JSImport("timezonecomplete", "DateTime")
  @js.native
  /**
    * Constructor. Creates current time in local timezone.
    * @throws nothing
    */
  class DateTime ()
    extends typingsSlinky.timezonecomplete.datetimeMod.DateTime {
    /**
      * Constructor. Parses ISO timestamp string.
      * Non-existing local times are normalized by rounding up to the next DST offset.
      *
      * @param isoString	String in ISO 8601 format. Instead of ISO time zone,
      *        it may include a space and then and IANA time zone.
      *        e.g. "2007-04-05T12:30:40.500"					(no time zone, naive date)
      *        e.g. "2007-04-05T12:30:40.500+01:00"				(UTC offset without daylight saving time)
      *        or   "2007-04-05T12:30:40.500Z"					(UTC)
      *        or   "2007-04-05T12:30:40.500 Europe/Amsterdam"	(IANA time zone, with daylight saving time if applicable)
      * @param timeZone	if given, the date in the string is assumed to be in this time zone.
      *        Note that it is NOT CONVERTED to the time zone. Useful
      *        for strings without a time zone
      * @throws timezonecomplete.Argument.S if the given string is invalid
      * @throws timezonecomplete.Argument.TimeZone if the given time zone is invalid
      */
    def this(isoString: String) = this()
    /**
      * Get a date from a TimeStruct
      * @throws timezonecomplete.Argument.TimeZone if the given time zone argument is invalid
      */
    def this(tm: typingsSlinky.timezonecomplete.basicsMod.TimeStruct) = this()
    /**
      * Constructor
      * @param unixTimestamp	milliseconds since 1970-01-01T00:00:00.000
      * @param timeZone	the time zone that the timestamp is assumed to be in (usually UTC).
      * @throws timezonecomplete.Argument.TimeZone if the given time zone is invalid
      * @throws timezonecomplete.Argument.UnixMillis if the given unix timestamp is not finite
      */
    def this(unixTimestamp: Double) = this()
    /**
      * Constructor. Parses string in given LDML format.
      * NOTE: does not handle eras/quarters/weeks/weekdays.
      * Non-existing local times are normalized by rounding up to the next DST offset.
      *
      * @param dateString	Date+Time string.
      * @param formatString The LDML format that the string is assumed to be in
      * @param timeZone	if given, the date in the string is assumed to be in this time zone.
      *        Note that it is NOT CONVERTED to the time zone. Useful
      *        for strings without a time zone
      * @throws timezonecomplete.ParseError if the given dateTimeString is wrong or not according to the pattern
      * @throws timezonecomplete.Argument.FormatString if the given format string is invalid
      * @throws timezonecomplete.Argument.Timezone if the given time zone is invalid
      */
    def this(dateString: String, formatString: String) = this()
    /**
      * Constructor. You provide a date, then you say whether to take the
      * date.getYear()/getXxx methods or the date.getUTCYear()/date.getUTCXxx methods,
      * and then you state which time zone that date is in.
      * Non-existing local times are normalized by rounding up to the next DST offset.
      * Note that the Date class has bugs and inconsistencies when constructing them with times around
      * DST changes.
      *
      * @param date	A date object.
      * @param getters Specifies which set of Date getters contains the date in the given time zone: the
      *        Date.getXxx() methods or the Date.getUTCXxx() methods.
      * @param timeZone The time zone that the given date is assumed to be in (may be undefined or null for unaware dates)
      * @throws timezonecomplete.Argument.GetFuncs if the getFuncs argument is invalid
      * @throws timezonecomplete.Argument.TimeZone if the time zone argument is invalid
      */
    def this(date: js.Date, getFuncs: DateFunctions) = this()
    def this(isoString: String, timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone) = this()
    def this(
      tm: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(unixTimestamp: Double, timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone) = this()
    def this(
      dateString: String,
      formatString: String,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      date: js.Date,
      getFuncs: DateFunctions,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    /**
      * Constructor. Note that unlike JavaScript dates we require fields to be in normal ranges.
      * Use the add(duration) or sub(duration) for arithmetic.
      * @param year	The full year (e.g. 2014)
      * @param month	The month [1-12] (note this deviates from JavaScript Date)
      * @param day	The day of the month [1-31]
      * @param hour	The hour of the day [0-24)
      * @param minute	The minute of the hour [0-59]
      * @param second	The second of the minute [0-59]
      * @param millisecond	The millisecond of the second [0-999]
      * @param timeZone	The time zone, or null/undefined (for unaware dates)
      * @throws timezonecomplete.Argument.Year if year invalid
      * @throws timezonecomplete.Argument.Month if month invalid
      * @throws timezonecomplete.Argument.Day if day invalid
      * @throws timezonecomplete.Argument.Hour if hour invalid
      * @throws timezonecomplete.Argument.Minute if minute invalid
      * @throws timezonecomplete.Argument.Second if second invalid
      * @throws timezonecomplete.Argument.Milli if milliseconds invalid
      */
    def this(year: Double, month: Double, day: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: js.UndefOr[scala.Nothing], minute: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: Double, minute: Double) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ) = this()
    def this(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: js.UndefOr[scala.Nothing],
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: js.UndefOr[scala.Nothing],
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: js.UndefOr[scala.Nothing],
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: js.UndefOr[scala.Nothing],
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: js.UndefOr[scala.Nothing],
      millisecond: js.UndefOr[scala.Nothing],
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: js.UndefOr[scala.Nothing],
      millisecond: Double,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double,
      millisecond: js.UndefOr[scala.Nothing],
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double,
      millisecond: Double,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: js.UndefOr[scala.Nothing],
      millisecond: js.UndefOr[scala.Nothing],
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: js.UndefOr[scala.Nothing],
      millisecond: Double,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double,
      millisecond: js.UndefOr[scala.Nothing],
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double,
      millisecond: Double,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: js.UndefOr[scala.Nothing],
      millisecond: js.UndefOr[scala.Nothing],
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: js.UndefOr[scala.Nothing],
      millisecond: Double,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double,
      millisecond: js.UndefOr[scala.Nothing],
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double,
      millisecond: Double,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: js.UndefOr[scala.Nothing],
      millisecond: js.UndefOr[scala.Nothing],
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: js.UndefOr[scala.Nothing],
      millisecond: Double,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      millisecond: js.UndefOr[scala.Nothing],
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      millisecond: Double,
      timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
    ) = this()
  }
  /* static members */
  object DateTime {
    
    @JSImport("timezonecomplete", "DateTime")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Split a combined ISO datetime and timezone into datetime and timezone
      * @throws nothing
      */
    @JSImport("timezonecomplete", "DateTime._splitDateFromTimeZone")
    @js.native
    def _splitDateFromTimeZone: js.Any = js.native
    @scala.inline
    def _splitDateFromTimeZone_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_splitDateFromTimeZone")(x.asInstanceOf[js.Any])
    
    /**
      * Check whether a given date exists in the given time zone.
      * E.g. 2015-02-29 returns false (not a leap year)
      * and 2015-03-29T02:30:00 returns false (daylight saving time missing hour)
      * and 2015-04-31 returns false (April has 30 days).
      * By default, pre-1970 dates also return false since the time zone database does not contain accurate info
      * before that. You can change that with the allowPre1970 flag.
      *
      * @param allowPre1970 (optional, default false): return true for pre-1970 dates
      * @throws nothing
      */
    @JSImport("timezonecomplete", "DateTime.exists")
    @js.native
    def exists(
      year: Double,
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      millisecond: js.UndefOr[Double],
      zone: js.UndefOr[typingsSlinky.timezonecomplete.timezoneMod.TimeZone | Null],
      allowPre1970: js.UndefOr[Boolean]
    ): Boolean = js.native
    
    /**
      * Create a DateTime from a Lotus 123 / Microsoft Excel date-time value
      * i.e. a double representing days since 1-1-1900 where 1900 is incorrectly seen as leap year
      * Does not work for dates < 1900
      * @param n excel date/time number
      * @param timeZone Time zone to assume that the excel value is in
      * @returns a DateTime
      * @throws timezonecomplete.Argument.N if n is not a finite number
      * @throws timezonecomplete.Argument.TimeZone if the given time zone is invalid
      */
    @JSImport("timezonecomplete", "DateTime.fromExcel")
    @js.native
    def fromExcel(n: Double): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    @JSImport("timezonecomplete", "DateTime.fromExcel")
    @js.native
    def fromExcel(n: Double, timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    
    /**
      * Current date+time in the given time zone
      * @param timeZone	The desired time zone (optional, defaults to UTC).
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    @JSImport("timezonecomplete", "DateTime.now")
    @js.native
    def now(): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    @JSImport("timezonecomplete", "DateTime.now")
    @js.native
    def now(timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    
    /**
      * Current date+time in local time
      * @throws nothing
      */
    @JSImport("timezonecomplete", "DateTime.nowLocal")
    @js.native
    def nowLocal(): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    
    /**
      * Current date+time in UTC time
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    @JSImport("timezonecomplete", "DateTime.nowUtc")
    @js.native
    def nowUtc(): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    
    /**
      * Parse a date in a given format
      * @param s the string to parse
      * @param format the format the string is in. See LDML.md for supported formats.
      * @param zone Optional, the zone to add (if no zone is given in the string)
      * @param locale Optional, different settings for constants like 'AM' etc
      * @param allowTrailing Allow trailing characters in the source string
      * @throws timezonecomplete.ParseError if the given dateTimeString is wrong or not according to the pattern
      * @throws timezonecomplete.Argument.FormatString if the given format string is invalid
      */
    @JSImport("timezonecomplete", "DateTime.parse")
    @js.native
    def parse(s: String, format: String): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    @JSImport("timezonecomplete", "DateTime.parse")
    @js.native
    def parse(
      s: String,
      format: String,
      zone: js.UndefOr[scala.Nothing],
      locale: js.UndefOr[scala.Nothing],
      allowTrailing: Boolean
    ): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    @JSImport("timezonecomplete", "DateTime.parse")
    @js.native
    def parse(s: String, format: String, zone: js.UndefOr[scala.Nothing], locale: PartialLocale): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    @JSImport("timezonecomplete", "DateTime.parse")
    @js.native
    def parse(
      s: String,
      format: String,
      zone: js.UndefOr[scala.Nothing],
      locale: PartialLocale,
      allowTrailing: Boolean
    ): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    @JSImport("timezonecomplete", "DateTime.parse")
    @js.native
    def parse(s: String, format: String, zone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    @JSImport("timezonecomplete", "DateTime.parse")
    @js.native
    def parse(
      s: String,
      format: String,
      zone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
      locale: js.UndefOr[scala.Nothing],
      allowTrailing: Boolean
    ): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    @JSImport("timezonecomplete", "DateTime.parse")
    @js.native
    def parse(
      s: String,
      format: String,
      zone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
      locale: PartialLocale
    ): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    @JSImport("timezonecomplete", "DateTime.parse")
    @js.native
    def parse(
      s: String,
      format: String,
      zone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
      locale: PartialLocale,
      allowTrailing: Boolean
    ): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
    
    /**
      * Actual time source in use. Setting this property allows to
      * fake time in tests. DateTime.nowLocal() and DateTime.nowUtc()
      * use this property for obtaining the current time.
      */
    @JSImport("timezonecomplete", "DateTime.timeSource")
    @js.native
    def timeSource: TimeSource = js.native
    @scala.inline
    def timeSource_=(x: TimeSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeSource")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("timezonecomplete", "Duration")
  @js.native
  /**
    * Construct a time duration of 0 milliseconds
    * @throws nothing
    */
  class Duration ()
    extends typingsSlinky.timezonecomplete.durationMod.Duration {
    /**
      * Construct a duration from an amount and a time unit.
      * @param amount	Number of units
      * @param unit	A time unit i.e. TimeUnit.Second, TimeUnit.Hour etc. Default Millisecond.
      * @throws timezonecomplete.Argument.Amount if `amount` is not a finite number
      * @throws timezonecomplete.Argument.Unit for invalid `unit`
      */
    def this(amount: Double) = this()
    /**
      * Construct a time duration from a string in one of two formats:
      * 1) [-]hhhh[:mm[:ss[.nnn]]] e.g. '-01:00:30.501'
      * 2) amount and unit e.g. '-1 days' or '1 year'. The unit may be in singular or plural form and is case-insensitive
      * @throws timezonecomplete.Argument.S for invalid string
      */
    def this(s: String) = this()
    def this(amount: Double, unit: TimeUnit) = this()
  }
  /* static members */
  object Duration {
    
    /**
      * Construct a time duration
      * @param amount Number of days (may be fractional or negative)
      * @return A duration of n days
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    @JSImport("timezonecomplete", "Duration.days")
    @js.native
    def days(amount: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
    
    /**
      * Construct a time duration
      * @param amount Number of hours (may be fractional or negative)
      * @return A duration of n hours
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    @JSImport("timezonecomplete", "Duration.hours")
    @js.native
    def hours(amount: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
    
    /**
      * Construct a time duration
      * @param amount Number of milliseconds (may be fractional or negative)
      * @return A duration of n milliseconds
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    @JSImport("timezonecomplete", "Duration.milliseconds")
    @js.native
    def milliseconds(amount: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
    
    /**
      * Construct a time duration
      * @param amount Number of minutes (may be fractional or negative)
      * @return A duration of n minutes
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    @JSImport("timezonecomplete", "Duration.minutes")
    @js.native
    def minutes(amount: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
    
    /**
      * Construct a time duration
      * @param amount Number of months (may be fractional or negative)
      * @return A duration of n months
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    @JSImport("timezonecomplete", "Duration.months")
    @js.native
    def months(amount: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
    
    /**
      * Construct a time duration
      * @param amount Number of seconds (may be fractional or negative)
      * @return A duration of n seconds
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    @JSImport("timezonecomplete", "Duration.seconds")
    @js.native
    def seconds(amount: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
    
    /**
      * Construct a time duration
      * @param amount Number of years (may be fractional or negative)
      * @return A duration of n years
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    @JSImport("timezonecomplete", "Duration.years")
    @js.native
    def years(amount: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  }
  
  @JSImport("timezonecomplete", "ERA_NAMES_ABBREVIATED")
  @js.native
  val ERA_NAMES_ABBREVIATED: js.Tuple2[String, String] = js.native
  
  @JSImport("timezonecomplete", "ERA_NAMES_NARROW")
  @js.native
  val ERA_NAMES_NARROW: js.Tuple2[String, String] = js.native
  
  @JSImport("timezonecomplete", "ERA_NAMES_WIDE")
  @js.native
  val ERA_NAMES_WIDE: js.Tuple2[String, String] = js.native
  
  @JSImport("timezonecomplete", "LONG_MONTH_NAMES")
  @js.native
  val LONG_MONTH_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "LONG_WEEKDAY_NAMES")
  @js.native
  val LONG_WEEKDAY_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "MONTH_LETTERS")
  @js.native
  val MONTH_LETTERS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "NormalizeOption")
  @js.native
  object NormalizeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.tzDatabaseMod.NormalizeOption with Double] = js.native
    
    /* 1 */ val Down: typingsSlinky.timezonecomplete.tzDatabaseMod.NormalizeOption.Down with Double = js.native
    
    /* 0 */ val Up: typingsSlinky.timezonecomplete.tzDatabaseMod.NormalizeOption.Up with Double = js.native
  }
  
  @JSImport("timezonecomplete", "OnType")
  @js.native
  object OnType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.tzDatabaseMod.OnType with Double] = js.native
    
    /* 0 */ val DayNum: typingsSlinky.timezonecomplete.tzDatabaseMod.OnType.DayNum with Double = js.native
    
    /* 2 */ val GreqX: typingsSlinky.timezonecomplete.tzDatabaseMod.OnType.GreqX with Double = js.native
    
    /* 1 */ val LastX: typingsSlinky.timezonecomplete.tzDatabaseMod.OnType.LastX with Double = js.native
    
    /* 3 */ val LeqX: typingsSlinky.timezonecomplete.tzDatabaseMod.OnType.LeqX with Double = js.native
  }
  
  @JSImport("timezonecomplete", "Period")
  @js.native
  class Period protected ()
    extends typingsSlinky.timezonecomplete.periodMod.Period {
    /**
      * Constructor
      * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
      * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
      * This is due to the enormous processing power required by these cases. They are not
      * implemented and you will get an assert.
      *
      * @param json period represented as JSON object
      * @throws timezonecomplete.Argument.Json for invalid JSON (missing reference, unparseable reference or interval)
      * @throws timezonecomplete.Argument.Interval if amount not positive integer
      * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
      */
    def this(json: PeriodJson) = this()
    /**
      * Constructor
      * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
      * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
      * This is due to the enormous processing power required by these cases. They are not
      * implemented and you will get an assert.
      *
      * @param reference The reference date of the period. If the period is in Months or Years, and
      *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
      * @param interval The interval of the period
      * @param dst Specifies how to handle Daylight Saving Time. Not relevant
      *            if the time zone of the reference datetime does not have DST.
      *            Defaults to RegularLocalTime.
      * @throws timezonecomplete.Argument.Dst for invalid dst value
      * @throws timezonecomplete.Argument.Interval if amount not positive integer
      * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
      */
    def this(
      reference: typingsSlinky.timezonecomplete.datetimeMod.DateTime,
      interval: typingsSlinky.timezonecomplete.durationMod.Duration
    ) = this()
    /**
      * Constructor
      * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
      * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
      * This is due to the enormous processing power required by these cases. They are not
      * implemented and you will get an assert.
      *
      * @param reference The reference of the period. If the period is in Months or Years, and
      *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
      * @param amount The amount of units.
      * @param unit The unit.
      * @param dst Specifies how to handle Daylight Saving Time. Not relevant
      *              if the time zone of the reference datetime does not have DST.
      *              Defaults to RegularLocalTime.
      * @throws timezonecomplete.Argument.Amount for invalid amount
      * @throws timezonecomplete.Argument.Unit for invalid time unit
      * @throws timezonecomplete.Argument.Interval if amount not positive integer
      * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
      * @throws timezonecomplete.Argument.Dst for invalid dst value
      */
    def this(reference: typingsSlinky.timezonecomplete.datetimeMod.DateTime, amount: Double, unit: TimeUnit) = this()
    def this(
      reference: typingsSlinky.timezonecomplete.datetimeMod.DateTime,
      interval: typingsSlinky.timezonecomplete.durationMod.Duration,
      dst: PeriodDst
    ) = this()
    def this(
      reference: typingsSlinky.timezonecomplete.datetimeMod.DateTime,
      amount: Double,
      unit: TimeUnit,
      dst: PeriodDst
    ) = this()
  }
  
  @JSImport("timezonecomplete", "PeriodDst")
  @js.native
  object PeriodDst extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.periodMod.PeriodDst with Double] = js.native
    
    /* 2 */ val MAX: typingsSlinky.timezonecomplete.periodMod.PeriodDst.MAX with Double = js.native
    
    /* 0 */ val RegularIntervals: typingsSlinky.timezonecomplete.periodMod.PeriodDst.RegularIntervals with Double = js.native
    
    /* 1 */ val RegularLocalTime: typingsSlinky.timezonecomplete.periodMod.PeriodDst.RegularLocalTime with Double = js.native
  }
  
  @JSImport("timezonecomplete", "QUARTER_ABBREVIATIONS")
  @js.native
  val QUARTER_ABBREVIATIONS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "QUARTER_LETTER")
  @js.native
  val QUARTER_LETTER: String = js.native
  
  @JSImport("timezonecomplete", "QUARTER_WORD")
  @js.native
  val QUARTER_WORD: String = js.native
  
  @JSImport("timezonecomplete", "RealTimeSource")
  @js.native
  class RealTimeSource ()
    extends typingsSlinky.timezonecomplete.timesourceMod.RealTimeSource
  
  @JSImport("timezonecomplete", "RuleInfo")
  @js.native
  class RuleInfo protected ()
    extends typingsSlinky.timezonecomplete.tzDatabaseMod.RuleInfo {
    /**
      * Constructor
      * @param from
      * @param toType
      * @param toYear
      * @param type
      * @param inMonth
      * @param onType
      * @param onDay
      * @param onWeekDay
      * @param atHour
      * @param atMinute
      * @param atSecond
      * @param atType
      * @param save
      * @param letter
      * @throws nothing
      */
    def this(
      /**
      * FROM column year number.
      * Note, can be -10000 for NaN value (e.g. for "SystemV" rules)
      */
    from: Double,
      /**
      * TO column type: Year for year numbers and "only" values, Max for "max" value.
      */
    toType: ToType,
      /**
      * If TO column is a year, the year number. If TO column is "only", the FROM year.
      */
    toYear: Double,
      /**
      * TYPE column, not used so far
      */
    `type`: String,
      /**
      * IN column month number 1-12
      */
    inMonth: Double,
      /**
      * ON column type
      */
    onType: OnType,
      /**
      * If onType is DayNum, the day number
      */
    onDay: Double,
      /**
      * If onType is not DayNum, the weekday
      */
    onWeekDay: WeekDay,
      /**
      * AT column hour
      */
    atHour: Double,
      /**
      * AT column minute
      */
    atMinute: Double,
      /**
      * AT column second
      */
    atSecond: Double,
      /**
      * AT column type
      */
    atType: AtType,
      /**
      * DST offset from local standard time (NOT from UTC!)
      */
    save: typingsSlinky.timezonecomplete.durationMod.Duration,
      /**
      * Character to insert in %s for time zone abbreviation
      * Note if TZ database indicates "-" this is the empty string
      */
    letter: String
    ) = this()
  }
  
  @JSImport("timezonecomplete", "RuleType")
  @js.native
  object RuleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.tzDatabaseMod.RuleType with Double] = js.native
    
    /* 0 */ val None: typingsSlinky.timezonecomplete.tzDatabaseMod.RuleType.None with Double = js.native
    
    /* 1 */ val Offset: typingsSlinky.timezonecomplete.tzDatabaseMod.RuleType.Offset with Double = js.native
    
    /* 2 */ val RuleName: typingsSlinky.timezonecomplete.tzDatabaseMod.RuleType.RuleName with Double = js.native
  }
  
  @JSImport("timezonecomplete", "SHORT_MONTH_NAMES")
  @js.native
  val SHORT_MONTH_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "SHORT_WEEKDAY_NAMES")
  @js.native
  val SHORT_WEEKDAY_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_LONG_MONTH_NAMES")
  @js.native
  val STAND_ALONE_LONG_MONTH_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_MONTH_LETTERS")
  @js.native
  val STAND_ALONE_MONTH_LETTERS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_QUARTER_ABBREVIATIONS")
  @js.native
  val STAND_ALONE_QUARTER_ABBREVIATIONS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_QUARTER_LETTER")
  @js.native
  val STAND_ALONE_QUARTER_LETTER: String = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_QUARTER_WORD")
  @js.native
  val STAND_ALONE_QUARTER_WORD: String = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_SHORT_MONTH_NAMES")
  @js.native
  val STAND_ALONE_SHORT_MONTH_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "TimeStruct")
  @js.native
  class TimeStruct protected ()
    extends typingsSlinky.timezonecomplete.basicsMod.TimeStruct {
    /**
      * Constructor
      *
      * @param components Separate timestamp components (year, month, ...)
      * @throws timezonecomplete.Argument.Components if `components` is not an object
      * @throws timezonecomplete.Argument.* for invalid components (* = Year, Month, Day, Hour, Minute, Second, Milli)
      */
    def this(components: TimeComponentOpts) = this()
    /**
      * Constructor
      *
      * @param unixMillis milliseconds since 1-1-1970
      * @throws timezonecomplete.Argument.UnixMillis for non-integer unixMillis
      */
    def this(unixMillis: Double) = this()
  }
  /* static members */
  object TimeStruct {
    
    /**
      * Returns a TimeStruct from the given year, month, day etc
      *
      * @param year	Year e.g. 1970
      * @param month	Month 1-12
      * @param day	Day 1-31
      * @param hour	Hour 0-23
      * @param minute	Minute 0-59
      * @param second	Second 0-59 (no leap seconds)
      * @param milli	Millisecond 0-999
      * @throws timezonecomplete.Argument.Year for invalid year
      * @throws timezonecomplete.Argument.Month for invalid month
      * @throws timezonecomplete.Argument.Day for invalid day of month
      * @throws timezonecomplete.Argument.Hour for invalid hour
      * @throws timezonecomplete.Argument.Minute for invalid minute
      * @throws timezonecomplete.Argument.Second for invalid second
      * @throws timezonecomplete.Argument.Milli for invalid milliseconds
      */
    @JSImport("timezonecomplete", "TimeStruct.fromComponents")
    @js.native
    def fromComponents(
      year: js.UndefOr[Double],
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      milli: js.UndefOr[Double]
    ): typingsSlinky.timezonecomplete.basicsMod.TimeStruct = js.native
    
    /**
      * Create a TimeStruct from a JavaScript date
      *
      * @param d	The date
      * @param df Which functions to take (getX() or getUTCX())
      * @throws nothing
      */
    @JSImport("timezonecomplete", "TimeStruct.fromDate")
    @js.native
    def fromDate(d: js.Date, df: DateFunctions): typingsSlinky.timezonecomplete.basicsMod.TimeStruct = js.native
    
    /**
      * Returns a TimeStruct from an ISO 8601 string WITHOUT time zone
      * @throws timezonecomplete.Argument.S if `s` is not a proper iso string
      */
    @JSImport("timezonecomplete", "TimeStruct.fromString")
    @js.native
    def fromString(s: String): typingsSlinky.timezonecomplete.basicsMod.TimeStruct = js.native
    
    /**
      * Create a TimeStruct from a number of unix milliseconds
      * (backward compatibility)
      * @throws timezonecomplete.Argument.UnixMillis for non-integer milliseconds
      */
    @JSImport("timezonecomplete", "TimeStruct.fromUnix")
    @js.native
    def fromUnix(unixMillis: Double): typingsSlinky.timezonecomplete.basicsMod.TimeStruct = js.native
  }
  
  @JSImport("timezonecomplete", "TimeUnit")
  @js.native
  object TimeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.basicsMod.TimeUnit with Double] = js.native
    
    /* 4 */ val Day: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Day with Double = js.native
    
    /* 3 */ val Hour: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Hour with Double = js.native
    
    /* 8 */ val MAX: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.MAX with Double = js.native
    
    /* 0 */ val Millisecond: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Millisecond with Double = js.native
    
    /* 2 */ val Minute: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Minute with Double = js.native
    
    /* 6 */ val Month: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Month with Double = js.native
    
    /* 1 */ val Second: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Second with Double = js.native
    
    /* 5 */ val Week: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Week with Double = js.native
    
    /* 7 */ val Year: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Year with Double = js.native
  }
  
  @JSImport("timezonecomplete", "TimeZone")
  @js.native
  /**
    * Do not use this constructor, use the static
    * TimeZone.zone() method instead.
    * @param name NORMALIZED name, assumed to be correct
    * @param dst Adhere to Daylight Saving Time if applicable, ignored for local time and fixed offsets
    * @throws timezonecomplete.NotFound.Zone if the given zone name doesn't exist
    * @throws timezonecomplete.InvalidTimeZoneData if the time zone database is invalid
    */
  class TimeZone protected ()
    extends typingsSlinky.timezonecomplete.timezoneMod.TimeZone
  /* static members */
  object TimeZone {
    
    @JSImport("timezonecomplete", "TimeZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Time zone cache.
      */
    @JSImport("timezonecomplete", "TimeZone._cache")
    @js.native
    def _cache: js.Any = js.native
    @scala.inline
    def _cache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_cache")(x.asInstanceOf[js.Any])
    
    /**
      * Find in cache or create zone
      * @param name	Time zone name
      * @param dst	Adhere to Daylight Saving Time?
      * @throws timezonecomplete.NotFound.Zone if the zone doesn't exist in the time zone database
      */
    @JSImport("timezonecomplete", "TimeZone._findOrCreate")
    @js.native
    def _findOrCreate: js.Any = js.native
    @scala.inline
    def _findOrCreate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_findOrCreate")(x.asInstanceOf[js.Any])
    
    /**
      * Returns true iff the first non-whitespace character of s is +, -, or Z
      * @param s
      * @throws nothing
      */
    @JSImport("timezonecomplete", "TimeZone._isOffsetString")
    @js.native
    def _isOffsetString: js.Any = js.native
    @scala.inline
    def _isOffsetString_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isOffsetString")(x.asInstanceOf[js.Any])
    
    /**
      * Normalize a string so it can be used as a key for a cache lookup
      * @throws Argument.S if s is empty
      */
    @JSImport("timezonecomplete", "TimeZone._normalizeString")
    @js.native
    def _normalizeString: js.Any = js.native
    @scala.inline
    def _normalizeString_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_normalizeString")(x.asInstanceOf[js.Any])
    
    /**
      * The local time zone for a given date. Note that
      * the time zone varies with the date: amsterdam time for
      * 2014-01-01 is +01:00 and amsterdam time for 2014-07-01 is +02:00
      * @throws nothing
      */
    @JSImport("timezonecomplete", "TimeZone.local")
    @js.native
    def local(): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
    
    /**
      * Convert an offset number into an offset string
      * @param offset The offset in minutes from UTC e.g. 90 minutes
      * @return the offset in ISO notation "+01:30" for +90 minutes
      * @throws Argument.Offset if offset is not a finite number or not within -24 * 60 ... +24 * 60 minutes
      */
    @JSImport("timezonecomplete", "TimeZone.offsetToString")
    @js.native
    def offsetToString(offset: Double): String = js.native
    
    /**
      * String to offset conversion.
      * @param s	Formats: "-01:00", "-0100", "-01", "Z"
      * @return offset w.r.t. UTC in minutes
      * @throws timezonecomplete.Argument.S if s cannot be parsed
      */
    @JSImport("timezonecomplete", "TimeZone.stringToOffset")
    @js.native
    def stringToOffset(s: String): Double = js.native
    
    /**
      * The UTC time zone.
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    @JSImport("timezonecomplete", "TimeZone.utc")
    @js.native
    def utc(): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
    
    /**
      * Time zone with a fixed offset
      * @param offset	offset w.r.t. UTC in minutes, e.g. 90 for +01:30
      * @throws timezonecomplete.Argument.Offset if the offset is not within -24h...+24h (in minutes)
      */
    @JSImport("timezonecomplete", "TimeZone.zone")
    @js.native
    def zone(offset: Double): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
    /**
      * Time zone for an offset string or an IANA time zone string. Note that time zones are cached
      * so you don't necessarily get a new object each time.
      * @param s "localtime" for local time,
      *          a TZ database time zone name (e.g. Europe/Amsterdam),
      *          or an offset string (either +01:30, +0130, +01, Z). For a full list of names, see:
      *          https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
      *          TZ database zone name may be suffixed with " without DST" to indicate no DST should be applied.
      *          In that case, the dst parameter is ignored.
      * @param dst	Optional, default true: adhere to Daylight Saving Time if applicable. Note for
      *              "localtime", timezonecomplete will adhere to the computer settings, the DST flag
      *              does not have any effect.
      * @throws timezonecomplete.Argument.S if s cannot be parsed
      * @throws timezonecomplete.NotFound.Zone if the zone name doesn't exist in the time zone database
      */
    @JSImport("timezonecomplete", "TimeZone.zone")
    @js.native
    def zone(s: String): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
    @JSImport("timezonecomplete", "TimeZone.zone")
    @js.native
    def zone(s: String, dst: Boolean): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
  }
  
  @JSImport("timezonecomplete", "TimeZoneKind")
  @js.native
  object TimeZoneKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.timezoneMod.TimeZoneKind with Double] = js.native
    
    /* 0 */ val Local: typingsSlinky.timezonecomplete.timezoneMod.TimeZoneKind.Local with Double = js.native
    
    /* 1 */ val Offset: typingsSlinky.timezonecomplete.timezoneMod.TimeZoneKind.Offset with Double = js.native
    
    /* 2 */ val Proper: typingsSlinky.timezonecomplete.timezoneMod.TimeZoneKind.Proper with Double = js.native
  }
  
  @JSImport("timezonecomplete", "ToType")
  @js.native
  object ToType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.tzDatabaseMod.ToType with Double] = js.native
    
    /* 1 */ val Max: typingsSlinky.timezonecomplete.tzDatabaseMod.ToType.Max with Double = js.native
    
    /* 0 */ val Year: typingsSlinky.timezonecomplete.tzDatabaseMod.ToType.Year with Double = js.native
  }
  
  @JSImport("timezonecomplete", "Transition")
  @js.native
  class Transition protected ()
    extends typingsSlinky.timezonecomplete.tzDatabaseMod.Transition {
    /**
      * Constructor
      * @param at
      * @param offset
      * @param letter
      * @throws nothing
      */
    def this(
      /**
      * Transition time in UTC millis
      */
    at: Double,
      /**
      * New offset (type of offset depends on the function)
      */
    offset: typingsSlinky.timezonecomplete.durationMod.Duration,
      /**
      * New timzone abbreviation letter
      */
    letter: String
    ) = this()
  }
  
  @JSImport("timezonecomplete", "TzDatabase")
  @js.native
  /**
    * Constructor - do not use, this is a singleton class. Use TzDatabase.instance() instead
    * @throws AlreadyCreated if an instance already exists
    * @throws timezonecomplete.InvalidTimeZoneData if `data` is empty or invalid
    */
  class TzDatabase protected ()
    extends typingsSlinky.timezonecomplete.tzDatabaseMod.TzDatabase
  /* static members */
  object TzDatabase {
    
    @JSImport("timezonecomplete", "TzDatabase")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Single instance member
      */
    @JSImport("timezonecomplete", "TzDatabase._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /**
      * (re-) initialize timezonecomplete with time zone data
      *
      * @param data TZ data as JSON object (from one of the tzdata NPM modules).
      *             If not given, Timezonecomplete will search for installed modules.
      * @throws timezonecomplete.InvalidTimeZoneData if `data` or the global time zone data is invalid
      */
    @JSImport("timezonecomplete", "TzDatabase.init")
    @js.native
    def init(): Unit = js.native
    @JSImport("timezonecomplete", "TzDatabase.init")
    @js.native
    def init(data: js.Any): Unit = js.native
    @JSImport("timezonecomplete", "TzDatabase.init")
    @js.native
    def init(data: js.Array[_]): Unit = js.native
    
    /**
      * Single instance of this database
      * @throws timezonecomplete.InvalidTimeZoneData if the global time zone data is invalid
      */
    @JSImport("timezonecomplete", "TzDatabase.instance")
    @js.native
    def instance(): typingsSlinky.timezonecomplete.tzDatabaseMod.TzDatabase = js.native
  }
  
  @JSImport("timezonecomplete", "WEEKDAY_LETTERS")
  @js.native
  val WEEKDAY_LETTERS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "WEEKDAY_TWO_LETTERS")
  @js.native
  val WEEKDAY_TWO_LETTERS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "WeekDay")
  @js.native
  object WeekDay extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.timezonecomplete.basicsMod.WeekDay with Double] = js.native
    
    /* 5 */ val Friday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Friday with Double = js.native
    
    /* 1 */ val Monday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Monday with Double = js.native
    
    /* 6 */ val Saturday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Saturday with Double = js.native
    
    /* 0 */ val Sunday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Sunday with Double = js.native
    
    /* 4 */ val Thursday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Thursday with Double = js.native
    
    /* 2 */ val Tuesday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Tuesday with Double = js.native
    
    /* 3 */ val Wednesday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Wednesday with Double = js.native
  }
  
  @JSImport("timezonecomplete", "ZoneInfo")
  @js.native
  class ZoneInfo protected ()
    extends typingsSlinky.timezonecomplete.tzDatabaseMod.ZoneInfo {
    /**
      * Constructor
      * @param gmtoff
      * @param ruleType
      * @param ruleOffset
      * @param ruleName
      * @param format
      * @param until
      * @throws nothing
      */
    def this(
      /**
      * GMT offset in fractional minutes, POSITIVE to UTC (note JavaScript.Date gives offsets
      * contrary to what you might expect).  E.g. Europe/Amsterdam has +60 minutes in this field because
      * it is one hour ahead of UTC
      */
    gmtoff: typingsSlinky.timezonecomplete.durationMod.Duration,
      /**
      * The RULES column tells us whether daylight saving time is being observed:
      * A hyphen, a kind of null value, means that we have not set our clocks ahead of standard time.
      * An amount of time (usually but not necessarily “1:00” meaning one hour) means that we have set our clocks ahead by that amount.
      * Some alphabetic string means that we might have set our clocks ahead; and we need to check the rule
      * the name of which is the given alphabetic string.
      */
    ruleType: RuleType,
      /**
      * If the rule column is an offset, this is the offset
      */
    ruleOffset: typingsSlinky.timezonecomplete.durationMod.Duration,
      /**
      * If the rule column is a rule name, this is the rule name
      */
    ruleName: String,
      /**
      * The FORMAT column specifies the usual abbreviation of the time zone name. It can have one of four forms:
      * the string, “zzz,” which is a kind of null value (don’t ask)
      * a single alphabetic string other than “zzz,” in which case that’s the abbreviation
      * a pair of strings separated by a slash (‘/’), in which case the first string is the abbreviation
      * for the standard time name and the second string is the abbreviation for the daylight saving time name
      * a string containing “%s,” in which case the “%s” will be replaced by the text in the appropriate Rule’s LETTER column
      */
    format: String
    ) = this()
    def this(
      /**
      * GMT offset in fractional minutes, POSITIVE to UTC (note JavaScript.Date gives offsets
      * contrary to what you might expect).  E.g. Europe/Amsterdam has +60 minutes in this field because
      * it is one hour ahead of UTC
      */
    gmtoff: typingsSlinky.timezonecomplete.durationMod.Duration,
      /**
      * The RULES column tells us whether daylight saving time is being observed:
      * A hyphen, a kind of null value, means that we have not set our clocks ahead of standard time.
      * An amount of time (usually but not necessarily “1:00” meaning one hour) means that we have set our clocks ahead by that amount.
      * Some alphabetic string means that we might have set our clocks ahead; and we need to check the rule
      * the name of which is the given alphabetic string.
      */
    ruleType: RuleType,
      /**
      * If the rule column is an offset, this is the offset
      */
    ruleOffset: typingsSlinky.timezonecomplete.durationMod.Duration,
      /**
      * If the rule column is a rule name, this is the rule name
      */
    ruleName: String,
      /**
      * The FORMAT column specifies the usual abbreviation of the time zone name. It can have one of four forms:
      * the string, “zzz,” which is a kind of null value (don’t ask)
      * a single alphabetic string other than “zzz,” in which case that’s the abbreviation
      * a pair of strings separated by a slash (‘/’), in which case the first string is the abbreviation
      * for the standard time name and the second string is the abbreviation for the daylight saving time name
      * a string containing “%s,” in which case the “%s” will be replaced by the text in the appropriate Rule’s LETTER column
      */
    format: String,
      /**
      * Until timestamp in unix utc millis. The zone info is valid up to
      * and excluding this timestamp.
      * Note this value can be undefined (for the first rule)
      */
    until: Double
    ) = this()
  }
  
  @JSImport("timezonecomplete", "abs")
  @js.native
  def abs(d: typingsSlinky.timezonecomplete.durationMod.Duration): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "binaryInsertionIndex")
  @js.native
  def binaryInsertionIndex[T](arr: js.Array[T], compare: js.Function1[/* a */ T, Double]): Double = js.native
  
  @JSImport("timezonecomplete", "dayOfYear")
  @js.native
  def dayOfYear(year: Double, month: Double, day: Double): Double = js.native
  
  @JSImport("timezonecomplete", "days")
  @js.native
  def days(n: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "daysInMonth")
  @js.native
  def daysInMonth(year: Double, month: Double): Double = js.native
  
  @JSImport("timezonecomplete", "daysInYear")
  @js.native
  def daysInYear(year: Double): Double = js.native
  
  @JSImport("timezonecomplete", "firstWeekDayOfMonth")
  @js.native
  def firstWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = js.native
  
  @JSImport("timezonecomplete", "format")
  @js.native
  def format(
    dateTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String
  ): String = js.native
  @JSImport("timezonecomplete", "format")
  @js.native
  def format(
    dateTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  @JSImport("timezonecomplete", "format")
  @js.native
  def format(
    dateTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    localZone: Null,
    formatString: String
  ): String = js.native
  @JSImport("timezonecomplete", "format")
  @js.native
  def format(
    dateTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    localZone: Null,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  @JSImport("timezonecomplete", "format")
  @js.native
  def format(
    dateTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    localZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
    formatString: String
  ): String = js.native
  @JSImport("timezonecomplete", "format")
  @js.native
  def format(
    dateTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    localZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  
  @JSImport("timezonecomplete", "hours")
  @js.native
  def hours(n: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "isDateTime")
  @js.native
  def isDateTime(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/datetime.DateTime */ Boolean = js.native
  
  @JSImport("timezonecomplete", "isDuration")
  @js.native
  def isDuration(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/duration.Duration */ Boolean = js.native
  
  @JSImport("timezonecomplete", "isLeapYear")
  @js.native
  def isLeapYear(year: Double): Boolean = js.native
  
  @JSImport("timezonecomplete", "isPeriod")
  @js.native
  def isPeriod(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/period.Period */ Boolean = js.native
  
  @JSImport("timezonecomplete", "isTimeZone")
  @js.native
  def isTimeZone(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ Boolean = js.native
  
  @JSImport("timezonecomplete", "isValidOffsetString")
  @js.native
  def isValidOffsetString(s: String): Boolean = js.native
  
  @JSImport("timezonecomplete", "isValidPeriodJson")
  @js.native
  def isValidPeriodJson(json: PeriodJson): Boolean = js.native
  
  @JSImport("timezonecomplete", "lastWeekDayOfMonth")
  @js.native
  def lastWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = js.native
  
  @JSImport("timezonecomplete", "local")
  @js.native
  def local(): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
  
  @JSImport("timezonecomplete", "max")
  @js.native
  def max(
    d1: typingsSlinky.timezonecomplete.datetimeMod.DateTime,
    d2: typingsSlinky.timezonecomplete.datetimeMod.DateTime
  ): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
  @JSImport("timezonecomplete", "max")
  @js.native
  def max(
    d1: typingsSlinky.timezonecomplete.durationMod.Duration,
    d2: typingsSlinky.timezonecomplete.durationMod.Duration
  ): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "milliseconds")
  @js.native
  def milliseconds(n: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "min")
  @js.native
  def min(
    d1: typingsSlinky.timezonecomplete.datetimeMod.DateTime,
    d2: typingsSlinky.timezonecomplete.datetimeMod.DateTime
  ): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
  @JSImport("timezonecomplete", "min")
  @js.native
  def min(
    d1: typingsSlinky.timezonecomplete.durationMod.Duration,
    d2: typingsSlinky.timezonecomplete.durationMod.Duration
  ): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "minutes")
  @js.native
  def minutes(n: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "months")
  @js.native
  def months(n: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "now")
  @js.native
  def now(): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
  @JSImport("timezonecomplete", "now")
  @js.native
  def now(timeZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
  
  @JSImport("timezonecomplete", "nowLocal")
  @js.native
  def nowLocal(): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
  
  @JSImport("timezonecomplete", "nowUtc")
  @js.native
  def nowUtc(): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
  
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(dateTimeString: String, formatString: String): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(dateTimeString: String, formatString: String, overrideZone: Null, allowTrailing: Boolean): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  
  @JSImport("timezonecomplete", "parseable")
  @js.native
  def parseable(dateTimeString: String, formatString: String): Boolean = js.native
  @JSImport("timezonecomplete", "parseable")
  @js.native
  def parseable(
    dateTimeString: String,
    formatString: String,
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): Boolean = js.native
  @JSImport("timezonecomplete", "parseable")
  @js.native
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean): Boolean = js.native
  @JSImport("timezonecomplete", "parseable")
  @js.native
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean, locale: PartialLocale): Boolean = js.native
  
  @JSImport("timezonecomplete", "periodDstToString")
  @js.native
  def periodDstToString(p: PeriodDst): String = js.native
  
  @JSImport("timezonecomplete", "secondOfDay")
  @js.native
  def secondOfDay(hour: Double, minute: Double, second: Double): Double = js.native
  
  @JSImport("timezonecomplete", "seconds")
  @js.native
  def seconds(n: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "stringToTimeUnit")
  @js.native
  def stringToTimeUnit(s: String): TimeUnit = js.native
  
  @JSImport("timezonecomplete", "timeToUnixNoLeapSecs")
  @js.native
  def timeToUnixNoLeapSecs(components: TimeComponentOpts): Double = js.native
  @JSImport("timezonecomplete", "timeToUnixNoLeapSecs")
  @js.native
  def timeToUnixNoLeapSecs(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    milli: Double
  ): Double = js.native
  
  @JSImport("timezonecomplete", "timeUnitToMilliseconds")
  @js.native
  def timeUnitToMilliseconds(unit: TimeUnit): Double = js.native
  
  @JSImport("timezonecomplete", "timeUnitToString")
  @js.native
  def timeUnitToString(unit: TimeUnit): String = js.native
  @JSImport("timezonecomplete", "timeUnitToString")
  @js.native
  def timeUnitToString(unit: TimeUnit, amount: Double): String = js.native
  
  @JSImport("timezonecomplete", "timestampOnWeekTimeGreaterThanOrEqualTo")
  @js.native
  def timestampOnWeekTimeGreaterThanOrEqualTo(opts: WeekTimeOpts): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
  
  @JSImport("timezonecomplete", "timestampOnWeekTimeLessThan")
  @js.native
  def timestampOnWeekTimeLessThan(opts: WeekTimeOpts): typingsSlinky.timezonecomplete.datetimeMod.DateTime = js.native
  
  @JSImport("timezonecomplete", "unixToTimeNoLeapSecs")
  @js.native
  def unixToTimeNoLeapSecs(unixMillis: Double): TimeComponents = js.native
  
  @JSImport("timezonecomplete", "utc")
  @js.native
  def utc(): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
  
  @JSImport("timezonecomplete", "weekDayNoLeapSecs")
  @js.native
  def weekDayNoLeapSecs(unixMillis: Double): WeekDay = js.native
  
  @JSImport("timezonecomplete", "weekDayOnOrAfter")
  @js.native
  def weekDayOnOrAfter(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = js.native
  
  @JSImport("timezonecomplete", "weekDayOnOrBefore")
  @js.native
  def weekDayOnOrBefore(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = js.native
  
  @JSImport("timezonecomplete", "weekNumber")
  @js.native
  def weekNumber(year: Double, month: Double, day: Double): Double = js.native
  
  @JSImport("timezonecomplete", "weekOfMonth")
  @js.native
  def weekOfMonth(year: Double, month: Double, day: Double): Double = js.native
  
  @JSImport("timezonecomplete", "years")
  @js.native
  def years(n: Double): typingsSlinky.timezonecomplete.durationMod.Duration = js.native
  
  @JSImport("timezonecomplete", "zone")
  @js.native
  def zone(name: String): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
  @JSImport("timezonecomplete", "zone")
  @js.native
  def zone(name: String, dst: Boolean): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
  @JSImport("timezonecomplete", "zone")
  @js.native
  def zone(offset: Double): typingsSlinky.timezonecomplete.timezoneMod.TimeZone = js.native
}
