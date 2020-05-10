package typingsSlinky.senchaTouch.Ext.chart.axis.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiscrete extends ILayout {
  /** [Method] Processes the data of the series bound to the axis  */
  @JSName("processData")
  var processData_IDiscrete: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
  		* @param context Object
  		* @param min Object
  		* @param max Object
  		* @param estStepSize Object
  		*/
  @JSName("snapEnds")
  var snapEnds_IDiscrete: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Trims the layout of the axis by the defined minimum and maximum
  		* @param context Object
  		* @param out Object
  		* @param trimMin Object
  		* @param trimMax Object
  		*/
  @JSName("trimByRange")
  var trimByRange_IDiscrete: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* trimMin */ js.UndefOr[js.Any], 
      /* trimMax */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IDiscrete {
  @scala.inline
  def apply(): IDiscrete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiscrete]
  }
  @scala.inline
  implicit class IDiscreteOps[Self <: IDiscrete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutProcessData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processData")(js.undefined)
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
    @scala.inline
    def withTrimByRange(
      value: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[js.Any], /* trimMax */ js.UndefOr[js.Any]) => Unit
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

