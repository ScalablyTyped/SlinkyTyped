package typingsSlinky.senchaTouch.Ext.chart

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.dataview.IDataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILegend extends IDataView {
  /** [Method] Returns the value of horizontalHeight
  		* @returns Number
  		*/
  var getHorizontalHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of inline
  		* @returns Boolean
  		*/
  @JSName("getInline")
  var getInline_ILegend: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of itemTpl
  		* @returns Array
  		*/
  @JSName("getItemTpl")
  var getItemTpl_ILegend: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of padding
  		* @returns Number
  		*/
  @JSName("getPadding")
  var getPadding_ILegend: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of toggleable
  		* @returns Boolean
  		*/
  var getToggleable: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of verticalWidth
  		* @returns Number
  		*/
  var getVerticalWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  /** [Method] Sets the value of horizontalHeight
  		* @param horizontalHeight Number The new value.
  		*/
  var setHorizontalHeight: js.UndefOr[js.Function1[/* horizontalHeight */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of inline
  		* @param inline Boolean The new value.
  		*/
  @JSName("setInline")
  var setInline_ILegend: js.UndefOr[js.Function1[/* inline */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl Array The new value.
  		*/
  @JSName("setItemTpl")
  var setItemTpl_ILegend: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of padding
  		* @param padding Number The new value.
  		*/
  @JSName("setPadding")
  var setPadding_ILegend: js.UndefOr[js.Function1[/* padding */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of toggleable
  		* @param toggleable Boolean The new value.
  		*/
  var setToggleable: js.UndefOr[js.Function1[/* toggleable */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of verticalWidth
  		* @param verticalWidth Number The new value.
  		*/
  var setVerticalWidth: js.UndefOr[js.Function1[/* verticalWidth */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var toggleable: js.UndefOr[Boolean] = js.native
}

object ILegend {
  @scala.inline
  def apply(): ILegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILegend]
  }
  @scala.inline
  implicit class ILegendOps[Self <: ILegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetHorizontalHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHorizontalHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHorizontalHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHorizontalHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInline(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInline")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemTpl(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemTpl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPadding(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPadding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetToggleable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToggleable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetToggleable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToggleable")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVerticalWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVerticalWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetVerticalWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVerticalWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHorizontalHeight(value: /* horizontalHeight */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHorizontalHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHorizontalHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHorizontalHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInline(value: /* inline */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInline")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemTpl(value: /* itemTpl */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemTpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPadding(value: /* padding */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSetToggleable(value: /* toggleable */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToggleable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetToggleable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToggleable")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVerticalWidth(value: /* verticalWidth */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVerticalWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetVerticalWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVerticalWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleable")(js.undefined)
        ret
    }
  }
  
}

