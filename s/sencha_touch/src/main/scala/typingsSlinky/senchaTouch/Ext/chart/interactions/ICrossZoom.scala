package typingsSlinky.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICrossZoom extends IAbstract {
  /** [Config Option] (Object/Array) */
  var axes: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of axes
  		* @returns Object/Array
  		*/
  var getAxes: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of undoButton
  		* @returns Object
  		*/
  var getUndoButton: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Placeholder method
  		* @param e Object
  		*/
  @JSName("onGesture")
  var onGesture_ICrossZoom: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of axes
  		* @param axes Object/Array The new value.
  		*/
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of undoButton
  		* @param undoButton Object The new value.
  		*/
  var setUndoButton: js.UndefOr[js.Function1[/* undoButton */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICrossZoom {
  @scala.inline
  def apply(): ICrossZoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICrossZoom]
  }
  @scala.inline
  implicit class ICrossZoomOps[Self <: ICrossZoom] (val x: Self) extends AnyVal {
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
    def withGetUndoButton(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUndoButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUndoButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUndoButton")(js.undefined)
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
    def withSetUndoButton(value: /* undoButton */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUndoButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUndoButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUndoButton")(js.undefined)
        ret
    }
  }
  
}

