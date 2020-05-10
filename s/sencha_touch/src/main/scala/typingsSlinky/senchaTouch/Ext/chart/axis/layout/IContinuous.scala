package typingsSlinky.senchaTouch.Ext.chart.axis.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContinuous extends ILayout {
  /** [Method] Returns the value of adjustMaximumByMajorUnit
  		* @returns Boolean
  		*/
  var getAdjustMaximumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of adjustMinimumByMajorUnit
  		* @returns Boolean
  		*/
  var getAdjustMinimumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of adjustMaximumByMajorUnit
  		* @param adjustMaximumByMajorUnit Boolean The new value.
  		*/
  var setAdjustMaximumByMajorUnit: js.UndefOr[js.Function1[/* adjustMaximumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of adjustMinimumByMajorUnit
  		* @param adjustMinimumByMajorUnit Boolean The new value.
  		*/
  var setAdjustMinimumByMajorUnit: js.UndefOr[js.Function1[/* adjustMinimumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
  		* @param context Object
  		* @param min Object
  		* @param max Object
  		* @param estStepSize Object
  		*/
  @JSName("snapEnds")
  var snapEnds_IContinuous: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IContinuous {
  @scala.inline
  def apply(): IContinuous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContinuous]
  }
  @scala.inline
  implicit class IContinuousOps[Self <: IContinuous] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAdjustMaximumByMajorUnit(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdjustMaximumByMajorUnit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAdjustMaximumByMajorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdjustMaximumByMajorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAdjustMinimumByMajorUnit(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdjustMinimumByMajorUnit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAdjustMinimumByMajorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdjustMinimumByMajorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAdjustMaximumByMajorUnit(value: /* adjustMaximumByMajorUnit */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAdjustMaximumByMajorUnit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAdjustMaximumByMajorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAdjustMaximumByMajorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAdjustMinimumByMajorUnit(value: /* adjustMinimumByMajorUnit */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAdjustMinimumByMajorUnit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAdjustMinimumByMajorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAdjustMinimumByMajorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapEnds(
      value: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => Unit
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
  }
  
}

