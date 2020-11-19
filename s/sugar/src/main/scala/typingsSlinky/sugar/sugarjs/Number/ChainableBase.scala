package typingsSlinky.sugar.sugarjs.Number

import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.sugar.Array
import typingsSlinky.sugar.Date
import typingsSlinky.sugar.sugarjs.Date.DateCreateOptions
import typingsSlinky.sugar.sugarjs.Range
import typingsSlinky.sugar.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainableBase[RawValue] extends js.Object {
  
  def abbr(): SugarDefaultChainable[String] = js.native
  def abbr(precision: Double): SugarDefaultChainable[String] = js.native
  
  def abs(): SugarDefaultChainable[Double] = js.native
  
  def acos(): SugarDefaultChainable[Double] = js.native
  
  def asin(): SugarDefaultChainable[Double] = js.native
  
  def atan(): SugarDefaultChainable[Double] = js.native
  
  def bytes(): SugarDefaultChainable[String] = js.native
  def bytes(precision: js.UndefOr[scala.Nothing], binary: js.UndefOr[scala.Nothing], units: String): SugarDefaultChainable[String] = js.native
  def bytes(precision: js.UndefOr[scala.Nothing], binary: Boolean): SugarDefaultChainable[String] = js.native
  def bytes(precision: js.UndefOr[scala.Nothing], binary: Boolean, units: String): SugarDefaultChainable[String] = js.native
  def bytes(precision: Double): SugarDefaultChainable[String] = js.native
  def bytes(precision: Double, binary: js.UndefOr[scala.Nothing], units: String): SugarDefaultChainable[String] = js.native
  def bytes(precision: Double, binary: Boolean): SugarDefaultChainable[String] = js.native
  def bytes(precision: Double, binary: Boolean, units: String): SugarDefaultChainable[String] = js.native
  
  def cap(): SugarDefaultChainable[Double] = js.native
  def cap(max: Double): SugarDefaultChainable[Double] = js.native
  
  def ceil(): SugarDefaultChainable[Double] = js.native
  def ceil(precision: Double): SugarDefaultChainable[Double] = js.native
  
  def chr(): SugarDefaultChainable[String] = js.native
  
  def clamp(): SugarDefaultChainable[Double] = js.native
  def clamp(start: js.UndefOr[scala.Nothing], end: Double): SugarDefaultChainable[Double] = js.native
  def clamp(start: Double): SugarDefaultChainable[Double] = js.native
  def clamp(start: Double, end: Double): SugarDefaultChainable[Double] = js.native
  
  def cos(): SugarDefaultChainable[Double] = js.native
  
  def day(): SugarDefaultChainable[Double] = js.native
  
  def dayAfter(d: String): SugarDefaultChainable[Date] = js.native
  def dayAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def dayAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def dayAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def dayAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def dayAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def dayAgo(): SugarDefaultChainable[Date] = js.native
  
  def dayBefore(d: String): SugarDefaultChainable[Date] = js.native
  def dayBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def dayBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def dayBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def dayBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def dayBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def dayFromNow(): SugarDefaultChainable[Date] = js.native
  
  def days(): SugarDefaultChainable[Double] = js.native
  
  def daysAfter(d: String): SugarDefaultChainable[Date] = js.native
  def daysAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def daysAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def daysAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def daysAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def daysAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def daysAgo(): SugarDefaultChainable[Date] = js.native
  
  def daysBefore(d: String): SugarDefaultChainable[Date] = js.native
  def daysBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def daysBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def daysBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def daysBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def daysBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def daysFromNow(): SugarDefaultChainable[Date] = js.native
  
  def downto[T](num: Double): SugarDefaultChainable[Array[T]] = js.native
  def downto[T](
    num: Double,
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
  ): SugarDefaultChainable[Array[T]] = js.native
  def downto[T](
    num: Double,
    step: js.UndefOr[scala.Nothing],
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
  ): SugarDefaultChainable[Array[T]] = js.native
  def downto[T](num: Double, step: Double): SugarDefaultChainable[Array[T]] = js.native
  def downto[T](
    num: Double,
    step: Double,
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
  ): SugarDefaultChainable[Array[T]] = js.native
  
  def duration(): SugarDefaultChainable[String] = js.native
  def duration(localeCode: String): SugarDefaultChainable[String] = js.native
  
  def exp(): SugarDefaultChainable[Double] = js.native
  
  def floor(): SugarDefaultChainable[Double] = js.native
  def floor(precision: Double): SugarDefaultChainable[Double] = js.native
  
  def format(): SugarDefaultChainable[String] = js.native
  def format(place: Double): SugarDefaultChainable[String] = js.native
  
  def hex(): SugarDefaultChainable[String] = js.native
  def hex(pad: Double): SugarDefaultChainable[String] = js.native
  
  def hour(): SugarDefaultChainable[Double] = js.native
  
  def hourAfter(d: String): SugarDefaultChainable[Date] = js.native
  def hourAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def hourAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def hourAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def hourAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def hourAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def hourAgo(): SugarDefaultChainable[Date] = js.native
  
  def hourBefore(d: String): SugarDefaultChainable[Date] = js.native
  def hourBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def hourBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def hourBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def hourBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def hourBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def hourFromNow(): SugarDefaultChainable[Date] = js.native
  
  def hours(): SugarDefaultChainable[Double] = js.native
  
  def hoursAfter(d: String): SugarDefaultChainable[Date] = js.native
  def hoursAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def hoursAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def hoursAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def hoursAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def hoursAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def hoursAgo(): SugarDefaultChainable[Date] = js.native
  
  def hoursBefore(d: String): SugarDefaultChainable[Date] = js.native
  def hoursBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def hoursBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def hoursBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def hoursBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def hoursBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def hoursFromNow(): SugarDefaultChainable[Date] = js.native
  
  def isEven(): SugarDefaultChainable[Boolean] = js.native
  
  def isInteger(): SugarDefaultChainable[Boolean] = js.native
  
  def isMultipleOf(num: Double): SugarDefaultChainable[Boolean] = js.native
  
  def isOdd(): SugarDefaultChainable[Boolean] = js.native
  
  def log(): SugarDefaultChainable[Double] = js.native
  def log(base: Double): SugarDefaultChainable[Double] = js.native
  
  def metric(): SugarDefaultChainable[String] = js.native
  def metric(precision: js.UndefOr[scala.Nothing], units: String): SugarDefaultChainable[String] = js.native
  def metric(precision: Double): SugarDefaultChainable[String] = js.native
  def metric(precision: Double, units: String): SugarDefaultChainable[String] = js.native
  
  def millisecond(): SugarDefaultChainable[Double] = js.native
  
  def millisecondAfter(d: String): SugarDefaultChainable[Date] = js.native
  def millisecondAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def millisecondAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def millisecondAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def millisecondAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def millisecondAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def millisecondAgo(): SugarDefaultChainable[Date] = js.native
  
  def millisecondBefore(d: String): SugarDefaultChainable[Date] = js.native
  def millisecondBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def millisecondBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def millisecondBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def millisecondBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def millisecondBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def millisecondFromNow(): SugarDefaultChainable[Date] = js.native
  
  def milliseconds(): SugarDefaultChainable[Double] = js.native
  
  def millisecondsAfter(d: String): SugarDefaultChainable[Date] = js.native
  def millisecondsAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def millisecondsAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def millisecondsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def millisecondsAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def millisecondsAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def millisecondsAgo(): SugarDefaultChainable[Date] = js.native
  
  def millisecondsBefore(d: String): SugarDefaultChainable[Date] = js.native
  def millisecondsBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def millisecondsBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def millisecondsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def millisecondsBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def millisecondsBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def millisecondsFromNow(): SugarDefaultChainable[Date] = js.native
  
  def minute(): SugarDefaultChainable[Double] = js.native
  
  def minuteAfter(d: String): SugarDefaultChainable[Date] = js.native
  def minuteAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def minuteAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def minuteAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def minuteAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def minuteAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def minuteAgo(): SugarDefaultChainable[Date] = js.native
  
  def minuteBefore(d: String): SugarDefaultChainable[Date] = js.native
  def minuteBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def minuteBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def minuteBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def minuteBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def minuteBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def minuteFromNow(): SugarDefaultChainable[Date] = js.native
  
  def minutes(): SugarDefaultChainable[Double] = js.native
  
  def minutesAfter(d: String): SugarDefaultChainable[Date] = js.native
  def minutesAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def minutesAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def minutesAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def minutesAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def minutesAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def minutesAgo(): SugarDefaultChainable[Date] = js.native
  
  def minutesBefore(d: String): SugarDefaultChainable[Date] = js.native
  def minutesBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def minutesBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def minutesBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def minutesBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def minutesBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def minutesFromNow(): SugarDefaultChainable[Date] = js.native
  
  def month(): SugarDefaultChainable[Double] = js.native
  
  def monthAfter(d: String): SugarDefaultChainable[Date] = js.native
  def monthAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def monthAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def monthAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def monthAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def monthAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def monthAgo(): SugarDefaultChainable[Date] = js.native
  
  def monthBefore(d: String): SugarDefaultChainable[Date] = js.native
  def monthBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def monthBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def monthBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def monthBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def monthBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def monthFromNow(): SugarDefaultChainable[Date] = js.native
  
  def months(): SugarDefaultChainable[Double] = js.native
  
  def monthsAfter(d: String): SugarDefaultChainable[Date] = js.native
  def monthsAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def monthsAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def monthsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def monthsAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def monthsAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def monthsAgo(): SugarDefaultChainable[Date] = js.native
  
  def monthsBefore(d: String): SugarDefaultChainable[Date] = js.native
  def monthsBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def monthsBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def monthsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def monthsBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def monthsBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def monthsFromNow(): SugarDefaultChainable[Date] = js.native
  
  def ordinalize(): SugarDefaultChainable[String] = js.native
  
  def pad(): SugarDefaultChainable[String] = js.native
  def pad(place: js.UndefOr[scala.Nothing], sign: js.UndefOr[scala.Nothing], base: Double): SugarDefaultChainable[String] = js.native
  def pad(place: js.UndefOr[scala.Nothing], sign: Boolean): SugarDefaultChainable[String] = js.native
  def pad(place: js.UndefOr[scala.Nothing], sign: Boolean, base: Double): SugarDefaultChainable[String] = js.native
  def pad(place: Double): SugarDefaultChainable[String] = js.native
  def pad(place: Double, sign: js.UndefOr[scala.Nothing], base: Double): SugarDefaultChainable[String] = js.native
  def pad(place: Double, sign: Boolean): SugarDefaultChainable[String] = js.native
  def pad(place: Double, sign: Boolean, base: Double): SugarDefaultChainable[String] = js.native
  
  def pow(): SugarDefaultChainable[Double] = js.native
  
  var raw: RawValue = js.native
  
  def round(): SugarDefaultChainable[Double] = js.native
  def round(precision: Double): SugarDefaultChainable[Double] = js.native
  
  def second(): SugarDefaultChainable[Double] = js.native
  
  def secondAfter(d: String): SugarDefaultChainable[Date] = js.native
  def secondAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def secondAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def secondAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def secondAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def secondAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def secondAgo(): SugarDefaultChainable[Date] = js.native
  
  def secondBefore(d: String): SugarDefaultChainable[Date] = js.native
  def secondBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def secondBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def secondBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def secondBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def secondBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def secondFromNow(): SugarDefaultChainable[Date] = js.native
  
  def seconds(): SugarDefaultChainable[Double] = js.native
  
  def secondsAfter(d: String): SugarDefaultChainable[Date] = js.native
  def secondsAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def secondsAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def secondsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def secondsAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def secondsAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def secondsAgo(): SugarDefaultChainable[Date] = js.native
  
  def secondsBefore(d: String): SugarDefaultChainable[Date] = js.native
  def secondsBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def secondsBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def secondsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def secondsBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def secondsBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def secondsFromNow(): SugarDefaultChainable[Date] = js.native
  
  def sin(): SugarDefaultChainable[Double] = js.native
  
  def sqrt(): SugarDefaultChainable[Double] = js.native
  
  def tan(): SugarDefaultChainable[Double] = js.native
  
  def times[T](indexMapFn: js.Function1[/* i */ Double, SugarDefaultChainable[_]]): SugarDefaultChainable[T] = js.native
  
  def toExponential(): SugarDefaultChainable[String] = js.native
  def toExponential(fractionDigits: Double): SugarDefaultChainable[String] = js.native
  
  def toFixed(): SugarDefaultChainable[String] = js.native
  def toFixed(fractionDigits: Double): SugarDefaultChainable[String] = js.native
  
  def toLocaleString(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: String): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: String, options: NumberFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: Array[String]): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: Array[String], options: NumberFormatOptions): SugarDefaultChainable[String] = js.native
  
  def toNumber(): SugarDefaultChainable[Double] = js.native
  
  def toPrecision(): SugarDefaultChainable[String] = js.native
  def toPrecision(precision: Double): SugarDefaultChainable[String] = js.native
  
  def upto[T](num: Double): SugarDefaultChainable[Array[T]] = js.native
  def upto[T](
    num: Double,
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
  ): SugarDefaultChainable[Array[T]] = js.native
  def upto[T](
    num: Double,
    step: js.UndefOr[scala.Nothing],
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
  ): SugarDefaultChainable[Array[T]] = js.native
  def upto[T](num: Double, step: Double): SugarDefaultChainable[Array[T]] = js.native
  def upto[T](
    num: Double,
    step: Double,
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
  ): SugarDefaultChainable[Array[T]] = js.native
  
  def week(): SugarDefaultChainable[Double] = js.native
  
  def weekAfter(d: String): SugarDefaultChainable[Date] = js.native
  def weekAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def weekAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def weekAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def weekAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def weekAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def weekAgo(): SugarDefaultChainable[Date] = js.native
  
  def weekBefore(d: String): SugarDefaultChainable[Date] = js.native
  def weekBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def weekBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def weekBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def weekBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def weekBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def weekFromNow(): SugarDefaultChainable[Date] = js.native
  
  def weeks(): SugarDefaultChainable[Double] = js.native
  
  def weeksAfter(d: String): SugarDefaultChainable[Date] = js.native
  def weeksAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def weeksAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def weeksAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def weeksAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def weeksAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def weeksAgo(): SugarDefaultChainable[Date] = js.native
  
  def weeksBefore(d: String): SugarDefaultChainable[Date] = js.native
  def weeksBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def weeksBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def weeksBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def weeksBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def weeksBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def weeksFromNow(): SugarDefaultChainable[Date] = js.native
  
  def year(): SugarDefaultChainable[Double] = js.native
  
  def yearAfter(d: String): SugarDefaultChainable[Date] = js.native
  def yearAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def yearAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def yearAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def yearAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def yearAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def yearAgo(): SugarDefaultChainable[Date] = js.native
  
  def yearBefore(d: String): SugarDefaultChainable[Date] = js.native
  def yearBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def yearBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def yearBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def yearBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def yearBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def yearFromNow(): SugarDefaultChainable[Date] = js.native
  
  def years(): SugarDefaultChainable[Double] = js.native
  
  def yearsAfter(d: String): SugarDefaultChainable[Date] = js.native
  def yearsAfter(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def yearsAfter(d: Double): SugarDefaultChainable[Date] = js.native
  def yearsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def yearsAfter(d: Date): SugarDefaultChainable[Date] = js.native
  def yearsAfter(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def yearsAgo(): SugarDefaultChainable[Date] = js.native
  
  def yearsBefore(d: String): SugarDefaultChainable[Date] = js.native
  def yearsBefore(d: String, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def yearsBefore(d: Double): SugarDefaultChainable[Date] = js.native
  def yearsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  def yearsBefore(d: Date): SugarDefaultChainable[Date] = js.native
  def yearsBefore(d: Date, options: DateCreateOptions): SugarDefaultChainable[Date] = js.native
  
  def yearsFromNow(): SugarDefaultChainable[Date] = js.native
}
