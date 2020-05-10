package typingsSlinky.senchaTouch.Ext.draw

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISegmentTree extends IBase {
  /** [Method] Returns the minimum range of data that fits the given range and step size
  		* @param min Number
  		* @param max Number
  		* @param estStep Number
  		* @returns Object The aggregation information.
  		*/
  var getAggregation: js.UndefOr[
    js.Function3[
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* estStep */ js.UndefOr[Double], 
      _
    ]
  ] = js.native
  /** [Method] Returns the value of strategy
  		* @returns String
  		*/
  var getStrategy: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the data of the segment tree
  		* @param dataX Number
  		* @param dataOpen Number
  		* @param dataHigh Number
  		* @param dataLow Number
  		* @param dataClose Number
  		*/
  var setData: js.UndefOr[
    js.Function5[
      /* dataX */ js.UndefOr[Double], 
      /* dataOpen */ js.UndefOr[Double], 
      /* dataHigh */ js.UndefOr[Double], 
      /* dataLow */ js.UndefOr[Double], 
      /* dataClose */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of strategy
  		* @param strategy String The new value.
  		*/
  var setStrategy: js.UndefOr[js.Function1[/* strategy */ js.UndefOr[String], Unit]] = js.native
}

object ISegmentTree {
  @scala.inline
  def apply(): ISegmentTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISegmentTree]
  }
  @scala.inline
  implicit class ISegmentTreeOps[Self <: ISegmentTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAggregation(
      value: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* estStep */ js.UndefOr[Double]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAggregation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAggregation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStrategy(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrategy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(
      value: (/* dataX */ js.UndefOr[Double], /* dataOpen */ js.UndefOr[Double], /* dataHigh */ js.UndefOr[Double], /* dataLow */ js.UndefOr[Double], /* dataClose */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStrategy(value: /* strategy */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrategy")(js.undefined)
        ret
    }
  }
  
}

