package typingsSlinky.senchaTouch.Ext.chart.axis.layout

import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.chart.axis.IAxis
import typingsSlinky.senchaTouch.Ext.chart.series.ISeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayout extends IBase {
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[IAxis] = js.native
  /** [Method] Calculates the position of tick marks for the axis
  		* @param context Object
  		* @returns *
  		*/
  var calculateLayout: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Calculates the position of major ticks for the axis
  		* @param context Object
  		*/
  var calculateMajorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Calculates the position of sub ticks for the axis
  		* @param context Object
  		*/
  var calculateMinorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of axis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getAxis: js.UndefOr[js.Function0[IAxis]] = js.native
  /** [Method] Processes the data of the series bound to the axis
  		* @param series Ext.chart.series.Series The bound series.
  		*/
  var processData: js.UndefOr[js.Function1[/* series */ js.UndefOr[ISeries], Unit]] = js.native
  /** [Method] Sets the value of axis
  		* @param axis Ext.chart.axis.Axis The new value.
  		*/
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.native
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
  		* @param context Object
  		* @param min Number
  		* @param max Number
  		* @param estStepSize Number
  		*/
  var snapEnds: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* estStepSize */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Trims the layout of the axis by the defined minimum and maximum
  		* @param context Object
  		* @param out Object
  		* @param trimMin Number
  		* @param trimMax Number
  		*/
  var trimByRange: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* trimMin */ js.UndefOr[Double], 
      /* trimMax */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}

object ILayout {
  @scala.inline
  def apply(): ILayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayout]
  }
  @scala.inline
  implicit class ILayoutOps[Self <: ILayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCalculateLayout(value: /* context */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculateLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateMajorTicks(value: /* context */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateMajorTicks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculateMajorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateMajorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateMinorTicks(value: /* context */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateMinorTicks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculateMinorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateMinorTicks")(js.undefined)
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
    def withProcessData(value: /* series */ js.UndefOr[ISeries] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processData")(js.undefined)
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
    @scala.inline
    def withSnapEnds(
      value: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* estStepSize */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapEnds")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSnapEnds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapEnds")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimByRange(
      value: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[Double], /* trimMax */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimByRange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutTrimByRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimByRange")(js.undefined)
        ret
    }
  }
  
}

