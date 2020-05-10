package typingsSlinky.senchaTouch.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILine extends ICartesian {
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of aggregator
  		* @returns Object
  		*/
  var getAggregator: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of fill
  		* @returns Boolean
  		*/
  var getFill: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of selectionTolerance
  		* @returns Number
  		*/
  var getSelectionTolerance: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of smooth
  		* @returns Boolean/Number
  		*/
  var getSmooth: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of step
  		* @returns Boolean
  		*/
  var getStep: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var selectionTolerance: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of aggregator
  		* @param aggregator Object The new value.
  		*/
  var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of fill
  		* @param fill Boolean The new value.
  		*/
  var setFill: js.UndefOr[js.Function1[/* fill */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of selectionTolerance
  		* @param selectionTolerance Number The new value.
  		*/
  var setSelectionTolerance: js.UndefOr[js.Function1[/* selectionTolerance */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of smooth
  		* @param smooth Boolean/Number The new value.
  		*/
  var setSmooth: js.UndefOr[js.Function1[/* smooth */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of step
  		* @param step Boolean The new value.
  		*/
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean/Number) */
  var smooth: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var step: js.UndefOr[Boolean] = js.native
}

object ILine {
  @scala.inline
  def apply(): ILine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILine]
  }
  @scala.inline
  implicit class ILineOps[Self <: ILine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAggregator(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAggregator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAggregator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAggregator")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFill(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFill")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectionTolerance(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionTolerance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectionTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSmooth(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSmooth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSmooth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStep(value: () => Boolean): Self = {
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
    def withSelectionTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAggregator(value: /* aggregator */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAggregator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAggregator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAggregator")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFill(value: /* fill */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFill")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSelectionTolerance(value: /* selectionTolerance */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectionTolerance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSelectionTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectionTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSmooth(value: /* smooth */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSmooth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSmooth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStep(value: /* step */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withSmooth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Boolean): Self = {
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
  }
  
}

