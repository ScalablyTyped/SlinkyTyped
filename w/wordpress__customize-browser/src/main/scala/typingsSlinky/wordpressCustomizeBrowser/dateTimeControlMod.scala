package typingsSlinky.wordpressCustomizeBrowser

import typingsSlinky.wordpressCustomizeBrowser.controlMod.Control
import typingsSlinky.wordpressCustomizeBrowser.wordpressCustomizeBrowserStrings.am
import typingsSlinky.wordpressCustomizeBrowser.wordpressCustomizeBrowserStrings.pm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeControlMod {
  
  @JSImport("@wordpress/customize-browser/DateTimeControl", "DateTimeControl")
  @js.native
  class DateTimeControl protected () extends Control {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    @JSName("convertHourToTwentyFourHourFormat")
    def convertHourToTwentyFourHourFormat_am(hourInTwelveHourFormat: String, meridian: am): String = js.native
    @JSName("convertHourToTwentyFourHourFormat")
    def convertHourToTwentyFourHourFormat_pm(hourInTwelveHourFormat: String, meridian: pm): String = js.native
    
    def convertInputDateToString(): String = js.native
    
    def isFutureDate(): Boolean = js.native
    
    def parseDateTime(datetime: String): DateTime | Null = js.native
    
    def populateDateInputs(): Boolean = js.native
    
    def populateSetting(): Boolean = js.native
    
    def toggleFutureDateNotification(notify: Boolean): DateTimeControl = js.native
    
    def updateDaysForMonth(): Unit = js.native
    
    def validateInputs(): Boolean = js.native
  }
  
  @js.native
  trait DateTime extends StObject {
    
    var day: String = js.native
    
    var hour: String = js.native
    
    var minute: String = js.native
    
    var month: String = js.native
    
    var second: String = js.native
    
    var year: String = js.native
  }
  object DateTime {
    
    @scala.inline
    def apply(day: String, hour: String, minute: String, month: String, second: String, year: String): DateTime = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTime]
    }
    
    @scala.inline
    implicit class DateTimeMutableBuilder[Self <: DateTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
