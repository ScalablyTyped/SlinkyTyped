package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.utilMod.Vector10
import typingsSlinky.vegaTypings.utilMod.Vector12
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.utilMod.Vector7
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  @js.native
  trait Locale extends StObject {
    
    var number: js.UndefOr[NumberLocale] = js.native
    
    var time: js.UndefOr[TimeLocale] = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(): Locale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumber(value: NumberLocale): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setTime(value: TimeLocale): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  @js.native
  trait NumberLocale extends StObject {
    
    /**
      * The currency prefix and suffix (e.g., ["$", ""]).
      */
    var currency: Vector2[String] = js.native
    
    /**
      * The decimal point (e.g., ".").
      */
    var decimal: String = js.native
    
    /**
      * The array of group sizes (e.g., [3]), cycled as needed.
      */
    var grouping: js.Array[Double] = js.native
    
    /**
      * The minus sign (defaults to hyphen-minus, "-").
      */
    var minus: js.UndefOr[String] = js.native
    
    /**
      * The not-a-number value (defaults to "NaN").
      */
    var nan: js.UndefOr[String] = js.native
    
    /**
      * An array of ten strings to replace the numerals 0-9.
      */
    var numerals: js.UndefOr[Vector10[String]] = js.native
    
    /**
      * The percent sign (defaults to "%").
      */
    var percent: js.UndefOr[String] = js.native
    
    /**
      * The group separator (e.g., ",").
      */
    var thousands: String = js.native
  }
  object NumberLocale {
    
    @scala.inline
    def apply(currency: Vector2[String], decimal: String, grouping: js.Array[Double], thousands: String): NumberLocale = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberLocale]
    }
    
    @scala.inline
    implicit class NumberLocaleMutableBuilder[Self <: NumberLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: Vector2[String]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrouping(value: js.Array[Double]): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingVarargs(value: Double*): Self = StObject.set(x, "grouping", js.Array(value :_*))
      
      @scala.inline
      def setMinus(value: String): Self = StObject.set(x, "minus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinusUndefined: Self = StObject.set(x, "minus", js.undefined)
      
      @scala.inline
      def setNan(value: String): Self = StObject.set(x, "nan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNanUndefined: Self = StObject.set(x, "nan", js.undefined)
      
      @scala.inline
      def setNumerals(value: Vector10[String]): Self = StObject.set(x, "numerals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeralsUndefined: Self = StObject.set(x, "numerals", js.undefined)
      
      @scala.inline
      def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimeLocale extends StObject {
    
    /**
      * The date (%x) format specifier (e.g., "%m/%d/%Y").
      */
    var date: String = js.native
    
    /**
      * The date and time (%c) format specifier (e.g., "%a %b %e %X %Y").
      */
    var dateTime: String = js.native
    
    /**
      * The full names of the weekdays, starting with Sunday.
      */
    var days: Vector7[String] = js.native
    
    /**
      * The full names of the months (starting with January).
      */
    var months: Vector12[String] = js.native
    
    /**
      * The A.M. and P.M. equivalents (e.g., ["AM", "PM"]).
      */
    var periods: Vector2[String] = js.native
    
    /**
      * The abbreviated names of the weekdays, starting with Sunday.
      */
    var shortDays: Vector7[String] = js.native
    
    /**
      * The abbreviated names of the months (starting with January).
      */
    var shortMonths: Vector12[String] = js.native
    
    /**
      * The time (%X) format specifier (e.g., "%H:%M:%S").
      */
    var time: String = js.native
  }
  object TimeLocale {
    
    @scala.inline
    def apply(
      date: String,
      dateTime: String,
      days: Vector7[String],
      months: Vector12[String],
      periods: Vector2[String],
      shortDays: Vector7[String],
      shortMonths: Vector12[String],
      time: String
    ): TimeLocale = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeLocale]
    }
    
    @scala.inline
    implicit class TimeLocaleMutableBuilder[Self <: TimeLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDays(value: Vector7[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: Vector12[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriods(value: Vector2[String]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDays(value: Vector7[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortMonths(value: Vector12[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
