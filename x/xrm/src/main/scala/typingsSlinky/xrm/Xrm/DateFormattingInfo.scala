package typingsSlinky.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UserSettings.dateFormattingInfo response
  */
@js.native
trait DateFormattingInfo extends StObject {
  
  var AbbreviatedDayNames: js.Array[String] = js.native
  
  var AbbreviatedMonthGenitiveNames: js.Array[String] = js.native
  
  var AbbreviatedMonthNames: js.Array[String] = js.native
  
  var AmDesignator: String = js.native
  
  var Calendar: typingsSlinky.xrm.Xrm.Calendar = js.native
  
  var CalendarWeekRule: Double = js.native
  
  var DateSeparator: String = js.native
  
  var DayNames: js.Array[String] = js.native
  
  var FirstDayOfWeek: Double = js.native
  
  var FullDateTimePattern: String = js.native
  
  var LongDatePattern: String = js.native
  
  var LongTimePattern: String = js.native
  
  var MonthDayPattern: String = js.native
  
  var MonthGenitiveNames: js.Array[String] = js.native
  
  var MonthNames: js.Array[String] = js.native
  
  var PmDesignator: String = js.native
  
  var ShortDatePattern: String = js.native
  
  var ShortTimePattern: String = js.native
  
  var ShortestDayNames: js.Array[String] = js.native
  
  var SortableDateTimePattern: String = js.native
  
  var TimeSeparator: String = js.native
  
  var UniversalSortableDateTimePattern: String = js.native
  
  var YearMonthPattern: String = js.native
}
object DateFormattingInfo {
  
  @scala.inline
  def apply(
    AbbreviatedDayNames: js.Array[String],
    AbbreviatedMonthGenitiveNames: js.Array[String],
    AbbreviatedMonthNames: js.Array[String],
    AmDesignator: String,
    Calendar: Calendar,
    CalendarWeekRule: Double,
    DateSeparator: String,
    DayNames: js.Array[String],
    FirstDayOfWeek: Double,
    FullDateTimePattern: String,
    LongDatePattern: String,
    LongTimePattern: String,
    MonthDayPattern: String,
    MonthGenitiveNames: js.Array[String],
    MonthNames: js.Array[String],
    PmDesignator: String,
    ShortDatePattern: String,
    ShortTimePattern: String,
    ShortestDayNames: js.Array[String],
    SortableDateTimePattern: String,
    TimeSeparator: String,
    UniversalSortableDateTimePattern: String,
    YearMonthPattern: String
  ): DateFormattingInfo = {
    val __obj = js.Dynamic.literal(AbbreviatedDayNames = AbbreviatedDayNames.asInstanceOf[js.Any], AbbreviatedMonthGenitiveNames = AbbreviatedMonthGenitiveNames.asInstanceOf[js.Any], AbbreviatedMonthNames = AbbreviatedMonthNames.asInstanceOf[js.Any], AmDesignator = AmDesignator.asInstanceOf[js.Any], Calendar = Calendar.asInstanceOf[js.Any], CalendarWeekRule = CalendarWeekRule.asInstanceOf[js.Any], DateSeparator = DateSeparator.asInstanceOf[js.Any], DayNames = DayNames.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], FullDateTimePattern = FullDateTimePattern.asInstanceOf[js.Any], LongDatePattern = LongDatePattern.asInstanceOf[js.Any], LongTimePattern = LongTimePattern.asInstanceOf[js.Any], MonthDayPattern = MonthDayPattern.asInstanceOf[js.Any], MonthGenitiveNames = MonthGenitiveNames.asInstanceOf[js.Any], MonthNames = MonthNames.asInstanceOf[js.Any], PmDesignator = PmDesignator.asInstanceOf[js.Any], ShortDatePattern = ShortDatePattern.asInstanceOf[js.Any], ShortTimePattern = ShortTimePattern.asInstanceOf[js.Any], ShortestDayNames = ShortestDayNames.asInstanceOf[js.Any], SortableDateTimePattern = SortableDateTimePattern.asInstanceOf[js.Any], TimeSeparator = TimeSeparator.asInstanceOf[js.Any], UniversalSortableDateTimePattern = UniversalSortableDateTimePattern.asInstanceOf[js.Any], YearMonthPattern = YearMonthPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormattingInfo]
  }
  
  @scala.inline
  implicit class DateFormattingInfoMutableBuilder[Self <: DateFormattingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbbreviatedDayNames(value: js.Array[String]): Self = StObject.set(x, "AbbreviatedDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbreviatedDayNamesVarargs(value: String*): Self = StObject.set(x, "AbbreviatedDayNames", js.Array(value :_*))
    
    @scala.inline
    def setAbbreviatedMonthGenitiveNames(value: js.Array[String]): Self = StObject.set(x, "AbbreviatedMonthGenitiveNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbreviatedMonthGenitiveNamesVarargs(value: String*): Self = StObject.set(x, "AbbreviatedMonthGenitiveNames", js.Array(value :_*))
    
    @scala.inline
    def setAbbreviatedMonthNames(value: js.Array[String]): Self = StObject.set(x, "AbbreviatedMonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbreviatedMonthNamesVarargs(value: String*): Self = StObject.set(x, "AbbreviatedMonthNames", js.Array(value :_*))
    
    @scala.inline
    def setAmDesignator(value: String): Self = StObject.set(x, "AmDesignator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendar(value: Calendar): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarWeekRule(value: Double): Self = StObject.set(x, "CalendarWeekRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateSeparator(value: String): Self = StObject.set(x, "DateSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = StObject.set(x, "DayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = StObject.set(x, "DayNames", js.Array(value :_*))
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "FirstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDateTimePattern(value: String): Self = StObject.set(x, "FullDateTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDatePattern(value: String): Self = StObject.set(x, "LongDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongTimePattern(value: String): Self = StObject.set(x, "LongTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthDayPattern(value: String): Self = StObject.set(x, "MonthDayPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthGenitiveNames(value: js.Array[String]): Self = StObject.set(x, "MonthGenitiveNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthGenitiveNamesVarargs(value: String*): Self = StObject.set(x, "MonthGenitiveNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "MonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "MonthNames", js.Array(value :_*))
    
    @scala.inline
    def setPmDesignator(value: String): Self = StObject.set(x, "PmDesignator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDatePattern(value: String): Self = StObject.set(x, "ShortDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortTimePattern(value: String): Self = StObject.set(x, "ShortTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortestDayNames(value: js.Array[String]): Self = StObject.set(x, "ShortestDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortestDayNamesVarargs(value: String*): Self = StObject.set(x, "ShortestDayNames", js.Array(value :_*))
    
    @scala.inline
    def setSortableDateTimePattern(value: String): Self = StObject.set(x, "SortableDateTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeparator(value: String): Self = StObject.set(x, "TimeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniversalSortableDateTimePattern(value: String): Self = StObject.set(x, "UniversalSortableDateTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearMonthPattern(value: String): Self = StObject.set(x, "YearMonthPattern", value.asInstanceOf[js.Any])
  }
}
