package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePicker
  extends typingsSlinky.senchaTouch.Ext.picker.IPicker {
  /** [Config Option] (String) */
  var dayText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of dayText
  		* @returns String
  		*/
  var getDayText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of monthText
  		* @returns String
  		*/
  var getMonthText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of slotOrder
  		* @returns Array
  		*/
  var getSlotOrder: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of yearFrom
  		* @returns Number
  		*/
  var getYearFrom: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of yearText
  		* @returns String
  		*/
  var getYearText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of yearTo
  		* @returns Number
  		*/
  var getYearTo: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (String) */
  var monthText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of dayText
  		* @param dayText String The new value.
  		*/
  var setDayText: js.UndefOr[js.Function1[/* dayText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of monthText
  		* @param monthText String The new value.
  		*/
  var setMonthText: js.UndefOr[js.Function1[/* monthText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of slotOrder
  		* @param slotOrder Array The new value.
  		*/
  var setSlotOrder: js.UndefOr[js.Function1[/* slotOrder */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the values of the pickers slots
  		* @param value Object
  		* @param animated Object
  		* @returns Ext.Picker this This picker.
  		*/
  @JSName("setValue")
  var setValue_IDatePicker: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any], IPicker]
  ] = js.native
  /** [Method] Sets the value of yearFrom
  		* @param yearFrom Number The new value.
  		*/
  var setYearFrom: js.UndefOr[js.Function1[/* yearFrom */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of yearText
  		* @param yearText String The new value.
  		*/
  var setYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of yearTo
  		* @param yearTo Number The new value.
  		*/
  var setYearTo: js.UndefOr[js.Function1[/* yearTo */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Array) */
  var slotOrder: js.UndefOr[Array] = js.native
  /** [Method] Updates the dayText configuration
  		* @param newDayText Object
  		* @param oldDayText Object
  		*/
  var updateDayText: js.UndefOr[
    js.Function2[/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Updates the monthText configuration
  		* @param newMonthText Object
  		* @param oldMonthText Object
  		*/
  var updateMonthText: js.UndefOr[
    js.Function2[/* newMonthText */ js.UndefOr[js.Any], /* oldMonthText */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Updates the yearFrom configuration */
  var updateYearFrom: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the yearText configuration
  		* @param yearText Object
  		*/
  var updateYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Updates the yearTo configuration */
  var updateYearTo: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var yearFrom: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var yearText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number) */
  var yearTo: js.UndefOr[Double] = js.native
}

object IDatePicker {
  @scala.inline
  def apply(): IDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePicker]
  }
  @scala.inline
  implicit class IDatePickerOps[Self <: IDatePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDayText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMonthText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonthText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMonthText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonthText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSlotOrder(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlotOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSlotOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlotOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetYearFrom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYearFrom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetYearFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYearFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withGetYearText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYearText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetYearText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYearText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetYearTo(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYearTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetYearTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYearTo")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDayText(value: /* dayText */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDayText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDayText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMonthText(value: /* monthText */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonthText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMonthText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonthText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSlotOrder(value: /* slotOrder */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSlotOrder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSlotOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSlotOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: (/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any]) => IPicker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetYearFrom(value: /* yearFrom */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYearFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetYearFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYearFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetYearText(value: /* yearText */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYearText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetYearText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYearText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetYearTo(value: /* yearTo */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYearTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetYearTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYearTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotOrder(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDayText(value: (/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDayText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateDayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDayText")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMonthText(value: (/* newMonthText */ js.UndefOr[js.Any], /* oldMonthText */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMonthText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateMonthText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMonthText")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateYearFrom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateYearFrom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdateYearFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateYearFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateYearText(value: /* yearText */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateYearText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateYearText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateYearText")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateYearTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateYearTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdateYearTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateYearTo")(js.undefined)
        ret
    }
    @scala.inline
    def withYearFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withYearText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearText")(js.undefined)
        ret
    }
    @scala.inline
    def withYearTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearTo")(js.undefined)
        ret
    }
  }
  
}

