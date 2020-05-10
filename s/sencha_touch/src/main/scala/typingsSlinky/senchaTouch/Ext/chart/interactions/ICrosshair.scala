package typingsSlinky.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICrosshair extends IAbstract {
  /** [Config Option] (Object) */
  var axes: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of axes
  		* @returns Object
  		*/
  var getAxes: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of lines
  		* @returns Object
  		*/
  var getLines: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Object) */
  var lines: js.UndefOr[js.Any] = js.native
  /** [Method] Placeholder method
  		* @param e Object
  		*/
  @JSName("onGesture")
  var onGesture_ICrosshair: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of axes
  		* @param axes Object The new value.
  		*/
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of lines
  		* @param lines Object The new value.
  		*/
  var setLines: js.UndefOr[js.Function1[/* lines */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICrosshair {
  @scala.inline
  def apply(): ICrosshair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICrosshair]
  }
  @scala.inline
  implicit class ICrosshairOps[Self <: ICrosshair] (val x: Self) extends AnyVal {
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
    def withGetLines(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLines")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLines")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
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
    def withSetLines(value: /* lines */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLines")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLines")(js.undefined)
        ret
    }
  }
  
}

