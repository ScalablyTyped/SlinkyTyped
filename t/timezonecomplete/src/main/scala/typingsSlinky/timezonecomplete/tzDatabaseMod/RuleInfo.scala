package typingsSlinky.timezonecomplete.tzDatabaseMod

import typingsSlinky.timezonecomplete.basicsMod.TimeStruct
import typingsSlinky.timezonecomplete.basicsMod.WeekDay
import typingsSlinky.timezonecomplete.durationMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete/dist/lib/tz-database", "RuleInfo")
@js.native
class RuleInfo protected () extends js.Object {
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
  save: Duration,
    /**
    * Character to insert in %s for time zone abbreviation
    * Note if TZ database indicates "-" this is the empty string
    */
  letter: String
  ) = this()
  
  /**
    * Returns true iff this rule is applicable in the year
    * @throws nothing
    */
  def applicable(year: Double): Boolean = js.native
  
  /**
    * AT column hour
    */
  var atHour: Double = js.native
  
  /**
    * AT column minute
    */
  var atMinute: Double = js.native
  
  /**
    * AT column second
    */
  var atSecond: Double = js.native
  
  /**
    * AT column type
    */
  var atType: AtType = js.native
  
  /**
    * Returns the date that the rule takes effect. Note that the time
    * is NOT adjusted for wall clock time or standard time, i.e. this.atType is
    * not taken into account
    * @throws NotApplicable if this rule is not applicable in the given year
    * @throws timezonecomplete.InvalidTimeZoneData if this rule depends on a weekday and the weekday in question doesn't exist
    */
  def effectiveDate(year: Double): TimeStruct = js.native
  
  /**
    * Sort comparison
    * @return (first effective date is equal to other's first effective date)
    * @throws timezonecomplete.InvalidTimeZoneData for invalid internal structure of the database
    */
  def effectiveEqual(other: RuleInfo): Boolean = js.native
  
  /**
    * Sort comparison
    * @return (first effective date is less than other's first effective date)
    * @throws timezonecomplete.InvalidTimeZoneData if this rule depends on a weekday and the weekday in question doesn't exist
    */
  def effectiveLess(other: RuleInfo): Boolean = js.native
  
  /**
    * FROM column year number.
    * Note, can be -10000 for NaN value (e.g. for "SystemV" rules)
    */
  var from: Double = js.native
  
  /**
    * IN column month number 1-12
    */
  var inMonth: Double = js.native
  
  /**
    * Character to insert in %s for time zone abbreviation
    * Note if TZ database indicates "-" this is the empty string
    */
  var letter: String = js.native
  
  /**
    * If onType is DayNum, the day number
    */
  var onDay: Double = js.native
  
  /**
    * ON column type
    */
  var onType: OnType = js.native
  
  /**
    * If onType is not DayNum, the weekday
    */
  var onWeekDay: WeekDay = js.native
  
  /**
    * DST offset from local standard time (NOT from UTC!)
    */
  var save: Duration = js.native
  
  /**
    * TO column type: Year for year numbers and "only" values, Max for "max" value.
    */
  var toType: ToType = js.native
  
  /**
    * If TO column is a year, the year number. If TO column is "only", the FROM year.
    */
  var toYear: Double = js.native
  
  /**
    * Returns the transition moment in UTC in the given year
    *
    * @param year	The year for which to return the transition
    * @param standardOffset	The standard offset for the timezone without DST
    * @param prevRule	The previous rule
    * @throws NotApplicable if this rule is not applicable in the given year
    * @throws timezonecomplete.InvalidTimeZoneData for invalid internal structure of the database
    */
  def transitionTimeUtc(year: Double, standardOffset: Duration): Double = js.native
  def transitionTimeUtc(year: Double, standardOffset: Duration, prevRule: RuleInfo): Double = js.native
  
  /**
    * TYPE column, not used so far
    */
  var `type`: String = js.native
}
