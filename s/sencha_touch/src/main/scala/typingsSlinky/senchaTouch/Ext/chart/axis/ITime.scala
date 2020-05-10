package typingsSlinky.senchaTouch.Ext.chart.axis

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITime extends INumeric {
  /** [Config Option] (Boolean) */
  var calculateByLabelSize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of calculateByLabelSize
  		* @returns Boolean
  		*/
  var getCalculateByLabelSize: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Mapping data value into coordinate
  		* @param value Object
  		* @returns Number
  		*/
  @JSName("getCoordFor")
  var getCoordFor_ITime: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Returns the value of dateFormat
  		* @returns String/Boolean
  		*/
  var getDateFormat: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of fromDate
  		* @returns Date
  		*/
  var getFromDate: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of step
  		* @returns Array
  		*/
  var getStep: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of toDate
  		* @returns Date
  		*/
  var getToDate: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of calculateByLabelSize
  		* @param calculateByLabelSize Boolean The new value.
  		*/
  var setCalculateByLabelSize: js.UndefOr[js.Function1[/* calculateByLabelSize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of dateFormat
  		* @param dateFormat String/Boolean The new value.
  		*/
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of fromDate
  		* @param fromDate Date The new value.
  		*/
  var setFromDate: js.UndefOr[js.Function1[/* fromDate */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of step
  		* @param step Array The new value.
  		*/
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of toDate
  		* @param toDate Date The new value.
  		*/
  var setToDate: js.UndefOr[js.Function1[/* toDate */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Array) */
  var step: js.UndefOr[Array] = js.native
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[js.Any] = js.native
}

object ITime {
  @scala.inline
  def apply(): ITime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITime]
  }
  @scala.inline
  implicit class ITimeOps[Self <: ITime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateByLabelSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateByLabelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculateByLabelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateByLabelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFromDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCalculateByLabelSize(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCalculateByLabelSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCalculateByLabelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCalculateByLabelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCoordFor(value: /* value */ js.UndefOr[js.Any] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoordFor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCoordFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoordFor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDateFormat(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFromDate(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFromDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFromDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFromDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStep(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStep")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStep")(js.undefined)
        ret
    }
    @scala.inline
    def withGetToDate(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCalculateByLabelSize(value: /* calculateByLabelSize */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCalculateByLabelSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCalculateByLabelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCalculateByLabelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDateFormat(value: /* dateFormat */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFromDate(value: /* fromDate */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFromDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFromDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFromDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStep(value: /* step */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStep")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStep")(js.undefined)
        ret
    }
    @scala.inline
    def withSetToDate(value: /* toDate */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withToDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(js.undefined)
        ret
    }
  }
  
}

