package typingsSlinky.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideTime extends js.Object {
  
  /**
    * Gets the time in the specified format.
    *
    * @param format The time format.
    * @returns The time in the specified format.
    * @example
    *
    * var gt = new GlideTime();
    * gt.setValue('12:00:00');
    * gs.info(gt.getByFormat("HH:mm"));
    */
  def getByFormat(format: String): String = js.native
  
  /**
    * Gets the time in the current user's display format and time zone.
    *
    * @returns The time in the user's format and time zone.
    * @example
    *
    * var gt = new GlideTime();
    * gt.setDisplayValue("12:00:00"); // User Time Zone
    * gs.info(gt.getDisplayValue()); // User Time Zone
    */
  def getDisplayValue(): String = js.native
  
  /**
    * Gets the display value in the current user's time zone and the internal format
    * (HH:mm:ss).
    *
    * @returns The time value for the GlideTime object in the current user's time zone and the
    * internal time format of HH:mm:ss.
    * @example
    *
    * var gt = new GlideTime();
    * gt.setValue("01:00:00"); //Internal Time Zone , UTC
    * gs.info(gt.getDisplayValueInternal()); //User Time Zone
    */
  def getDisplayValueInternal(): String = js.native
  
  /**
    * Returns the hours part of the time using the local time zone.
    *
    * @returns The hours using the local time zone.
    */
  def getHourLocalTime(): Double = js.native
  
  /**
    * Returns the hours part of the time using the local time zone. The number of hours is
    * based on a 24 hour clock.
    *
    * @returns The hours using the local time zone. The number of hours is based on a 24 hour
    * clock.
    */
  def getHourOfDayLocalTime(): Double = js.native
  
  /**
    * Returns the hours part of the time using the UTC time zone. The number of hours is
    * based on a 24 hour clock.
    *
    * @returns The hours using the UTC time zone. The number of hours is based on a 24 hour
    * clock.
    */
  def getHourOfDayUTC(): Double = js.native
  
  /**
    * Returns the hours part of the time using the UTC time zone. The number of hours is
    * based on a 12 hour clock. Noon and midnight are represented by 0, not 12.
    *
    * @returns The hours using the UTC time zone. The number of hours is based on a 12 hour
    * clock. Noon and midnight are represented by 0, not 12.
    */
  def getHourUTC(): Double = js.native
  
  /**
    * Returns the number of minutes using the local time zone.
    *
    * @returns The number of minutes using the local time zone.
    */
  def getMinutesLocalTime(): Double = js.native
  
  /**
    * Returns the number of minutes in the hour based on the UTC time zone.
    *
    * @returns The number of minutes in the hour using the UTC time zone.
    */
  def getMinutesUTC(): Double = js.native
  
  /**
    * Returns the number of seconds in the current minute.
    *
    * @returns The number of seconds in the minute.
    */
  def getSeconds(): Double = js.native
  
  /**
    * Gets the time value stored in the database by the GlideTime object in the internal
    * format, HH:mm:ss, and the system time zone.
    *
    * @returns The time value in the internal fomat and system time zone.
    * @example
    *
    * var gt = new GlideTime();
    * gs.info(gt.getValue()); // Internal Time Zone, UTC
    */
  def getValue(): String = js.native
  
  /**
    * Sets a time value using the current user's display format and time zone.
    *
    * @param asDisplayed The time in the current user's display format and time zone. The parameter
    * must be formatted using the current user's preferred display format, such as HH:mm:ss.
    * @returns Method does not return a value
    * @example
    *
    * var gt = new GlideTime();
    * gt.setDisplayValue('01:00:00');   // User Time Zone
    * gs.info(gt.getDisplayValueInternal()); // User Time Zone
    */
  def setDisplayValue(asDisplayed: String): Unit = js.native
  
  /**
    * Sets the time of the GlideTime object in the internal time zone.
    *
    * @param o The time in hh:mm:ss format.
    * @returns Method does not return a value
    * @example
    *
    * var gt = new GlideTime();
    * gt.setValue('01:00:00');  //Internal Time Zone, UTC
    * gs.info("time is "+ gt.getByFormat('hh:mm:ss'));
    */
  def setValue(o: String): Unit = js.native
  
  /**
    * Gets the duration difference between two GlideTime object values.
    *
    * @param startTime The start value.
    * @param endTime The end value.
    * @returns The duration between the two values.
    * @example
    *
    * var gd1 = new GlideTime();
    * gd1.setDisplayValue("09:00:00");
    * var gd2 = new GlideTime();
    * gd2.setDisplayValue("09:10:00");
    * var dur = GlideDate.subtract(gd1, gd2); //the difference between gdt1 and gdt2
    * gs.info(dur.getDisplayValue());
    */
  def subtract(start: GlideTime, end: GlideTime): GlideDuration = js.native
}
object GlideTime {
  
  @scala.inline
  def apply(
    getByFormat: String => String,
    getDisplayValue: () => String,
    getDisplayValueInternal: () => String,
    getHourLocalTime: () => Double,
    getHourOfDayLocalTime: () => Double,
    getHourOfDayUTC: () => Double,
    getHourUTC: () => Double,
    getMinutesLocalTime: () => Double,
    getMinutesUTC: () => Double,
    getSeconds: () => Double,
    getValue: () => String,
    setDisplayValue: String => Unit,
    setValue: String => Unit,
    subtract: (GlideTime, GlideTime) => GlideDuration
  ): GlideTime = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDisplayValueInternal = js.Any.fromFunction0(getDisplayValueInternal), getHourLocalTime = js.Any.fromFunction0(getHourLocalTime), getHourOfDayLocalTime = js.Any.fromFunction0(getHourOfDayLocalTime), getHourOfDayUTC = js.Any.fromFunction0(getHourOfDayUTC), getHourUTC = js.Any.fromFunction0(getHourUTC), getMinutesLocalTime = js.Any.fromFunction0(getMinutesLocalTime), getMinutesUTC = js.Any.fromFunction0(getMinutesUTC), getSeconds = js.Any.fromFunction0(getSeconds), getValue = js.Any.fromFunction0(getValue), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue), subtract = js.Any.fromFunction2(subtract))
    __obj.asInstanceOf[GlideTime]
  }
  
  @scala.inline
  implicit class GlideTimeOps[Self <: GlideTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetByFormat(value: String => String): Self = this.set("getByFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDisplayValue(value: () => String): Self = this.set("getDisplayValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayValueInternal(value: () => String): Self = this.set("getDisplayValueInternal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHourLocalTime(value: () => Double): Self = this.set("getHourLocalTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHourOfDayLocalTime(value: () => Double): Self = this.set("getHourOfDayLocalTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHourOfDayUTC(value: () => Double): Self = this.set("getHourOfDayUTC", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHourUTC(value: () => Double): Self = this.set("getHourUTC", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinutesLocalTime(value: () => Double): Self = this.set("getMinutesLocalTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinutesUTC(value: () => Double): Self = this.set("getMinutesUTC", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSeconds(value: () => Double): Self = this.set("getSeconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => String): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDisplayValue(value: String => Unit): Self = this.set("setDisplayValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: String => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtract(value: (GlideTime, GlideTime) => GlideDuration): Self = this.set("subtract", js.Any.fromFunction2(value))
  }
}
