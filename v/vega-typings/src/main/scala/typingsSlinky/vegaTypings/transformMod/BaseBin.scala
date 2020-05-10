package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseBin extends js.Object {
  /**
    * The number base to use for automatic bin determination (default is base 10).
    *
    * __Default value:__ `10`
    *
    */
  var base: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Scale factors indicating allowable subdivisions. The default value is [5, 2], which indicates that for base 10 numbers (the default base), the method may consider dividing bin sizes by 5 and/or 2. For example, for an initial step size of 10, the method can check if bin sizes of 2 (= 10/5), 5 (= 10/2), or 1 (= 10/(5*2)) might also satisfy the given constraints.
    *
    * __Default value:__ `[5, 2]`
    *
    * @minItems 1
    */
  var divide: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  /**
    * Maximum number of bins.
    *
    * __Default value:__ `6` for `row`, `column` and `shape` channels; `10` for other channels
    *
    * @minimum 2
    */
  var maxbins: js.UndefOr[Double | SignalRef] = js.native
  /**
    * A minimum allowable step size (particularly useful for integer values).
    */
  var minstep: js.UndefOr[Double | SignalRef] = js.native
  /**
    * If true (the default), attempts to make the bin boundaries use human-friendly boundaries, such as multiples of ten.
    */
  var nice: js.UndefOr[Boolean | SignalRef] = js.native
  /**
    * An exact step size to use between bins.
    *
    * __Note:__ If provided, options such as maxbins will be ignored.
    */
  var step: js.UndefOr[Double | SignalRef] = js.native
  /**
    * An array of allowable step sizes to choose from.
    * @minItems 1
    */
  var steps: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
}

object BaseBin {
  @scala.inline
  def apply(): BaseBin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBin]
  }
  @scala.inline
  implicit class BaseBinOps[Self <: BaseBin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withDivide(value: (Vector2[Double | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divide")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxbins(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxbins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxbins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxbins")(js.undefined)
        ret
    }
    @scala.inline
    def withMinstep(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minstep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinstep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minstep")(js.undefined)
        ret
    }
    @scala.inline
    def withNice(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double | SignalRef): Self = {
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
    @scala.inline
    def withSteps(value: (js.Array[Double | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
  }
  
}

