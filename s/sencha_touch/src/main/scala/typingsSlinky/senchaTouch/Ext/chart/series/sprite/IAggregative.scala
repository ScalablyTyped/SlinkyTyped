package typingsSlinky.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAggregative extends ICartesian {
  /** [Config Option] (Object) */
  var dataClose: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var dataHigh: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var dataLow: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var dataOpen: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of aggregator
  		* @returns Object
  		*/
  var getAggregator: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Render the given visible clip range
  		* @param surface Object
  		* @param ctx Object
  		* @param clip Object
  		* @param region Object
  		*/
  @JSName("renderClipped")
  var renderClipped_IAggregative: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of aggregator
  		* @param aggregator Object The new value.
  		*/
  var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAggregative {
  @scala.inline
  def apply(): IAggregative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAggregative]
  }
  @scala.inline
  implicit class IAggregativeOps[Self <: IAggregative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataClose(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataClose")(js.undefined)
        ret
    }
    @scala.inline
    def withDataHigh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataHigh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataHigh")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLow")(js.undefined)
        ret
    }
    @scala.inline
    def withDataOpen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOpen")(js.undefined)
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
    def withRenderClipped(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderClipped")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRenderClipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderClipped")(js.undefined)
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
  }
  
}

