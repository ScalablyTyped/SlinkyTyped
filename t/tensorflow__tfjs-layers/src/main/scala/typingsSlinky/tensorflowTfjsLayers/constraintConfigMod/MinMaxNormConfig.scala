package typingsSlinky.tensorflowTfjsLayers.constraintConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinMaxNormConfig extends js.Object {
  var axis: js.UndefOr[Double] = js.native
  var max_value: js.UndefOr[Double] = js.native
  var min_value: js.UndefOr[Double] = js.native
  var rate: js.UndefOr[Double] = js.native
}

object MinMaxNormConfig {
  @scala.inline
  def apply(): MinMaxNormConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinMaxNormConfig]
  }
  @scala.inline
  implicit class MinMaxNormConfigOps[Self <: MinMaxNormConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: Double): Self = {
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
    def withMax_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_value")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_value")(js.undefined)
        ret
    }
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
  }
  
}

