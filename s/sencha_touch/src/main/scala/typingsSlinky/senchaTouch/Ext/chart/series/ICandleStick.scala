package typingsSlinky.senchaTouch.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICandleStick extends ICartesian {
  /** [Config Option] (String) */
  var closeField: js.UndefOr[String] = js.native
  /** [Method] Returns the value of closeField
  		* @returns String
  		*/
  var getCloseField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of highField
  		* @returns String
  		*/
  var getHighField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of lowField
  		* @returns String
  		*/
  var getLowField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of openField
  		* @returns String
  		*/
  var getOpenField: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var highField: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var lowField: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var openField: js.UndefOr[String] = js.native
  /** [Method] Sets the value of closeField
  		* @param closeField String The new value.
  		*/
  var setCloseField: js.UndefOr[js.Function1[/* closeField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of highField
  		* @param highField String The new value.
  		*/
  var setHighField: js.UndefOr[js.Function1[/* highField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of lowField
  		* @param lowField String The new value.
  		*/
  var setLowField: js.UndefOr[js.Function1[/* lowField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of openField
  		* @param openField String The new value.
  		*/
  var setOpenField: js.UndefOr[js.Function1[/* openField */ js.UndefOr[String], Unit]] = js.native
}

object ICandleStick {
  @scala.inline
  def apply(): ICandleStick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleStick]
  }
  @scala.inline
  implicit class ICandleStickOps[Self <: ICandleStick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCloseField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCloseField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCloseField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCloseField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHighField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHighField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLowField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLowField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLowField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLowField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOpenField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOpenField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenField")(js.undefined)
        ret
    }
    @scala.inline
    def withHighField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highField")(js.undefined)
        ret
    }
    @scala.inline
    def withLowField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowField")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCloseField(value: /* closeField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCloseField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCloseField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCloseField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHighField(value: /* highField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHighField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLowField(value: /* lowField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLowField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLowField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLowField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOpenField(value: /* openField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpenField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOpenField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpenField")(js.undefined)
        ret
    }
  }
  
}

