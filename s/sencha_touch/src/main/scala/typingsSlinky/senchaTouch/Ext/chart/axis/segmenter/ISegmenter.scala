package typingsSlinky.senchaTouch.Ext.chart.axis.segmenter

import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.chart.axis.IAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISegmenter extends IBase {
  /** [Method] Add step units to the value
  		* @param value * The value to be added.
  		* @param step Number The step of units. Negative value are allowed.
  		* @param unit * The unit.
  		*/
  var add: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[Double], 
      /* unit */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Align value with step of units
  		* @param value * The value to be aligned.
  		* @param step Number The step of units.
  		* @param unit * The unit.
  		* @returns * Aligned value.
  		*/
  var align: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[Double], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[IAxis] = js.native
  /** [Method] Returns the difference between the min and max value based on the given unit scale
  		* @param min * The smaller value.
  		* @param max * The larger value.
  		* @param unit * The unit scale. Unit can be any type.
  		* @returns Number The number of units between min and max. It is the minimum n that min + n * unit >= max.
  		*/
  var diff: js.UndefOr[
    js.Function3[
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      Double
    ]
  ] = js.native
  /** [Method] Convert from any data into the target type
  		* @param value * The value to convert from
  		* @returns * The converted value.
  		*/
  var from: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of axis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getAxis: js.UndefOr[js.Function0[IAxis]] = js.native
  /** [Method] Given a start point and estimated step size of a range determine the preferred step size
  		* @param start * The start point of range.
  		* @param estStepSize * The estimated step size.
  		* @returns Object Return the step size by an object of step x unit.
  		*/
  var preferredStep: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] This method formats the value
  		* @param value * The value to format.
  		* @param context Object Axis layout context.
  		* @returns String
  		*/
  var renderer: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any], String]
  ] = js.native
  /** [Method] Sets the value of axis
  		* @param axis Ext.chart.axis.Axis The new value.
  		*/
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.native
}

object ISegmenter {
  @scala.inline
  def apply(): ISegmenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISegmenter]
  }
  @scala.inline
  implicit class ISegmenterOps[Self <: ISegmenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(
      value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(
      value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withDiff(
      value: (/* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDiff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: /* value */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAxis(value: () => IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredStep(value: (/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredStep")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreferredStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredStep")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: (/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAxis(value: /* axis */ js.UndefOr[IAxis] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxis")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxis")(js.undefined)
        ret
    }
  }
  
}

