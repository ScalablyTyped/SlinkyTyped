package typingsSlinky.timezonecomplete

import typingsSlinky.timezonecomplete.javascriptMod.DateFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicsMod {
  
  @JSImport("timezonecomplete/dist/lib/basics", "TimeStruct")
  @js.native
  class TimeStruct protected () extends StObject {
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
    
    /**
      * The time value in separate year/month/... components
      */
    var _components: js.Any = js.native
    
    /**
      * The time value in unix milliseconds
      */
    var _unixMillis: js.Any = js.native
    
    def components: TimeComponents = js.native
    
    def day: Double = js.native
    
    /**
      * Equality function
      * @param other
      * @throws TypeError if other is not an Object
      */
    def equals(other: TimeStruct): Boolean = js.native
    
    def hour: Double = js.native
    
    def milli: Double = js.native
    
    def minute: Double = js.native
    
    def month: Double = js.native
    
    def second: Double = js.native
    
    def unixMillis: Double = js.native
    
    /**
      * Validate a timestamp. Filters out non-existing values for all time components
      * @returns true iff the timestamp is valid
      * @throws nothing
      */
    def validate(): Boolean = js.native
    
    def year: Double = js.native
    
    /**
      * The day-of-year 0-365
      * @throws nothing
      */
    def yearDay(): Double = js.native
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
    @JSImport("timezonecomplete/dist/lib/basics", "TimeStruct.fromComponents")
    @js.native
    def fromComponents(
      year: js.UndefOr[Double],
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      milli: js.UndefOr[Double]
    ): TimeStruct = js.native
    
    /**
      * Create a TimeStruct from a JavaScript date
      *
      * @param d	The date
      * @param df Which functions to take (getX() or getUTCX())
      * @throws nothing
      */
    @JSImport("timezonecomplete/dist/lib/basics", "TimeStruct.fromDate")
    @js.native
    def fromDate(d: js.Date, df: DateFunctions): TimeStruct = js.native
    
    /**
      * Returns a TimeStruct from an ISO 8601 string WITHOUT time zone
      * @throws timezonecomplete.Argument.S if `s` is not a proper iso string
      */
    @JSImport("timezonecomplete/dist/lib/basics", "TimeStruct.fromString")
    @js.native
    def fromString(s: String): TimeStruct = js.native
    
    /**
      * Create a TimeStruct from a number of unix milliseconds
      * (backward compatibility)
      * @throws timezonecomplete.Argument.UnixMillis for non-integer milliseconds
      */
    @JSImport("timezonecomplete/dist/lib/basics", "TimeStruct.fromUnix")
    @js.native
    def fromUnix(unixMillis: Double): TimeStruct = js.native
  }
  
  @js.native
  sealed trait TimeUnit extends StObject
  @JSImport("timezonecomplete/dist/lib/basics", "TimeUnit")
  @js.native
  object TimeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TimeUnit with Double] = js.native
    
    @js.native
    sealed trait Day extends TimeUnit
    /* 4 */ val Day: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Day with Double = js.native
    
    @js.native
    sealed trait Hour extends TimeUnit
    /* 3 */ val Hour: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Hour with Double = js.native
    
    /**
      * End-of-enum marker, do not use
      */
    @js.native
    sealed trait MAX extends TimeUnit
    /* 8 */ val MAX: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.MAX with Double = js.native
    
    @js.native
    sealed trait Millisecond extends TimeUnit
    /* 0 */ val Millisecond: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Millisecond with Double = js.native
    
    @js.native
    sealed trait Minute extends TimeUnit
    /* 2 */ val Minute: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Minute with Double = js.native
    
    @js.native
    sealed trait Month extends TimeUnit
    /* 6 */ val Month: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Month with Double = js.native
    
    @js.native
    sealed trait Second extends TimeUnit
    /* 1 */ val Second: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Second with Double = js.native
    
    @js.native
    sealed trait Week extends TimeUnit
    /* 5 */ val Week: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Week with Double = js.native
    
    @js.native
    sealed trait Year extends TimeUnit
    /* 7 */ val Year: typingsSlinky.timezonecomplete.basicsMod.TimeUnit.Year with Double = js.native
  }
  
  @js.native
  sealed trait WeekDay extends StObject
  @JSImport("timezonecomplete/dist/lib/basics", "WeekDay")
  @js.native
  object WeekDay extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WeekDay with Double] = js.native
    
    @js.native
    sealed trait Friday extends WeekDay
    /* 5 */ val Friday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Friday with Double = js.native
    
    @js.native
    sealed trait Monday extends WeekDay
    /* 1 */ val Monday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Monday with Double = js.native
    
    @js.native
    sealed trait Saturday extends WeekDay
    /* 6 */ val Saturday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Saturday with Double = js.native
    
    @js.native
    sealed trait Sunday extends WeekDay
    /* 0 */ val Sunday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Sunday with Double = js.native
    
    @js.native
    sealed trait Thursday extends WeekDay
    /* 4 */ val Thursday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Thursday with Double = js.native
    
    @js.native
    sealed trait Tuesday extends WeekDay
    /* 2 */ val Tuesday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Tuesday with Double = js.native
    
    @js.native
    sealed trait Wednesday extends WeekDay
    /* 3 */ val Wednesday: typingsSlinky.timezonecomplete.basicsMod.WeekDay.Wednesday with Double = js.native
  }
  
  @JSImport("timezonecomplete/dist/lib/basics", "binaryInsertionIndex")
  @js.native
  def binaryInsertionIndex[T](arr: js.Array[T], compare: js.Function1[/* a */ T, Double]): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "dayOfYear")
  @js.native
  def dayOfYear(year: Double, month: Double, day: Double): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "daysInMonth")
  @js.native
  def daysInMonth(year: Double, month: Double): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "daysInYear")
  @js.native
  def daysInYear(year: Double): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "firstWeekDayOfMonth")
  @js.native
  def firstWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "isLeapYear")
  @js.native
  def isLeapYear(year: Double): Boolean = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "lastWeekDayOfMonth")
  @js.native
  def lastWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "secondOfDay")
  @js.native
  def secondOfDay(hour: Double, minute: Double, second: Double): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "stringToTimeUnit")
  @js.native
  def stringToTimeUnit(s: String): TimeUnit = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "timeToUnixNoLeapSecs")
  @js.native
  def timeToUnixNoLeapSecs(components: TimeComponentOpts): Double = js.native
  @JSImport("timezonecomplete/dist/lib/basics", "timeToUnixNoLeapSecs")
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
  
  @JSImport("timezonecomplete/dist/lib/basics", "timeUnitToMilliseconds")
  @js.native
  def timeUnitToMilliseconds(unit: TimeUnit): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "timeUnitToString")
  @js.native
  def timeUnitToString(unit: TimeUnit): String = js.native
  @JSImport("timezonecomplete/dist/lib/basics", "timeUnitToString")
  @js.native
  def timeUnitToString(unit: TimeUnit, amount: Double): String = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "unixToTimeNoLeapSecs")
  @js.native
  def unixToTimeNoLeapSecs(unixMillis: Double): TimeComponents = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "weekDayNoLeapSecs")
  @js.native
  def weekDayNoLeapSecs(unixMillis: Double): WeekDay = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "weekDayOnOrAfter")
  @js.native
  def weekDayOnOrAfter(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "weekDayOnOrBefore")
  @js.native
  def weekDayOnOrBefore(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "weekNumber")
  @js.native
  def weekNumber(year: Double, month: Double, day: Double): Double = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "weekOfMonth")
  @js.native
  def weekOfMonth(year: Double, month: Double, day: Double): Double = js.native
  
  @js.native
  trait TimeComponentOpts extends StObject {
    
    /**
      * Day of month 1-31, default 1
      */
    var day: js.UndefOr[Double] = js.native
    
    /**
      * Hour of day 0-23, default 0
      */
    var hour: js.UndefOr[Double] = js.native
    
    /**
      * Millisecond 0-999, default 0
      */
    var milli: js.UndefOr[Double] = js.native
    
    /**
      * Minute 0-59, default 0
      */
    var minute: js.UndefOr[Double] = js.native
    
    /**
      * Month 1-12, default 1
      */
    var month: js.UndefOr[Double] = js.native
    
    /**
      * Second 0-59, default 0
      */
    var second: js.UndefOr[Double] = js.native
    
    /**
      * Year, default 1970
      */
    var year: js.UndefOr[Double] = js.native
  }
  object TimeComponentOpts {
    
    @scala.inline
    def apply(): TimeComponentOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeComponentOpts]
    }
    
    @scala.inline
    implicit class TimeComponentOptsMutableBuilder[Self <: TimeComponentOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setMilli(value: Double): Self = StObject.set(x, "milli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilliUndefined: Self = StObject.set(x, "milli", js.undefined)
      
      @scala.inline
      def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait TimeComponents extends StObject {
    
    /**
      * Day of month 1-31
      */
    var day: Double = js.native
    
    /**
      * Hour 0-23
      */
    var hour: Double = js.native
    
    /**
      * Millisecond 0-999
      */
    var milli: Double = js.native
    
    /**
      * Minute
      */
    var minute: Double = js.native
    
    /**
      * Month 1-12
      */
    var month: Double = js.native
    
    /**
      * Second
      */
    var second: Double = js.native
    
    /**
      * Year
      */
    var year: Double = js.native
  }
  object TimeComponents {
    
    @scala.inline
    def apply(
      day: Double,
      hour: Double,
      milli: Double,
      minute: Double,
      month: Double,
      second: Double,
      year: Double
    ): TimeComponents = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], milli = milli.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeComponents]
    }
    
    @scala.inline
    implicit class TimeComponentsMutableBuilder[Self <: TimeComponents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilli(value: Double): Self = StObject.set(x, "milli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
