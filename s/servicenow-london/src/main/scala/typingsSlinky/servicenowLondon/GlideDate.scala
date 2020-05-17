package typingsSlinky.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideDate extends js.Object {
  /**
    * Gets the date in the specified date format.
    *
    * @param format the desired date format
    * @returns the date in the specified format
    * @example
    *
    * var gd = new GlideDate();
    * gd.setValue('2015-01-01');
    * gs.info(gd.getByFormat('dd-MM-yyyy'));
    * // 01-01-2015
    */
  def getByFormat(format: String): String = js.native
  /**
    * Gets the day of the month stored by the GlideDate object, expressed in the UTC time
    * zone.
    *
    * @returns The day of the month in the UTC time zone, from 1 to 31.
    * @example
    *
    * // Today's date is 2016-05-13
    * var gd = new GlideDate('2016-05-13');
    * gs.info(gd.getDayOfMonthNoTZ());
    * // 13
    */
  def getDayOfMonthNoTZ(): Double = js.native
  /**
    * Gets the date in the current user's display format and time zone.
    *
    * @returns The date in the user's format and time zone. Keep in mind when designing
    * business rules or script includes that this method may return values in different
    * formats for different users.
    * @example
    *
    * var gd = new GlideDate();
    * gd.setValue('2015-01-01');
    * gs.info(gd.getDisplayValue());
    * // 2015-01-01
    */
  def getDisplayValue(): String = js.native
  /**
    * Gets the display value in the internal format (yyyy-MM-dd).
    *
    * @returns The date values for the GlideDate object in the current user's time zone and
    * the internal time format of yyyy-MM-dd.
    * @example
    *
    * var gd = new GlideDate();
    * gs.info(gd.getDisplayValueInternal());
    * // 2014-10-22
    */
  def getDisplayValueInternal(): String = js.native
  /**
    * Gets the month stored by the GlideDate object, expressed in the UTC time zone.
    * @returns The numerical value of the month from 1 to 12.
    *
    * @example
    *
    * // Today's date is 2016-05-13
    * var gd = new GlideDate();
    * gs.info(gd.getMonthNoTZ());
    * // 5
    */
  def getMonthNoTZ(): Double = js.native
  /**
    * Gets the date value stored in the database by the GlideDate object in the internal
    * format, yyyy-MM-dd, and the system time zone, UTC by default.
    *
    * @returns The date value in the internal format and system time zone.
    * @example
    *
    * var gd = new GlideDate();
    * gd.setValue('2015-01-01');
    * gs.info(gd.getValue());
    * // 2015-01-01
    */
  def getValue(): String = js.native
  /**
    * Gets the year stored by the GlideDate object, expressed in the UTC time zone.
    *
    * @returns The numerical value of the year.
    * @example
    *
    * // Today's date is 2016-05-13
    * var gd = new GlideDate();
    * gs.info(gd.getYearNoTZ());
    * // 5
    */
  def getYearNoTZ(): Double = js.native
  /**
    * Sets a date value using the current user's display format and time zone.
    *
    * @param asDisplayed The date in the current user's display format and time zone. The parameter must
    * be formatted using the current user's preferred display format, such as yyyy-MM-dd.
    * @returns Method does not return a value
    * @example
    *
    * var gd = new GlideDate();
    * gd.setDisplayValue('2011-01-01');
    * gs.info(gd.getValue());
    * // 2011-01-01
    */
  def setDisplayValue(asDisplayed: String): Unit = js.native
  /**
    * Sets the date of the GlideDate object.
    *
    * @param o The date and time to use.
    * @returns Method does not return a value
    * @example
    *
    * var gd = new GlideDate();
    * gd.setValue('2015-01-01');
    * gs.info(gd.getValue());
    * // 2015-01-01
    */
  def setValue(o: String): Unit = js.native
}

object GlideDate {
  @scala.inline
  def apply(
    getByFormat: String => String,
    getDayOfMonthNoTZ: () => Double,
    getDisplayValue: () => String,
    getDisplayValueInternal: () => String,
    getMonthNoTZ: () => Double,
    getValue: () => String,
    getYearNoTZ: () => Double,
    setDisplayValue: String => Unit,
    setValue: String => Unit
  ): GlideDate = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDayOfMonthNoTZ = js.Any.fromFunction0(getDayOfMonthNoTZ), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDisplayValueInternal = js.Any.fromFunction0(getDisplayValueInternal), getMonthNoTZ = js.Any.fromFunction0(getMonthNoTZ), getValue = js.Any.fromFunction0(getValue), getYearNoTZ = js.Any.fromFunction0(getYearNoTZ), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[GlideDate]
  }
  @scala.inline
  implicit class GlideDateOps[Self <: GlideDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetByFormat(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDayOfMonthNoTZ(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayOfMonthNoTZ")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDisplayValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDisplayValueInternal(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayValueInternal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMonthNoTZ(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonthNoTZ")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetYearNoTZ(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYearNoTZ")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDisplayValue(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

