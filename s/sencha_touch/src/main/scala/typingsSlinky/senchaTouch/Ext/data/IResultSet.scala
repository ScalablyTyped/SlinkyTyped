package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResultSet extends IBase {
  /** [Config Option] (Number) */
  var count: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of count
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of loaded
  		* @returns Boolean
  		*/
  var getLoaded: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of message
  		* @returns String
  		*/
  var getMessage: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of records
  		* @returns Ext.data.Model[]
  		*/
  var getRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of success
  		* @returns Boolean
  		*/
  var getSuccess: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of total
  		* @returns Number
  		*/
  var getTotal: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var message: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[Array] = js.native
  /** [Method] Sets the value of count
  		* @param count Number The new value.
  		*/
  var setCount: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of loaded
  		* @param loaded Boolean The new value.
  		*/
  var setLoaded: js.UndefOr[js.Function1[/* loaded */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of records
  		* @param records Ext.data.Model[] The new value.
  		*/
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of success
  		* @param success Boolean The new value.
  		*/
  var setSuccess: js.UndefOr[js.Function1[/* success */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of total
  		* @param total Number The new value.
  		*/
  var setTotal: js.UndefOr[js.Function1[/* total */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var total: js.UndefOr[Double] = js.native
}

object IResultSet {
  @scala.inline
  def apply(): IResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResultSet]
  }
  @scala.inline
  implicit class IResultSetOps[Self <: IResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLoaded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSuccess(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTotal(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withRecords(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCount(value: /* count */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLoaded(value: /* loaded */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMessage(value: /* message */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRecords(value: /* records */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSuccess(value: /* success */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTotal(value: /* total */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

