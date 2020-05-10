package typingsSlinky.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanZoom extends IAbstract {
  /** [Config Option] (Object/Array) */
  var axes: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of axes
  		* @returns Object/Array
  		*/
  var getAxes: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of hideLabelInGesture
  		* @returns Boolean
  		*/
  var getHideLabelInGesture: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of maxZoom
  		* @returns Object
  		*/
  var getMaxZoom: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of minZoom
  		* @returns Object
  		*/
  var getMinZoom: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of modeToggleButton
  		* @returns Object
  		*/
  var getModeToggleButton: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of panGesture
  		* @returns String
  		*/
  var getPanGesture: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of showOverflowArrows
  		* @returns Boolean
  		*/
  var getShowOverflowArrows: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of zoomOnPanGesture
  		* @returns Boolean
  		*/
  var getZoomOnPanGesture: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Placeholder method
  		* @param e Object
  		*/
  @JSName("onGesture")
  var onGesture_IPanZoom: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var overflowArrowOptions: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of axes
  		* @param axes Object/Array The new value.
  		*/
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of hideLabelInGesture
  		* @param hideLabelInGesture Boolean The new value.
  		*/
  var setHideLabelInGesture: js.UndefOr[js.Function1[/* hideLabelInGesture */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of maxZoom
  		* @param maxZoom Object The new value.
  		*/
  var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of minZoom
  		* @param minZoom Object The new value.
  		*/
  var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of modeToggleButton
  		* @param modeToggleButton Object The new value.
  		*/
  var setModeToggleButton: js.UndefOr[js.Function1[/* modeToggleButton */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of panGesture
  		* @param panGesture String The new value.
  		*/
  var setPanGesture: js.UndefOr[js.Function1[/* panGesture */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of showOverflowArrows
  		* @param showOverflowArrows Boolean The new value.
  		*/
  var setShowOverflowArrows: js.UndefOr[js.Function1[/* showOverflowArrows */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of zoomOnPanGesture
  		* @param zoomOnPanGesture Boolean The new value.
  		*/
  var setZoomOnPanGesture: js.UndefOr[js.Function1[/* zoomOnPanGesture */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var showOverflowArrows: js.UndefOr[Boolean] = js.native
}

object IPanZoom {
  @scala.inline
  def apply(): IPanZoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanZoom]
  }
  @scala.inline
  implicit class IPanZoomOps[Self <: IPanZoom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAxes(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHideLabelInGesture(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHideLabelInGesture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHideLabelInGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHideLabelInGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxZoom(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinZoom(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModeToggleButton(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModeToggleButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModeToggleButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModeToggleButton")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPanGesture(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanGesture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPanGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withGetShowOverflowArrows(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShowOverflowArrows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetShowOverflowArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShowOverflowArrows")(js.undefined)
        ret
    }
    @scala.inline
    def withGetZoomOnPanGesture(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZoomOnPanGesture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetZoomOnPanGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZoomOnPanGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowArrowOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowArrowOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowArrowOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowArrowOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHideLabelInGesture(value: /* hideLabelInGesture */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHideLabelInGesture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHideLabelInGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHideLabelInGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxZoom(value: /* maxZoom */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinZoom(value: /* minZoom */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModeToggleButton(value: /* modeToggleButton */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModeToggleButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetModeToggleButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModeToggleButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPanGesture(value: /* panGesture */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPanGesture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPanGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPanGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withSetShowOverflowArrows(value: /* showOverflowArrows */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShowOverflowArrows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetShowOverflowArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShowOverflowArrows")(js.undefined)
        ret
    }
    @scala.inline
    def withSetZoomOnPanGesture(value: /* zoomOnPanGesture */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZoomOnPanGesture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetZoomOnPanGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZoomOnPanGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOverflowArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverflowArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOverflowArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverflowArrows")(js.undefined)
        ret
    }
  }
  
}

